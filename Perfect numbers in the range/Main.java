#include<iostream>
using namespace std;

int main()
{
    int i, j, start, end, sum;

    
    cin>>start>>end;

    
    
    /* Iterate from start to end */
    for(i=start; i<=end; i++)
    {
        sum = 0;

        /* Check whether the current number i is Perfect number or not */
        for(j=1; j<i; j++)
        {
            if(i % j == 0)
            {
                sum += j;
            }
        }
        if(sum == i)
        {
            cout<<i<<" ";
        }
    }

    return 0;
}