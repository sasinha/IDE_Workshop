# Print the next 8 leap years


starting_year = int(input("What year is it? "))

counter = 0
while counter < 8:
    starting_year += 4
    print(starting_year)
    counter += 1



