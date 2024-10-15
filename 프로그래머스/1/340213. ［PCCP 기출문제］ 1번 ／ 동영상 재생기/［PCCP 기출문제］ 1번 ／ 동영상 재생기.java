class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_sec = toSec(video_len);
        int pos_sec = toSec(pos);
        int op_start_sec = toSec(op_start);
        int op_end_sec = toSec(op_end);
        
        if (op_start_sec <= pos_sec && pos_sec <= op_end_sec) {
            pos_sec = op_end_sec;
        }
        
        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("prev")) {
                pos_sec -= 10;
                if (pos_sec < 0) pos_sec = 0;
                if (op_start_sec <= pos_sec && pos_sec <= op_end_sec) {
                    pos_sec = op_end_sec;
                }
            } else if (commands[i].equals("next")) {
                pos_sec += 10;
                if (pos_sec > video_sec) pos_sec = video_sec;
                if (op_start_sec <= pos_sec && pos_sec <= op_end_sec) {
                    pos_sec = op_end_sec;
                }
            }
        }
        
        answer = String.format("%2s", pos_sec / 60).replace(" ", "0") 
            + ":" 
            + String.format("%2s", pos_sec % 60).replace(" ", "0") ;
        return answer;
    }
    
    public int toSec(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3));
    }
}