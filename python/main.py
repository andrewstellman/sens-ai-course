from guy import Guy

# Create a new Guy object in a variable called joe
# Set its name attribute to "Joe"
# Set its cash attribute to 50

# Create a new Guy object in a variable called bob
# Set its name attribute to "Bob"
# Set its cash attribute to 100

while True:
    # Call the write_my_info methods for each Guy object

    how_much = input("Enter an amount: ")
    if how_much == "":
        break

    # Try to convert how_much to an int
    # if it was successful
    if True:  # Replace this with proper int conversion check
        which_guy = input("Who should give the cash: ")
        if which_guy == "Joe":
            # Call the joe object's give_cash method and save the results
            # Call the bob object's receive_cash method with the saved results
            pass
        elif which_guy == "Bob":
            # Call the bob object's give_cash method and save the results
            # Call the joe object's receive_cash method with the saved results
            pass
        else:
            print("Please enter 'Joe' or 'Bob'")
    else:
        print("Please enter an amount (or a blank line to exit).")
