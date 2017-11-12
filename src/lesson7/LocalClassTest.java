package lesson7;

import java.util.Random;

public class LocalClassTest {
    static public void main( String [] arg) {
        IntSequence seq = randomInts(3, 6);
        System.out.println(seq.next());
        System.out.println(seq.next());
        System.out.println(seq.next());
    }
    private static Random generator = new Random();
    public static IntSequence randomInts(int low, int high){
        //중첩클래스, 익명클래스, 람다까지 변환 가능.
        /* 중첩클래스
        class RandomSequence implements IntSequnece{
                    @Override
            public int next() {
                return low + generator.nextInt(high - low + 1); // 내부 클래스에서 low와 high는 자유변수. 파라미터도 아니고 내부변수도 아닌.
            }
        }
        return new RandomSequence();
        */

        /* 익명클래스
        return new IntSequence(){

            @Override
            public int next() {
                return low + generator.nextInt(high - low + 1); // 내부 클래스에서 low와 high는 자유변수. 파라미터도 아니고 내부변수도 아닌.
            }
        }*/
        //람다
        return ()->low + generator.nextInt(high - low + 1);
        }
    }

