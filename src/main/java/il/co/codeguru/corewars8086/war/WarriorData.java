package il.co.codeguru.corewars8086.war;

/**
 * Holds a single warrior's name & code.
 * 
 * @author DL
 */
public class WarriorData {

    /**
     * Constructor.
     * @param name   Warrior's name.
     * @param code   Warrior's code.
     */
    public WarriorData(String name, byte[] code, boolean zombie) {
        m_name = name;
        m_code = code;		
        this.zombie = zombie;
    }

    /** @return the warrior's name. */
    public String getName() {
        return m_name;
    }

    /** @return the warrior's code. */
    public byte[] getCode() {
        return m_code;
    }
    
    
    public boolean isZombie() {
    	return zombie;
    }
    

    /** Holds warrior's name */
    private final String m_name;

    /** Holds warrior's code */
    private final byte[] m_code;
    
    private final boolean zombie;
    

    @Override
    public String toString() {
        return m_name;
    }
    
    
    
}
