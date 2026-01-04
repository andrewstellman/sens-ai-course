public class Guy {
    public String name;
    public int cash;

    /**
     * Writes my name and the amount of cash I have to the console.
     */
    public void writeMyInfo() {
        System.out.println(name + " has " + cash + " bucks.");
    }

    /**
     * Gives some of my cash, removing it from my wallet (or printing
     * a message to the console if I don't have enough cash).
     *
     * @param amount Amount of cash to give.
     * @return The amount of cash removed from my wallet, or 0 if I don't
     *         have enough cash (or if the amount is invalid).
     */
    public int giveCash(int amount) {
        if (amount <= 0) {
            System.out.println(name + " says: " + amount + " isn't a valid amount");
            return 0;
        }
        if (amount > cash) {
            System.out.println(name + " says: " +
                "I don't have enough cash to give you " + amount);
            return 0;
        }
        cash -= amount;
        return amount;
    }

    /**
     * Receive some cash, adding it to my wallet (or printing
     * a message to the console if the amount is invalid).
     *
     * @param amount Amount of cash to receive.
     */
    public void receiveCash(int amount) {
        if (amount <= 0) {
            System.out.println(name + " says: " + amount + " isn't an amount I'll take");
        } else {
            cash += amount;
        }
    }
}
