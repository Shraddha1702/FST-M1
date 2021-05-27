num_tuple = tuple(input('Enter the numbers: ').split(", "))
print(num_tuple)

print("Number is divisible by 5")
for num in num_tuple:
    if(int(num) % 5 == 0):
        print(num)

