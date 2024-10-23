public class Person {
    String name;
    int saving;

    void introduce_self(){
        System.out.println("Hi, My name is " + name);
    }

    Person(){

    }

    Person(String name ,int saving){
        this.name = name;
        this.saving = saving;
    } 

    @Override
    public String toString() {
        return "I am " + name + ". Mysavings amount is " + saving;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + saving;
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
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (saving != other.saving)
            return false;
        return true;
    }

    int reward(Person p, int amount){
        this.saving -= amount;
        p.saving += amount;
        return this.saving;
    }

    boolean isWealthier(Person p) {
        return this.saving > p.saving;
    }
}
