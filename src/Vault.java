
public class Vault {
  
    private int code = 0;
    boolean trycode(int b) {
    	if(b == code) {
		return true;
    	}  
    	else {
    		return false;
    	}
    
    }  
    
    
    
    public static void main(String[] args) {
		
		// TODO Auto-generated method stub
Vault a = new Vault();
System.out.println(a.trycode(1));
	}
}
