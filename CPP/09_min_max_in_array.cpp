#include<iostream>
using namespace std;
void printArray(int arr[],int size){
    cout<<"your array is : ";
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
}
int maxelement(int arr[],int size){
    int max1=INT32_MIN;
    for(int i=0;i<size;i++){
        if(arr[i] > max1){
            max1 = arr[i];
        }
    }
    return max1;
}
int minelement(int arr[],int size){
    int min1=INT32_MAX;
    for(int i=0;i<size;i++){
        if(arr[i] < min1){
            min1 = arr[i];
        }
    }
    return min1;
}
int main(){
    int first[5]={1,2,34,5,6};
    int secound[10]={-15,25,-19,40,29,56,-38,28};

    printArray(first,5);
    cout << endl << "maaximum element of your array is : " << maxelement(first,5);
    cout << endl << "minimum element of your array is : " << minelement(first,5) << endl;
    printArray(secound,10);
    cout << endl << "maaximum element of your array is : " << maxelement(secound,10);
    cout << endl << "minimum element of your array is : " << minelement(secound,10);
    return 0;
}