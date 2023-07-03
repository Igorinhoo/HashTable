public class App {
    public static void main(String[] args) throws Exception {
        HashTable<String, Integer> hashInt = new HashTable<String, Integer>(10);
        hashInt.Put("Adam", 30);
        hashInt.Put("Kamil", 10);
        hashInt.Put("Frans", 40);

        HashTable<String, Boolean> hashBool = new HashTable<String, Boolean>(30);
        hashBool.Put("Cole", true);
        hashBool.Put("Michal", false);
        hashBool.Put("Old", false);

        HashTable<String, Person> hashPerson = new HashTable<String, Person>(30);
        Person person1 = new Person("Oskar", 17);
        Person person2 = new Person("Kuba", 18);
        Person person3 = new Person("Python", 17);

        hashPerson.Put(person1.Name, person1);
        hashPerson.Put(person2.Name, person2);
        hashPerson.Put(person3.Name, person3);

        System.out.println(hashInt.Get("Kamil"));

        System.out.println(hashBool.Get("Old"));

        System.out.println(hashPerson.Get("Python").Age);

    }
}
