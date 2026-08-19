s = input("Enter a string: ").strip()
res = ""
count = 0
for i in range(1,len(s)):
    if s[i] == s[i-1]:
        count = count + 1
    else :
        res = res + s[i-1] + str(count + 1)
        count = 1

res = res + s[-1] + str(count)
print(res)
