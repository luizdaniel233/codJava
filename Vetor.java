/*
import java.util.Scanner;
    class Vetor{
        private int tamanho;
        private int vet[];
    Vetor(int tamanho){
        this.setTamanho(tamanho);
        vet = new int[this.getTamanho()];
    }
    Vetor(){
        this.setTamanho(100);
        vet = new int[this.getTamanho()];
    }
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }
    public int getTamanho(){
        return this.tamanho;
    }
    public void setVetor(int index,int valor){
        this.vet[index] = valor;
    }
    public int getVetor(int index){
        return this.vet[index];
    }
    public void inicializa(int tamanho){
        int valor = 0;
        Scanner t = new Scanner(System.in);
        for(int i = 1;i < tamanho;i++){
            System.out.print("Valor: ");
            valor = t.nextInt();
            //valor = i;
            this.setVetor(i,valor);
        }
    }
    public boolean primo(int valor){
        if(valor == 0){
            return false;
        }else{
            if(valor == 1){
                return false;
            }
        }for (int j = 2; j < valor; j++) {
            if (valor% j == 0){
                return false; 
            }  
        }
        
        return true;
    }
    public boolean PorI(int valor){
        if((valor % 2) == 0){
            return true;
        }else{
            return false;
        }
    }
    public void verificaPorI(int tamanho){
        for(int i = 1;i <  tamanho;i++){
            if(PorI(this.getVetor(i))== true){
                System.out.println("Eh Par: " + this.getVetor(i));
            }else{
                System.out.println("Eh Ímpar: "+ this.getVetor(i));
            }
        }
    }
    public void verificaPimprime(){
        for(int i = 0;i <this.getTamanho();i++){
            if(primo(this.getVetor(i)) == true){
                System.out.println("Eh primo: "+ this.getVetor(i));
            }
        }
    }
    public boolean verificaMorm(int valor){
        boolean x = false;
       int menor;
           menor = valor;
           if(valor < menor){
               menor = valor;
               x = true;
           }else{
            x = false;
           }
          
       
       return x;
    }
    public boolean vM(int valor){
       int maior = 0;
        boolean x = false;
            if( valor > maior){
                maior = valor;
                x = true;
            }else{
                x = false;
            }
        
        return x;
    }
    public void imprime(){
        int maior = this.getVetor(0);
        int menor = Integer.MAX_VALUE;
        for(int i = 1;i < this.getTamanho();i++){
            if(this.getVetor(i) > maior){
                maior = this.getVetor(i);
            }
        }
        for (int j = 1;j < this.getTamanho();j++){
            if (this.getVetor(j) < menor){
                menor = this.getVetor(j);
               
            }
        }
        System.out.println("o maior eh: " + maior);
        System.out.println("o menor eh: " + menor);
    }
    public static void main(String [] agrs){
        Scanner trt = new Scanner(System.in);
        System.out.println("tamanho: ");
        int tamanho = trt.nextInt();
        tamanho = tamanho + 1;
        Vetor mxz = new Vetor(tamanho);
        mxz.inicializa(tamanho);
        //mxz.verificaPimprime();
        //mxz.verificaPorI(tamanho);
        mxz.imprime();
    }
    }
   
*/
