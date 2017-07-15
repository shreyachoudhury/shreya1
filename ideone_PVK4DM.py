# your code goes here
n=565
n1=n
r=0
d=0
while(n1>0):
	d=n1%10
	r=(r*10)+d
	n1=n1/10
if(r==n):
	print('palindrome')
else:
	print ('not palindrome')