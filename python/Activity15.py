#Handling errors
try:
    print(2/0)
except NameError:
    print("x hasn't been defined yet.")