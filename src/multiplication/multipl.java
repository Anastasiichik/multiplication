package multiplication;

/**
  * @author Anastasia
 */
public class multipl {
    private final int value;  
    
    
    public multipl(int a){
          value = a;      
    }    
    public multipl mult(multipl a1){
        return new multipl (value*a1.getValue());    }
    public int getValue(){
        return value;
    }
    @Override
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        multipl other = (multipl) obj;
        return value == other.value;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.value;
        return hash;
    }
}
