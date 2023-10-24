class Test4 {
    public static void main(String[] args) {
        int  upper = 10;
       
        int a = 0 , b = 1;
        for( int i = 1 ;  i <= upper;){
            if(a%2==0)
            {
              System.out.println(a); 
              i++; 
            }
            int c = a+b;
            a = b;
            b = c;
        }
    } 
}
