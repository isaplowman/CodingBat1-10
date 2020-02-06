public class Runner {


        public static void main(String[] args) {
            System.out.println(icyHot(100, 5));
            System.out.println(makeTags("i", "pose"));
            System.out.println(sum2([2,3,4]));
            System.out.println(alarmClock(2, true));
            System.out.println(hasTeen(50, 70, 2));
            System.out.println(bobThere("hello"));
            System.out.println(without2("hithere"));
        }





    public static boolean icyHot(int temp1, int temp2) {
        if((temp1< 0 && temp2> 100) || (temp1>100 && temp2<0)){
            return true;
        }else{
            return false;
        }
    }

    public static String makeTags(String tag, String word) {
        String newTag = "<" + tag + ">";
        String lastTag = "</" + tag + ">";
        String finalStr = newTag + word + lastTag;
        return finalStr;
    }

    public static int sum2(int[] nums) {
        if(nums.length >= 2){
            int sum = nums[0] + nums[1];
            return sum;
        }
        if(nums.length == 1){
            int ans = nums[0];
            return ans;
        }else{
            return 0;
        }

    }

    public static String alarmClock(int day, boolean vacation) {
        if((day==0 || day == 6) && vacation ==true){
            String sleep = "off";
            return sleep;
        }
        if((day== 0 || day==6) || vacation ==true){
            String wake = "10:00";
            return wake;
        }else{
            String rise = "7:00";
            return rise;
        }
    }

    public static boolean hasTeen(int a, int b, int c) {
        if((a>= 13 && a<= 19) || (b>= 13 && b<= 19) || (c>= 13 && c<= 19)){
            return true;
        }else{
            return false;
        }
    }



    public static boolean bobThere(String str) {
        for(int i= 0; i < str.length() -2; i++){
            if(str.substring(i, i + 1).equals("b") && str.substring(i + 2, i+ 3).equals("b")){
                return true;
            }
        }
        return false;
    }


}




    public static String without2(String str) {
    String word = str;
        for(int i = 0; i<str.length()-2; i++){
            if(str.substring(i, i+2).equals(str.length()-3, word.length())){
                return str.substring(2, str.length());
            }
        }
        return str;
    }

