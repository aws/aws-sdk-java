/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.oam.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.oam.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InternalServiceException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServiceExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InternalServiceExceptionUnmarshaller() {
        super(com.amazonaws.services.oam.model.InternalServiceException.class, "InternalServiceFault");
    }

    @Override
    public com.amazonaws.services.oam.model.InternalServiceException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.oam.model.InternalServiceException internalServiceException = new com.amazonaws.services.oam.model.InternalServiceException(null);

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amzn-ErrorType") != null) {
                context.setCurrentHeader("x-amzn-ErrorType");
                internalServiceException.setAmznErrorType(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        return internalServiceException;
    }

    private static InternalServiceExceptionUnmarshaller instance;

    public static InternalServiceExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InternalServiceExceptionUnmarshaller();
        return instance;
    }
}
