import java.util.Scanner;

class covid{
    private int var;
    covid(int var){
        this.setVar(var);
    }
    public int getVar(){                        
        return this.var;
    }
    public void setVar(int var){
        this.var = var;
    }
    public void covidZ(int var){
        boolean covid;
        if (var == 2){
            covid = false;          
        }else{
            covid = true;
        }   
        if(covid ==  true){
            System.out.println("fudeu");
        }else{
            System.out.println("ainda bem");
        }
    }
    public static void main(String[]args){
        Scanner t = new Scanner(System.in); 
        int andrew = t.nextInt();                               
        covid d = new covid(andrew);
        d.covidZ(andrew);      //class nomedavariavel =  new nomedaclasse()
    }
}