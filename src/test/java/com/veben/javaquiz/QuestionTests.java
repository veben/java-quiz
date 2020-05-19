package com.veben.javaquiz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class QuestionTests {
    @Nested
    @DisplayName("Q4")
    class should_test_equality {
        private int stringEquality() {
            String str1 = "foo";
            String str2 = new String("foo");
            if (str1 == str2) {
                return 1;
            } else if (str1.equals(str2)) {
                return "0".equals(str1.substring(1)) ? 2 : 3;
            }
            return 4;
        }

        @Test
        void should_test_str_equality_function() {
            assertThat(stringEquality()).isEqualTo(3);
            System.out.println("foo".substring(1));
        }
    }

    @Nested
    @DisplayName("Q5")
    class should_test_transformation {
        private void transform(String str) {
            str = "foo-new";
        }

        private String stringTransform() {
            String str = "foo-old";
            transform(str);
            return str.split("-")[1];
        }

        @Test
        void should_test_str_transform_function() {
            assertThat(stringTransform()).isEqualTo("old");
        }
    }

    @Nested
    @DisplayName("Q8")
    class should_test_matching {
        private String match() {
            String str = "123abc";
            Pattern pattern = Pattern.compile("(\\d+)(\\w+)");
            Matcher matcher = pattern.matcher(str);
            return matcher.matches() ? matcher.group(0) : "";
        }

        @Test
        void should_test_match_function() {
            assertThat(match()).isEqualTo("123abc");
        }
    }

    @Nested
    @DisplayName("Q29")
    class should_test_evaluation_order {
        private int evaluate() {
            int a = 2;
            return ++a + ++a * ++a;
        }

        private int evaluateBis() {
            int a = 2;
            return a++ + a++ * a++;
        }

        private int evaluateTer() {
            int a = 2;
            return a++ + ++a * a++;
        }

        @Test
        void should_test_evaluate_function() {

            assertThat(evaluate()).isEqualTo(23); // 3 + 4 * 5
            assertThat(evaluateBis()).isEqualTo(14); // 2 + 3 * 4
            assertThat(evaluateTer()).isEqualTo(18); // 2 + 4 * 4
        }
    }
}