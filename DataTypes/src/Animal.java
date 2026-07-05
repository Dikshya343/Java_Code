 interface Animal {
    void sound();
}
 class horse implements Animal {
     public void sound() {
         System.out.println("Bark");
     }
 }

 class Cat implements Animal {
     public void sound() {
         System.out.println("Meow");
     }
 }