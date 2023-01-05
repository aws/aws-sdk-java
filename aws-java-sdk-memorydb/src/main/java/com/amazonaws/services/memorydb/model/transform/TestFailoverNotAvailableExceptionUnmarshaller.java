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
package com.amazonaws.services.memorydb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.memorydb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TestFailoverNotAvailableException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestFailoverNotAvailableExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private TestFailoverNotAvailableExceptionUnmarshaller() {
        super(com.amazonaws.services.memorydb.model.TestFailoverNotAvailableException.class, "TestFailoverNotAvailableFault");
    }

    @Override
    public com.amazonaws.services.memorydb.model.TestFailoverNotAvailableException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.memorydb.model.TestFailoverNotAvailableException testFailoverNotAvailableException = new com.amazonaws.services.memorydb.model.TestFailoverNotAvailableException(
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
        return testFailoverNotAvailableException;
    }

    private static TestFailoverNotAvailableExceptionUnmarshaller instance;

    public static TestFailoverNotAvailableExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestFailoverNotAvailableExceptionUnmarshaller();
        return instance;
    }
}
