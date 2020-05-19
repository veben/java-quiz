package com.veben.javaquiz;

import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaQuizApplicationTest {
    public static void main(String[] args) {
        SpringApplication.run(JavaQuizApplicationTest.class, args);
    }

    @DisplayName("Q6")
    static class Argument {
        public static void main(String[] argz) {
            String arg1 = argz[1];
            String arg2 = argz[2];
            String arg3 = argz[3];
            System.out.println("arg2=" + arg2);
        }
    }

    @DisplayName("Q11")
    static class Construction {
        public Construction() {
            System.out.print("default");
        }

        public Construction(String str) {
            this();
            System.out.print(str);
        }

        public static void main(String[] argz) {
            new Construction("specific");
        }
    }
}