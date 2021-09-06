/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import data.Student;
import util.Filter;

/**
 *
 * @author FPT
 */
public class FilterByYob implements Filter{

    @Override
    public boolean check(Student x) {
        return x.getYob() >= 1990 && x.getYob() <= 1995;
    }

}
