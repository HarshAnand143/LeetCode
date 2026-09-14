var lengthOfLastWord = function(s) {
    let i = s.length - 1;
    let len = 0;
    while(i >= 0 && s[i] == ' '){
        i--;
    }
    while(i >= 0 && s[i] != ' '){
        len++;
        i--;
    }
    return len;
};