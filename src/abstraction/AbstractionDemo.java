package abstraction;

import abstraction.Outer.Inner;

/*
* Abstraction means a plan or template to create a class
* Abstraction means hiding the implementation details of methods
* we have two ways to implement abstraction
* 1. abstract classes
* 		It is class which contains at least one abstract method and declared using "abstract" keyword. 
* Abstract method is a method with declaration only. 
* A normal Java class "extends" this abstract class and provides implementation to the abstract methods.
* If in case this normal Java class failed to provide implementation to any one abstract method then that
* normal Java class also becomes abstract class.
* An abstract class can extends another abstract class or normal java class and it can implement an interface
* Abstract class can contain both abstract methods and concrete methods.
* 
* 
* 2. Interfaces
* 		In interface all the methods are public and abstract by default. A normal Java class "implements" 
* interface and provides implementation to the abstract methods.
* By default all the methods in Interface are public and abstract
* By default all the variables of interface are public, static and final
* An interface can extends multiple interfaces and it can't implement another interface
* A class can implement multiple interfaces and can only extends one normal class or one abstract class
* 
* From Java 8 onwards interface allows concrete methods
* These concrete methods are either static methods or "default" methods
* We can access default method using interface reference and static method using interface name
* we can override a default method of interface in implementation classes but
* we can't override static method of interface
* we can't create an instance of either abstract class or interface but we can create object reference,
* 
* Type of interfaces
* Inner interface or nested interface
* inner interface is an interface inside another interface.
* a single java class can implement the outer interface as well as 
* the inner interface or we can create two different class to implement
* outer and inner interfaces.
* 
* Marker or tagged interface
* 	it is an interface without any abstract methods like Serializable, Clonable .etc
* 	Generally these interfaces provides special instructions to the JVM
* 	we can have common parent to the multiple classes or interfaces
* 
* Functional interfaces
* 	it is an interface with only one abstract method.
* A class can implement this functional interface or we can write a lambda expression which will implement 
* the abstract method of functional interface
*/

public class AbstractionDemo {
	public static void main(String[] args) {
		// object reference to the AbstractClass and object creation to the
		// AbstractClassImpl
		AbstractClass aObj = new AbstractClassImpl();
		aObj.methodOne();
		aObj.methodTwo();
		
		// object reference to the Interface and object creation to 
		// the Implementation class
		MyInterface iObj = new MyInterfaceImpl();
		iObj.methodOne();
		iObj.methodTwo();
		
		// single class implementing multiple interfaces
		InterfaceOne i1Obj = new MultipleIntefaceImpl();
		i1Obj.methodOne();
		
//		InterfaceTwo i2Obj = new MultipleIntefaceImpl();
//		i2Obj.methodTwo();
		
//		MultipleIntefaceImpl obj = (MultipleIntefaceImpl) i1Obj;
//		obj.methodTwo();
		
		InterfaceTwo i2Obj = (InterfaceTwo) i1Obj;
		i2Obj.methodTwo();
		
		
//		Java8 interfaces
		Java8Interface jObj = new Java8IntefaceImpl();
		jObj.methodOne();
		// default method of Java8 interface
		jObj.methodThree();
		// static method of Java8 interface
		Java8Interface.methodTwo();
		
		// inner interfaces
		Outer oObj = new OuterAndInnerImpl();
		oObj.methodOne();
		
//		Outer.Inner inObj = new OuterAndInnerImpl();
		Outer.Inner inObj = (Outer.Inner)oObj;
		inObj.methodTwo();
		
//		Inner innObj = oObj.method();
//		innObj.methodTwo();
		oObj.method().methodTwo();
	}

}
