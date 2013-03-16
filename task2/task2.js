function isPrime(n){
	var sqrtN = Math.round(Math.sqrt(n)) + 1;

    if(n==1) return false;
    for(var d=2; d <= sqrtN; d++){
        if(n%d==0) return false;
    };
    return true;
};

var n = 600851475143;
var prime = 2;

while (n != 1) {
	if (n % prime == 0){
		print(n,"/",prime,"=",n=n/prime);
	}
	else {
		while (!isPrime(++prime)){};
	}
}

print("Max prime divider:", prime);