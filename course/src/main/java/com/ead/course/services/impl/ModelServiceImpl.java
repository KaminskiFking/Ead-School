package com.ead.course.services.impl;

import com.ead.course.repositories.ModuleRepository;
import com.ead.course.services.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    ModuleRepository moduleRepository;
}
