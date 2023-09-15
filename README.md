![collaboration-1106196_640](https://github.com/hwan129/WordMasterProject/assets/130568725/f3270ff3-fe5a-4a88-a3c7-6a92fe26cfc0)

# Word Master Project

#### 실전프로젝트1. project1 - 영어 단어장 프로그램

## 영어 단어 마스터 프로젝트
* 영어 단어를 빠르게 마스터 할 수 있는 프로그램.
* 영어 단어를 외우기 위한 많은 기능을 가지고 있다.


## 기능
* 단어장 조회
  
  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/2eef1c68-84a0-48fc-8961-34a6f1ca0c36)
* 난이도에 따른 단어 조회
  
  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/585e5991-1115-41ac-a35a-bdfeb46e32eb)
* 단어 검색
  
  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/8583465b-f0a4-4035-9912-cd32380c48ef)

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/1161e352-92b3-4680-93b8-41eb79d55da3)
* 단어 추가

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/e913b6ea-ddef-4143-9324-8466ff4ac6f4)
* 단어 수정

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/8a932def-44bc-4545-8a97-bd21ba2331e7)

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/495617b7-2dcc-465d-9938-b3a363f2a81e)

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/86c500de-2904-4aba-8e45-042f3fcadadc)

* 단어 삭제

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/d26fcba5-3cc8-434b-9c35-3acb0f9ced6f)

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/0df653ec-db69-4620-b5be-c7873367e63b)

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/e52f302f-0ba4-4779-86e1-8903189bf7a7)

* 단어장 파일 저장

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/4983dfcc-933d-4e0e-bdf2-222904634418)

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/282a434a-1bcf-4236-b4d9-3313922f1975)

* 프로그램 종료

  ![image](https://github.com/hwan129/WordMasterProject/assets/130568725/f40b07eb-f93e-45f6-b7b8-e560cefa858e)


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
