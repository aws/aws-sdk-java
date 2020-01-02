/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvalidEC2TagException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidEC2TagExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InvalidEC2TagExceptionUnmarshaller() {
        super(com.amazonaws.services.codedeploy.model.InvalidEC2TagException.class, "InvalidEC2TagException");
    }

    @Override
    public com.amazonaws.services.codedeploy.model.InvalidEC2TagException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.codedeploy.model.InvalidEC2TagException invalidEC2TagException = new com.amazonaws.services.codedeploy.model.InvalidEC2TagException(
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
        return invalidEC2TagException;
    }

    private static InvalidEC2TagExceptionUnmarshaller instance;

    public static InvalidEC2TagExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvalidEC2TagExceptionUnmarshaller();
        return instance;
    }
}
