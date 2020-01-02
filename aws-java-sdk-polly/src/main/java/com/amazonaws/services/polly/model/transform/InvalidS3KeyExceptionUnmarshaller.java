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
package com.amazonaws.services.polly.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvalidS3KeyException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidS3KeyExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InvalidS3KeyExceptionUnmarshaller() {
        super(com.amazonaws.services.polly.model.InvalidS3KeyException.class, "InvalidS3KeyException");
    }

    @Override
    public com.amazonaws.services.polly.model.InvalidS3KeyException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.polly.model.InvalidS3KeyException invalidS3KeyException = new com.amazonaws.services.polly.model.InvalidS3KeyException(null);

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
        return invalidS3KeyException;
    }

    private static InvalidS3KeyExceptionUnmarshaller instance;

    public static InvalidS3KeyExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvalidS3KeyExceptionUnmarshaller();
        return instance;
    }
}
