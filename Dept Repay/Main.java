#include<iostream>
using namespace std;
int main()
{
int x,y,r;
double inter,amount,disc,finall;
cin>>x>>y>>r;
inter=(x*y*r)/100;
amount=x+inter;
disc=inter*2/100;
finall=x+inter-disc;
cout<<inter;
cout<<"\n"<<amount;
cout<<"\n"<<disc;
cout<<"\n"<<finall;  
return 0;
}
