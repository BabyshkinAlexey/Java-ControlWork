import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrizeGame {
    private List<Toy> toys;

    public PrizeGame() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeToyWeight(Toy toy, double newWeight) {
        toy.setWeight(newWeight);
    }

    public Toy choosePrizeToy() {
        double sumWeight = 0.0;
        for (Toy toy : toys) {
            sumWeight += toy.getWeight();
        }

        double randomWeight = new Random().nextDouble() * sumWeight;

        for (Toy toy : toys) {
            randomWeight -= toy.getWeight();
            if (randomWeight <= 0.0) {
                toys.remove(toy);
                return toy;
            }
        }
        return null;
    }

    public List<Toy> getToys() {
        return toys;
    }
}