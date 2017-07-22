n=input("Enter the number")
n1=n
s=n
while(s>9):
    s=0
    while(n1>0):
        d=n1%10
        n1=n1/10
        s=s+(d*d)
    n1=s
if(s==1):
    print 'Happy nUMBER'
else:
    print 'Not a happy number'
