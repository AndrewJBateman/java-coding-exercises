# :zap:Java Coding Exercises
 
* Java coding practise for Java Programming Masterclass - see [:clap: Inspiration](#clap-inspiration) below

*** Note: to open web links in a new window use: _ctrl+click on link_**

## :page_facing_up: Table of contents

* [:zap: Angular Material Table](#zap-angular-material-table)
  * [:page_facing_up: Table of contents](#page_facing_up-table-of-contents)
  * [:books: General info](#books-general-info)
  * [:camera: Screenshots](#camera-screenshots)
  * [:signal_strength: Technologies](#signal_strength-technologies)
  * [:floppy_disk: Setup](#floppy_disk-setup)
  * [:computer: Code Examples](#computer-code-examples)
  * [:cool: Features](#cool-features)
  * [:clipboard: Status & To-Do List](#clipboard-status--to-do-list)
  * [:clap: Inspiration](#clap-inspiration)
  * [:envelope: Contact](#envelope-contact)

## :books: General info

* [listIterator](https://www.geeksforgeeks.org/arraylist-listiterator-method-in-java-with-examples/) used to iterate to next and previous tracks
* [Overriding](https://www.geeksforgeeks.org/overriding-in-java/) used in child classes to implement a parent-class method
* [Java inner class](https://www.w3schools.com/java/java_inner_classes.asp)
* [Java abstract class](https://www.w3schools.com/java/java_abstract.asp) a restricted class that cannot be used to create objects
* [Java Generics](https://www.baeldung.com/java-generics) add a layer of abstraction over types to reduce bugs
* [Java Access Modifiers](https://www.javatpoint.com/access-modifiers) private - only within the class, default - only within the package, protected - within the package and outside the package through a child class, public - access everywhere
* [Java Interfaces](https://docs.oracle.com/javase/tutorial/java/concepts/interface.html)
* [Java HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html) Hash table based implementation of the Map interface (allows null values)
* [Java HashCode](https://www.baeldung.com/java-hashcode) used to return an integer value, generated by a hashing algorithm.
* [The NullPointerException (NPE)](https://docs.oracle.com/javase/7/docs/api/java/lang/NullPointerException.html)  occurs when you declare a variable but did not create an object and assign it to the variable before trying to use the contents of the variable (called dereferencing). So you are pointing to something that does not actually exist.
* [The Map.computeIfAbsent() method](https://www.baeldung.com/java-map-computeifabsent) introduced in Java 8, it checks if the key is present in the map. If the key is present and a non-null value is related to the key, then it returns that value.
* [getOrDefault(key, defaultValue) method](https://www.geeksforgeeks.org/properties-getordefaultkey-defaultvalue-method-in-java-with-examples/) returns the value fetched corresponding to this key, if present. If there is no such mapping, then it returns the defaultValue.
* [Java checkbox](https://openjfx.io/javadoc/13/javafx.controls/javafx/scene/control/CheckBox.html)
* [Java Interface Runnable](https://docs.oracle.com/javase/7/docs/api/java/lang/Runnable.html)
* [Java Class DateTimeFormatter](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html) used for printing and parsing date-time objects

**JavaFX**
* [JavaFX FXML](https://docs.oracle.com/javafx/2/get_started/fxml_tutorial.htm) an XML-based language that provides the structure for building a user interface separate from the application logic.
* [VBox](http://tutorials.jenkov.com/javafx/vbox.html)
* [Java Look and Feel Graphics Repo.](https://www.oracle.com/java/technologies/java-look-and-feel-graphics-repository.html) collection of toolbar button graphics for use with the Java look and feel

## :camera: Screenshots

![Example screenshot](./img/java.jpg)

## :signal_strength: Technologies

* [Java v11](https://www.java.com/en/)
* [Java look and feel Graphics Repository](https://www.oracle.com/java/technologies/java-look-and-feel-graphics-repository.html)

## :floppy_disk: Setup

* Open each folder in an IDE such as IntelliJ.

## :computer: Code Examples

* tba

```java
// stores the values in the list
@Override
public void read(List<String> savedValues) {
  if(savedValues != null && savedValues.size() > 0) {
    this.name = savedValues.get(0);
    this.hitPoints = Integer.parseInt(savedValues.get(1));
    this.strength = Integer.parseInt(savedValues.get(2));
    this.weapon = savedValues.get(3);
  }
}
```

## :cool: Features

* IntelliJ

## :clipboard: Status & To-Do List

* Status: Course part complete
* To-Do: Complete course

## :clap: Inspiration

* [Udemy: Java Programming Masterclass for Software Developers](https://www.udemy.com/course/java-the-complete-java-developer-course/learn/lecture/3561816#overview)
* [Youtube video, how to configure JavaFX module](https://www.youtube.com/watch?v=qn2tbftFjno)

## :envelope: Contact

* Repo created by [ABateman](https://www.andrewbateman.org), email: gomezbateman@yahoo.com
