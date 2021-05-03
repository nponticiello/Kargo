import java.lang.Object;
import java.util.Arrays;
public class main
{

public void converter(int test[])
{
  String[] converted = new String[test.length];

  for(int i = 0; i < test.length; i++){
    converted[i] = String.valueOf(test[i]);
  }

  String m;
  for(int j = 0; j < converted.length; j++){
    if(j == converted.length - 1)
    {
     m = converted[j];
   }
  else{
    m = converted[j] + ",";
  }

    for(char ch: m.toCharArray()){
      if(ch == '0')
      {
        System.out.print("Zero");
      }
      else if(ch == '1')
      {
        System.out.print("One");
      }
      else if(ch == '2')
      {
        System.out.print("Two");
      }
      else if(ch == '3')
      {
        System.out.print("Three");
      }
      else if(ch == '4')
      {
        System.out.print("Four");
      }
      else if(ch == '5')
      {
        System.out.print("Five");
      }
      else if(ch == '6')
      {
        System.out.print("Six");
      }
      else if(ch == '7')
      {
        System.out.print("Seven");
      }
      else if(ch == '8')
      {
        System.out.print("Eight");
      }
      else if(ch == '9')
      {
        System.out.print("Nine");
      }
      else
      System.out.print(ch);
    }
  }
}

}
