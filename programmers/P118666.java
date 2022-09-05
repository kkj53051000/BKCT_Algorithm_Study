import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P118666 {
    public static void main(String[] args) {

        Map<String , Integer> maps = new HashMap<>();

        String[] kbti  = {"RT", "CF", "JM", "AN"};

        maps.put("RT", 0);
        maps.put("CF", 0);
        maps.put("JM", 0);
        maps.put("AN", 0);

        String result = "";


        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choice = {5, 3, 2, 7, 5};

        for (int i = 0; i < survey.length; i++) {
            String nowSurvey = survey[i];
            int nowChoice = choice[i];



            if (nowSurvey.charAt(0) > nowSurvey.charAt(1)) {
                String changeSurvey = String.valueOf(nowSurvey.charAt(1)) + String.valueOf(nowSurvey.charAt(0));

                if (nowChoice > 4) {
                    int temp = maps.get(changeSurvey);
                    maps.put(changeSurvey, temp - 1);
                }else if (nowChoice < 4) {
                    int temp = maps.get(changeSurvey);
                    maps.put(changeSurvey, temp + 1);
                }
            }else {

                if (nowChoice > 4) {
                    int temp = maps.get(nowSurvey);
                    maps.put(nowSurvey, temp + 1);
                }else if (nowChoice < 4) {
                    int temp = maps.get(nowSurvey);
                    maps.put(nowSurvey, temp - 1);
                }
            }

        }

        for (String k : kbti) {
            if (maps.get(k) > 0) {
                result += k.charAt(1);
            }else{
                result += k.charAt(0);
            }

        }

        System.out.println(result);

    }
}
