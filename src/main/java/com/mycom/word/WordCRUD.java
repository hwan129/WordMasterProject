package com.mycom.word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordCRUD implements ICRUD {        // CRUD 작성
    ArrayList<Word> list;   // Word를 ArrayList에 저장
    Scanner s;

    WordCRUD(Scanner s){        // 생성자
        list = new ArrayList<>();       // 단어들을 저장할 곳
        this.s = s;
    }
    @Override
    public Object add() {           // 새로운 단어 정보 받기
        System.out.print("\n난이도(1, 2, 3)와 새 단어를 입력하시오 : ");
        int level = s.nextInt();        // int를 입력 받음. 난이도
        String word = s.nextLine();     // 개행문자 포함 한 줄을 입력 받음. 단어

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();  // 개행문자 포함 한 줄을 입력 받음. 뜻

        return new Word(0, level, word, meaning);       // 입력 받은 것들 return
    }

    public void addWord(){          // 새로운 단어 추가
        Word one = (Word) add();     // Word로 리턴하기 때문에 (Word)
        list.add(one);              // ArrayList 끝에 단어 추가
        System.out.println("새 단어가 추가되었습니다. ");
    }

    @Override
    public void update() {         // 기존 단어 수정
        listAll();
        System.out.print("\n수정할 단어 검색 : ");
        String searchWord = s.next();
        s.nextLine();

        if(!list(searchWord).isEmpty()) {
            //ArrayList<Integer> searchlist = list(searchWord);
            System.out.print("수정할 단어 번호 입력 : ");
            int id = s.nextInt();
            s.nextLine();

            System.out.print("\n난이도(1, 2, 3)와 단어를 입력하시오 : ");
            int level = s.nextInt();
            String word = s.nextLine();

            System.out.print("뜻 입력 : ");
            String meaning = s.nextLine();

            Word wordlist = list.get(list(searchWord).get(id - 1));
            wordlist.setLevel(level);
            wordlist.setWord(word);
            wordlist.setMeaning(meaning);
            System.out.println("단어 수정이 완료되었습니다.");
        }else{
            System.out.println("단어를 찾지 못했습니다.");
        }
    }

    public ArrayList<Integer> list(String searchWord) {        // 단어 검색
        ArrayList<Integer> searchList = new ArrayList<>();

        System.out.println("\nNo Level         Word  Meaning");
        System.out.println("---------------------------------");
        for (int i = 0; i < list.size(); i++){      // 단어의 개수만큼
            String word = list.get(i).toString();
            if (word.toUpperCase().contains(searchWord.toUpperCase())) {
                System.out.print((i)      // 단어 번호
                        + "  "
                        + list.get(i).toString()    // Word 클래스에서 입력 받은 단어
                        + "\n"
                );
                searchList.add(i);
            }
        }
        System.out.println("---------------------------------");

        return searchList;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll(){
        System.out.println("\nNo Level         Word  Meaning");
        System.out.println("---------------------------------");
        for (int i = 0; i < list.size(); i++){      // 단어의 개수만큼
            System.out.print((i+1)      // 단어 번호
            + "  "
            + list.get(i).toString()    // Word 클래스에서 입력 받은 단어
            + "\n"
            );
        }
        System.out.println("---------------------------------");
    }
}
