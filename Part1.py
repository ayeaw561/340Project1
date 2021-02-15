import random
from time import time, time_ns
"""
Matrix
for(i=0; i<n; i++)
            for(j=0; j<n; j++){
                a3[i][j] = 0;
                for(k=0; k<n; k++)
                    a3[i][j] = a3[i][j] + a1[i][k] * a2[k][j];
                
        }

Scalar
 for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a2[i][j] = a1[i][j] * x;

            }
        }

Sum
for(p= 0; p< n; p++){

            result += a1[p];
        }
"""
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
timestart = int(time())
timestartN = time_ns()
for i in range(n):
    for j in range(n):
        list2d3[i][j] = 0
        for k in range(n):
            list2d3[i][j] = list2d3[i][j] + (list2d1[i][k] * list2d2[k][j])


timeend = int(time())
timeendN = time_ns()
print("start: " + str(timestart) + "\nend: " + str(timeend))
timedif = timeend - timestart
timedifN = timeendN - timestartN
print("The time is: " + str(timedif*1000) + " ms" + "\nThe time is: " + str(timedif) + " sec\n" + str(timedifN) + " nanosec")

#Scalar
timestart = int(time())
timestartN = time_ns()
for i in range(n):
    for j in range(n):
        list2d4[i][j] = list2d1[i][j] * x


timeend = int(time())
timeendN = time_ns()
print("start: " + str(timestart) + "\nend: " + str(timeend))
timedif = timeend - timestart
timedifN = timeendN - timestartN
print("The time is: " + str(timedif*1000) + " ms" + "\nThe time is: " + str(timedif) + " sec\n" + str(timedifN) + " nanosec")
#print("list2d4[2][3]: " + str(list2d4[2][3]) + "\nlist2d1[2][3]: " + str(list2d1[2][3]))


#Sum
timestart = int(time())
timestartN = time_ns()
for i in range(n):
    result += list5[i]


timeend = int(time())
timeendN = time_ns()
print("start: " + str(timestart) + "\nend: " + str(timeend))
timedif = timeend - timestart
timedifN = timeendN - timestartN
print("The time is: " + str(timedif*1000) + " ms" + "\nThe time is: " + str(timedif) + " sec\n" + str(timedifN) + " nanosec")

