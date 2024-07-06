def sum_multiples_3_or_5(limit):
    sum = 0
    for i in range(limit):
        if i % 3 == 0 or i % 5 == 0:
            sum += i
    return sum

limit = 1000
result = sum_multiples_3_or_5(limit)
print(f"The sum of all multiples of 3 or 5 below {limit} is: {result}")