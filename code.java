public class Cal{

        public int add(int a,int b)
        {
            return a+b;
        }
  
        public int sub(int a,int b)
        {
            if(a-b<0)
            return a-b-(2*(a-b));
            
            return a-b;
        }
  
        public int mul(int a,int b)
        {
            return a*b;
        }
          
}
