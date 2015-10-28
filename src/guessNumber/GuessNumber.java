package guessNumber;

import java.util.Vector;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {

        int aCount = 0;
        int bCount = 0;
        Vector<String> exceptAList = new Vector<String>();
        for(int i = 0; i < 4; i++)
        {
            if(randomNumber.charAt(i) == userInput.charAt(i))
            {
                aCount++;
            }
            else
            {
                exceptAList.add(String.valueOf(userInput.charAt(i)));
            }
        }
        for(int i = 0; i < exceptAList.size(); i++)
        {
            if(randomNumber.contains(exceptAList.elementAt(i)))
                    bCount++;
        }
        return (aCount + "a" + bCount + "b");
        
    }
}
