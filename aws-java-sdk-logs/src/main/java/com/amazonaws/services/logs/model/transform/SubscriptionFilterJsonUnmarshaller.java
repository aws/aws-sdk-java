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
package com.amazonaws.services.logs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubscriptionFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubscriptionFilterJsonUnmarshaller implements Unmarshaller<SubscriptionFilter, JsonUnmarshallerContext> {

    public SubscriptionFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubscriptionFilter subscriptionFilter = new SubscriptionFilter();

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
                if (context.testExpression("filterName", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setFilterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logGroupName", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setLogGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterPattern", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setFilterPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationArn", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setDestinationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("distribution", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setDistribution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    subscriptionFilter.setCreationTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return subscriptionFilter;
    }

    private static SubscriptionFilterJsonUnmarshaller instance;

    public static SubscriptionFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscriptionFilterJsonUnmarshaller();
        return instance;
    }
}
