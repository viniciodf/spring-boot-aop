package com.javainuse.core;

import com.javainuse.annotation.Operation;
import com.javainuse.annotation.OperationEnum;
import com.javainuse.annotation.SecurityEnforcer;

@SecurityEnforcer
public abstract class AbstractCrudService {
    @Operation(OperationEnum.CREATE)
    public void findAll() {
        findById();
    }

    protected void findById(){}
}
