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
 * ThrottlingException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThrottlingExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private ThrottlingExceptionUnmarshaller() {
        super(com.amazonaws.services.connectcampaign.model.ThrottlingException.class, "ThrottlingException");
    }

    @Override
    public com.amazonaws.services.connectcampaign.model.ThrottlingException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.connectcampaign.model.ThrottlingException throttlingException = new com.amazonaws.services.connectcampaign.model.ThrottlingException(
                null);

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amzn-ErrorType") != null) {
                context.setCurrentHeader("x-amzn-ErrorType");
                throttlingException.setXAmzErrorType(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        return throttlingException;
    }

    private static ThrottlingExceptionUnmarshaller instance;

    public static ThrottlingExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThrottlingExceptionUnmarshaller();
        return instance;
    }
}
