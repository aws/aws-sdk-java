/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InternalServerErrorException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerErrorExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InternalServerErrorExceptionUnmarshaller() {
        super(com.amazonaws.services.deadline.model.InternalServerErrorException.class, "InternalServerErrorException");
    }

    @Override
    public com.amazonaws.services.deadline.model.InternalServerErrorException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.deadline.model.InternalServerErrorException internalServerErrorException = new com.amazonaws.services.deadline.model.InternalServerErrorException(
                null);

        if (context.isStartOfDocument()) {
            if (context.getHeader("Retry-After") != null) {
                context.setCurrentHeader("Retry-After");
                internalServerErrorException.setRetryAfterSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
            }
        }

        return internalServerErrorException;
    }

    private static InternalServerErrorExceptionUnmarshaller instance;

    public static InternalServerErrorExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InternalServerErrorExceptionUnmarshaller();
        return instance;
    }
}
