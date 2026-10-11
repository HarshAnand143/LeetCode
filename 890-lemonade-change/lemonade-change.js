var lemonadeChange = function(bills) {
    let n = bills.length;
    let fives = 0;
    let tens = 0;
    for (let i = 0; i < n; i++) {
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
            if (tens > 0 && fives > 0) {
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
};