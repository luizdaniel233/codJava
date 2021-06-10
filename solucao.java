import java.util.Scanner;
class solucao{
    public static void main (String []args){
        String entrada;
        String ent[] = new String[200];
        int i = 0;
        Scanner read = new Scanner(System.in);
        while((entrada = read.nextLine()) != null){
            ent[i] = entrada;
            i++;
            if(i > 200){
                break;
            }
        }
        for(int j = 0;j < i;j++){
            System.out.println(ent[j]);
        }
        

    }
}