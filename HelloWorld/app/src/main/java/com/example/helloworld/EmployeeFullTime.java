package com.example.helloworld;

import com.example.helloworld.Employee;

public class EmployeeFullTime extends Employee {

    @Override
    public double TinhLuong() {
        return 500;
    }

    @Override
    public String toString() {
        return super.toString() + " -->FullTime=" + TinhLuong();
    }
}


