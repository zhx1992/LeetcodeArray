/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals == null || intervals.isEmpty())
            return intervals;
        Collections.sort(intervals,new Comparator<Interval>() {
            public int compare(Interval i1,Interval i2) {
                if(i1.start != i2.start) {
                    return i1.start - i2.start;
            }
            return i1.end - i2.end;
                         }
        });
        ListIterator<Interval> it = intervals.listIterator();
        Interval cur = it.next();
        while(it.hasNext()) {
            Interval next = it.next();
            if(cur.end < next.start) {
                cur = next;
                continue;
            } else {
                cur.end = Math.max(cur.end,next.end);
                it.remove();
            }
        }
        return intervals;
    }
}