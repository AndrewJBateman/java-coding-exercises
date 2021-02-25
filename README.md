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

## :camera: Screenshots

![Example screenshot](./img/java.jpg)

## :signal_strength: Technologies

* [Java v11](https://www.java.com/en/)

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

## :envelope: Contact

* Repo created by [ABateman](https://www.andrewbateman.org) - you are welcome to [send me a message](https://andrewbateman.org/contact)