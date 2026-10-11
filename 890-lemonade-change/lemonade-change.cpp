class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int n = bills.size();
        int fives = 0;
        int tens = 0;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                fives++;
            } else if (bills[i] == 10) {
                if(fives > 0) {
                    tens++;
                    fives--;
                } else {
                    return false;
                }
            } else {
                if (tens && fives) {
                    tens--;
                    fives--;
                } else if (fives >= 3) {
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
};