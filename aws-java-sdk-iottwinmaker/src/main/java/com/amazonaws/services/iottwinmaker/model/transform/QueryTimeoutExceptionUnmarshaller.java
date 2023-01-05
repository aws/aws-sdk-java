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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QueryTimeoutException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryTimeoutExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private QueryTimeoutExceptionUnmarshaller() {
        super(com.amazonaws.services.iottwinmaker.model.QueryTimeoutException.class, "QueryTimeoutException");
    }

    @Override
    public com.amazonaws.services.iottwinmaker.model.QueryTimeoutException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.iottwinmaker.model.QueryTimeoutException queryTimeoutException = new com.amazonaws.services.iottwinmaker.model.QueryTimeoutException(
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
        return queryTimeoutException;
    }

    private static QueryTimeoutExceptionUnmarshaller instance;

    public static QueryTimeoutExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new QueryTimeoutExceptionUnmarshaller();
        return instance;
    }
}
