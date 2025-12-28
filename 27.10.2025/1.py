balance = 5000
pin = 1234

entered_pin = int(input("Enter PIN: "))
if entered_pin != pin:
    print("Invalid PIN")
    exit()

while True:
    print("\n1.Check Balance 2.Deposit 3.Withdraw 4.Exit")
    choice = int(input("Enter choice: "))

    if choice == 1:
        print("Balance:", balance)

    elif choice == 2:
        amt = int(input("Enter amount: "))
        balance += amt
        print("Amount Deposited")

    elif choice == 3:
        amt = int(input("Enter amount: "))
        if amt <= balance:
            balance -= amt
            print("Withdrawn Successfully")
        else:
            print("Insufficient Balance")

    elif choice == 4:
        break
