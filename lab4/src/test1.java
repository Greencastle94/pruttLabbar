
public class test1 {
    public static void main(String[] args) {
        Composite suitcase = new Composite("Suitcase", 700);
        Composite bag = new Composite("Bag", 200);
        Composite bag2 = new Composite("Bag 2", 200);
        Composite bag3 = new Composite("Bag 3", 200);
        Composite smallPlasticBag = new Composite("Small plastic bag", 10);

        // Packing the suitcase
        suitcase.add(new Leaf("T-shirt", 100));
        suitcase.add(new Leaf("Jeans", 200));
        suitcase.add(new Leaf("Sweater", 200));
        suitcase.add(new Leaf("Shoes", 150));
        suitcase.add(bag);
        bag.add(new Leaf("Soap", 150));
        bag.add(new Leaf("Schampoo", 150));
        bag.add(new Leaf("Toothbrush", 30));
        bag.add(smallPlasticBag);
        smallPlasticBag.add(new Leaf("Hair clipper", 20));
        smallPlasticBag.add(new Leaf("Hair tie", 10));
        suitcase.add(bag2);
        bag2.add(new Leaf("Soap", 150));
        bag2.add(new Leaf("Schampoo", 150));
        bag2.add(new Leaf("Toothbrush", 30));
        suitcase.add(bag3);
        bag3.add(new Leaf("Soap", 150));
        bag3.add(new Leaf("Schampoo", 150));
        bag3.add(new Leaf("Toothbrush", 30));

        // Print out the total weight of the suitcase
        System.out.println(suitcase.getWeight() + " g");
        System.out.println();
        // Print out the items in the suitcase
        System.out.println(suitcase.toString());
    }
}
