
class Test3 {
    public static void main(String[] args) {
        int lower = 5, upper = 40;
        int a = 0 , b = 1;
        while( a <= upper){
            if(a >= lower)
            {
              System.out.println(a);  
            }
            int c = a+b;
            a = b;
            b = c;
        }
    }   
}
