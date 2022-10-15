package BudgetManager;

import java.util.List;

public class User {
    private String name;
    private List<Purchase> purchases;
    private Double buget;

    public User(String name, List<Purchase> purchases, Double buget) {
        this.name = name;
        this.purchases = purchases;
        this.buget = buget;
    }


    public void saveAllPurchasesToFile (){
        //Salvarea tuturor cheltuielilor intr-un fisier
    }
    public void addAllPurchasesFromFile(){
        //Incarcarea in aplicatie a tuturor cheltuielilor dintr-un fisier
    }


//---------------- getters setters -------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Double getBuget() {
        return buget;
    }

    public void setBuget(Double buget) {
        this.buget = buget;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", purchases=" + purchases +
                ", buget=" + buget +
                '}';
    }
}
