package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;
    //추상화에 의존시켜서 나중에 어떤 리스트를 활용할지 유연하게 변경하고 결정할 수 있게함

    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);//앞에 추가
        }

        long endTime = System.currentTimeMillis();
        System.out.println("size ="+size+"time = "+(endTime - startTime)+"ms");
    }
}
