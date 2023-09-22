
![영어단어](https://github.com/hwan129/WordMasterProject/assets/130568725/ad4aa752-34ea-418e-a247-60d201563ff8)

# Word Master Project

#### 실전프로젝트1. project1 - 영어 단어장 프로그램

## 영어 단어 마스터 프로젝트
* 영어 단어를 빠르게 마스터 할 수 있는 프로그램.
* 영어 단어를 외우기 위한 많은 기능을 가지고 있다.


## 기능
* 단어장 조회
  
  ![wordList1](https://github.com/hwan129/WordMasterProject/assets/130568725/f3b99917-c7d2-4042-bfca-dbc0f6b91fe3)
* 난이도에 따른 단어 조회
  
  ![searchLevel](https://github.com/hwan129/WordMasterProject/assets/130568725/135f7943-73f7-480e-8761-e4609bcd90e6)
* 단어 검색
  
  ![searchWord1](https://github.com/hwan129/WordMasterProject/assets/130568725/07661676-eb9a-48d1-a2fb-b5cd48e0bb1e)


  ![searchWord2](https://github.com/hwan129/WordMasterProject/assets/130568725/5ca43112-acb0-4b52-8b94-5b5de531bca4)
* 단어 추가

  ![addWord](https://github.com/hwan129/WordMasterProject/assets/130568725/fea40eae-f890-4884-b303-7f0d6e689141)
* 단어 수정


  ![updateWord](https://github.com/hwan129/WordMasterProject/assets/130568725/67f83b04-79e9-435c-9ae3-236e36464f09)


  ![updateWord2](https://github.com/hwan129/WordMasterProject/assets/130568725/4d2253b5-8b35-47fb-97cd-ad99c1952c2f)


  ![updateWord3](https://github.com/hwan129/WordMasterProject/assets/130568725/4ce2c17a-2a14-401f-9dee-31185a4e7d4c)
* 단어 삭제

  
  ![deleteWord1](https://github.com/hwan129/WordMasterProject/assets/130568725/5667634c-a8aa-41f7-ad9c-200437139ecf)

  
  ![deleteWord2](https://github.com/hwan129/WordMasterProject/assets/130568725/06a6f371-af4f-458a-8baf-785a4ce75300)

  
  ![deleteWord3](https://github.com/hwan129/WordMasterProject/assets/130568725/7ae8cf73-801b-4181-a382-20fcf13b1ea2)
* 단어장 파일 저장

  
  ![saveWord](https://github.com/hwan129/WordMasterProject/assets/130568725/84950b3f-155a-43ae-8207-5c1bef519e1e)

  
  ![saveWord2](https://github.com/hwan129/WordMasterProject/assets/130568725/73afafd2-536f-4009-9eff-1ebbd7a786c4)
* 프로그램 종료


  ![exitProgram](https://github.com/hwan129/WordMasterProject/assets/130568725/15f84339-8e74-425b-a308-f9a918ebdc65)


## 코드
```Java#
public void listAll();              // 단어장 조회
public void searchLevel();          // 난이도 검색
public void searchWord();           // 단어 검색 
public Object add();                // 단어 추가
public int update(Object obj);      // 단어 수정
public int delete(Object obj);      // 단어 삭제
public void saveFile();             // 단어장 저장

public void loadFile();             // 단어장 불러오기 
public void addWord();              // 단어 추가(ArrayList 이용)
public int selectMenu();            // 메뉴 선택
public void start();                // main에서 사용
public ArrayList<Integer> searchList(int searchLevel);  // 레벨 검색
public ArrayList<Integer> searchList(String searchWord); // 단어 검색 
```

## 개발환경, 언어
- <img alt="java" src ="https://img.shields.io/badge/JAVA-FF4500.svg?&style=for-the badge&logo=java&logoColor=white"/>
- `JDK 17`
- <img alt="intellijidea" src ="https://img.shields.io/badge/IntelliJ IDEA-BA55D3.svg?&style=for-the badge&logo=intellijidea&logoColor=white"/>
