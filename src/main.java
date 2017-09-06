import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by arkan on 06.09.2017.
 */
public class main {
    public static void main(String[] argc) throws IOException {

        File path = new File("D:\\zrodlo\\");
        List imageCollection = new ArrayList();
        File[] files = path.listFiles();
        for(int i=0; i<files.length; i++){
            if(files[i].isFile()){
                imageCollection.add(files[i]);
            }
        }




        System.out.println("files length: " + files.length);

        BufferedImage result = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
        Graphics g = result.getGraphics();

        BufferedImage bi = ImageIO.read(new File("D:\\zrodlo\\test.jpg"));
        g.drawImage(bi, 0, 0, null);
        g.drawImage(bi, bi.getWidth(), 0, null);
        g.drawImage(bi, 0, bi.getHeight(), null);
        g.drawImage(bi, bi.getWidth(), bi.getHeight(), null);

        ImageIO.write(result, "jpg", new File("D:\\zrodlo\\result.jpg"));

    }
}
