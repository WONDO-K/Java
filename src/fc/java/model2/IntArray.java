package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private final int DEFAULT_CAPACITY =5; // 초기용량, final-> 수정불가 => 상수
    private int[] elements;
    private int size=0;

    public IntArray(){ // 생성동작
        elements = new int[DEFAULT_CAPACITY]; // 크기 5개의 배열
    }

    public int size(){ // 크기 구하는 동작
        return size;
    }

    public int get(int index){ // 가져오는 동작
        if(index<0||index>=size){
            throw new IndexOutOfBoundsException("범위초과"); // 예외처리
        }
        return elements[index];
    }

    public void add(int element){ // 저장동작
        if(size==elements.length){ // 현재 size가 elements의 길이와 같다면 이제 공간이 없다는 의미 (길이가 5일때 인덱스는 4까지 이기 때문)
            ensureCapacity();
        }
        elements[size++] = element; // 현재 size를 인덱스로하는 공간에 값 저장후 다음 동작을 위해 후위연산자로 size를 증가시킨다.
    }

    private void ensureCapacity() { // 공간을 늘려준다.
        int newCapacity = elements.length*2; // 현재 배열의 길이에 두배를 저장
        elements= Arrays.copyOf(elements,newCapacity); // elements를 newCapacity에 복사한다.
    }
}
