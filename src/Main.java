import BUILDER.Meal;
import BUILDER.MealBuilder;
import FACADE.Car;
import NULLOBJECT.PassangerFactory;
import STATE.Context;
import STATE.StartState;
import STATE.StopState;

public class Main {

    public static void main(String[] args) {
        testState();
    }

    public static void testState(){
//        State jest uzywany aby unikac drabinek if- ow, tworzymy interfejs state, ktory implementuja
//        klasy symbolizujace stany, do interfejsu wrzucamy funkcje ktora wszyskite musza dziedziczyc, np zmien stan
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

    public static void testFacade(){
        //Fasada udostepnia urzytkownikowi tylko fragment funcjonalnosci, ukrywajac elementy, ktore moga
        //skomplikowac mu zycie, np jak odpalasz auto nie musisz recznie wszystkiego po kolei odpalac, tylko
        //komputer pokladowy/ jakis uklad scalony robi to za ciebie
        Car car = new Car();
        car.turnOn();
        car.turnOff();
    }

    public static void testNullObject(){
        // Wzorzec nullObject usuwa problem wystepowania nullpointerexception, moze sie przydac tam gdzie np
        // chcemy cos sprawdzic, mamy sklep z produktami, robimy wyszukiwarke, tworzymy klase abstrakcyjna
        // produkt, jest zwyklypordukt i nullprodukt, toString zwraca nam "nazwa produktu to: "
        // albo w przypadku nie istniejacego produktu zwraca nam "taki produkt nie istnieje"
        System.out.println(PassangerFactory.getPassanger("Joe").getName());
        System.out.println(PassangerFactory.getPassanger("pawel").getName());
    }

    public static void testBuilder(){
        //Wzorzec builder zaklada ze mamy jakis wiekszy obiekt (posilek), skladajacy sie z kilku mniejszych
        //(burger, napoj, cokolwiek) , klasa buildera ma za zadanie przygotowac mozliwe scenariusze, czyli w przypadku
        // tworzenia programu dla mcdonalda nie tworzysz obiektow klasy Meal uzywajac new, a raczej odwolujesz sie do
        //obiektu klasy MealBuilder
        MealBuilder builder = new MealBuilder();
        Meal vegMeal =builder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total cost: "+vegMeal.getCost());
        Meal chickenMeal = builder.prepareNonVegMeal();
        chickenMeal.showItems();
        System.out.println("Total cost: "+chickenMeal.getCost());
    }
}
