public class Main {
    public static void main(String[] args) {
//        CustomLinkedList<Integer> CusList = new CustomLinkedList<>();
//        CusList.addAtLast(1);
//        CusList.addAtLast(2);
//        CusList.addAtLast(3);
//        CusList.addAtLast(4);
//        CusList.addAtLast(5);
//        System.out.println(CusList);
//        System.out.printf("CustomLinkedList size = " + CusList.getSize());

//        CusList.addAtFirst(1);
//        CusList.addAtFirst(2);
//        CusList.addAtFirst(3);
//        CusList.addAtFirst(4);
//        System.out.println(CusList);
//        System.out.printf("CustomLinkedList size = " + CusList.getSize());

        CustomLinkedList<String> CusStringList = new CustomLinkedList<>();
        int num = 5;
        for (int i = 0; i < num; i++) {
            CusStringList.addAtLast(String.format("%d", i));
        }

        System.out.println(CusStringList);


    }

}
