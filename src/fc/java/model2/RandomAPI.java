package fc.java.model2;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[6];
        int i = 0;

        while (i<6){
            int num = random.nextInt(45)+1; // 0이상 45미만의 난수를 반환 -> +1을 한 이유 0~45까지 출력하기 위해
            boolean isDuplicate = false;

            //배열의 이전 인덱스들과 비교하여 중복되는지 확인
            for(int j=0;j<i;j++){
                if(arr[j]==num){
                    isDuplicate=true;
                    break;
                }
            }
            // 중복되지 않으면 배열에 추가
            if(!isDuplicate){
                arr[i++]=num;
            }
        }
        for(int num : arr){
            System.out.println(num+"");
        }
    }
}
