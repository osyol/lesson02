// отдельно задания без ввода числа с клавиатуры
public class Main
{
	public static void main(String[] args) {
        
        // вывод чисел от 1 до 100 с сдвигом строки при каждой десятке
        for (int i = 1;i < 101 ;i++ ){
            System.out.print(i + " ");
                if(i % 10 == 0){
                    System.out.print("\n");
                }
        } 
        
        // минимальное число больше 1000 которое делится на 7
        int seven = 0;
        for (int i = 0; i <=2000; i++){
            if(i % 7 == 0 && i > 1000){
                System.out.println("минимальное число больше 1000 которое делится на 7: " + i);
                break;
            }
        }
        
    

	}
}
