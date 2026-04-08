import os
import sys
from typing import BinaryIO


def get_input_stream(argv: list[str]) -> BinaryIO:
    if (len(argv) != 1) or (not os.path.exists(argv[0])):
        return sys.stdin.buffer

    try:
        return open(argv[0], "rb")
    except OSError as ex:
        print(
            f"Unable to read {argv[0]}, dumping from stdin: {ex}",
            file=sys.stderr,
        )
        return sys.stdin.buffer


def main() -> None:
    args = sys.argv[1:]
    if len(args) != 1:
        print("usage: HexDump filename")
        return

    input_stream = get_input_stream(args)
    close_stream = input_stream is not sys.stdin.buffer

    try:
        position = 0
        while True:
            chunk = input_stream.read(16)
            if not chunk:
                return

            print(f"{position:04x}: ", end="")
            position += len(chunk)

            for i in range(16):
                if i < len(chunk):
                    print(f"{chunk[i]:02x} ", end="")
                else:
                    print("   ", end="")
                if i == 7:
                    print("-- ", end="")

            printable = "".join(chr(b) if b >= 32 else "?" for b in chunk)
            print(printable)
    finally:
        if close_stream:
            input_stream.close()


if __name__ == "__main__":
    main()
