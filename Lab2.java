import java.util.Scanner;
import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        //Task 1
        int[] numbers = {2, 5,8,3,4,6,10,20,1,11};
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num= input.nextInt();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==num){
                System.out.println("Number can be found at index "+i);
                break;
            }
        }

        //Task 2
        System.out.print("Enter a number : ");
        int num1= input.nextInt();
        System.out.print("Enter another number : ");
        int num2= input.nextInt();

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==num1){
                for(int j=0; j<numbers.length; j++){
                    if(numbers[j]==num2){
                        numbers[i]=num2;
                        numbers[j]=num1;
                        System.out.println("Updated array(numbers): "+Arrays.toString(numbers));
                        break;
                    }
                }
            }
        }
        //Task 3
        //Ascending order
        Arrays.sort(numbers);
        System.out.println("Ascending order: "+Arrays.toString(numbers));
        //Descending order
        for(int i=0; i<numbers.length/2; i++){
            int temp=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=temp;
        }
        System.out.println("Descending order: "+Arrays.toString(numbers));

        //Task 4
        System.out.print("Enter a number : ");
        int number= input.nextInt();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==number){
                System.out.println(number + " can be found at index " + i);
                break;
            }
        }

        //Task 5
        System.out.print("Enter a number : ");
        int numb= input.nextInt();
        int start= 0;
        int end= numbers.length-1;
        while(start<=end) {
            int middle = (start + end) / 2;
            if(numbers[middle]==numb){
                System.out.println(numb+ " can be found at index "+ middle);
                break;
            }
            else if(numbers[middle]<numb){
                start=middle+1;
            }
            else{
                end=middle-1;
            }
        }
    }
}

