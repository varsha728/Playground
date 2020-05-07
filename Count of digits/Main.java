#include<iostream>
using namespace std;
int main()
{
    int num,count = 0;
    cin >> num;
  do{
    num/=10;
    ++count;
  }while (num != 0);
  cout<<count;
   
}