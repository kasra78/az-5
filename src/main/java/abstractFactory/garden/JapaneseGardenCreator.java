package abstractFactory.garden;

import abstractFactory.garden.flower.G1;
import abstractFactory.garden.tree.J1;

public class JapaneseGardenCreator extends AbstractGardenCreator {
    @Override
    public void createTree() {
        J1 tree = new J1();
    }

    @Override
    public void createFlower() {
        G1 flower = new G1();
    }
}
