s = "123 abc"
result =""
for char in s:
    if not char.isdigit():
        result+=char
result = result.lstrip()
print(result)