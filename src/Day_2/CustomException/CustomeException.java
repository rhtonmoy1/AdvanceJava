package Day_2.CustomException;

//Java Custom Exception
//        In Java, we can create our own exceptions that are derived classes of the Exception class.
//        Creating our own Exception is known as custom exception or user-defined exception. Basically, Java custom exceptions are used to customize the exception according to user need.
//
//        Consider the example 1 in which InvalidAgeException class extends the Exception class.
//
//        Using the custom exception, we can have your own exception and message.
//        Here, we have passed a string to the constructor of superclass i.e. Exception class that can be obtained using getMessage() method on the object we have created.
//
//        In this section, we will learn how custom exceptions are implemented and used in Java programs.

//Why use custom exceptions?
//        Java exceptions cover almost all the general type of exceptions that may occur in the programming. However, we sometimes need to create custom exceptions.
//
//        Following are few of the reasons to use custom exceptions:
//
//        To catch and provide specific treatment to a subset of existing Java exceptions.
//        Business logic exceptions: These are the exceptions related to business logic and workflow. It is useful for the application users or the developers to understand the exact problem.
//        In order to create custom exception, we need to extend Exception class that belongs to java.lang package.
//
//        Consider the following example, where we create a custom exception named WrongFileNameException:
//
//public class WrongFileNameException extends Exception {
//    public WrongFileNameException(String errorMessage) {
//        super(errorMessage);
//    }
//}
//Note: We need to write the constructor that takes the String as the error message and it is called parent class constructor.


//Example 1:
//        Let's see a simple example of Java custom exception. In the following code, constructor of InvalidAgeException takes a string as an argument.
//        This string is passed to constructor of parent
//class Exception using the super() method. Also the constructor of Exception class can be called without using a parameter and calling super() method is not mandatory.

// class representing custom exception
class InvalidAgeException  extends Exception
{
    public InvalidAgeException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}

// class that uses custom exception InvalidAgeException
public class CustomeException
{

    // method to check the age
    static void validate (int age) throws InvalidAgeException{
        if(age < 18){

            // throw an object of user defined exception
            throw new InvalidAgeException("age is not valid to vote");
        }
        else {
            System.out.println("welcome to vote");
        }
    }

    // main method
    public static void main(String args[])
    {
        try
        {
            // calling the method
            validate(13);
        }
        catch (InvalidAgeException ex)
        {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }
}


