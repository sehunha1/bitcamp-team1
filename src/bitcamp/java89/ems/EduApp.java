package bitcamp.java89.ems;

import java.util.Scanner;

public class EduApp {
  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {
    BookController bookController = new BookController(keyScan);
    TeacherController teacherController = new TeacherController(keyScan);
    LectureController lectureController = new LectureController(keyScan);
    System.out.println("비트캠프 관리시스템에 오신걸 환영합니다.");

    loop:
    while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine().toLowerCase();
      switch (command) {
        case "menu" :
          doMenu();
          break;

        case "go 1" :
          bookController.service();
          break;


        case "go 2" :
          teacherController.service();
          break;


        case "go 3" :
          lectureController.service();
          break;


        case "dsafeat" :
          break;

        case "testest" :
          break;

        case "quit" :
          System.out.println("Good bye!");
          break loop;

        default :
          System.out.println("지원하지 않는 명령어입니다.");
      }
    }
  }
  static void doMenu() {
    System.out.println("[메뉴]");
    System.out.println("1. 교재관리");
    System.out.println("2. 강사관리");
    System.out.println("3. 강좌관리");
    System.out.println("메뉴 이동은 'go 메뉴번호'를 입력하세요.");

    System.out.println("4. 가라");
    System.out.println("5. 와라");
    System.out.println("6. 커먼");
    System.out.println("7. ㅇㅇ");
    System.out.println("7. ㅇㅇ");


  }
}
