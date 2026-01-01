import csv

with open("data.csv", "w", newline="") as f:
    writer = csv.writer(f)
    writer.writerow(["ID", "Name", "Dept"])
    writer.writerow([1, "Naveen", "AIML"])
    writer.writerow([2, "Rahul", "CSE"])

with open("data.csv", "r") as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)
