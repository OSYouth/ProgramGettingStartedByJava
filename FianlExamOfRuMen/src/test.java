import java.util.Scanner;
import java.util.Stack;  
  
public class test {  
    public static void main(String[] args){  
        test opt = new test();  
        Scanner in = new Scanner(System.in);
		String s = in.nextLine();
        System.out.println(opt.caculate(s));  
    }  
    private static final String[] prior = {"*/","+-","$"};  
      
    private Stack<Character> opStack = new Stack<Character>();  
    private Stack<Integer> numStack = new Stack<Integer>();  
      
    public int caculate(String str){  
        char tmpChar;  
        //取正常的数字  
        StringBuffer tmpNum = new StringBuffer();  
        //取完整的字符串 给丫加一个末尾标记  
        StringBuffer buff = new StringBuffer(str+"$");  
          
        while(buff.length()!=0){  
            tmpChar = buff.charAt(0);  
            //先给丫去了  
            buff.delete(0, 1);  
            if(tmpChar<'0' || tmpChar>'9'){  
                //假如不是数字，就可以把之前tmpNum里存的数字连起来了，比如2，6->26然后输出了。  
                if(!tmpNum.toString().equals("")){  
                    int num = Integer.parseInt(tmpNum.toString());  
                    numStack.push(num);  
                    tmpNum.delete(0, tmpNum.length());  
                }  
                while(!compare(tmpChar) && (!opStack.empty())){  
                    char op = opStack.pop();  
                      
                    Integer a = numStack.pop();  
                    Integer b = numStack.pop();  
                    Integer result = 0;  
                    switch(op){  
                    case '+':  
                        result = a+b;  
                        break;  
                    case '-':  
                        result = b-a;  
                        break;  
                    case '*':  
                        result = a*b;  
                        break;  
                    case '/':  
                        if(a==0){  
                            System.out.println("这种情况没考虑。。看看机器怎么报");  
                        }  
                          
                        result = b/a;  
                        break;  
                    default:  
                        System.out.println("错误输入，你要是愿意，throw一个exeption便是极好的");  
                      
                    }  
                    numStack.push(result);  
                }  
                //最后一个啦  
                if(tmpChar!='$')  
                    opStack.push(tmpChar);  
                  
            }  
            //是一个完整的数，2和6是26  
            else{  
                tmpNum = tmpNum.append(tmpChar);  
            }  
              
        }  
        return numStack.pop();  
    }  
      
    //比较现操作符与stack里面的优先级高低  
    private boolean compare(char currentChar){  
          
        if (opStack.empty())  
        {  
            return true;  
        }  
        //不能pop，要不就没了，只能lastElement  
        char lastchar = (char) opStack.lastElement();  
          
        //用-1假设找不到，好直接return  
        int lastPriority = -1;  
        int currentPriority = -1;  
  
        for (int i = 0; i < prior.length; i++){  
            //能找到。-1的话就是没找到了。  
            if (prior[i].indexOf(lastchar) != -1){  
                lastPriority = i;  
            }  
  
            if (prior[i].indexOf(currentChar) != -1){  
                currentPriority = i;  
            }  
        }  
  
        return currentPriority < lastPriority;  
    }  
      
  
}  