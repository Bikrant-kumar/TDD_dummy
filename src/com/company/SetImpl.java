package com.company;

public class SetImpl implements Set {
    private int size=0;
    private int arr[] = new int[5];
    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void add(int a) {
        if(has(a)){
            return;
        }
        this.arr[this.size]=a;
        this.size++;
    }

    @Override
    public boolean has(int a) {
        for (int i=0;i<this.size;i++){
           if(this.arr[i]==a){
            return true;
        }}
        return false;
    }
}
