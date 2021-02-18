import random
from time import time, time_ns

n = input("Enter input size: ")
n = int(n)
x = input("Multiplied by? ")
x = int(x)
result = 0

list2d1 = [[random.random() for i in range(n)] for j in range(n)]
list2d2 = [[random.random() for i in range(n)] for j in range(n)]
list2d3 = [[random.random() for i in range(n)] for j in range(n)]
list2d4 = [[0 for i in range(n)] for j in range(n)]
list5 = [random.random() for i in range(n)]

#Matrix
timestartN = time_ns()
for i in range(n):
    for j in range(n):
        list2d3[i][j] = 0
        for k in range(n):
            list2d3[i][j] = list2d3[i][j] + (list2d1[i][k] * list2d2[k][j])


timeendN = time_ns()
print("start: " + str(timestartN) + "\nend: " + str(timeendN))
timedifN = timeendN - timestartN
print("The time is: " + str(timedifN/1000000) + " ms" + "\nThe time is: " + str(timedifN/1000000000) + " sec\n" + str(timedifN) + " nanosec")

#Scalar
timestartN = time_ns()
for i in range(n):
    for j in range(n):
        list2d4[i][j] = list2d1[i][j] * x


timeendN = time_ns()
print("start: " + str(timestartN) + "\nend: " + str(timeendN))
timedifN = timeendN - timestartN
print("The time is: " + str(timedifN/1000000) + " ms" + "\nThe time is: " + str(timedifN/1000000000) + " sec\n" + str(timedifN) + " nanosec")


#Sum
timestartN = time_ns()
for i in range(n):
    result += list5[i]


timeendN = time_ns()
print("start: " + str(timestartN) + "\nend: " + str(timeendN))
timedifN = timeendN - timestartN
print("The time is: " + str(timedifN/1000000) + " ms" + "\nThe time is: " + str(timedifN/1000000000) + " sec\n" + str(timedifN) + " nanosec")

