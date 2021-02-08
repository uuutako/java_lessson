public class les3 {
  public static void main(String[]args){
    System.out.println("数当てゲーム！");
    int ans = new java.util.Random().nextInt(10);
    for(int i=0; i<5; i++){
      System.out.println("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans){
        System.out.println("当たりです。");
      break;     
      }else{
        System.out.println("違います。");
      }    
    }
    System.out.println("ゲームを終了します。");
  }
}

// System.out.println("[メニュー]1:検索2:登録3:削除4:変更>"); 
// System.out.println("上記の数字を入力してください。");
// int selected = new java.util.Scanner(System.in).nextInt();
// switch(selected){
//   case 1:
//     System.out.println("検索します");
//   break;
//   case 2:
//     System.out.println("登録します");
//  break;
//   case 3:
//     System.out.println("削除します");
//   break;
//   case 4:
//     System.out.println("変更します");
//   break;
// }


  //   int seibetu  = 0;
  //   int age = 30;
  //   System.out.println("こんにちは。");
  //   if(seibetu == 0){
  //     System.out.println("私は男です。");
  //   }else{
  //     System.out.println("私は女です。");
  //   }
  //   if(seibetu == 0){
  //     System.out.println( age + "歳です"); 
  //   }
  //   System.out.println( "よろしくお願いします。");
  // }
