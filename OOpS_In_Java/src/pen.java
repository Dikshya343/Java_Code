public  class pen {
    String color;
    String type;
    public void write(){
        System.out.println("write something");
    }
    public void printcolor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class oops extends pen {
    public static void main(String[] args){
        pen pen1 = new pen();
        pen1.color = "red";
        pen1.type ="gel";
        pen1.write();
        pen pen2 = new pen();
        pen2.color ="green";
        pen2.type = "teknotip";
        pen2.printcolor();
    }

}
