class Meet{
    int st;
    int end;
    int pos;
    
    public Meet(int st, int end, int pos){
        this.st = st;
        this.end = end;
        this.pos = pos;
    }
}

class Solution {

//logic  : be greedy at each step;
    
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    
    public int maxMeetings(int start[], int end[]) {
        
        List<Meet> meetarr = new ArrayList<>();
        
        for(int i=0;i<start.length;i++){
            meetarr.add(new Meet(start[i], end[i], i));
        }
        
        meetarr.sort(Comparator.comparingInt(m->m.end));
        
        int cntr = 1;
        int starT = meetarr.get(0).st;
        int endT = meetarr.get(0).end;
        
        for(int i=1;i<meetarr.size();i++){
            
            if(meetarr.get(i).st > endT){
                cntr++;
                endT = meetarr.get(i).end;
            }
        }
        
        return cntr;
        
        // add your code here
    }
}
