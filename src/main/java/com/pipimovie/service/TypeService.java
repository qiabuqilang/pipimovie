package com.pipimovie.service;

import com.pipimovie.service.businessobject.TypeBO;

import java.util.List;

public interface TypeService {
    List<TypeBO> listType();
    List<TypeBO> listType(byte pid);
    TypeBO getType(short tid);

}
