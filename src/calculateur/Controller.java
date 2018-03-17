package calculateur;

import calculateur.Exception.DivisionException;
import calculateur.Exception.ModelException;
import calculateur.Exception.OpException;

import java.util.HashMap;

public class Controller {

    private HashMap<String, Model> model;
    private String mod;

    Controller() {
        this.mod = "calculator";
        this.model = new HashMap<String, Model>();
    }

    public float calculer(float a, float b, String op) throws OpException, DivisionException {
        Model calculator = this.model.get("calculator");

        calculator.init(a, b, op);
        return calculator.calc();
    }

    public void addModele(String sym, Model model) throws ModelException {
        if (this.mod.equals("calculator")) {
            this.model.put(sym, model); // Ajoute model dans map
        } else {
            new ModelException();
        }
    }
}
