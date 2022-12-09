package abstractFactory.garden;

import abstractFactory.garden.flower.AbstractFlower;
import abstractFactory.garden.tree.AbstractTree;

public abstract class AbstractGardenCreator {

    public abstract AbstractTree createTree();
    public abstract AbstractFlower createFlower();
}
