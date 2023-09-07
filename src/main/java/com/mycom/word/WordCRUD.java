package com.mycom.word;

import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {
    // CRUD 작성
    ArrayList<Word> list;
    Scanner s;

    WordCRUD(Scanner s){        // 생성자
        list = new ArrayList<>();       // 단어들을 저장할 곳
        this.s = s;
    }
    @Override
    public Object add() {
        System.out.print("난이도(1, 2, 3)와 새 단어를 입력하시오 : ");
        int level = s.nextInt();        // int를 입력 받음
        String word = s.nextLine();     // 개행문자 포함 한 줄을 입력 받음

        System.out.print("뜻 입력 : ");
        String meaning = s.nextLine();

        return new Word(0, level, word, meaning);       // 입력 받은 것 return
    }

    public void addWord(){
        Word one = (Word)add();
        list.add(one);
        System.out.println("새 단어가 추가되었습니다. ");
    }

    @Override
    public int update(Object obj) {
        return 0;
    }

    @Override
    public int delete(Object obj) {
        return 0;
    }

    @Override
    public void selectOne(int id) {

    }

    public void listAll(){
        System.out.println("---------------------------------");
        for (int i = 0; i < list.size(); i++){      // 단어의 개수만큼
            System.out.print((i+1)      // 단어 번호
            + " "
            + list.get(i).toString()
            + "\n"
            );
        }
        System.out.println("---------------------------------");
    }
}
