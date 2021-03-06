import java.awt.Color;

public class GrayScale {
    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);

        int width = picture.width();
        int height = picture.height();

        // convert to grayscale
        for (int col = 0; col < width; col++) {
            for (int row = 0; row < height; row++) {
                Color color = picture.get(col, row);
                Color gray = LuminanceLib.toGray(color);
                picture.set(col, row, gray);
            }
        }

        picture.show();
    }
}
