#include<iostream>
using namespace std;
int main()
{
int n,first,last,sum;
cin >> n;
first = n;
last=n % 10;
for(first=n;first>=n;first=first/1000);
  if(first==1)
    first=1;
  else
    first=0;
sum=first+last;
cout<<sum;
}