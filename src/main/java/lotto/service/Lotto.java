package lotto.service;

import java.util.Collections;
import java.util.List;
import lotto.view.ExceptionMessage;

public class Lotto {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            ExceptionMessage.sizeException();
            throw new IllegalArgumentException();
        }
    }

}