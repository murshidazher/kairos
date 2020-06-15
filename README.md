# Kairos
This repository is a small library which contains Java based real-world examples of many popular design patterns mentioned in the [Gang of Four Book](https://en.wikipedia.org/wiki/Design_Patterns).

* :point_up: Note that this project is meant to be used for learning and researching purposes 
only and it is **not** meant to be used for production.*

## Design Patterns

A data pattern is a 

### Design Patterns by Topic

* **Creational**
  * `A` [Abstract Factory](src/algorithms/math/bits) - set/get/update/clear bits, multiplication/division by two, make negative etc.
  * `B` [Builder Pattern](src/algorithms/math/factorial) 
  * `B` [Factory Method](src/algorithms/math/fibonacci) - classic and closed-form versions
  * `B` [Singleton](src/algorithms/math/primality-test) (trial division method)
  * `B` [Object Pool](src/algorithms/math/euclidean-algorithm) - calculate the Greatest Common Divisor (GCD)
  * `B` [Prototype](src/algorithms/math/least-common-multiple) (LCM)
* **Structural**
  * `B` [Adapter Pattern](src/structural/adapter) - product of multiple sets
  * `B` [Bridge Pattern](src/algorithms/sets/fisher-yates) - random permutation of a finite sequence
  * `A` [Composite Pattern](src/algorithms/sets/power-set) - all subsets of a set (bitwise and backtracking solutions)
  * `A` [Decorator Pattern](src/algorithms/sets/permutations) (with and without repetitions)
  * `A` [Facade Pattern](src/algorithms/sets/combinations) (with and without repetitions)
  * `A` [Flyweight Pattern](src/algorithms/sets/longest-common-subsequence) (LCS)
  * `A` [Proxy Pattern](src/algorithms/sets/longest-increasing-subsequence)
* **Behavioral**
  * `B` [Chain of Responsibility](src/algorithms/string/hamming-distance) - number of positions at which the symbols are different
  * `A` [Command Pattern](src/algorithms/string/levenshtein-distance) - minimum edit distance between two sequences
  * `A` [Iterator Pattern](src/algorithms/string/knuth-morris-pratt) (KMP Algorithm) - substring search (pattern matching)
  * `A` [Mediator Pattern](src/algorithms/string/z-algorithm) - substring search (pattern matching)
  * `A` [Observer Pattern](src/algorithms/string/rabin-karp) - substring search
  * `A` [State Pattern](src/algorithms/string/longest-common-substring)
  * `A` [Strategy Pattern](src/algorithms/string/regular-expression-matching)
  * `A` [Template Method](src/algorithms/string/regular-expression-matching)
  * `A` [Visitor Pattern](src/algorithms/string/regular-expression-matching)
