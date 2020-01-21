package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestSet {

    @Test
    public void createNewSet_hasEmptyElements() {
        Set set = new SetImpl();
        Assert.assertTrue(set.isEmpty());
        Assert.assertEquals(set.size(), 0);
    }

    @Test
    public void createNewSet_addElement_isNotEmpty() {
        Set set = new SetImpl();
        set.add(3);
        Assert.assertFalse(set.isEmpty());
        Assert.assertEquals(set.size(), 1);
    }

    @Test
    public void createNewSet_addElement_checkIfElementExists() {
        Set set = new SetImpl();
        set.add(3);
        Assert.assertTrue(set.has(3));
    }

    @Test
    public void createNewSet_addTwoSameElements(){
        Set set = new SetImpl();
        set.add(3);
        set.add(3);
        Assert.assertTrue(set.has(3));
        Assert.assertEquals(set.size(), 1);
    }

    @Test
    public void createNewSet_AddMoreThanBuffer(){
        Set set=new SetImpl() ;
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        Assert.assertEquals(set.size(),4);
    }
}
