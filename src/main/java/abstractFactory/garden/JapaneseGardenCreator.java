package abstractFactory.garden;

import abstractFactory.garden.flower.AbstractFlower;
import abstractFactory.garden.flower.G1;
import abstractFactory.garden.tree.AbstractTree;
import abstractFactory.garden.tree.J1;

public class JapaneseGardenCreator extends AbstractGardenCreator {
    @Override
    public AbstractTree createTree() {
        return new J1();
    }

    @Override
    public AbstractFlower createFlower() {
        return new G1();
    }
}
