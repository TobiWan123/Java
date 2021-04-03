public class Main {
    public static void main(String[] args){
        // Unique - Singletone
        System.out.print("----------Singletone Class-----------\n");
        // Get Singleton - 2 times - but same object
        UniqueClass instanceA = UniqueClass.getInstance();
        UniqueClass instanceB = UniqueClass.getInstance();

        // proof of same object - equals()
        boolean testEquals = instanceA.equals(instanceB);

        System.out.println(testEquals +  "| InstanceA.equals(InstanceB)");

        // proof of same object - hashcode()
        int hashA = instanceA.hashCode();
        int hashB = instanceB.hashCode();
        boolean testHash = hashA == hashB;

        System.out.println(testHash + "| A: " + hashA + ", B: " + hashB);

        // proof of same object - testValue
        instanceA.testValue = 10;
        System.out.println("A-Value: " + instanceA.testValue + ", B-Value: " + instanceB.testValue + "\n");

        System.out.println("Everything is true because of same Values and same pointer to UniqueClass\n\n");

        // Not Unique - Not Singletone
        System.out.print("----------Not unique class-----------\n");
        // compare against not singletone
        // 2 times - but not same object - but same testValues (5)
        NotUnique instanceC = new NotUnique();
        NotUnique instanceD = new NotUnique();

        // proof of same object - equals()
        boolean testEquals2 = instanceA.equals(instanceB);

        System.out.println(testEquals2 +  "| InstanceC.equals(InstanceD)");

        // proof of same object - hashcode()
        int hashC = instanceC.hashCode();
        int hashD = instanceD.hashCode();
        boolean testHash2 = hashC == hashD;

        System.out.println(testHash2 + "| C: " + hashC + ", D: " + hashD);

        // proof of same object - testValue
        System.out.println("A-Value: " + instanceC.testValue + ", B-Value: " + instanceD.testValue + "\n");
        System.out.println("Equals() = true, because of same value - but hashcode() is false because different pointer to new class");
    }
}
