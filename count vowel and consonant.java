//count vowel and consonant 
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
String name="aeiou";
int vowel=0;
int consonant =0;
for(int i=0;i<name.length();i++){
char ch=name.charAt(i);
if("aeiouAEIOU".indexOf(ch)>=0){
vowel++;
} else {
consonant++;
}
}
System.out.println(vowel);
System.out.println(consonant);

}
}