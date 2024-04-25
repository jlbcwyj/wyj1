def euler_function(n):
    j=0
    for i in range(2,n):
        a=n
        q=i
        r=a%i
        while r!=1 and r!=0:
            a=int(q)
            q=int(r)
            r=int(a)%int(q)
        if r==1:
            j+=1
        elif r==0:
            pass
            
        print(j+1)
if  __name__ == '__main__':
    n=int(input("please input a number:"))
    euler_function(n)