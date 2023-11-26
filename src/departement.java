
import java.util.TreeSet;
public class departement {
    private int id;
    private String nomdep;
    private int nbremp;

    departement(){}

    departement(int id,String nomdep,int nbremp)
    {
        this.id=id;
        this.nomdep=nomdep;
        this.nbremp=nbremp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomdep() {

        return nomdep;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public int getNbremp() {
        return nbremp;
    }

    public void setNbremp(int nbremp) {
        this.nbremp = nbremp;
    }

    @Override
    public String toString()
    {
        return "id"+id+" "+"nom_departement"+nomdep;
    }

    public boolean equals(Object obj){
        if(obj==this)return true;
        if(obj==null)return false;
        if (obj instanceof departement)
            if(obj.getClass()==this.getClass())
            {
                departement p=(departement)obj;
                if (id==p.id && nomdep.equals(p.nomdep))
                    return true;
            }
        return false;
    }

    public int compareTo(departement dep) {
        return Integer.compare(this.id, dep.id);

    }

    public int hashCode() {
        return id+nomdep.hashCode();
    }
}
