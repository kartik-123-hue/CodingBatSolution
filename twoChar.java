/*
Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"
*/

public String twoChar(String str, int index) {
  //if the index is negative or index is more than the str length 
  if(index<0 || index>str.length()){
    return str.substring(0,2);
  }
  String twocharStringformed=str.substring(index,str.length());
  
  //twoChar("java", 0) → "ja" the below condition works for this input
  if(twocharStringformed.length()>2){
    return twocharStringformed.substring(0,2);
  }
  
  //twoChar("java", 3) → "ja" the below condition works for this input
  if(twocharStringformed.length()<2){
    return str.substring(0,2);
  }

  //twoChar("java", 2) → "va" if its inside the confined length then we can return that string itself
  return twocharStringformed;
}
