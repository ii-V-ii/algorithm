package programmers.lv0;

/**
 * 이름: 공배수.
 * 문제설명.
 * 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 10 ≤ number ≤ 100
 * 2 ≤ n, m < 10
 */
public class CommonMultiple {

  public static void main(String[] args) {
    CommonMultiple cm = new CommonMultiple();
    cm.solution(1,1,1);
  }

  public int solution(int number, int n, int m) {
    int answer = 0;
    if(number <= 0 || number > 100) return answer;
    else if(n<2 || n>10) return answer;
    else if(m<2 || m>10) return answer;

    int l = 0;
    if(n%m == 0) l = n;
    else if(m%n == 0) l=m;
    else l = n*m;

    if(number%l==0) answer = 1;

    return answer;
  }
}
