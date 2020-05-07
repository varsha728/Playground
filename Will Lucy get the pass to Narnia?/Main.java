
# include <iostream>
using namespace std;

int main()
{
    char op;
    int num1, num2;
    cout<<"Enter first number : ";
    cin>>num1;
   cout<<"Enter second number : ";
    cin>>num2;
   cout<<"Menu";
  cout<<"\n1.Addition"<< "\n2.Subtraction"<<"\n3.Multiplication"<<"\n4.Division"<<"\n5.Remainder";
   cin>>op;
    switch(op)
    {
        case '1':
            cout <<"\n"<< num1+num2;
            break;

        case '2':
            cout <<"\n"<< num1-num2;
            break;

        case '3':
            cout <<"\n"<< num1*num2;
            break;

        case '4':
            cout <<"\n"<< num1/num2;
            break;
      case '5':
        cout<<"\n"<<num1%num2;
        break;

        default:
            cout <<"\nInvalid operation";
            break;
    }


}