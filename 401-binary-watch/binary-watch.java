class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> arr=new ArrayList<>();
        for(int hr=0;hr<12;hr++){
            for (int min=0;min<60;min++){
                int total= Integer.bitCount(hr)+Integer.bitCount(min);
                if(total==turnedOn){
                    String time=hr+":"+ (min<10 ? "0"+min : min);
                    arr.add(time);
                }
            } 
        }
        return arr;
    }
}