text = input("Enter sentence: ").lower().split()
freq = {}

for word in text:
    freq[word] = freq.get(word, 0) + 1

for k, v in freq.items():
    print(k, ":", v)
