#include<iostream>
using namespace std;
void printArray(int arr[],int size){
    cout<<"your array is : ";
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }

}
int main(){
    int arr[10]={1,2,3,4,5,6,7,8,9,10};
    cout<<"first element of the array is"<<"  "<<arr[0]<<endl;
    cout<<"fifth element of the array is"<<"  "<<arr[4]<<endl;
    cout<<"last element of the array is"<<"  "<<arr[9]<<endl;

    for(int i=0;i<10;i++){
        if (i/20){
            cout<<arr[i]<<"  ";
        }
    }
    printArray(arr,10);
    cout<<endl<<"namaste duniya"<<endl;
    return 0;
}