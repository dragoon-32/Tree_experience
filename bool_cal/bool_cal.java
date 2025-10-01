import java.util.*;

public class bool_cal {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("논리식을 입력해주세요.");

        String sentence = scan.nextLine();

        Logic_Expr_parser str = new Logic_Expr_parser(sentence);

        System.out.println(sentence);
        str.print_Expr();
        scan.close();
    }
}

class Logic_Expr_parser{
    private String Expression;

    Logic_Expr_parser(String S){
        Expression = S.replaceAll("\\s", "");       // 입력값의 빈칸까지 제거
    }
    Logic_Expr_parser(){
        System.out.println("논리식이 없습니다. 프로그램 코드를 확인해주세요.");
    }

    public boolean parens_check(){
        int start = Expression.indexOf('(');
        int end = Expression.indexOf(')');
        if(start == -1){       //S 문자열에 ( 가 없을 때.
            return false;
        }
        else{
            if(end == -1){      //S 문자열에 ) 가 없어 괄호가 열려있을 때
                System.out.println("E: 괄호가 안끝납니다.");
                System.exit(0);
            }
        }
        return true;
    }

    public void print_Expr(){
        System.out.println(Expression);
    }
}

class Node_T{
    public Node_T left;
    public Node_T right;
    public char oper;
    public boolean value[];
}

class Logic_Tree{
    private Node_T root;
}