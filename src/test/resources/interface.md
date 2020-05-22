## Interface category

---
1. What is the keyword to declare an interface?
	- (x) `interface`
	- ( ) `class`
	- ( ) `final`
	- ( ) `abstract`
	
2. What is the keyword to base a class on an interface?
	- ( ) `extends`
	- ( ) `extend`
	- ( ) `implement`
	- (x) `implements`

3. What does an interface contain?
	- ( ) method names
	- ( ) method implementations
	- (x) method declarations

4. An interface can contain?
	- ( ) abstract methods
	- ( ) final variables
	- ( ) final variables and non-abstract methods
	- (x) final variables and abstract methods
	
5. What assertions are true?
	- [x] you can use `default` keyword to add new methods in an interface
	- [ ] an interface can define `private` or `protected` methods
	- [x] all methods are `public` and `abstract` by default
	- [ ] none of the above
	
	> Methods are abstract and public by default. Since java 9, methods can now be private. See: https://docs.oracle.com/javase/specs/jls/se9/html/jls-9.html#jls-9.4
	> Since java 8, you can use `default` keyword to add new methods in an interface without breaking the existing implementations of this interface
	
6. How can you implement 2 interfaces?
	- (x) `class A implements B, C {}`
	- ( ) `class A implements B C {}`
	- ( ) `class A implements B, implements C {}`
	- ( ) none of the above
	
7. Can an interface be `final`?
	- ( ) yes
	- (x) no
	
    > The utilization of `final` keyword on a class is to prevent from inheritance. It is forbidden to use it with an interface.

8. When you implement an interface you have to implement all its methods?
	- (x) yes
	- ( ) no

