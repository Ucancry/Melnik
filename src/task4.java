import java.util.Stack;
public class task4 {
/* [((())()(())]] некорректно т.к. один вид скобок закрывает другой, несоблюдён баланс
чтобы стала правильной необходимо поменять:
либо вторую полукруглую открывающую на квадратную открывающую
либо предпоследнюю квадратную закрывающую на полукруглую закрывающую
 */
    public static void main(String[] args) {
        int count = 0;
        char[] let = {'[','(','(','(',')',')','(',')','(','(',')',')',']',']' };
        System.out.println(let.length);
        for (int i = 0; i < let.length; i++) {
            if ((let[i] == '(') || (let[i] == '[')) {
                count++;
            } else {
                count--;
            }  ;
        }
        System.out.println(count);
    }
}
