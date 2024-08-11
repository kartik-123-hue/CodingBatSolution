/*Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"*/

//it can never reach 0 otherwise i-1 will produce -1 and that will be index outofbounds therefor as soon as it 1 and updates the 
//tochararr[0] it will come out of the loop so basically tochararronce will have [ohell] and then in the next iteration it will have 
//tochararr will have [lohel] which is required when we rotate it 2 times to the right 


public String rotate(String str){
  char[] tochararr=str.toCharArray();
  for(int i=tochararr.length-1;i>0;i--){
    char c=tochararr[i];
    tochararr[i]=tochararr[i-1];
    tochararr[i-1]=c;
  }
  String str1=new String(tochararr);
  return str1;
}
public String right2(String str) {
  //hello
  //ohell
  //lohel
  String strrightonce=rotate(str);
  String strrighttwice=rotate(strrightonce);
  return strrighttwice;
}
