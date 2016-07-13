/**
 * Created by jin on 16. 7. 13.
 */
public class directoryNames {

    public static void main(String args[]){

        //
        if(args.length == 0){
            System.err.println("옵션을 입력하세요.");
            System.exit(1);
        }

        System.out.println("모두 " + args.length + "개의 옵션을 입력하였습니다.");

        for(int i=0; i<args.length; i++){
            System.out.format("args[%d] : %s%n", i, args[i]);
        }

    }

}
