package Tic_Tac_Toe;
import java.util.Scanner;
import java.util.ArrayList;
public class tic_tac_toe {
    public static void main(String[] args){
        String[] choices = new String[9];
        ArrayList<Integer> handling_input = new ArrayList<>();
        for(int num = 1;num<=9;num++){
            handling_input.add(num);
        }
        int z = 3;
        int a = 5;
        choices[0] = "1";
        choices[1] = "2";
        choices[2] = "3";
        choices[3] = "4";
        choices[4] = "5";
        choices[5] = "6";
        choices[6] = "7";
        choices[7] = "8";
        choices[8] = "9";
        
        Scanner input = new Scanner(System.in);
        System.out.println("_1_|_2_|_3_\n_4_|_5_|_6_\n 7 | 8 | 9 ");
        while(a>0){
            System.out.println();
            System.out.print("Choose Player 1 for \"X\": ");
            int choice = input.nextInt();
            
            if (choice>9 || choice<1 || !handling_input.contains(choice)){
                System.out.println("!! Wrong Input !!");
                System.exit(1);    
            }
            choices[choice-1] = "X"; 
            System.out.printf("_%s_|_%s_|_%s_\n_%s_|_%s_|_%s_\n %s | %s | %s ",choices[0],choices[1],choices[2],choices[3],choices[4],choices[5],choices[6],choices[7],choices[8]);
            z = gamelogic(choices);
            if (z==2 || z==1 || a==1){
                break;    
            }
            System.out.println();
            System.out.print("Choose Player 2 for \"O\": ");
            int choice2 = input.nextInt();
            if (choice>9 || choice<1 || !handling_input.contains(choice)){
                System.out.println("!! Wrong Input !!");
                System.exit(1);
            }
            choices[choice2-1] = "O";
            System.out.printf("_%s_|_%s_|_%s_\n_%s_|_%s_|_%s_\n %s | %s | %s ",choices[0],choices[1],choices[2],choices[3],choices[4],choices[5],choices[6],choices[7],choices[8]);
            z = gamelogic(choices);
            if (z==2 || z==1){
                break;
            }
            handling_input.remove(Integer.valueOf(choice));
            a--;
        }
        System.out.println();
        if (z==3){
            System.out.println("!!A TIE!!");
        }
        else if (z==2){
            System.out.println("------PLAYER 1 WINS------");
        }
        else if (z==1){
            System.out.println("------PLAYER 2 wins------");
        }
        input.close();
    }

    public static int gamelogic(String[] choices){
        int y = 3;
        for(int i = 0;i<=6;i+=3){
            if (choices[0+i].equals(choices[1+i]) && choices[0+i].equals(choices[2+i])){
                if (choices[0+i].equals("X")){
                    y = 2;
                    return y;
                }    
                else if(choices[0+i].equals("O")){
                    y = 1;
                    return y;
                }
            }    
        }        
        for(int x = 0;x<3;x++){
            if (choices[0+x].equals(choices[3+x]) && choices[0+x].equals(choices[6+x])){
                if (choices[0+x].equals("X")){
                    y = 2;
                }    
                else if(choices[0+x].equals("O")){
                    y = 1;
                }
            }       
        }
        if (choices[0].equals(choices[4]) && choices[0].equals(choices[8])){
            if (choices[0].equals("X")){
                y = 2;
            }    
            else if(choices[0].equals("O")){
                y = 1;
            }
        }
        if (choices[2].equals(choices[4]) && choices[2].equals(choices[6])){
            if (choices[2].equals("X")){
                y = 2;
            }    
            else if(choices[2].equals("O")){
                y = 1;
            }
        }
        return y;
    }
}

