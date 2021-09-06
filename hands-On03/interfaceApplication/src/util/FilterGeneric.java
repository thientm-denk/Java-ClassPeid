/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author FPT
 */
public interface FilterGeneric<T> {
    public boolean check(T x);
    
    
}
