str = input("Enter a string: ").strip()
freq = {}
arr = list(str.split(" "))
for word in arr:
    freq[word] = freq.get(word,0) + 1

for key , value in freq.items():
    print(key," ",value)