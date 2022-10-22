    package vendingmachine2;
    import static java.lang.Thread.sleep; //Static thread to allow sleep commands.
    import java.util.Scanner; //Scanner Import.
    public class megaVendingMachine {
    private static int food;
    public static void main(String[] args) throws InterruptedException { // throw arg was added to pevent sleep statements from closing the console due to interruption.
    Scanner scan = new Scanner(System.in); //scanner re-defined.
        {
        System.out.print("Welcome to my Dru- I mean Candy Shop!\n"); //Candy Shop prompt.
        System.out.print("That being said, how much dough u got? \n"
                + " > ");
            int money = scan.nextInt();
            if(money < 1) {
            System.out.println("\nKid get out of here, you have chump change."); //If you input less than 1, scanner closes.
            scan.close();
        }
            while(money >= 16) {
                System.out.println("\nI see you've got a little more dough than I thought u had... I got something special for you");
                sleep(3500);
                System.out.print("\nAlright welcome to my Shop... What do you want? " //GUI Prompt
            + "\n1. Fentanilia:  $15"
            + "\n2. Weedle Woods: $30"  
            + "\n3. Black Tar-Tangerine: $40"
            + "\n4. Hennesilly: $35"
            + "\n5. Blue Chewies: $30"
            + "\n====================================================");
          System.out.print("\nAlright kid, what do you want. Don't waste my time! >"
                  + "  ");
           food = scan.nextInt(); //Scanner defines food item. Bug was resolved and doesn't require scan.next(); anymore.
           switch (food) {      
                 case 1:  //Case 1, Coca Loca.. price is $2
              if(money < 15) { //If less than price, shop re-opens to allow other items to be bought
                  System.out.println("\nKid... look you cant buy that. Try again some other time");
              }
              else {
              money -= 15;  //removes money if price requirement is met.
              System.out.println("\nAlright kid, here's your Fentanilia, dont come back here!");
              System.out.println("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
              }
              break;
                   case 2: //Case 2, Weedle Strips.. $5
                   if(money < 30 ) { //If less than price, shop re-opens to allow other items to be bought
                       System.out.println("\nKid... look you cant buy that. Try again some other time.");
                   }
                   else {
                  money -= 30; //removes money if price requirement is met.
                   System.out.println("\nAlright kid here's your Weedle Woods, dont come back here!");
                  System.out.println("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                   }
             break;
           case 3: //Case 3, Black Tar-angerine... 4$
                   if(money < 40 ) {//If less than price, shop re-opens to allow other items to be bought
                       System.out.println("Kid... look you cant buy that. Try again some other time.");
                   }
                   else {
                    money -= 40;   //removes money if price requirement is met.
                  System.out.print("\nAlright kid here's your Black Tangerine, dont come back here!");
                  System.out.print("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                   }
                  break;
           case 4: //Case 4, White Liqour... $1
                 if(money < 35 ) {//If less than price, shop re-opens to allow other items to be bought
                       System.out.println("Kid... look you cant buy that. Try again some other time.");
                   }
                   else {
                    money -= 35;  //removes money if price requirement is met.
                    System.out.print("\nAlright kid here's your Hennesilly dont come back here!");
                  System.out.print("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                  break;
                 }
                   case 5: // Case 5, Blue Tablets, $3
                   if(money < 30) {//If less than price, shop re-opens to allow other items to be bought
                       System.out.println("kid... Look you cant buy that. Try again some other time.");
                   }
                   else {
                  money -= 30; //removes money if price requirement is met.
                  System.out.print("\nAlright kid here's your Blue Chewies, dont come back here!");
                  System.out.print("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                   }
                  break;
                 default:
               System.out.println("That is not a valid number, try again"); //Invalid Entry Catch
                    }
            }
        while(money <= 15) { //If money is more than one, a loop is defined allowing the shop to open. 
            if(money < 1 ) {
                break;
            }
        System.out.println("Loading...");
        sleep(3000);  // 3s Loading time
        System.out.print("\nAlright welcome to my Shop... What do you want? " //GUI Prompt
            + "\n1. Coca Loca:  $2"
            + "\n2. Weedle Strips: $5.00"  
            + "\n3. Black Tangerine: $4"
            + "\n4. White Liqour-ish: $1"
            + "\n5. Blue Tablettos: $3"
            + "\n====================================================");
          System.out.print("\nAlright kid, what do you want. Don't waste my time! >"
                  + "  ");
           food = scan.nextInt(); //Scanner defines food item. Bug was resolved and doesn't require scan.next(); anymore.
           switch (food) {      
           
            case 1:  //Case 1, Coca Loca.. price is $2
              if(money < 2) { //If less than price, shop re-opens to allow other items to be bought
                  System.out.println("\nKid... look you cant buy that. Try again some other time");
              }
              else {
              money -= 2;  //removes money if price requirement is met.
              System.out.println("\nAlright kid, here's your Coca Loca, dont come back here!");
              System.out.println("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
              }
              break;
                   case 2: //Case 2, Weedle Strips.. $5
                   if(money < 5 ) { //If less than price, shop re-opens to allow other items to be bought
                       System.out.println("Kid... look you cant buy that. Try again some other time.");
                   }
                   else {
                  money -= 5; //removes money if price requirement is met.
                   System.out.println("\nAlright kid here's your Weedle Strips, dont come back here!");
                  System.out.println("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                   }
             break;
           case 3: //Case 3, Black Tar-angerine... 4$
                   if(money < 4 ) {//If less than price, shop re-opens to allow other items to be bought
                       System.out.println("Kid... look you cant buy that. Try again some other time.");
                   }
                   else {
                    money -= 4;   //removes money if price requirement is met.
                  System.out.print("\nAlright kid here's your Black Tangerine, dont come back here!");
                  System.out.print("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                   }
                  break;
           case 4: //Case 4, White Liqour... $1
                 if(money < 1 ) {//If less than price, shop re-opens to allow other items to be bought
                       System.out.println("Kid... look you cant buy that. Try again some other time.");
                   }
                   else {
                    money -= 1;  //removes money if price requirement is met.
                    System.out.print("\nAlright kid here's your White Liqour-ish dont come back here!");
                  System.out.print("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                  break;
                 }
                   case 5: // Case 5, Blue Tablets, $3
                   if(money < 3) {//If less than price, shop re-opens to allow other items to be bought
                       System.out.println("kid... Look you cant buy that. Try again some other time.");
                   }
                   else {
                  money -= 3; //removes money if price requirement is met.
                  System.out.print("\nAlright kid here's your Blue Tablettos, dont come back here!");
                  System.out.print("\nOh and hey kid, heres your change!" + " You have: " + "$" + money + " left");
                   }
                  break;
                 default:
               System.out.println("That is not a valid number, try again"); //Invalid Entry Catch  
                     }
                }
           }
        }
    }
         