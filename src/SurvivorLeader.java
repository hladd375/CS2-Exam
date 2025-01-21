public class SurvivorLeader {
    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";
    Shelter[] shelters = new Shelter[40];
    public static void main(String[] args) {
        new SurvivorLeader();
    }

    public SurvivorLeader (){
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");
        for(int x = 0; x < shelters.length; x++){
            shelters[x] = new Shelter((int)((Math.random()*100)+1),(int)((Math.random()*1001)));
        }
        displayShelters();
        System.out.println("It is " + checkSupplies() + " that two shelters have the same number of supplies");
        System.out.println("YAY We deciphered the secert code. It is: " + decipher(transmission));
        newDefense();
        displayShelters();
        System.out.println("Do any defense levels equal each other? This should always equal false beacuse of the new defense method.  Output: " + checkDefesne());
    }
    public void displayShelters(){
        for(int x = 0; x < shelters.length; x++){
            shelters[x].printInfo();
        }
    }
    public boolean checkSupplies (){
        boolean isEqual = false;
        for(int x = 0; x < shelters.length; x++){
            for(int i = 0; i < shelters.length; i++){
                if(shelters[x].getNumberOfSupplies() == shelters[i].getNumberOfSupplies() && i!=x){
                    isEqual = true;
                }
            }
        }

        return isEqual;
    }
    public String decipher (String secertCode){
        String dedocdedString = "";
        while(secertCode.contains("5")){
            String letter = secertCode.substring(secertCode.indexOf("5")+1,secertCode.indexOf("5")+2);
            dedocdedString += letter;
            secertCode = secertCode.substring(secertCode.indexOf("5") + 1);
        }
        return dedocdedString;
    }
    public void newDefense(){
        boolean check = true;
        int equalNum;
        for(int x = 0; x < shelters.length; x++){
            shelters[x].setDefenseLevel((int)((Math.random()*100)+1));
        }
        while(check == true){
            equalNum = 0;
            System.out.println("Running again");
            for(int x = 0; x < shelters.length; x++){
                for(int i = 0; i < shelters.length; i++){
                    if(shelters[x].getDefenseLevel() == shelters[i].getDefenseLevel() && i!=x){
                        shelters[i].setDefenseLevel((int)((Math.random()*100)+1));
                        System.out.println("Found a match");
                        equalNum ++;
                    }

                }
            }
            if (equalNum > 0){
                check = true;
            }
            if (equalNum == 0) {
                check = false;
            }
        }
    }
    public boolean checkDefesne (){
        boolean isEqual = false;
        for(int x = 0; x < shelters.length; x++){
            for(int i = 0; i < shelters.length; i++){
                if(shelters[x].getDefenseLevel() == shelters[i].getDefenseLevel() && i!=x){
                    isEqual = true;
                }
            }
        }

        return isEqual;
    }

}

