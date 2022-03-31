
### Java Collections Framework
    * The Java collections framework is a set of classes and interfaces
    that implement commonly reusable collection data structures
    for storing and manipulating a group of objects..
    * Java collections framework works in a manner of a library.
    * The collections framework provides both interfaces that define various collections
    and classes that implement them.

#### What is Collection in Java?
    * A Collection represents a single unit of objects, such as a group.

#### What is a framework in Java?
    * Framework provides readymade architecture
    * Framework represents a set of classes and interfaces

#### How many types of Collection are there?
    * There are three generic types of collection: ordered lists, dictionaries/maps, and sets
        * Ordered lists allows the programmer to insert items
        in a certain order and retrieve those items in the same order. 
        Using List and Queue interfaces.

        * Dictionaries/maps store references to objects with a lookup key to access
        the object's values. Using Map interface

        * Sets are unordered collections that can be iterated and contain 
        each element at most once.
        Using Set interface.

#### Can Java Collections directly store primitives types?
    * No. 
    * Collections are the framework used to store and manipulate a group of objects.
    * Java primitive types are not referenced types. For example, Int is not an Object
    * THus, generic Java Collections cannot not store primitive directly.
    * Wrapper Class is needed in this case.
    * Wrapper class provides a way to use primitive data types as objects.
        * Wrapper class is a class whose object wraps or contains primitive data types.
        * Wrapper class gives birth to two concepts as follows:
            * Autoboxing
            * Unboxing

 #### Autoboxing
    * Autoboxing is the automatic conversion of primitive types to the object of their
    corresponding wrapper classes.
    * Example:
        * Conversion of int to Integer
        * Integer i = new Integer(5);
        * Integer j = 5;

#### Unboxing
    * Unboxing is the reverse process of autoboxing.
    * That is, converting an object of a wrapper class to its corresponding primitive type.
    * Example:
        * Conversion of Integer to int
        * Integer i = new Integer(8);
        * int a = i; or
        * int b = i.intValue();          
* Reference: 
    * https://en.wikipedia.org/wiki/Java_collections_framework
    * Learn more about Java Collections at : https://www.javatpoint.com/collections-in-java
    * https://www.geeksforgeeks.org/why-java-collections-cannot-directly-store-primitives-types/
    
    

