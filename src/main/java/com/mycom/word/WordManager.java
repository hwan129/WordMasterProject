package com.mycom.word;

import java.util.Scanner;

public class WordManager {
    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;


    WordManager(){
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu() {
        System.out.print("\n---영단어 마스터---\n"
                + "==================\n"
                + "1. 모든 단어 보기\n"
                + "2. 난이도별 단어 보기\n"
                + "3. 단어 검색\n"
                + "4. 단어 추가\n"
                + "5. 단어 수정\n"
                + "6. 단어 삭제\n"
                + "7. 파일 저장\n"
                + "0. 나가기\n"
                + "==================\n"
                + "메뉴 선택 : "
        );
        return s.nextInt();
    }
    public void start() {

        wordCRUD.loadFile();
        while(true) {
            int menu = selectMenu();
            if (menu == 0) {
                System.out.println("\n단어장을 종료합니다.");
                break;
            }
            if (menu == 1){         // 단어장 조회
                wordCRUD.listAll();
            } else if (menu == 2) {     // 난이도 검색
                wordCRUD.searchLevel();
            } else if (menu == 3) {     // 단어 검색
                wordCRUD.searchWord();
            } else if (menu == 4){    // 단어 추가
                wordCRUD.addWord();
            } else if (menu == 5) {   // 단어 수정
                wordCRUD.update();
            } else if (menu == 6){    // 단어 삭제
                wordCRUD.delete();
            } else if (menu == 7){    // 단어장 파일 저장
                wordCRUD.saveFile();
            }
        }
    }
}
