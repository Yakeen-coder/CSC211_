import random

def slowshuffle(N):
    shuffled = [0] * (N + 1)
    isNotPresent = [True] * (N + 1)
    i = 0
    
    while i < N - 1:
        r = int(random.random() * N) + 1
        if isNotPresent[r]:
            i += 1
            shuffled[i] = r
            isNotPresent[r] = False
            
    for r in range(1, N + 1):
        if isNotPresent[r]:
            shuffled[N] = r
            break
            
    return shuffled[1:]

def biasedshuffle(N):
    shuffled = [i + 1 for i in range(N)]
    for i in range(N):
        r = random.randint(0, N - 1)
        shuffled[i], shuffled[r] = shuffled[r], shuffled[i]
    return shuffled

def shuffle(N):
    B = [b + 1 for b in range(N)]
    b = 0
    while b < N:
        r = random.randint(b, N - 1)
        B[b], B[r] = B[r], B[b]
        b += 1
    return B

def run_bias_test(method_func):
    D = {}
    for _ in range(60000):
        result = method_func(3)
        key = "".join(map(str, result))
        
        if key not in D:
            D[key] = 1
        else:
            D[key] += 1
            
    for key in sorted(D.keys()):
        print(key, D[key])
        
if __name__ == "__main__":
    print("Biased Test Results:")
    run_bias_test(biasedshuffle)
    print("\nUnbiased Test Results:")
    run_bias_test(shuffle)
