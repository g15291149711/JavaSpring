package math;
//public static 方法返回值 方法名称（参数类型 变量）{
//方法体代码
//return 返回值;}
//方法重载
//方法递归
public class Test {
    public static void main(String[] args) {
        System.out.println(sum(5));
    /*        myPrint(2);
    }
       public static void myPrint(int x){
           if(x == 2){
               return ;
           }else{
               System.out.println(x);
           }
        }*/
    }
    public static int sum(int num){
        if(num == 1){
            return 1;
        }else{
            return sum(num -1) * num;
        }
    }
}




