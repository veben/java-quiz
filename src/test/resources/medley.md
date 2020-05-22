## Medley category

---
1. Java language is?
    - ( ) compiled
    - (x) interpreted

2. Which protection level allows you to access only from the class?
	- ( ) the `private` one
	- ( ) the `protected` one
	- ( ) the `public` one
	- (x) the default one

3. What do you need to when you overload the `equals` method of a class?
	- (x) `hashCode` overloading
	- ( ) protected `clone`
	- ( ) public `toString`

4. What does `stringEquality` method returns?
    ```java
    @Nested
    @DisplayName("Q4")
    class should_test_equality {
        public int stringEquality() {
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
    ```
	- ( ) 1
	- ( ) 2
	- (x) 3
	- ( ) 4

5. What does `stringTransform` method returns?
    ```java
    @Nested
    @DisplayName("Q5")
    class should_test_transformation {
        public void transform(String str) {
            str = "foo-new";
        }
    
        public String stringTransform() {
            String str = "foo-old";
            transform(str);
            return str.split("-")[1];
        }
    
        @Test
        void should_test_str_transform_function() {
            assertThat(stringTransform()).isEqualTo("old");
        }
    }
    ```
	- ( ) foo
	- ( ) new
	- (x) old
	- ( ) foo-new
	- ( ) foo-old
	
6. What is the result of this `main` function with `1 2 3` as arguments?
    ```java
    @DisplayName("Q6")
    static class Argument {
        public static void main(String[] argz) {
            String arg1 = argz[1];
            String arg2 = argz[2];
            String arg3 = argz[3];
            System.out.println("arg2=" + arg2);
        }
    }
    ```
    - ( ) 1
    - ( ) 2
    - ( ) 3
    - (x) An exception is thrown

    > see: https://stackoverflow.com/questions/890966/what-is-string-args-parameter-in-main-method-java

7. What is true about the `static` keyword
    - [ ] A field declared as static is constant
    - [x] A static method belongs the class itself
    - [ ] You need to instantiate a static class to use one of its methods
    - [x] You don't need to instantiate static class

8. What does `match` function return?
    ```java
    @Nested
    @DisplayName("Q8")
    class should_test_matching {
        public String match() {
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
    ```
   - ( ) 123
   - ( ) abc
   - (x) None of the above

9. What of the following sentences is true?
    - (x) A class can implement many interfaces but can extend only one class
    - ( ) A class can implement many classes but can extend one interface
    - ( ) A class can implement many classes and can extend many interfaces
    - ( ) A class can implement one interface and can extend one class
    
10. What concept of OOP allows for the same method, different behavior depending on the situation?
    - ( ) Encapsulation
    - (x) Polymorphism
    - ( ) Inheritance

11. What does this code display?
    ```java
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
    ```
    - ( ) default
    - ( ) specificdefault
    - (x) defaultspecific
    - ( ) specific

12. What does `transient` keyword means when it is associated with and attributes?
    - ( ) The attribute is "thread safe"
    - ( ) The attribute is only visible on the package itself
    - (x) The attribute will not be saved during serialization
    - ( ) The attribute cannot be modified
    
13. What is the difference between `HashMap` and `HashTable`?
    - ( ) HashMap is thread safe, HashTable not
    - ( ) HashTable does not implement Map interface
    - (x) HashTable is thread safe, HashMap not

14. What is **boxing**?
    - (x) Conversion from primitive type to object
    - ( ) Conversion from object to primitive type
    - ( ) Adapt an interface to another interface
    - ( ) None of the above

15. What is the role of `parseInt` method from `Integer` class?
    - ( ) Transform Integer to String
    - (x) Transform String to Integer

16. Java language has been initially developed by?
    - ( ) Hewlett-Packard
    - (x) Sun Microsystems
    - ( ) Microsoft
    - ( ) Oracle
    
17. Which packages/classes are own by `javax`?
    - [ ] sql
    - [ ] nio
    - [x] servlet
    - [x] swing

18. What new feature has been brought with **java 5**?
	- ( ) Autoboxing
	- ( ) Java nio
	- ( ) Lambda functions
	- (x) Generics
	
19. What does `getMultiply()` function return?
    ```
    class Foo {
        public int a() { return 5; }
    
        public static int b() { return 8; }
    }
    class SpecificFoo extends Foo {
        public int a() { return 10; }
    
        public static int b() { return 12; }
    }
    
    private int getMultiply() {
        final SpecificFoo givenSpecificFoo = new SpecificFoo();
        final Foo givenFoo = givenSpecificFoo;
    
        return givenFoo.a() * givenFoo.b();
    }
    ```
	- ( ) 120
	- ( ) 40
	- (x) 80
	- ( ) 60

20. What is the command to execute a java program?
	- (x) java
	- ( ) javac
	- ( ) exec
	
21. What of the following Design Patterns concern object creation/instantiation?
	- [x] Factory
	- [ ] Adapter
	- [ ] Composite
	- [x] Builder

22. What allow to have a one line commentary?
	- (x) `//`
	- ( ) `#`
	- ( ) `/*`
	- ( ) `%`
	
23. What is the category of the Facade Design?
	- ( ) Creational
	- ( ) Structural
	- (x) Behavioral
	- ( ) Concurrency
	
24. What is the purpose of a `final` class?
	- (x) The class can't be extended
	- ( ) All references to objects of the class would act as if they were declared as `final`
	
25. What assertions are true?
	- [ ] A class can be `abstract` and `final`
	- [x] `abstract` and `final` are exclusive
	- [x] A nested interface can be private
	- [ ] None of the above
	
	> see: https://stackoverflow.com/questions/9618583/java-final-abstract-class

26. What is **boxing**?
	- (x) Conversion from primitive type to object
	- ( ) Conversion from object to primitive type
	- ( ) Adapt an interface to another one
	- ( ) None of the above
	
27. How can you create a thread?
	- ( ) By extending `Runnable`
	- ( ) By implementing `Thread`
	- (x) By implementing `Runnable`
	- (x) By extending `Thread`

28. What operator always evaluate its operands?
- ( ) `&&`
- (x) `%`
- ( ) `||`
- ( ) `?`

29. What do return the following function, in order?
    ```java
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
    }
    ```
	- ( ) 23 and 23 and 23
	- ( ) 23 and 14 and 14
	- (x) 23 and 14 and 18
	- ( ) 23 and 18 and 18
