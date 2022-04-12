public class Pen {
    /**
     * Instance Variables
     */
    private String name;
    private int id;

    /**
     * Constructor
     */
    Pen(){
        System.out.println("No Parameter Called");
    }

    Pen(String inputName){
        this.name = inputName;
        System.out.println("The new name of the pen is " + this.name);
    }

    Pen(int inputId){
        this.id = inputId;
        System.out.println("The new ID of the pen is " + this.id);
    }
}
