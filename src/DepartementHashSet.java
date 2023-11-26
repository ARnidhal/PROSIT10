import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<departement> {

    HashSet<departement> hash=new HashSet<>();

    public DepartementHashSet() {
        this.hash = new HashSet();
    }
    @Override
    public void ajouterDepartement(departement dep) {
        hash.add(dep);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (departement i: hash) {
            if (i.getNomdep().equals(nom)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public boolean rechercherDepartement(departement departement) {
        return hash.contains(departement);
    }


    @Override
    public void supprimerDepartement(departement departement) {
        hash.remove(departement);

    }

    @Override
    public void displayDepartement() {
        for (departement dep : hash) {
            System.out.println(dep.toString());
        }

    }

    @Override
    public TreeSet<departement> trierDepartementById() {
        TreeSet<departement> tre=new TreeSet<>();
        tre.addAll(hash);

        return null;
    }
}
