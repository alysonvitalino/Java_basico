public class Ternario {
    public static void main(String[] args) {
        double nota = 8.0;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota<7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        
    }
}
