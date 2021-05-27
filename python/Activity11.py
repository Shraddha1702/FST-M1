"""fruits = dict(apple = "200",orange = "60", pomegranate = "160", mango = "180")
enterFruitName = input("Enter the fruitname: ").lower()
if(enterFruitName == "apple"):
    for x in fruits:
        print("The entered fruit is available in stock ",enterFruitName, "price is: ",fruits[x])
    else:
        print("The entered fruit is not available")"""

fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

key_to_check = input("What are you looking for? ").lower()

if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")