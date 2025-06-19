import java.util.Scanner;
public class stuavg{
    public static void main(String args[]){
        System.out.println("Enter the total Number of students");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();


        //storing name of the students 
        System.out.println("Enter the Name of the Students Respectively");
        String[] name = new String[n];
        for(int i = 0 ; i<n ; i++){
            name [i] = sc.nextLine(); 
        }


        //storing the marks in physics 
        System.out.println("Enter the Marks in Physics of the Students Respectively");
        int [] phy = new int [n];
        for(int i = 0 ; i<n ; i++){
            phy[i] = sc.nextInt(); 
        }
        

        //storing the marks in chem
        System.out.println("Enter the Marks in Chemistry of the Students Respectively");
        int [] chem = new int [n];
        for(int i = 0 ; i<n ; i++){
            chem [i] = sc.nextInt(); 
        }


        //storing the marks in maths 
        System.out.println("Enter the Marks in Maths of the Students Respectively");
        int[] maths = new int [n];
        for(int i = 0 ; i<n ; i++){
            maths[i] = sc.nextInt(); 
        }


        //storing the marks in bio 
        System.out.println("Enter the Marks in Biology of the Students Respectively");
        int [] bio = new int [n];
        for(int i = 0 ; i<n ; i++){
            bio [i] = sc.nextInt(); 
        }


        //storing the marks in english 
        System.out.println("Enter the Marks in English of the Students Respectively");
        int [] eng = new int [n];
        for(int i = 0 ; i<n ; i++){
            eng[i] = sc.nextInt(); 
        }


        //storing the marks in computer
        System.out.println("Enter the Marks in Computer of the Students Respectively");
        int [] comp = new int [n];
        for(int i = 0 ; i<n ; i++){
            comp [i] = sc.nextInt(); 
        }


        //average marks 
        float [] avg = new float[n];
        for (int i = 0 ; i <n ; i++){
            avg [i] =  (phy[i] + chem[i] + maths[i] + bio[i] + eng[i] + comp[i]) / 6 ;
        }


        //average marks of the class
        float  avgc = 0;
        for (int i =0;i<n ; i++){
            avgc = avgc + avg[i] ;
        }
        avgc = avgc / n;


        //science subject average
        float [] sci = new float [n];
        for (int i = 0 ; i < n ;i++){
            sci[i] = (phy[i] + chem[i] + bio[i])/3 ;
        }


        //highest average 
        float max = avg[0];
        for ( int i = 1 ; i < n ; i++){
            if(max < avg[i]){
                max = avg[i];
            }
        }
        int a = 0 ;
        for( int i = 0 ; i < n ; i++){
            if( max == avg[i] )
                a = i ;
        }


        //printig the data
        for(int i = 0 ; i < n ; i++){
        System.out.println("Name of the Student :"+ name[i]);
        System.out.println();
        System.out.println("Marks scored in different Subjects are :");
        System.out.println();
        System.out.println("Physics       :"+ phy[i]);
        System.out.println("Chemistry     :"+ chem[i]);
        System.out.println("Mathematics   :"+ maths[i]);
        System.out.println("Biology       :"+ bio[i]);
        System.out.println("English       :"+ eng[i]);
        System.out.println("Computer      :"+ comp[i]);
        System.out.println();
        System.out.println("Average marks :"+ avg[i]);
        System.out.println("Average marks of the class :"+ avgc);
        System.out.println("Average marks in Scince :"+ sci[i] );
        }
        System.out.println();
        System.out.println();
        System.out.println("Highest average in the class :"+avg[a]);
    }
}