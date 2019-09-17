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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvalidFilterException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidFilterExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InvalidFilterExceptionUnmarshaller() {
        super(com.amazonaws.services.comprehend.model.InvalidFilterException.class, "InvalidFilterException");
    }

    @Override
    public com.amazonaws.services.comprehend.model.InvalidFilterException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.comprehend.model.InvalidFilterException invalidFilterException = new com.amazonaws.services.comprehend.model.InvalidFilterException(
                null);

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return invalidFilterException;
    }

    private static InvalidFilterExceptionUnmarshaller instance;

    public static InvalidFilterExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvalidFilterExceptionUnmarshaller();
        return instance;
    }
}
