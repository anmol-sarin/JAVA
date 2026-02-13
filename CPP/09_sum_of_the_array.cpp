#include<iostream>
using namespace std;
int adding(int arr[],int n){
    int sum=0;
    for (int i=0; i<n; i++){
        sum+=arr[i];
    }
    return sum;
}
int main(){
    int first[5]={2,5,8,10,14};
    for(int i=0;i<5;i++){
        cout<<first[i]<<" ";
    }
    cout<< endl <<" sum of the array is : "<<adding(first,5);
}