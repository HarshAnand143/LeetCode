var maxDepth = function(s) {
    let maxdepth = 0;
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) == '(') {
            count++;
        }
        else if (s.charAt(i) == ')') {
            count--;
        }
        maxdepth = Math.max(maxdepth, count);
    }
    return maxdepth;
};