/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.annotations;

import com.amazonaws.services.simpleworkflow.flow.DataConverter;
import com.amazonaws.services.simpleworkflow.flow.DataConverterException;

/**
 * To be used only by annotations as they do not support <code>null</code> parameters.
 * 
 * @see Activities, Workflow
 * @author fateev, samar
 */
public final class NullDataConverter extends DataConverter {

    private NullDataConverter() {
    }
    
    @Override
    public <T> T fromData(String content, Class<T> valueType) throws DataConverterException {
        throw new UnsupportedOperationException("not implemented");
    }

    @Override
    public String toData(Object value) throws DataConverterException {
        throw new UnsupportedOperationException("not implemented");
    }

}
