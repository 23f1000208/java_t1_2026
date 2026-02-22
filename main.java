class Pen {
    String color;
    String type;
    
    void write() {
        System.out.println("Writing...Woo its working");
    }
    
    public void printColor(){
        System.out.println(this.color);
    }
}

class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";
        
        
        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "ballpoint";
        
        pen1.printColor();
        pen2.printColor();
    }
}