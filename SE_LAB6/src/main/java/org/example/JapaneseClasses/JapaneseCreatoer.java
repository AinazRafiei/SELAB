package org.example.JapaneseClasses;

import org.example.AbstractClasses.AbstractGardenCreator;

public class JapaneseCreatoer extends AbstractGardenCreator {
    @Override
    public JapaneseTree createTree(String x) {
        return new JapaneseTree(x);
    }

    @Override
    public JapaneseFlower createFlower(String x) {
        return new JapaneseFlower(x);
    }
}
