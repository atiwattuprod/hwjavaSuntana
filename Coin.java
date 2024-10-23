public class Coin {
    String tailColor;
    boolean isHead;

    Coin(String color) {
        tailColor = color;
        isHead = true;
    }

    @Override
    public String toString() {
        return "I am a coin object with tailColor = " + tailColor + ". My isHead is " + isHead;
    }
    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tailColor == null) ? 0 : tailColor.hashCode());
        result = prime * result + (isHead ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Coin other = (Coin) obj;
        if (tailColor == null) {
            if (other.tailColor != null)
                return false;
        } else if (!tailColor.equals(other.tailColor))
            return false;
        if (isHead != other.isHead)
            return false;
        return true;
    }

    void flip() {
        if (isHead)
            System.out.println("From flip() -> I am head my color is SILVER (my tailColor is " + tailColor + ")");
        else
            System.out.println("From flip() -> My face color is " + tailColor);
        isHead = !isHead;
    }

    void hit(Coin c) {
        if (!this.equals(c)){
            this.flip();
            c.flip();
        }
    }

    void hit(Coin c1, Coin c2) {
        if (!this.equals(c1)){
            this.hit(c1);
        }
        if (!this.equals(c2)){
            this.hit(c2);
        }
    }
}

