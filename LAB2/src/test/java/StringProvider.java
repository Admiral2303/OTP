//package lab2;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class StringProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(Arguments.of("ddfdf", false),
                Arguments.of("----", false),
                Arguments.of("++d878", false),
                Arguments.of("F888",false),
                Arguments.of("+8dDddd",false),
                Arguments.of("/+++++",false));
    }
}
