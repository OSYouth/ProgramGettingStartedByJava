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
        //ȡ����������  
        StringBuffer tmpNum = new StringBuffer();  
        //ȡ�������ַ��� ��Ѿ��һ��ĩβ���  
        StringBuffer buff = new StringBuffer(str+"$");  
          
        while(buff.length()!=0){  
            tmpChar = buff.charAt(0);  
            //�ȸ�Ѿȥ��  
            buff.delete(0, 1);  
            if(tmpChar<'0' || tmpChar>'9'){  
                //���粻�����֣��Ϳ��԰�֮ǰtmpNum���������������ˣ�����2��6->26Ȼ������ˡ�  
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
                            System.out.println("�������û���ǡ�������������ô��");  
                        }  
                          
                        result = b/a;  
                        break;  
                    default:  
                        System.out.println("�������룬��Ҫ��Ը�⣬throwһ��exeption���Ǽ��õ�");  
                      
                    }  
                    numStack.push(result);  
                }  
                //���һ����  
                if(tmpChar!='$')  
                    opStack.push(tmpChar);  
                  
            }  
            //��һ������������2��6��26  
            else{  
                tmpNum = tmpNum.append(tmpChar);  
            }  
              
        }  
        return numStack.pop();  
    }  
      
    //�Ƚ��ֲ�������stack��������ȼ��ߵ�  
    private boolean compare(char currentChar){  
          
        if (opStack.empty())  
        {  
            return true;  
        }  
        //����pop��Ҫ����û�ˣ�ֻ��lastElement  
        char lastchar = (char) opStack.lastElement();  
          
        //��-1�����Ҳ�������ֱ��return  
        int lastPriority = -1;  
        int currentPriority = -1;  
  
        for (int i = 0; i < prior.length; i++){  
            //���ҵ���-1�Ļ�����û�ҵ��ˡ�  
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