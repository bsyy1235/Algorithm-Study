def solution(n):
    x = n ** 0.5
    return pow(x + 1, 2) if x % 1 == 0 else -1
