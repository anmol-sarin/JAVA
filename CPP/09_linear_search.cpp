#include<iostream>
using namespace std;
bool search(int arr[],int n,int key){
    for (int i=0;i<n;i++){
        if (arr[i] == key){
            return 1;
        }
        else{
            return 0;
        }
    }
}

int main(){
    int first[6]={34,56,74,64,35,11};
    int key;
    cout<<"enter the number you want to search : ";
    cin>>key;
    bool found=search(first,6,key);
    if(found){
        cout<<"^^^^^^^^^^^^^^^ it is present ^^^^^^^^^^^^^^";
    }
    else{
        cout<<"''''''''''''''not found'''''''''''''''''";
    }   
}