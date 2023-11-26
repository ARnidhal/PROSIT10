import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public interface IDepartement <T>{
    public void ajouterDepartement(T t);
    public boolean rechercherDepartement(String nom);
    public boolean rechercherDepartement(T t);
    public void supprimerDepartement(T t);
    public void displayDepartement();
    public TreeSet<T> trierDepartementById();

}
