class Student:
    def __init__(self, name, marks):
        self.name = name
        self.marks = marks

    def total(self):
        return sum(self.marks)

    def grade(self):
        avg = self.total() / len(self.marks)
        if avg >= 90:
            return "A"
        elif avg >= 75:
            return "B"
        elif avg >= 60:
            return "C"
        else:
            return "D"

name = input("Enter name: ")
marks = list(map(int, input("Enter 5 marks: ").split()))

s = Student(name, marks)

print("Total:", s.total())
print("Grade:", s.grade())
