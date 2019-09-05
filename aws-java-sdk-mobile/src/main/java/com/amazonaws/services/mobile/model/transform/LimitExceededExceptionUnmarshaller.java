/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mobile.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mobile.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LimitExceededException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LimitExceededExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private LimitExceededExceptionUnmarshaller() {
        super(com.amazonaws.services.mobile.model.LimitExceededException.class, "LimitExceededException");
    }

    @Override
    public com.amazonaws.services.mobile.model.LimitExceededException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.mobile.model.LimitExceededException limitExceededException = new com.amazonaws.services.mobile.model.LimitExceededException(null);

        if (context.isStartOfDocument()) {
            if (context.getHeader("Retry-After") != null) {
                context.setCurrentHeader("Retry-After");
                limitExceededException.setRetryAfterSeconds(context.getUnmarshaller(String.class).unmarshall(context));
            }
        }

        return limitExceededException;
    }

    private static LimitExceededExceptionUnmarshaller instance;

    public static LimitExceededExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new LimitExceededExceptionUnmarshaller();
        return instance;
    }
}
