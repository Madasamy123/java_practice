package OOPSMain;



    // Java program demonstrating Encapsulation
    class Programmer {
        private String name;

        // Getter and Setter for name
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
    }

    public class encapsulation1 {
        public static void main(String[] args) {
            Programmer p = new Programmer();
            p.setName("Madasamy");
            System.out.println("Name=> " + p.getName());
        }
    }

