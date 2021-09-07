# simple-add-and-subtract-quiz

My solution for Chapter 5 Exercise 7 of “Introduction to Programming Using Java”.
Implementation note: At the time I originally did this exercise, I implemented it in a way that
I would now consider less than ideal. However, I am leaving it as-is to demonstrate my progression.
The current implementation could be made considerably better both in computation time and 
readability. If I were to rewrite the class, I would make an AdditionQuestion [] instance variable
that could be accessed by the methods of the AdditionQuiz.java class.

Problem Description:
Rewrite the program from the previous exercise so that it administers a quiz with several
different kinds of questions. In the previous exercise, you used a class to represent addition
questions. For this exercise, you will use the following interface, or an equivalent abstract
class, to represent the more general idea of a question that has an integer as its answer:
public interface IntQuestion {
public String getQuestion();
public int getCorrectAnswer();
}
You can make the AdditionQuestion class implement the interface simply by adding
“implements IntQuestion” to its definition. Write a similar class to represent subtrac-
tion questions. When creating a subtraction problem, you should make sure that the
answer is not negative.
For the new program, use an array of type IntQuestion[ ] to hold the quiz questions.
Include some addition questions and some subtraction questions in the quiz. You can also
add a couple non-math questions, including this one, created as an anonymous class:
IntQuestion bigQuestion = new IntQuestion() {
public String getQuestion() {
return "What is the answer to the ultimate question " +
" of life, the universe, and everything?";
}
public int getCorrectAnswer() {
return 42;
}
};

Notes: relies on AdditionQuestion.java, IntQuestion.java, and TextIO.java, provided 
by the textbook's author.
