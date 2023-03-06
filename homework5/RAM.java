package homework5;

public class RAM {
    String name;
    int size;

    RAM(){ }

    RAM(String name, int size){
        this.name=name;
        this.size=size;
    }
    void show(){
        System.out.println(name +" "+ size);
    }
}
