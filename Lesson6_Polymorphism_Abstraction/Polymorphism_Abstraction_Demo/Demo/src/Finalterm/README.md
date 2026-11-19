###### In Polymorphism Demo program, I demonstrated it as an animals. I created an Animal parent class and two child classes, Dog and Cat and each animal has its own sound. When I run the program, the Dog makes a barking sound while the Cat makes a meowing sound. While in Abstraction Demo, I demonstrated it as vehicles. I created an abstract Vehicle class and two child classes, Car and Motorcycle. Each vehicle has its own way of starting its engine. I also added a common message that is displayed before showing how each vehicle starts.

###### 

* ###### **Explain how polymorphism works in your code. Identify the parent class, child classes, and overridden method.**

###### 

###### In my program, I used polymorphism by allowing the Dog and Cat classes to use the same makeSound() method but produce different sounds. I created Animal as the parent class, while Dog and Cat are the child classes. I used @Override so each child class could have its own version of the parent's method. I also used Animal references to call the methods of the Dog and Cat objects.

###### 

* ###### **Explain how abstraction works in your code. Identify the abstract class, abstract method, and its implementation.**

###### 

###### In this program, I used abstraction by creating an abstract Vehicle class that provides a common structure for different vehicles. I created an abstract method called startEngine() without a method body. The Car and Motorcycle classes extend Vehicle and provide their own instructions for starting the engine. I also added a regular method called displayMessage() that both child classes can use.

###### 

* ###### **Explain the difference between polymorphism and abstraction.**

###### 

###### In my understanding, polymorphism focuses on allowing different objects to use the same method but produce different results. In my program, the Dog and Cat use makeSound() but display different sounds. On the other hand, abstraction focuses on providing a common structure without showing all the details. Like in my program, Vehicle provides the startEngine() method, while Car and Motorcycle provide their own instructions for starting their engines.

###### 

###### In simple words, I use polymorphism when I want different objects to perform the same method in different ways, while I use abstraction when I want to create a common structure that child classes can follow.

###### 

* ###### **Following Questions:**

###### 

###### **1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?**

###### 

###### For me, method overriding is important because it allows each child class to have its own behavior while using the same method from the parent class. If a child class does not override the parent's method, it will just use the original method from the parent class.

###### 

###### **2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?**

###### 

###### I cannot create an object directly from an abstract class because it may contain methods that do not have complete instructions yet. This makes sure that the child classes provide the missing methods before they can be used. It also helps me create a proper structure for related classes.

###### 

###### **3. If you need to add another child class to your polymorphism program, how would your existing code handle it?**

###### 

###### If I need to add another child class, I can create a new class that extends Animal and overrides the makeSound() method. For example, I can add a Bird class that makes a chirping sound. I can then use an Animal reference to create a Bird object and call its method without changing my existing Dog and Cat classes.

###### 

###### **4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.**

###### 

###### Yes, I can use polymorphism and abstraction together in one program. For example, I can create an abstract Animal class with an abstract makeSound() method. Then, I can create Dog and Cat classes that extend Animal and provide their own sounds. I can use an Animal reference to call their methods. This allows me to demonstrate abstraction through the abstract class and polymorphism through their different behaviors.

###### 

###### **5. As a future programmer, when would you use polymorphism, and when would you use abstraction?**

###### 

###### As a future programmer, I would use polymorphism when I want different objects to perform the same method but produce different results. I would use abstraction when I want to create a common structure for related classes without showing all the details. I believe both concepts can help me make my programs more organized, easier to understand, and easier to maintain.

