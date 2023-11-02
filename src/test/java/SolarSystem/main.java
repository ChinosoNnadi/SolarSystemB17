package SolarSystem;

public class main {
    public static void main(String[] args) {
        SolarSystemBasic solarsys=new SolarSystemBasic();
        solarsys.Sun="1";
        solarsys.Moon="2";
        solarsys.Planets="2";
        solarsys.Stars="10";

        System.out.println("*************feature sun***************");
        FeatureSun sun = new FeatureSun();
        sun.name="panther";
        sun.color="black";
        sun.temp="-1223124kelvin";

        //Planet
        Planet1 plato = new Planet1();
        plato.color = "green";
        plato.name = "green";
        plato.temp = "green";
        plato.radius = "green";
    }
}
