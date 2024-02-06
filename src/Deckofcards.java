import java.util.Random;
public class Deckofcards {
    public static void main(String[] args) {
        String[] suit ={ "Clubs", "Diamonds", "Hearts", "Spades"};
        String[] faces ={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] dec = new String[52];
int cardindex =0;
        for(int i=0; i< suit.length; i++){
            for (int j=0; j< faces.length;j++) {
                dec[cardindex] = suit[i] + faces[j];
                cardindex++;
            }
        }
        Random random = new Random();
        for(int i =dec.length-1 ; i>0; i--){
            int index = random.nextInt(i+1);
            String temp = dec[index];
            dec[index]= dec[i];
            dec[i]=temp;


        }
        String [][] playerscard = new String[4][9];
        int cardno=0;

        for(int i =0; i<4; i++){
            for(int j=0; j<9; j++){
                playerscard[i][j]=dec[cardno];
                cardno++;

            }
        }
        for(int i =0; i<4; i++){
            for(int j=0; j<9; j++){
                System.out.println(playerscard[i][j]);

            }
        }






    }
}
