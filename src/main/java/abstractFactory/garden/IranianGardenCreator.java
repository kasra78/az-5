package abstractFactory.garden;

import abstractFactory.garden.flower.AbstractFlower;
import abstractFactory.garden.flower.Khatmi;
import abstractFactory.garden.tree.AbstractTree;
import abstractFactory.garden.tree.Chenar;

public class IranianGardenCreator extends AbstractGardenCreator {
    @Override
    public AbstractTree createTree() {
        return new Chenar();
    }

    @Override
    public AbstractFlower createFlower() {
        return new Khatmi();
    }
}
