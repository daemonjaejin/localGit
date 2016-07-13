import java.io.File;

/**
 * Created by jin on 16. 7. 13.
 */
public class directoryNames {

    public static void main(String args[]){

//        if(args.length == 0){
//            System.err.println("옵션을 입력하세요.");
//            System.exit(1);
//        }
//
//        System.out.println("모두 " + args.length + "개의 옵션을 입력하였습니다.");
//
//        for(int i=0; i<args.length; i++){
//            System.out.format("args[%d] : %s%n", i, args[i]);
//        }

        String path = "C:\\word\\directory";
        File file = new File(path);

        if(file.isDirectory()){
            System.out.println("directory !!!");
            File [] arrFile = file.listFiles();
            for(int i=0; i<arrFile.length; i++){

//                System.out.println("name : " + arrFile[i].getName());
//                System.out.println("path : " + arrFile[i].getPath());
//                System.out.println("parent : " + arrFile[i].getParent());

                String lastName = String.format("%03d", i+1); // 0채우기
                String extendsName = ".txt";
                String newPath = arrFile[i].getParent()+"\\"+lastName+extendsName; // 이름 변경할 경로
                File newFile = new File(newPath);
                boolean isMoved = arrFile[i].renameTo(newFile);

                if(isMoved){
                    System.out.println("성공적으로 변경하였습니다.");
                }else{
                    System.out.println("변경에 실패하였습니다.");
                }

            }
        }else{
            System.out.println("Not directory !!!");
            if(file.isFile()){
                System.out.println("file !!!");
            }else{
                System.out.println("Not file !!!");
            }
        }


    }

}
