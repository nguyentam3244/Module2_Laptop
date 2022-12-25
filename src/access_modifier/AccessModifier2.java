package access_modifier;

public class AccessModifier2 {
    private  String name = "john";
    private  String className = "c02" ;
    // ham k co tham so
    public AccessModifier2(){

    }
    // ham co tham so
    public AccessModifier2(String name, String className){
        this.name = name;
        this.className = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String toString(){
        return "name: " + getName() + " class name: " + getClassName();
    }
    public static void main(String[] args) {
        AccessModifier2 obj1 = new AccessModifier2();
        AccessModifier2 obj2 = new AccessModifier2();
        System.out.println(obj2.toString());
        obj1.setName("tam");
        obj1.setClassName("A0222I1");
        System.out.println(obj1.toString());
    }
}
