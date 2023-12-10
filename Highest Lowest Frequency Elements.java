 // Highest / Lowest Frequency Elements
import java.util.Map;

import java.util.TreeMap;

 

public class Solution {

public static int[] getFrequencies(int []v) {

Map<Integer,Integer> map=new TreeMap<>();

for(int i=0;i<v.length;i++){

if(!map.containsKey(v[i])){

map.put(v[i],1);

}

else{

int val=map.get(v[i]);

val+=1;

map.put(v[i],val);

}

}

int maxVal=Integer.MIN_VALUE;

int maxKey=0;

int minValue=Integer.MAX_VALUE;

int minKey=0;

for(Map.Entry<Integer,Integer> entry : map.entrySet()){

if(entry.getValue()>maxVal){

maxVal=entry.getValue();

maxKey=entry.getKey();

}

if(entry.getValue()<minValue){

minValue=entry.getValue();

minKey=entry.getKey();

}

}

int arr[]={maxKey,minKey};

return arr;

 

}

}

