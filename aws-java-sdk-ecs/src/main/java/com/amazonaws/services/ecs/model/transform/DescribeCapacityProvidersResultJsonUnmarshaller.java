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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeCapacityProvidersResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCapacityProvidersResultJsonUnmarshaller implements Unmarshaller<DescribeCapacityProvidersResult, JsonUnmarshallerContext> {

    public DescribeCapacityProvidersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCapacityProvidersResult describeCapacityProvidersResult = new DescribeCapacityProvidersResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCapacityProvidersResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("capacityProviders", targetDepth)) {
                    context.nextToken();
                    describeCapacityProvidersResult.setCapacityProviders(new ListUnmarshaller<CapacityProvider>(CapacityProviderJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("failures", targetDepth)) {
                    context.nextToken();
                    describeCapacityProvidersResult.setFailures(new ListUnmarshaller<Failure>(FailureJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    describeCapacityProvidersResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCapacityProvidersResult;
    }

    private static DescribeCapacityProvidersResultJsonUnmarshaller instance;

    public static DescribeCapacityProvidersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCapacityProvidersResultJsonUnmarshaller();
        return instance;
    }
}
