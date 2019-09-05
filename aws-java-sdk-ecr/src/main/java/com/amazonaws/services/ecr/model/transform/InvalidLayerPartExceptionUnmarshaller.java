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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InvalidLayerPartException JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InvalidLayerPartExceptionUnmarshaller extends EnhancedJsonErrorUnmarshaller {
    private InvalidLayerPartExceptionUnmarshaller() {
        super(com.amazonaws.services.ecr.model.InvalidLayerPartException.class, "InvalidLayerPartException");
    }

    @Override
    public com.amazonaws.services.ecr.model.InvalidLayerPartException unmarshallFromContext(JsonUnmarshallerContext context) throws Exception {
        com.amazonaws.services.ecr.model.InvalidLayerPartException invalidLayerPartException = new com.amazonaws.services.ecr.model.InvalidLayerPartException(
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
                if (context.testExpression("registryId", targetDepth)) {
                    context.nextToken();
                    invalidLayerPartException.setRegistryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repositoryName", targetDepth)) {
                    context.nextToken();
                    invalidLayerPartException.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uploadId", targetDepth)) {
                    context.nextToken();
                    invalidLayerPartException.setUploadId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastValidByteReceived", targetDepth)) {
                    context.nextToken();
                    invalidLayerPartException.setLastValidByteReceived(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }
        return invalidLayerPartException;
    }

    private static InvalidLayerPartExceptionUnmarshaller instance;

    public static InvalidLayerPartExceptionUnmarshaller getInstance() {
        if (instance == null)
            instance = new InvalidLayerPartExceptionUnmarshaller();
        return instance;
    }
}
