import java.util.Scanner;

class practice{
    public static void main(String[] args) {

        String positiveAnswer= "yes";
        String negativeAnswer= "no";
        String realName = "Lovenson";

        System.out.println("Are you this laptop's owner (Yes or No): ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        

        /*Making sure the user is the actual owner of this laptop */

        if (answer.equalsIgnoreCase(negativeAnswer)){
            System.out.println("Sorry, you are not the owner, Bye!");
        }

        else if (answer.equalsIgnoreCase(positiveAnswer)){
            System.out.println("Please write your name to prove it: ");
            Scanner owner= new Scanner(System.in);
            String ownerName= owner.nextLine();

            if(ownerName.equalsIgnoreCase(realName)){
                System.out.println("Congrats! You are the owner. Loggged In!");
            }

            while (! ownerName.equalsIgnoreCase(realName)){
                System.out.println("Incorrect, keep trying!");
                
                Scanner user= new Scanner(System.in);
                String userInfo= user.nextLine();
                break;


        }

    }
}

}
  
