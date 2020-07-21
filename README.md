# Java 8 features
Java 8 features practice project

### Why is Java 8 ?
* Introduction of functional features such as :
    * Lambdas
    * Stream
    * Optional 
* Simplify the concurrency operation

#### Functional Programming 

    1. Embrace creating immutable objects
    2. More concise and readale code
    3. Functions/methods are treated as first class citizen
    4. Promte declarative way of programming
    
#### Imperative vs Declarative Programming
    
| Imperative  | Declarative |
| ------------- | ------------- |
| Focus on how to perform an operation  | Focus on what result you want  |
| Promote object mutability  | Promote object immutability  |
| Used with classic object oriented programming  | Functional programming uses the concept of declarative programming |
| Need to follow step by step instruction on how to perform   | Analogous to SQL |


### What is Lambda Expression ?

* Lambda is equivalent to function(method) without name
* Lambda's are also refereed as Anonymous functions
    *  Method parameter
    *  Method body
    *  Return Type
* Lambdas are not tied to any class like regular method
* Lambdas can also be assigned to variable and passed around

#### Syntax 
( lambda input parameter ) -> { lambda body}


#### Usages of Lambda
* Lambda is mainly used to implement Functional Interfaces(SAM)

### Functional Interface
A functional interface is an interface that has exactly one abstract method

The new functional interfaces introduced in Java 8 :
* Consumer
* Predicate
* Functions
* Supplier

### Method Reference

* It's purpose is to simply the implementation of functional interface
* Shortcut of writing lambda expression
* Refer a method in class

#### Syntax
    Classname::instance-method-name
    Classname::static-method-name
    Instance::method-name
    
### Constructor Reference
#### Syntax
    Classname::new
    
### Local variables in Lambda
Lambdas have some restriction on using local variables:
* Not allowed to use the same local variable name as lambda parameters or inside lambda body
* Not allowed to re-assign a value to local variable
* For instance variable and class variable there is no restriction


### Effectively Final
* Lambda's are allowed to use local variables but not allowed to modify it even
though they are not declared final. This concept is called "Effectively Final"
* Not allowed to modify the value inside the lambda
* Advantages :
    * Easy to perform concurrency operation
    * Promotes functional programming
    
 ### Introduction to streams
 - Main purpose of introducing stream is to perform operation over collection
 - Parallel operations are easy to perform with Streams API
 
 #### What is Streams ?
 - Stream is a sequence of elements which can be created from collections
 - Stream operation can be performed sequentially and parallel
 
 ##### Streams API
 
 ###### map()
 Map method is responsible for transforming one type to another
 
 ###### flatMap()
 Similar to map. Using in context of Streams where each element in the streams
 represents another elements
 Multiple element Stream element:
  - Stream of list 
  - Stream of Arrays
  
 ###### distinct()
 Return a Stream with unique elements

 ###### count()
 Return total no. of elements in Stream

 ###### sorted()
 Sort the elements in Stream
 
  ###### filter()
  Filter the elements in Stream
  
  ###### filter()
  Terminal operation. Used to reduce content of Stream to single value.
  Takes two input :
  - 1st Parameter - default or initial value
  - 2nd Parameter - BinaryOperator<T> 

 
 
 
 
 
 
 
 
 
 
 
 










    
    
    
    
