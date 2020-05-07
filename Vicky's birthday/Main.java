#include<iostream>
using namespace std;
int main()
{
	int yr;
    cin>>yr;
	if((yr>=1996)&&(yr%4==0))
	{
		cout<<"Vicky can celebrate his birthday.";
	}
  else
	{
		cout<<"Vicky can't celebrate.";
	}

}