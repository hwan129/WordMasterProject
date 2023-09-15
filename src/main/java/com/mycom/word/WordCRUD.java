package com.mycom.word;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCRUD implements ICRUD {        // CRUD 작성
    ArrayList<Word> list;   // Word를 ArrayList에 저장
    Scanner s;
    String fileName = "Dictionary.txt";

    WordCRUD(Scanner s){        // 생성자
        list = new ArrayList<>();       // 단어들을 저장할 곳
        this.s = s;
    }
    @Override
    public Object add() {           // 새로운 단어 정보 받기
        System.out.print("\n난이도(1, 2, 3) : ");
        int level = s.nextInt();        // int를 입력 받음. 난이도
        s.nextLine();

        System.out.print("새 단어 : ");
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

        ArrayList<Integer> searchList = searchList(searchWord);
        if(!searchList.isEmpty()) {
            System.out.print("수정할 단어 번호 입력 : ");
            int id = s.nextInt();
            s.nextLine();

            System.out.print("\n수정) 난이도(1, 2, 3) : ");
            int level = s.nextInt();
            s.nextLine();

            System.out.print("수정) 단어 : ");
            String word = s.nextLine();

            System.out.print("수정) 뜻 입력 : ");
            String meaning = s.nextLine();

            Word wordlist = list.get(searchList.get(id - 1));
            wordlist.setLevel(level);
            wordlist.setWord(word);
            wordlist.setMeaning(meaning);
            System.out.println("단어 수정이 완료되었습니다.");
        }else{
            System.out.println("단어를 찾지 못했습니다.");
        }
    }

    public ArrayList<Integer> searchList(String searchWord) {        // 단어 검색. listAll 사용
        ArrayList<Integer> searchList = new ArrayList<>();

        System.out.println("\nNo Level         Word  Meaning");
        System.out.println("---------------------------------");
        int num = 0;
        for (int i = 0; i < list.size(); i++){      // 단어의 개수만큼
            String word = list.get(i).toString();
            if (word.toUpperCase().contains(searchWord.toUpperCase())) {
                System.out.print((num+1)      // 단어 번호
                        + "  "
                        + list.get(i).toString()    // Word 클래스에서 입력 받은 단어
                        + "\n"
                );
                searchList.add(i);
                num ++;
            }
        }
        System.out.println("---------------------------------");

        return searchList;
    }

    @Override
    public void delete() {
        listAll();
        System.out.print("\n삭제할 단어 검색 : ");
        String searchWord = s.next();
        s.nextLine();

        ArrayList<Integer> searchList = searchList(searchWord);
        if(!searchList.isEmpty()) {
            System.out.print("삭제할 단어 번호 입력 : ");
            int id = s.nextInt();
            s.nextLine();

            System.out.print("단어를 삭제하시겠습니까? (Y/N) : ");
            String ans = s.nextLine();

            if (ans.toUpperCase().contains("Y")){
                list.remove((int) searchList.get(id - 1));
                System.out.println("단어 삭제를 완료했습니다.");
            }else {
                System.out.println("삭제를 취소합니다.");
            }
        }else{
            System.out.println("단어를 찾지 못했습니다.");
        }
    }

    public void listAll(){          // 전체 단어장 출력
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

    public void saveFile(){
        try {
            FileWriter fileWriter = new FileWriter(fileName);       // 파일에 쓰기
            for(Word one : list){       // list에 있는것 옮기기
                fileWriter.write(one.toFileSave() + "\n");      // word에서 정의한 toFileSave 사용. 레벨, 단어, 뜻 반환. 여기서 다시 레벨, 단어, 뜻을 정의하지 않기 위해
            }
            fileWriter.close();     // 파일 닫기

            System.out.println("\n파일이 " + fileName + "에 저장되었습니다.");
        } catch (IOException e) {       // 예외 처리
            e.printStackTrace();
            System.err.println("파일을 저장하는데 오류가 발생했습니다.\n");
        }
    }

    public void loadFile(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            int num = 0;        // 단어 개수

            while (true) {
                line = reader.readLine();
                if(line == null) break;

                String wordData[] = line.split("\\|");  // |로 짤라서 load
                int level = Integer.parseInt(wordData[0]);
                String word = wordData[1];
                String meaning = wordData[2];
                list.add(new Word(0, level, word, meaning));
                num ++;
            }
            System.out.println("\n--- 영어 단어 " + num + "개 로딩 ---");

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("파일을 로드하는데 오류가 발생했습니다.\n");
        }
    }
    public void searchLevel(){
        System.out.print("검색할 레벨 : ");
        int level = s.nextInt();

        searchList(level);
    }

    public ArrayList<Integer> searchList(int searchLevel) {        // 레벨 검색. listAll 사용
        ArrayList<Integer> searchList = new ArrayList<>();

        System.out.println("\nNo Level         Word  Meaning");
        System.out.println("---------------------------------");
        int num = 0;
        for (int i = 0; i < list.size(); i++){      // 단어의 개수만큼
            int level = list.get(i).getLevel();
            if (searchLevel == level) {
                System.out.print((num+1)      // 단어 번호
                        + "  "
                        + list.get(i).toString()    // Word 클래스에서 입력 받은 단어
                        + "\n"
                );
                searchList.add(i);
                num ++;
            }
        }
        System.out.println("---------------------------------");

        return searchList;
    }

    public void searchWord(){
        listAll();
        System.out.print("\n단어 검색 : ");
        String searchWord = s.next();
        s.nextLine();

        searchList(searchWord);
    }
}
