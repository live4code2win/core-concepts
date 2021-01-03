package inheritance;
/**
 * i. InheritanceWith2InterfaceWithSameMethod => Here we are trying to implement two interface having same method. 
 * In our example 'show()' is the method in both the interfaces. It will not give any confusion of calling method or no diamond 
 * problem like c++, due to this only multiple classes cannot be extended in java.
 * 
 * Multiple Inheritance is not allowed in java but it can be achieved using interface.
 * 
 * ii. RestrictInheritance => It has the ways to restrict inheritance
 * a. By making zero parameter constructor as private. Any other constructor making private is not going to restrict the inheritance. i.e. if we make 
 * parameterized constructor as private and zero parameter constructor as public then it of no use. we need to make zero parameterized constructor as private.
 * 
 *  b. Make the class as Final.
 * 
 * 
 */
