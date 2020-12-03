
public class EgemenSetup extends BasicSetup{

    private static String[] words = {"Sarı", "Lacivert" , "En büyük" , "Fenerbahçe"};

    public int getMaxAllowedIncorrectTries()
    {
        return 6;
    }

    public char	getBlankChar()
    {
        return '*';
    }

    public String getCharsToPreserve()
    {
        return " ";
    }

    public String getAllLetters()
    {
        return "abcdefghijklmnopqrstuvwxyz";
    }

    @Override
    public String chooseSecretWord()
    {
        int random = (int) (Math.random() * words.length );
        return words[ random];
    }



}