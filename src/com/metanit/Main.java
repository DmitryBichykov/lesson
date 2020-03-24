package com.metanit;


public class Main {
    private static StringBuilder line = new StringBuilder("Мама мылы раму! Раму мыла мама. Сколько тебе лет? " +
            "я пойду гулять по гаю. Гай красивый? Очень! Ох, как хорошо. ");
    private static int number=0;

    public static void main(String[] args) {
        System.out.println("Исходная строка:\n"+line);
        search(".");
        search("!");
        search("?");

        System.out.println("Количество предложений в тексте: "+number);
        }


    private static void search(String str){
        int index=-1;
        int pos=0;
         do{
            index=line.substring(pos).indexOf(str);
            if ( index!= -1) {
                number++;
                pos+=index+1;
            }
        }while (index!=-1);
    }

}
