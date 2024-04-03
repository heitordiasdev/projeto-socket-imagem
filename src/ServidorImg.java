import java.net.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ServidorImg {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Servidor está rodando");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Cliente conectado");

            BufferedImage image = ImageIO.read(ImageIO.createImageInputStream(socket.getInputStream()));
            File outputFile = new File("recebi.png");
            ImageIO.write(image, "png", outputFile);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println(outputFile.getAbsolutePath());

            System.out.println("Imagem salva em: " + outputFile.getAbsolutePath());
            socket.close();
        }
    }
}
