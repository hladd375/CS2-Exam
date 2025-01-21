public class Shelter {
    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter (int pDefenseLevel, int pNumberOfSupplies){
        defenseLevel = pDefenseLevel;
        numberOfSupplies = pNumberOfSupplies;
    }
    public int getDefenseLevel (){
        return defenseLevel;
    }
    public int getNumberOfSupplies(){
        return numberOfSupplies;
    }
    public void setDefenseLevel (int pDefenseLevel){
        defenseLevel = pDefenseLevel;
    }
    public void setNumberOfSupplies (int pNumberofSupplies){
        numberOfSupplies = pNumberofSupplies;
    }
    public void printInfo(){
        System.out.println("For this shelter the defense level is: " + defenseLevel + " and the we have " + numberOfSupplies + " supplies");
    }
}

