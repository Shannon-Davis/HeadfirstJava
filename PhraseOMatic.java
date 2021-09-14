package headfirst;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] list1={"Love", "Family", "Relationships", "Trust", "Responsibility"};
        String[] list2={"Shannon", "Nichelle", "Carmen", "Ulani", "Nelson"};
        String[] list3={"COD","BO2", "Siege", "2K22", "Ghost"};

        int length1=list1.length;
        int length2=list2.length;
        int length3= list3.length;

        int gen1= (int) (Math.random() * length1);
        int gen2= (int) (Math.random() * length2);
        int gen3= (int) (Math.random() * length3);
        String phrase=list2[gen2] + " " + list1[gen1] + " " + list3[gen3];
        System.out.println("“What we need is a " + phrase);

    }
}
