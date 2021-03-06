# 분해합
## 문제
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 
따라서 245는 256의 생성자가 된다. 
물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 
반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

## 입력
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

## 출력
첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.

## 기능 구현
* 자연수 입력
* 1부터 입력된 자연수까지 연산
  * 입력된 자연수 + 입력된 자연수의 각 자리수의 합

## 향상된 기능 구현
* 자연수 입력
* 입력할 수 있는 자연수의 총 합은 6자리이고 9까지 입력 가능
  * 6 * 9 = 54
* 생성자를 찾기 위해서 1부터 찾는 것이 아닌 입력한 자연수의 최대 -54 안에서 생성자가 존재

## 실행 결과
* 개선 전 : `132`
* 개선 후 : `84`
