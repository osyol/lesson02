// выполнение заданий с вводом чисел с клавиатуры
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    
	    
	   // ввод числа
	   System.out.println("Введите ваше число ");
	   int N = in.nextInt();
	   
	   //вывод суммы числа с 1 до N
	   int sum = 0;
	   for(int i = 1; i <= N; i++){
	       sum = sum + i;
	       
	   }
	   System.out.println("Сумма чисел от 1 до " + N + " равна " + sum);
	   
	   
	   //вывод произведения чисел от 1 до N
	   int mult = 1;
	   for (int i = 1; i <= N; i++){
	       mult *= i;
	   }
	   System.out.println("Произведение чисел от 1 до " + N + " равно " + mult + ", ровно так же как и факториал");
	   
	   
	   //вывод суммы чётных чисел от 1 до N
	   int even = 0;
	   for (int i = 0; i <= N; i+= 2){
	       even += i;
	   }
	   System.out.println("Сумма всех чётных чисел от 1 до " + N + " равна " + even);
	   
	   
	   //вывод всех простых чисел от 1 до N

        System.out.println(" Все простые числа от 0 до " + N);
        for(int i = 0; i <= N; i++){
            boolean isPrime = true;
            //   циклон чтобы узнать делится ли число на что-то между собой и единицей    
            for(int j = 2; j < i; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
        
        if(isPrime){
            System.out.print(i + " ");
        }
        }
       
    in.close();
	}
}
