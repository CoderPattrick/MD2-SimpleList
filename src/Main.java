public class Main {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        for (int i = 0; i < 5; i++) {
            System.out.printf("element %d: %d\n",i+1,listInteger.get(i));
        }
        listInteger.add(-1);
        System.out.println("element -1: "+listInteger.get(-1));
    }
}
