/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.std.ec.repository.persistence;

import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author WALTER ROSERO
 */
@Local
public interface Repository<T> {

    T save(T entity);

    T update(T entity);

    T findById(Object entityId);

    void delete(T entity);

    List<T> findAll();
    
}
