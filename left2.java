/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"*/

public String rotate(String str){
  char[] tochararr=str.toCharArray();
  for(int i=0;i<tochararr.length-1;i++){
    char c=tochararr[i];
    tochararr[i]=tochararr[i+1];
    tochararr[i+1]=c;
  }
  String str1=new String(tochararr);
  return str1;
}
public String left2(String str) {
  //hello
  //elloh
  //llohe
  String strRotatedOnce=rotate(str);
  String strRotatedtwice=rotate(strRotatedOnce);
  return strRotatedtwice;
}
