class Animal {
    private int age;
    private String name;

    void set_data(int a, String b) {
        age = a;
        name = b;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Zebra extends Animal {

    String message_zebra(String str) {
        str = "The zebra named " + getName() + " is " + getAge() + " years old. The zebra comes from Africa";
        return str;
    }
}

class Dolphin extends Animal {


    String message_dolphin(String str) {
        str = "The dolphin named " + getName() + " is " + getAge() + " years old. The dolphin comes from New Zealand";
        return str;
    }
}
public class chellenge_3 {
public static void main(String[] args) {
    String str=null,str1,str2;
    Zebra obj = new Zebra();
    obj.set_data(12, "Akansha");
    str1=obj.message_zebra(str);
    System.out.println(str1+" ");
    str=null;
    Dolphin obj1 =new Dolphin();
    obj1.set_data(90, "Abhisheek");
    str2=obj1.message_dolphin(str);
    System.out.println(str2+" ");

}    
}
