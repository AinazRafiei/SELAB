
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test_garden {
    @Test
    void main(){
        IranianCreatore iranianCreatore;
        IranianFlower iranianFlower;
        IranianTree iranianTree;
        JapaneseCreatoer japaneseCreatoer;
        JapaneseFlower japaneseFlower;
        JapaneseTree japaneseTree;

        iranianTree = iranianTree = iranianCreatore.CreateTree("chenar");
        iranianFlower = iranianFlower = iranianCreatore.CreateFlower("khatmi");
        japaneseTree = japaneseCreatoer = japaneseCreatoer.CreateTree("Japanese tree");
        japaneseFlower = japaneseCreatoer = japaneseCreatoer.CreateTree("Japanese flower");

        assertEquals(iranianTree.getName(), "chenar");
        assertEquals(iranianFlower.getName(), "khatmi");
        assertEquals(japaneseTree.getName(), "Japanese tree");
        assertEquals(japaneseFlower.getName(), "Japanese flower");
    }

}
