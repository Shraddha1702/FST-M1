"""rock beats scissor
scissor beats paper
paper beats rock"""

player1 =  input("Enter the Player one name: ")
player2 =  input("Enter the Player two name: ")

player1_ans = input("Enter the player one answer: ")
player2_ans = input("Enter the player two answer: ")

if(player1_ans==player2_ans):
    print("Game in Tie mode")
elif player1_ans == "Rock":
    if player2_ans =="Scissor":
        print("Rock smashes scissor! you win")
    else:
        print("Paper cover scissor! you lose")
elif player1_ans == "Paper":
    if player2_ans == "Rock":
        print("Paper covers rock! you win")
    else:
        print("Scissor cuts paper! you lose")
elif player1_ans == "Scissor":
    if player2_ans == "Paper":
        print("Scissor cuts paper! you win")
    else:
        print("Rock smashes scissor! you lose.")

