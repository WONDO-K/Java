package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private final int DEFAULT_CAPACITY =5; // 초기용량, final-> 수정불가 => 상수
    private Object[] elements; // 다형성 배열
    private int size=0;

    public ObjectArray(){
        //elements = new Object[DEFAULT_CAPACITY];
        this(5); // this(); : 생성자안에서 다른 생성자를 호출할 때 사용
    }

    public ObjectArray(int capacity){ // 원하는 크기의 배열 생성
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public void add(Object element){
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public Object get(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }

    private void ensureCapacity() { // 공간을 늘려준다.
        int newCapacity = elements.length*2; // 현재 배열의 길이에 두배를 저장
        elements= Arrays.copyOf(elements,newCapacity); // elements를 newCapacity에 복사한다.
    }
}
