import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Arrays;
public class EvenOdd{
	public static void main(String[] args) {
	
	
		int[] even = new int [101];
		int i = 1;
		

		while (i <= 100){
			even[i] = 2*i;
			i++;
		
		} System.out.println("Your Even Numbers are" +Arrays.toString(even));
		int[] odd = new int [101];
		int x = 0;

		while ( x <= 100){
			odd[x] = 1 * x + 1;
			x++;
		} System.out.println("Your Odd Numbers are" +Arrays.toString(odd));
		
		int y = 1;
		while ( y < 26){
			switch(y){
						case 3:
					case 7: case 8: case 9:
				case 11: case 12: case 13: case 14: case 15:
					case 17: case 18: case 19: 
						case 23:
			
			System.out.print("*");
			break;
			default:
				System.out.print(" ");
			} if (y%5 == 0){
				System.out.println();
			} y++;
		}
	}
} 
