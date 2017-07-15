# your code goes here
n=7
i=1
c=0
for i in range(1,n):
	if((n%i)==0):
		c=c+1
if(c>2):
	print('prime number')
else:
	print('Not a prime number')
	