public class App {
    public static void main(String[] args) throws Exception {
        String welcome = "Welcome to Battleship!!!\n\n";
        //imprime a mensagem lentamente
        for (int i = 0; i < welcome.length(); i++) {
            System.out.print(welcome.charAt(i));
            Thread.sleep(80); // tempo em milissegundos
        }
        //iniciando o programa
        ReceiveCoordinates inicia = new ReceiveCoordinates();
        inicia.receiveCoordinates();
    }
}
