import cs102.Hangman;
import cs102.IHangmanSetup;

import java.util.ArrayList;


public class HangmanModel extends Hangman {


    private ArrayList<IHangmanView> views = new ArrayList<IHangmanView>();

    public HangmanModel(IHangmanSetup setup) {
        super(setup);
    }

    public void addView(IHangmanView view) {
        views.add(view);
        view.updateView(this);

    }

    public void update() {
        for (IHangmanView view : views) {
            view.updateView(this);
        }
    }

    @Override
    public int tryThis(char letter) {
        int tryThis = super.tryThis(letter);
        update();
        return tryThis;
    }

}
