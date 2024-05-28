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
package com.amazonaws.services.chatbot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chatbot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSlackUserIdentitiesException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSlackUserIdentitiesExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private DescribeSlackUserIdentitiesExceptionUnmarshaller() {
        super(com.amazonaws.services.chatbot.model.DescribeSlackUserIdentitiesException.class, "DescribeSlackUserIdentitiesException");
    }

    @Override
    public com.amazonaws.services.chatbot.model.DescribeSlackUserIdentitiesException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.chatbot.model.DescribeSlackUserIdentitiesException describeSlackUserIdentitiesException = new com.amazonaws.services.chatbot.model.DescribeSlackUserIdentitiesException(
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
        return describeSlackUserIdentitiesException;
    }

    private static DescribeSlackUserIdentitiesExceptionUnmarshaller instance;

    public static DescribeSlackUserIdentitiesExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSlackUserIdentitiesExceptionUnmarshaller();
        return instance;
    }
}
