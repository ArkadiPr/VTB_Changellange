package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import com.joestelmach.natty.*;


public class Main {

    //Задание 1
    public  List<Integer> freeIp(List<Integer> busyIp,int start,int end){
        List<Integer> result=new ArrayList<>();
        for(int i=start;i<=end;i++){
            result.add(i);
        }
        result.removeAll(busyIp);
        return result;
    }

    //Задание 2
    public  String mostOccurringWord(String line){

        String[] words=line.replaceAll("[.,]","").split(" ");
        int maxCounts = 0;
        int currentWordCount;
        String maxKey=null;

        Map<String,Integer> counts=new HashMap<String, Integer>() ;

        for (String word : words) {
            if(counts.containsKey(word)){
                currentWordCount=counts.get(word)+1;
                counts.put(word,currentWordCount);

            }
            else {
                currentWordCount=1;
                counts.put(word,currentWordCount);
            }
            if(maxCounts<currentWordCount){
                maxCounts=currentWordCount;
                maxKey=word;
            }

        }
        return maxKey;

    }

    //Задание 3 (выполняет немного другую задачу)
    public List<Date> getDatesFromLine(String line){
        List<Date> dates =new Parser().parse(line).stream().flatMap(listContainer -> listContainer.getDates().stream())
                .collect(Collectors.toList());
        return dates;
    }

    //Задание 3
    public  Set<Date> getDatesFromLine2(String line,String dateFormat){
        Set<Date> result=new HashSet<>();
        int n=line.length();
        int m=dateFormat.length();
        Date current;
        String dateString;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(dateFormat);
        simpleDateFormat.setLenient(false);
        for (int i = 0; i < n-m; i++) {
            try{
                dateString=line.substring(i,i+m+1);
                current=simpleDateFormat.parse(dateString);
                result.add(current);
            }
            catch(Exception e){}

        }
        return result;
    }

    //Задание 4
    public  int sumNumbers(String line){
        Integer sum=0;
        String[] numbers= Arrays.stream(line.split("[^0-9-]")).filter(number->!number.isEmpty()).toArray(String[]::new);

        for(String number: numbers){
            try {
                sum = sum + Integer.parseInt(number);
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return sum;
    }

    //Задание 5
    public int countOfLeafs(Node root){
        int count=0;
        if(root.getRight()==null&&root.getLeft()==null){
            count++;
            return count;
        }
        if(root.getLeft()!=null){
            count=count+countOfLeafs(root.getLeft());
        }
        if(root.getRight()!=null){
            count=count+countOfLeafs(root.getRight());
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
