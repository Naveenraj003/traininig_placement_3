votes_a = votes_b = 0

while True:
    print("\n1.Vote A 2.Vote B 3.Result 4.Exit")
    ch = int(input("Enter choice: "))

    if ch == 1:
        votes_a += 1
    elif ch == 2:
        votes_b += 1
    elif ch == 3:
        print("Votes A:", votes_a)
        print("Votes B:", votes_b)
    elif ch == 4:
        break
