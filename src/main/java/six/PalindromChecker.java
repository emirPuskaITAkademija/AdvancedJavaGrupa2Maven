package six;

public class PalindromChecker {

    public boolean isPalindrom(String input) {
        String lowerCaseInput = input.toLowerCase();
        lowerCaseInput = lowerCaseInput.replace(" ", "");
        char[] inputArray = lowerCaseInput.toCharArray();
        char[] okrenutArrayInput = new char[inputArray.length];
        int j = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            okrenutArrayInput[j] = inputArray[i];
            j++;
        }
        String okrenutInputLowerCase = new String(okrenutArrayInput);
        return lowerCaseInput.equals(okrenutInputLowerCase);
    }

    public boolean isPalindrom(char[] inputArray) {
        char[] okrenutArrayInput = new char[inputArray.length];
        int j = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            okrenutArrayInput[j] = inputArray[i];
            j++;
        }
        String inputString = new String(inputArray);
        String okrenutInput = new String(okrenutArrayInput);
        return inputString.equalsIgnoreCase(okrenutInput);
    }

    public boolean isPalindromBilal(String input) {
        input = input.replace(" ", "");
        String okrenutInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            okrenutInput = okrenutInput+input.charAt(i);
        }
        return input.equalsIgnoreCase(okrenutInput);
    }
}
