var numOfSubarrays = function(arr) {
    const MOD = 1_000_000_007;
    let count = 0;
    let even = 1;
    let odd = 0;
    let prefix = 0;
    for (let i = 0; i < arr.length; i++) {
        prefix += arr[i];
        if (prefix % 2 == 0) {
            count += odd;
            even++;
        } else {
            count += even;
            odd++;
        }
    }
    return count % MOD;
};