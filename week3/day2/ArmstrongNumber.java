package week3.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		/*Print the armstrong numbers between 1 and 1000.*/
		
		//1st approach
		System.out.println("1st approach");
		int n, b, sum1 = 0;
        for(int i = 1; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum1 = sum1 + (b * b * b);
                n = n / 10;
            }
            if(sum1 == i)
            {
                System.out.println("Armstrong number = "+ i);
            }
            sum1 = 0;
        }
		
        
        
        //2nd approach
        System.out.println("2nd approach");
        int r = 0, sum2 = 0;
        for (int i = 0; i <=1000; i++) { // number to iterate 1 to 1000
			sum2 = 0; //every iteration sum should be 0 to find the cube of number
			int temp= i; // temp is for to get current iteration
			while(temp>0) { // temp should be greater than 0
				r= temp%10;  // to select last digit of number for every iteration Eg : temp = 153 first last digit(r) = 3 , then second last digit (r) = 5 , then third last digit (r) = 1
				sum2 = (int) (sum2 + Math.pow(r, 3)); // last number eg : r= 3 --> 3^3, r= 5 --> 5^3 , r=1 ---> 1^3 ; sum2 = 3^3 + 5^3 + 1^3
				temp = temp/10; // to go for next last digit
			}
			
			if(sum2 == i) { //eg : when sum2 = 1^3 + 5^3 + 3^3 = 153 iteration)
				System.out.println("Armstrong number  = " + sum2);
			}
			
			
		}
        
        
        
		
	}
	
}
