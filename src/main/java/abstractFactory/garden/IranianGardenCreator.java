package abstractFactory.garden;

import abstractFactory.garden.flower.Khatmi;
import abstractFactory.garden.tree.Chenar;

public class IranianGardenCreator extends AbstractGardenCreator {
    @Override
    public void createTree() {
        Chenar chenar = new Chenar();
    }

    @Override
    public void createFlower() {
        Khatmi khatmi = new Khatmi();
    }
}
