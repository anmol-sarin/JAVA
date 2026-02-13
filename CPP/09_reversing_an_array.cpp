#include<iostream>
using namespace std;
void swapping(int arr[],int n){
    int start=0;
    int end=n-1;
    while(start<=end){
        swap(arr[start],arr[end]);
        start++;
        end--;
    }
}
void printArray(int arr[],int n){
    // cout<<"your array is : ";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<"  ";
    }
    cout<<endl;
}

int main(){
    int first[6]={1,2,3,4,5,6};
    int second[7]={8,3,4,2,10,6,9};
    cout<<"original first array : "<<endl;
    printArray(first,6);
    swapping(first,6);
    cout<<"after swapping first array : "<<endl;
    printArray(first,6);
    
    cout<<"original second array : "<<endl;
    printArray(second,7);
    swapping(second,7);
    cout<<"after swapping second array : "<<endl;
    printArray(second,7);
}