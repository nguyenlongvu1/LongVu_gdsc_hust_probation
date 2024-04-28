import java.util.ArrayList;
public class test
{
    public static void main(String[]args)
    {
        Person p1=new Person("A","id1");
        Person p2=new Person("B","id2");
        Person p3=new Person("C","id3");
        Person p4=new Person("D","id4");
        Person p5=new Person("E","id5");
        ArrayList<Person> arr=new ArrayList();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        System.out.println(arr);
    }
}
