import java.util.Scanner;

public class BTsangLib
{
    public static void main(String[] args) {
        System.out.print("Welcome new player! What is your name? ");
        Scanner nam = new Scanner(System.in);
        String name = nam.nextLine();
        System.out.print("Hey " + name + "! Press 1 to guess a number. Press 2 to have your number guessed. ");
        Scanner mode = new Scanner(System.in);
        if (mode.nextLine().equals("1"))
        {
            System.out.print("You've selected to guess a number. Now choose a difficulty. 1 for 1-10, 2 for 1-100, 3 for 1-1000, 4 for 1-10000. ");
            Scanner difficult = new Scanner(System.in);
            int difficulty = difficult.nextInt();
            int guesses = 1;
            if (difficulty < 1 || difficulty > 4)
            {
                while (difficulty < 1 || difficulty > 4)
                {
                    System.out.print("Please choose a difficulty from 1-4. ");
                    difficult = new Scanner(System.in);
                    difficulty = difficult.nextInt();
                }
            }
            if (difficulty == 1)
            {
                System.out.print("Guess a number from 1-10. ");
                int number = (int) (Math.random() * 11 + 1);
                Scanner gues = new Scanner(System.in);
                int guess = gues.nextInt();
                while (guess != number)
                {
                    if (guess > 10 || guess < 1)
                    {
                        System.out.print("Please guess a number from 1-10. You guessed " + Integer.toString(guess) + ". ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                    else
                    {
                        System.out.print(Integer.toString(guess) + " is incorrect! ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                }
                System.out.print("Congratulation " + name + "! " + Integer.toString(guess) + " is correct! You took " + Integer.toString(guesses) + " tries. ");
            }
            if (difficulty == 2)
            {
                System.out.print("Guess a number from 1-100. ");
                int number = (int) (Math.random() * 101 + 1);
                Scanner gues = new Scanner(System.in);
                int guess = gues.nextInt();
                while (guess != number)
                {
                    if (guess > 100 || guess < 1)
                    {
                        System.out.print("Please guess a number from 1-100. You guessed " + Integer.toString(guess) + ". ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                    else
                    {
                        System.out.print(Integer.toString(guess) + " is incorrect! ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                }
                System.out.print("Congratulation " + name + "! " + Integer.toString(guess) + " is correct! You took " + Integer.toString(guesses) + " tries. ");
            }
            if (difficulty == 3)
            {
                System.out.print("Guess a number from 1-1000. ");
                int number = (int) (Math.random() * 1001 + 1);
                Scanner gues = new Scanner(System.in);
                int guess = gues.nextInt();
                while (guess != number)
                {
                    if (guess > 1000 || guess < 1)
                    {
                        System.out.print("Please guess a number from 1-1000. You guessed " + Integer.toString(guess) + ". ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                    else
                    {
                        System.out.print(Integer.toString(guess) + " is incorrect! ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                }
                System.out.print("Congratulation " + name + "! " + Integer.toString(guess) + " is correct! You took " + Integer.toString(guesses) + " tries. ");
            }
            if (difficulty == 4)
            {
                System.out.print("Guess a number from 1-10000. ");
                int number = (int) (Math.random() * 10001 + 1);
                Scanner gues = new Scanner(System.in);
                int guess = gues.nextInt();
                while (guess != number)
                {
                    if (guess > 10000 || guess < 1)
                    {
                        System.out.print("Please guess a number from 1-10000. You guessed " + Integer.toString(guess) + ". ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                    else
                    {
                        System.out.print(Integer.toString(guess) + " is incorrect! ");
                        gues = new Scanner(System.in);
                        guess = gues.nextInt();
                        guesses++;
                    }
                }
                System.out.print("Congratulation " + name + "! " + Integer.toString(guess) + " is correct! You took " + Integer.toString(guesses) + " tries. ");
            }
        }
        else
        {
            System.out.print("Keep a number from 1-100 in mind. Type higher/lower if your number is higher/lower than the guessed number. Type correct if it is correct. ");
            int guess = (int) (Math.random() * 101 + 1);
            System.out.print(" My first guess is " + Integer.toString(guess) + ". ");
            Scanner clu = new Scanner(System.in);
            String clue = clu.nextLine();
            int high = 100;
            int low = 1;
            int guesses = 1;
            while (!clue.equals("correct"))
            {
                if (clue.equals("higher"))
                {
                    low = guess;
                    guess = (int)(Math.random() * (high - guess + 1) + low);
                    while (low == guess && guess < high)
                    {
                        guess = (int)(Math.random() * (high - guess + 1) + low);
                    }
                    System.out.print("Is your number " + Integer.toString(guess) + "? ");
                    guesses++;
                    clu = new Scanner(System.in);
                    clue = clu.nextLine();
                }
                if (clue.equals("lower"))
                {
                    high = guess;
                    guess = (int)(Math.random() * (guess - low + 1) + low);
                    while (high == guess && guess > low)
                    {
                        guess = (int)(Math.random() * (high - guess + 1) + low);
                    }
                    System.out.print("Is your number " + Integer.toString(guess) + "? ");
                    guesses++;
                    clu = new Scanner(System.in);
                    clue = clu.nextLine();
                }
                if (!clue.equals("higher") && !clue.equals("lower") && !clue.equals("correct"))
                {
                    System.out.print("Please type correct, higher or lower. ");
                    clu = new Scanner(System.in);
                    clue = clu.nextLine();
                }
            }
            System.out.print(name + ", your number is " + Integer.toString(guess) + "! " + Integer.toString(guesses) + " tries in total.");
        }
    }
}
