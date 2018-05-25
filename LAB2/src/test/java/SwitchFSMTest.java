import lab2.Statepatern.StateFSM;
import lab2.SwitchFSM.SwitchFSM;
import lab2.TableFSM.TableFSM;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;




class SwitchFSMTest {
    private static SwitchFSM switchFSM;
    private static TableFSM tableFSM;
    private static StateFSM stateFSM;

    @BeforeAll
    static void beforeAll() {
        switchFSM = new SwitchFSM();
        tableFSM = new TableFSM();
        stateFSM = new StateFSM();
    }


    static String[] dataProvider() {
        String[] testValues = new String[]{"++d", " ", "", "++++++ffffff", null};
        return testValues;
    }


    @ParameterizedTest
    @ValueSource(strings = {"+1A3", "+++", "+", "+5", "+$8"})
    void scan(String test) {
        assertAll(
                ()-> assertTrue(switchFSM.scan(test)),
                ()-> assertTrue(tableFSM.scan(test)),
                ()-> assertTrue(stateFSM.scan(test)));
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void scan1(String data) {
        assertAll(
                ()-> assertFalse(switchFSM.scan(data)),
                ()-> assertFalse(tableFSM.scan(data)),
                ()-> assertFalse(stateFSM.scan(data)));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "Data.csv")
    void scan2(String data) {
        assertAll(
                ()-> assertTrue(switchFSM.scan(data)),
                ()-> assertTrue(tableFSM.scan(data)),
                ()-> assertTrue(stateFSM.scan(data)));
    }

    @ParameterizedTest
    @ArgumentsSource(StringProvider.class)
    void scan3(String data, boolean expected) {
        assertAll(
                ()-> assertEquals(switchFSM.scan(data), expected),
                ()-> assertEquals(tableFSM.scan(data), expected),
                ()-> assertEquals(stateFSM.scan(data), expected));

    }



}