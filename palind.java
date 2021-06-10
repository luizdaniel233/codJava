import java.util.Scanner;
class palind{
    private String palavra;
    palind(String palavra){
        this.setPalavra(palavra);
    }
    public void setPalavra(String palavra){
        this.palavra = palavra;
    }
    public String getPalavra(){
        return this.palavra;
    }
    public void palindrome(String palavra){
        String x = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(x)){
            System.out.println("palindrome: " + x);
        }else{
            System.out.println("n eh paalindrome" );
        }

    }
    public static void main(String[]args){
        Scanner trt = new Scanner(System.in);
        String palavra = trt.next();
        palind xtx = new palind(palavra);
        xtx.palindrome(palavra);
    }
}
