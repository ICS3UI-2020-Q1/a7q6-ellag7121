/**
 * create a method that, whan given an intger, returns whether all the digits are odd or not
 * @author Graham Ellacott
 */
public class Main {

  //the method that checks all the digits in the given number and tells the user if all of them are odd or not
  public static boolean allDigitsOdd(int number){
    do{
      int digit = number % 10; //get the last digit of the number
      int remainder = digit % 2; //get the remainder of digit and 2
      if(remainder == 0){ //if the remainder is 0, it is even
        return false; //therefore, return false
      }
      number /= 10; //divide number by 10, thus removing the last digit
    }while(number > 0); //keep doing this until all numbers have been checked
    return true; //if it has gone through all digits without finding an even digit, all digits are odd
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //test the module
    for(int i = 0; i < 200; i += 7){ //count up by 7's to test the module

      if(allDigitsOdd(i)){ //if all the digits are odd
        System.out.println(i + " - true"); //tell the user they are all odd
      }else{ //if there are even digits
        System.out.println(i + " - false"); //tell the user they are not all odd
      }

    }
    
  }
}
