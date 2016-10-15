# Print numbers from "a" to "b" where values are asked by user

a = int(input("Please specify minimum value: "))
b = int(input("Please specify maximum value: "))

pointer = a - 1
while pointer < b:
    pointer += 1
    print(pointer)
