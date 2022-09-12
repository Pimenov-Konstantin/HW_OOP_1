public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Irina Olegrova", Gender.female);
        Person snoop = new Person("Snoop Dog", Gender.male);
        Person vika = new Person("Vika", Gender.female);
        Person olga = new Person("Olga", Gender.female);
        Person vova = new Person("Vova", Gender.male);
        Person igor = new Person("Igor", Gender.male);

        GeoTree gt = new GeoTree();
        gt.relations(irina, vika);
        gt.relations(irina, olga);
        gt.relations(irina, vova);
        gt.relations(snoop, vika);
        gt.relations(snoop, igor);
        gt.relations(snoop, vova);


        new Research(gt).familyMembers(irina,
                Relationship.parent);
        new Research(gt).familyMembers(snoop,
                Relationship.parent);
        new Research(gt).familyMembers(vika,
                Relationship.children);
        new Research(gt).familyMembers(igor,
                Relationship.children);

    }

}