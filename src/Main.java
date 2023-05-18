public class Main {
    public static void main(String[] args) {
        Supermarket s1 = new Supermarket();
        Product f1 = new Product("apple", "fruits", 20.0, 25.5, LocalDate.of(2023, 5, 29), 120);
        Product j1 = new Product("orange juice", "Drinks", 34.0, 44.0, LocalDate.of(2024, 5, 17), 450);
        Product f2=new Product("banana","fruits",34.0,44.0,LocalDate.of(2023,5,27),59);
        Product f3=new Product("orange","fruits",76,98,LocalDate.of(2023,6,19),134);
        Product j2=new Product("watermelon juice","juice",40,70,LocalDate.of(2023,5,21),29);
        Client c3=new Client("34efe","Mohamed",54,13434,"Alex 434st",LocalDate.of(2022,4,5),320.0,"orange juice",LocalDate.of(1976,3,5));
        Client c4=new Client("dfa3","mostafa",34,3477934,"cairo,madinty,block32",LocalDate.of(2023,4,23),200,"milk",LocalDate.of(1988,8,3));
        Client c5=new Client("nioa4","mazen",20,214332,"Qena,st67",LocalDate.of(2009,2,23),4500,"watermelon juice",LocalDate.of(1998,10,11));
        Client c2 = new Client("miu33", "Ahmed", 54, 2134, "alex,22st", LocalDate.of(2008, 9, 24), 0.0, "orange juice", LocalDate.of(1989, 5, 17));
        Client c1 = new Client("mda23", "Omar", 24, 23421, "tanta,20st", LocalDate.of(2023, 4, 3), 4000, "apple", LocalDate.of(2023, 3, 2));
        Staffmember sm1 = new Staffmember("aw2", "Amr", 28, 23421443, "tanta2242st", 3900);
        Staffmember sm2 = new Staffmember("mih3", "tawheed", 43, 3413, "modern cairo", 7000);
        Staffmember sm3 = new Staffmember("gakmn3", "omar", 22, 6543, "tanta elb7r st", 1890);
        Staffmember sm4 = new Staffmember("afh3", "marwan", 23, 56343, "tanta StadiumSt", 2600);
        Staffmember sm5 = new Staffmember("fkna2", "ibrahim", 24, 934346, "alex 34st", 3300);
        PointOfSale pof1 = new PointOfSale("9yvx", "Alex", "08979km");
        PointOfSale pof2 = new PointOfSale("75ok", "qena", "08979km");
        PointOfSale pof3 = new PointOfSale("drt22", "qena", "08979km");
        PointOfSale pof4 = new PointOfSale("34t", "Alex", "08979km");
        PointOfSale pof5 = new PointOfSale("3ojui", "Tanta", "08979km");
        s1.sellProduct(f2,2,c3,sm4,pof2);

    }
}
