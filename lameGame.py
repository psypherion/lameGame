def format_turns(current_number, turns):
    return " and ".join(str(current_number - turns + i + 1) for i in range(turns))

def main():
    print("Hello user! I am Sentient AI aka SAi. Welcome to the illusion of choice game!")
    print("I'll play with you a simple game, try to defeat me if you dare!")

    N = int(input("First, choose the limit: "))

    if N % 3 == 1:
        print("SAi wishes you to start the game.")
        current_turn = "User"
    else:
        print("Great! Let's start! Good luck!")
        current_turn = "Computer"

    current_number = 0

    while current_number < N:
        if current_turn == "User":
            turns = 0
            while turns != 1 and turns != 2:
                turns = int(input("How many turns do you wish? (Only 1 or 2): "))
                if turns != 1 and turns != 2:
                    print("Ha! That's wrong choice! Don't try to oversmart me human! ")
            current_number += turns
            print("User chooses: " + format_turns(current_number, turns))
            if current_number == N:
                print("User wins!")
                return
            current_turn = "Computer"
        else:
            if (N - current_number - 1) % 3 == 0:
                choices = 1
            else:
                choices = 2
            current_number += choices
            print("SAi chooses: " + format_turns(current_number, choices))
            if current_number == N:
                print("SAi Wins! Better luck next time human! Adios!")
                return
            current_turn = "User"

if __name__ == "__main__":
    main()
