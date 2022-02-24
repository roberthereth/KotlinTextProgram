// Main loop, runs program on start
fun main() {
    print("What's your name?: ")
    val name = readLine()
    print("Have you seen The Princess Bride? (Y or N): ")
    val movie = readLine()
    var seenIt = false
    if (movie.equals("Y") or movie.equals("y")) {
        seenIt = true
    }

    // If they've seen the movie, they can take a quiz. If not, they are told they can't continue
    if (seenIt) {
        print("Hey there $name, you wanna take a short movie quiz? (Y or N): ")
        val ans = readLine()
        if (ans.equals("Y") or ans.equals("y")) {
            quiz(name)
        } else {
            // Condemns user for not engaging with the program
            println("That's ok. I just thought you'd want to do something cool for once.")
            println("No, I'm not offended that you didn't want to do my really cool quiz.")
            println("It's not like I put a lot of time into it or anything....")
            println()
        }
    } else {
        println("Sorry, to continue this program you need to have seen this classic film.")
    }

    println("Bye!")
}

// Runs the quiz portion of the program
fun quiz(name: String?) {
    // Instructions and intro
    println()
    println("Welcome to The Princess Bride Quote Quiz!")
    println("This quiz is fairly straight forward: answer Y is the quote is from the movie,")
    println("and answer N if the quote isn't in the movie.")
    println("Let's get started then $name!")
    println()

    // Initialize variables used
    var count = 0
    var quizAns: String? = null

    // Answer: Yes
    println("Quote 1: 'Inconceivable!'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    // Answer: Yes
    println("Quote 2: 'Are you kidding? Fencing. Fighting. Torture. Revenge. Giants. Monsters. Chases. Escapes. True love. Miracles.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    // Answer: No, changed Gilder to Florin
    println("Quote 3: 'It's fabric from the uniform of an army officer of Florin.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("N") or quizAns.equals("n")) { count++ }
    println()

    // Answer: No, changed eleven to seven
    println("Quote 4: 'I was seven years old. When I was strong enough, I dedicated my life to the study of fencing.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("N") or quizAns.equals("n")) { count++ }
    println()

    // Answer: Yes
    println("Quote 5: 'My way's not very sportsmanlike.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    // Answer: No, swapped the "wine in front of" from you to me, and vice versa
    println("Quote 6:")
    println("'Now, a clever man would put the poison into his own goblet, because he would know that only a great fool")
    println(" would reach for what he was given. I'm not a great fool, so I can clearly not choose the wine in front of me.")
    println(" But you must have known I was not a great fool; you would have counted on it, so I can clearly not choose")
    println(" the wine in front of you.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("N") or quizAns.equals("n")) { count++ }
    println()

    // Answer: Yes
    println("Quote 7: 'Rodents of Unusual Size? I don't think they exist.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    // Answer: No, changed will to shall
    println("Quote 8: 'I swear it shall be done.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("N") or quizAns.equals("n")) { count++ }
    println()

    // Answer: Yes
    println("Quote 9: 'But it's going to be so much more moving when I strangle her on our wedding night.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    // Answer: Yes
    println("Quote 10:")
    println("'I'm not a witch, I'm your wife! But after what")
    println(" you just said, I'm not even sure I want to be that anymore.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    // Answer: No, changed suite from Honeymoon to Prince's
    println("Quote 11: 'And I won't be seeing you again since I'm killing myself once we reach the Prince's Suite.")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("N") or quizAns.equals("n")) { count++ }
    println()

    // Answer: Yes
    println("Quote 12:")
    println("'Your ears you keep, and I'll tell you why -- so that every shriek of every child")
    println(" at seeing your hideousness will be yours to cherish -- every babe that weeps at your approach,")
    println(" every woman who cries out, 'Dear God, what is that thing?' will echo in your perfect ears.")
    println(" That is what 'to the pain' means.'")
    print("Answer (Y or N): ")
    quizAns = readLine()
    if (quizAns.equals("Y") or quizAns.equals("y")) { count++ }
    println()

    println()
    println("And, with that, the quiz is over!")
    println("Now, let's see what score you got!")

    // Congrats if all correct, fail message if any are wrong
    if (count == 12){
        println("Bravo, bravo to you! You got them all! You're even more of a nerd than I!")
        println("Well, that's about it. Thanks for playing and, once again, congrats on being a big nerd!")
    } else {
        println("Looks like you you only got $count/12 correct.")
        println("Some of the quotes may not be exactly as written above, but feel free to try again sometime!")
    }
}
