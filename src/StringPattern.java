import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPattern {
    public static void main(String[] args) {
        String str = "{[[]]}[])";
//        List<Character> open = Arrays.asList('{','[','(');
//        List<Character> close = Arrays.asList('}',')',']');
        int n = str.length();
        int flo =0,cur =0,sqr =0;
        for(int i=0;i<n;i++) {
            if (flo >= 0 && cur >= 0 && sqr >= 0) {
                switch (str.charAt(i)) {
                    case '{':
                        flo++;
                        break;
                    case '[':
                        sqr++;
                        break;
                    case '(':
                        cur++;
                        break;
                    case '}':
                        flo--;
                        break;
                    case ']':
                        sqr--;
                        break;
                    case ')':
                        cur--;
                        break;
                }
            } else {
                System.out.println("invalid");
                break;
            }
        }
            if(flo==0 && cur==0 && sqr==0){
                System.out.println("valid");
            }
        }
    }

