public class HighLow {



   public static int getUsersGuessedNumber(){
       System.out.println("Guess the number!");
       int usersGuessedNum = MethodsExercises.getInteger(1,100);
       return usersGuessedNum;
   }


   public static void highLowGame() {
        int randomNumber = MethodsExercises.getRandomNumber(1,100);
        int usersLastGuess;
//       System.out.println(randomNumber);
       do{
           usersLastGuess = getUsersGuessedNumber();
           if(usersLastGuess > randomNumber ) {
               System.out.println("Bruh, you need to go LOWER!");
           }else if(usersLastGuess < randomNumber) {
               System.out.println("My guy, go HIGHER!");
           }
       }while (usersLastGuess != randomNumber);

       System.out.println("RIGHT ON THE MONEY!!!");
   }



    public static void main(String[] args) {

       highLowGame();



    }// end of main






}//end of HighLow
