import java.util.Arrays;

public class MyPiPrediction {

    public int piPrediction(String date){
        int[] hexPi = PiGenerator.computePiInHex(5000);
        int[] decPi = BaseTranslator.convertBase(hexPi, 16, 10, 5000);
        char[] alphabet = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String decPiString = DigitsToStringConverter.convert(decPi, 10, alphabet);
        return decPiString.indexOf(date);
    }

}
