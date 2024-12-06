scores = input()

X, Y, Z = map(float, scores.split())

average = (X + Y + Z) / 3

print(round(average, 1))

