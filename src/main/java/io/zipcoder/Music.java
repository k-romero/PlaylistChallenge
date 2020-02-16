package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int result = 0;
        int sk = startIndex;
        int next = 0;
        int prev = 0;


        for (int i = sk; i < playList.length; i++) {
            if(playList[i] != selection){
                next++;
            } else {break;}
        }

        for (int j = sk; j < playList.length; j--) {
            if(j-1 < 0){
                j = playList.length-1;
                prev++;
            }
            if(playList[j] != selection){
                prev++;
            } else {break;}
        }


        if(next <= prev){
            result = next;
        } else result = prev;



        return result;
    }
}
