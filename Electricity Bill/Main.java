#include <iostream>
using namespace std;

int main()
{
    int unit,total_amt;
    float amt,  sur_charge;

   cin>>unit;


    /* Calculate electricity bill according to given conditions */
    if(unit <= 200)
    {
        amt = unit * 0.40;
    }
    else if(unit <= 400)
    {
        amt = 25 + ((unit-200) * 0.65);
    }
    else if(unit <= 600)
    {
        amt = 100 + ((unit-600) * 1.20);
    }
    else
    {
        amt = 220 + ((unit-600)*1.0);
    }

   
    sur_charge = amt * 0.25;
    total_amt  = amt + sur_charge;

    cout<<"Rs."<<total_amt;

    return 0;
}