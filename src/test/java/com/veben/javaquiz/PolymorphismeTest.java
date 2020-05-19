package com.veben.javaquiz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Foo {
    public int a() { return 5; }

    public static int b() { return 8; }
}

class SpecificFoo extends Foo {
    public int a() { return 10; }

    public static int b() { return 12; }
}

@Nested
@DisplayName("Q19")
class should_test_polymorphisme {

    private int getMultiply() {
        final SpecificFoo givenSpecificFoo = new SpecificFoo();
        final Foo givenFoo = givenSpecificFoo;

        return givenFoo.a() * givenFoo.b();
    }

    @Test
    void should_test_polymorphisme() {
        assertThat(getMultiply()).isEqualTo(80);
    }
}

