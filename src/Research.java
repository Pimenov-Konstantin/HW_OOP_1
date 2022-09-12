import java.util.ArrayList;

public class Research {
    ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public void familyMembers(Person p, Relationship re) {
        ArrayList<String> result = spend(p, re);
        if (p.gender.equals(Gender.female)) {
            if (re.equals(Relationship.parent)) {
                System.out.println(p.fullName + "  Mutter  " + result);
            } else {
                System.out.println(p.fullName + "  daughter  " + result);
            }
        } else if (re.equals(Relationship.parent)) {
            System.out.println(p.fullName + " Papa " + result);
        } else {
            System.out.println(p.fullName + " Son " + result);
        }

    }

}