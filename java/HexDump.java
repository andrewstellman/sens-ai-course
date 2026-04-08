import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HexDump {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("usage: HexDump filename");
            return;
        }

        try (InputStream input = getInputStream(args)) {
            int position = 0;
            byte[] buffer = new byte[16];

            while (true) {
                int bytesRead = input.read(buffer, 0, buffer.length);
                if (bytesRead == -1) {
                    return;
                }

                System.out.printf("%04x: ", position);
                position += bytesRead;

                for (int i = 0; i < 16; i++) {
                    if (i < bytesRead) {
                        System.out.printf("%02x ", buffer[i] & 0xFF);
                    } else {
                        System.out.print("   ");
                    }
                    if (i == 7) {
                        System.out.print("-- ");
                    }
                }

                for (int i = 0; i < bytesRead; i++) {
                    int value = buffer[i] & 0xFF;
                    if (value < 32) {
                        value = '?';
                    }
                    System.out.print((char) value);
                }

                System.out.println();
            }
        } catch (IOException ex) {
            System.err.println("I/O error while dumping input: " + ex.getMessage());
        }
    }

    private static InputStream getInputStream(String[] args) {
        if ((args.length != 1) || !new java.io.File(args[0]).exists()) {
            return System.in;
        }

        try {
            return new FileInputStream(args[0]);
        } catch (SecurityException | IOException ex) {
            System.err.printf("Unable to read %s, dumping from stdin: %s%n", args[0], ex.getMessage());
            return System.in;
        }
    }
}
