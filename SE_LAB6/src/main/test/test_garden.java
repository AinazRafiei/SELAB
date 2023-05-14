
import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_garden {
    @Test
    void main(){
        IranianCreatore iranianCreatore = new IranianCreatore();
        JapaneseCreatoer japaneseCreatoer = new JapaneseCreatoer();

        IranianTree iranianTree = iranianCreatore.createTree("chenar");
        IranianFlower iranianFlower = iranianCreatore.createFlower("khatmi");
        JapaneseTree japaneseTree = japaneseCreatoer.createTree("Japanese tree");
        JapaneseFlower japaneseFlower = japaneseCreatoer.createFlower("Japanese flower");

        assertEquals(iranianTree.getName(), "chenar");
        assertEquals(iranianFlower.getName(), "khatmi");
        assertEquals(japaneseTree.getName(), "Japanese tree");
        assertEquals(japaneseFlower.getName(), "Japanese flower");
    }

}
