function createCounter(n) { 
    return function() {
        return n++;
    };
};