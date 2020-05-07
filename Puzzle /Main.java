#include<iostream>
using namespace std;
int main(){
   int matrix[10][10], transMatrix[10][10], r, c;
   cin>>r;
   cin>>c;
   for(int i =0;i<r;i++) {
     for(int j=0;j<c;j++) {
       cin>>matrix[i][j];
     }
   }
  
  for(int i=0;i<r;i++) {
    for(int j=0;j<c;j++) {
      transMatrix[j][i] = matrix[i][j];
    }
  }
 
  
  for(int i=0;i<c;i++) {
    for(int j=0;j<r;j++) {
      cout<<transMatrix[i][j]<<" ";
      if(j==r-1)
        cout<<"\n";
    }
   }
}