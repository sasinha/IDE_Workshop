# Write a program that assigns letters to an array of numbers


letters = "abcdefghijklmnopqrstuvwxyz"

dictionary = dict(zip(letters, range(0, 26)))

input_word = input("What is your word: ").lower()

output = [dictionary[x] for x in input_word]

print(output)
