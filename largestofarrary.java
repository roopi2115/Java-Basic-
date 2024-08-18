/* Here's the program that finds the largest number of the array */
public class largestofarrary{
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b=a[0];
        for(int i=0; i<a.length ;i++)
        {
            if( b<a[i])
            b=a[i];
        }
        System.out.println(b); 
    }
}

    