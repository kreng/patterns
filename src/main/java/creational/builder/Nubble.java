package creational.builder;

public class Nubble {
    private NubblePiece piece;

    Nubble (NubblePiece piece ) {
        this.piece = piece;
    }

    public enum NubblePiece {
        CHEESE, BACON, PINEAPPLE, MUSHROOMS, SEAFOOD;
    }
}
