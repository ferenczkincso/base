package hu.bme.mit.train.controller;
import java.util.Date;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tachograph {
    private Table<Date,Integer,Integer> data;

    public Tachograph(){
        this.data = HashBasedTable.create();
    }

    public void addData(java.util.Date date, int joystickP, int referenceS){
        data.put(date, joystickP, referenceS);
    }

    public int getLength(){
        return data.size();
    }
    public boolean isempty(){
		if (data.size ()> 0 )
			return false;
		return true;
	}
}
