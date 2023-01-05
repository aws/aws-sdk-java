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
package com.amazonaws.services.connectcampaign.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectcampaign.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InternalServerException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternalServerExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InternalServerExceptionUnmarshaller() {
        super(com.amazonaws.services.connectcampaign.model.InternalServerException.class, "InternalServerException");
    }

    @Override
    public com.amazonaws.services.connectcampaign.model.InternalServerException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.connectcampaign.model.InternalServerException internalServerException = new com.amazonaws.services.connectcampaign.model.InternalServerException(
                null);

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amzn-ErrorType") != null) {
                context.setCurrentHeader("x-amzn-ErrorType");
                internalServerException.setXAmzErrorType(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        return internalServerException;
    }

    private static InternalServerExceptionUnmarshaller instance;

    public static InternalServerExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InternalServerExceptionUnmarshaller();
        return instance;
    }
}
