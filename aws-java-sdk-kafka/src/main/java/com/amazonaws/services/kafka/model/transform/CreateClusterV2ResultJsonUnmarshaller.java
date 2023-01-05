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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateClusterV2Result JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterV2ResultJsonUnmarshaller implements Unmarshaller<CreateClusterV2Result, JsonUnmarshallerContext> {

    public CreateClusterV2Result unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateClusterV2Result createClusterV2Result = new CreateClusterV2Result();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createClusterV2Result;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("clusterArn", targetDepth)) {
                    context.nextToken();
                    createClusterV2Result.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    context.nextToken();
                    createClusterV2Result.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    createClusterV2Result.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterType", targetDepth)) {
                    context.nextToken();
                    createClusterV2Result.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createClusterV2Result;
    }

    private static CreateClusterV2ResultJsonUnmarshaller instance;

    public static CreateClusterV2ResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateClusterV2ResultJsonUnmarshaller();
        return instance;
    }
}
