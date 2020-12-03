import cs102.Hangman;


public class ConsoleHangmanView implements IHangmanView{


    @Override
    public void updateView(Hangman hangman) {
        if (!hangman.isGameOver()) {
            System.out.println("The secret word: " + hangman.getKnownSoFar());
            System.out.println("You have " + (hangman.getMaxAllowedIncorrectTries()
                    - hangman.getNumOfIncorrectTries()) + " tries left.");
        } else if (hangman.hasLost()) {
            System.out.print( "You lost the Hangman Game! " );
            System.out.print(" The word was : " + hangman.secretWord.toString().toUpperCase());
            System.out.println();

        } else if (hangman.isGameOver()) {
            System.out.println("You won the Hangman Game!");

        }

    }



}
