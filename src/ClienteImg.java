import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ClienteImg {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8080);
        System.out.println("Conectado ao Servidor");

        BufferedImage image = ImageIO.read(new File("src/imagem.png"));
        ImageIO.write(image, "png", socket.getOutputStream());

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String imagePath = in.readLine();
        System.out.println("Imagem salva em: " + imagePath);

        socket.close();
    }
}
