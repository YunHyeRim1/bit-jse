package day05;

import util.ArrayUtil;

public class Ex07ArrayUtilTest {
    public static void main(String[] args) {
        // 배열을 초기화할 때
        // 2가지 방법이 있는데
        // 첫 번째는 int[] arr = new int[크기];
        // 그리고 각 인덱스마다 값을 넣어주는 방법

        // 두 번째 방법은 즉석에서 배열을 만들어서
        // 그 배열로 초기화해라 하는 방법이
        // 바로 아래의 코드이다.
        int[] array = { 5, 1, 2, 3, 0 };
        // 위의 코드는
        // int[] arr = new int[5]
        // arr[0] = 5;
        // arr[1] = 1;
        // ...
        // arr[4] = 8;
        // 과 같은 의미를 지닌다.

        // 단, 이 방법의 단점은
        // 미리 값이 존재하지 않으면 사용할 수 없다.

        // ArrayUtil.print() 테스트
        System.out.println("-----출력 메소드 테스트-----");
        ArrayUtil.print("intArray", array);
        System.out.println("------------------------");

        // ArrayUtil.sortByASC() 테스트
        System.out.println("-----오름차순 정렬 메소드 테스트-----");
        ArrayUtil.sortByASC(array);
        ArrayUtil.print("intArray", array);
        System.out.println("-------------------------------");
        
        // ArrayUtil.sortByDESC() 테스트
        System.out.println("-----내림차순 정렬 메소드 테스트-----");
        ArrayUtil.sortByDESC(array);
        ArrayUtil.print("intArray", array);
        System.out.println("-------------------------------");
    }
}













