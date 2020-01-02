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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InsufficientS3BucketPolicyException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsufficientS3BucketPolicyExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InsufficientS3BucketPolicyExceptionUnmarshaller() {
        super(com.amazonaws.services.cloudtrail.model.InsufficientS3BucketPolicyException.class, "InsufficientS3BucketPolicyException");
    }

    @Override
    public com.amazonaws.services.cloudtrail.model.InsufficientS3BucketPolicyException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.cloudtrail.model.InsufficientS3BucketPolicyException insufficientS3BucketPolicyException = new com.amazonaws.services.cloudtrail.model.InsufficientS3BucketPolicyException(
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
        return insufficientS3BucketPolicyException;
    }

    private static InsufficientS3BucketPolicyExceptionUnmarshaller instance;

    public static InsufficientS3BucketPolicyExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsufficientS3BucketPolicyExceptionUnmarshaller();
        return instance;
    }
}
