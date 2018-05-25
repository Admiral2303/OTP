import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyPiPrediction prediction = new MyPiPrediction();
        int pred = prediction.piPrediction("2303");
        System.out.println(pred);




        int[] hexPi = PiGenerator.computePiInHex(100);

        int[] decPi = BaseTranslator.convertBase(hexPi, 16, 26, 100);

        char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                'v', 'w', 'x', 'y', 'z' };
        String decPiString = DigitsToStringConverter.convert(decPi,26, alphabet);
        String[] predict = {"oly", "a"};
        System.out.println(decPiString);
        Map<String, Integer> findPredict =  WordFinder.findWords(decPiString, predict);
        System.out.println(findPredict);

        String[] training = {"aaollyyy"};
        char[] alphabetGen = AlphabetGenerator.generateFrequencyAlphabet(30, training);

        String decPiString1 = DigitsToStringConverter.convert(decPi,30, alphabetGen);
        System.out.println(decPiString1);
        Map<String, Integer> findPredictAlpha =  WordFinder.findWords(decPiString1, predict);
        System.out.println(findPredictAlpha);

    }
}
