import javax.swing.JOptionPane;
public class Senha {

	private static String gerarSenha(){
        //int qtdeMaximaCaracteres = 8;
        int qtdeMaximaCaracteres = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da sua senha: "));
        String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
                    "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                    "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                    "x", "y", "z","+","-","/","*","_","!","@","$","%","&"};
        
        StringBuilder senha = new StringBuilder();
    
        for (int i = 0; i < qtdeMaximaCaracteres; i++) {
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
        
    }
    private static String gerarSenha(int qtdeMaximaCaracteres){
        
        String[] caracteres = { "0", "1", "b", "2", "4", "5", "6", "7", "8",
                    "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
                    "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
                    "x", "y","z","+","-","/","*","_","!","@","$","%","&"};
        
        StringBuilder senha = new StringBuilder();
    
        for (int i = 0; i < qtdeMaximaCaracteres; i++){ 
            int posicao = (int) (Math.random() * caracteres.length);
            senha.append(caracteres[posicao]);
        }
        return senha.toString();
    }
    public String gerarSenha(String ContemPalavra, int Repetir){
        // implementar o codigo para gerar a senha e repetir a Palavra especial
        return "Sua senha";
    }
    
    public static void main(String[] args) {
       System.out.println("Sua senha: " + gerarSenha());
        
}
}