# Print the next 8 leap years


current_year = int(input("What year is it? "))


displace = current_year % 4
starting_year = current_year - displace

counter = 0
while counter < 5:
    starting_year += 4
    print(starting_year)
    counter += 1



