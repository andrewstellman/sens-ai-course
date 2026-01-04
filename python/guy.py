class Guy:
    """A class representing a person who can give and receive cash."""

    def __init__(self):
        self.name = None
        self.cash = 0

    def write_my_info(self):
        """Writes my name and the amount of cash I have to the console."""
        print(f"{self.name} has {self.cash} bucks.")

    def give_cash(self, amount):
        """
        Gives some of my cash, removing it from my wallet (or printing
        a message to the console if I don't have enough cash).

        Args:
            amount: Amount of cash to give.

        Returns:
            The amount of cash removed from my wallet, or 0 if I don't
            have enough cash (or if the amount is invalid).
        """
        if amount <= 0:
            print(f"{self.name} says: {amount} isn't a valid amount")
            return 0
        if amount > self.cash:
            print(f"{self.name} says: I don't have enough cash to give you {amount}")
            return 0
        self.cash -= amount
        return amount

    def receive_cash(self, amount):
        """
        Receive some cash, adding it to my wallet (or printing
        a message to the console if the amount is invalid).

        Args:
            amount: Amount of cash to receive.
        """
        if amount <= 0:
            print(f"{self.name} says: {amount} isn't an amount I'll take")
        else:
            self.cash += amount
