package matrices;


public class Matrices {

   
    public static void main(String[] args) {
        String [] myNames={"A","B","C","D"};
        System.out.println(myNames[2]);
        
        int [] intArr = new int [5];
        System.out.println(intArr.length);
        
        int [] myArr = {6,42,3,7};
        int suma = 0;
        
        for (int i = 0; i < myArr.length; i++) {
            suma = myArr[i] + suma;
        }
        System.out.println("La suma es de: "+ suma);
        
        
        
    }
    
}
