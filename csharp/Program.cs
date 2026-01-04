// Create a new Guy object in a variable called joe
// Set its Name field to "Joe"
// Set its Cash field to 50

// Create a new Guy object in a variable called bob
// Set its Name field to "Bob"
// Set its Cash field to 100

while (true)
{
    // Call the WriteMyInfo methods for each Guy object

    Console.Write("Enter an amount: ");
    string? howMuch = Console.ReadLine();
    if (howMuch == "") return;

    // Use int.TryParse to try to convert the howMuch string? to an int
    // if it was successful (just like you did earlier in the chapter)
    {
        Console.Write("Who should give the cash: ");
        string? whichGuy = Console.ReadLine();
        if (whichGuy == "Joe")
        {
            // Call the joe object's GiveCash method and save the results
            // Call the bob object's ReceiveCash method with the saved results
        }
        else if (whichGuy == "Bob")
        {
            // Call the bob object's GiveCash method and save the results
            // Call the joe object's ReceiveCash method with the saved results
        }
        else
        {
            Console.WriteLine("Please enter 'Joe' or 'Bob'");
        }
    }
    else
    {
        Console.WriteLine("Please enter an amount (or a blank line to exit).");
    }
}
