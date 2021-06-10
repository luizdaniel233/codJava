import java.util.Scanner;   //-leia
class Teste{
    
    private String nome;
    private int num;
    Teste(String nome,int num){                     
        this.setNome(nome);
        this.setNum(num);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNum(int num){
        this.num = num;                         
    }
    public int getNum(){
        return this.num;
    }
    public void imprime(String nome,int numero){
        if (nome != ""){
            System.out.println("O nome eh: "+ nome);
            System.out.println("Idade eh: "+ numero);
        }
       
    }




    public static void main(String[]args){
        //Scanner read = new Scanner(System.in);            
        Scanner daniel = new Scanner(System.in);
        String nome = daniel.nextLine(); //- atos
        int idade = daniel.nextInt();// -- 14
        Teste atos = new Teste(nome,idade);
        atos.imprime(nome,idade);
    }
   
   
    /*
    public static void main(String[]args){
        Scanner read = new Scanner(System.in);
        String nome = "";
        nome = read.next();
        System.out.println("o nome eh: " + nome);
    }
    */
}