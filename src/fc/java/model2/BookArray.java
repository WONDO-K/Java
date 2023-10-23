package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPACITY =5; // 초기용량, final-> 수정불가 => 상수
    private Book[] elements;
    private int size=0;

    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY];
    }
    public int size(){
        return size;
    }
    public Book get(int index){
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }
    public void add(Book element){
        if(size==elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }
    private void ensureCapacity() { // 공간을 늘려준다.
        int newCapacity = elements.length*2; // 현재 배열의 길이에 두배를 저장
        elements= Arrays.copyOf(elements,newCapacity); // elements를 newCapacity에 복사한다.
    }
}
