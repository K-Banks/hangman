#### _Java Hangman_

#### By: _**Kayl Eubanks and Matt Miller**_

## Description

_This is an application to play a game of hangman in the command line with a randomly selected word from a pre-prepared list._

## Setup/Installation Requirement for Developers:

* Clone repository on your local computer from https://github.com/K-Banks/hangman
* If you already have Java and IntelliJ IDEA installed, then skip to "Running Application"

  #### Java Installation Instructions:
  * Navigate to http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
  * Download appropriate Java SDK
  * Install file
  * Navigate to https://www.java.com/en/
  * Download Java JRE
  * Install file
  * open Command Line/Bash/Console
  * run command '$ java -version' to confirm installation

  #### IntelliJ IDEA Installation Instructions:
  * Navigate to https://www.jetbrains.com/idea/#chooseYourEdition
  * Download the community version (available for free)
  * Install file

  #### Running Application:
  * Open IntelliJ IDEA
  * Go to File -> Open
  * Find the project folder and open from root directory of project
  * Select src -> main -> java -> App.java
  * Right click on App.java
  * Press 'Run'
  * Follow instructions given by program in the CLI of IntelliJ

## Specs
 | Spec | Sample Input | Sample Output |
 | :----------- | :----------- | :----------- |
 | Starting/Restarting game will provide a random word from a list | "Start new game?" | _ _ _ _ _ |
 | Submit a letter for a guess, returns letter in corresponding blank space of mystery word if present | "a" | _ _ a _ _ |
 | Submit a letter for a guess, decremements guess counter if incorrect | "z" Guesses remaining: 3 | Guesses remaining: 2 |
 | Incorrect guesses will be displayed back to user | Incorrect guesses: "x, y" | Incorrect guesses: "x, y, z" |
 | Repeat character guesses are considered invalid | "z" | "You have already guessed 'z'. Please enter a new guess:" |
 | Correctly guessing all characters returns a win | "w" | s w a r m   "You win" |
 | Incorrectly guessing a character 6 times returns a lose | "q" Guesses remaining: 1 | "You lose" |

## Known Bugs

_No known bugs._
_Please contact author at kayleubanks@gmail.com with any bugs._

## Technologies Used

 * Java
 * IntelliJ IDEA
 * Gradle
 * JUnit

### License

This software is licensed under the MIT license.

Copyright (c) 2018 ****_Kayl Eubanks_****
