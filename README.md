# Kairos
This repository is a small library which contains Java based real-world examples of many popular design patterns mentioned in the [Gang of Four Book](https://en.wikipedia.org/wiki/Design_Patterns).

:point_up: Note that this project is meant to be used for learning and researching purposes 
only and it is **not** meant to be used for production.*

## Design Patterns

A data pattern is a 

### Design Patterns by Topic

`B` - Beginner, `A` - Advanced

* **Creational**
  * `A` [Abstract Factory](src/creational/abstract) - set/get/update/clear bits, multiplication/division by two, make negative etc.
  * `B` [Builder Pattern](src/creational/builder) 
  * `B` [Factory Method](src/creational/factory) - classic and closed-form versions
  * `B` [Singleton](src/creational/singleton) (trial division method)
  * `B` [Object Pool](src/creational/objectPool) - calculate the Greatest Common Divisor (GCD)
  * `B` [Prototype](src/creational/prototype) (LCM)
* **Structural**
  * `B` [Adapter Pattern](src/structural/adapter) - product of multiple sets
  * `B` [Bridge Pattern](src/structural/bridge) - random permutation of a finite sequence
  * `A` [Composite Pattern](src/structural/composite) - all subsets of a set (bitwise and backtracking solutions)
  * `A` [Decorator Pattern](src/structural/decorator) (with and without repetitions)
  * `A` [Facade Pattern](src/structural/facade) (with and without repetitions)
  * `A` [Flyweight Pattern](src/structural/flyweight) (LCS)
  * `A` [Proxy Pattern](src/structural/proxy)
* **Behavioral**
  * `B` [Chain of Responsibility](src/behavioral/chainOfResponsibility) - number of positions at which the symbols are different
  * `A` [Command Pattern](src/behavioral/command) - minimum edit distance between two sequences
  * `A` [Iterator Pattern](src/behavioral/iterator) (KMP Algorithm) - substring search (pattern matching)
  * `A` [Mediator Pattern](src/behavioral/mediator) - substring search (pattern matching)
  * `A` [Observer Pattern](src/behavioral/memento) - substring search
  * `A` [State Pattern](src/behavioral/observer)
  * `A` [Strategy Pattern](src/behavioral/state)
  * `A` [Template Method](src/behavioral/template)
  * `A` [Visitor Pattern](src/behavioral/visitor)
