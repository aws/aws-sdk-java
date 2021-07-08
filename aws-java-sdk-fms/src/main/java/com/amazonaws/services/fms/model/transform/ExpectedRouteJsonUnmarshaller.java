/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ExpectedRoute JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExpectedRouteJsonUnmarshaller implements Unmarshaller<ExpectedRoute, JsonUnmarshallerContext> {

    public ExpectedRoute unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExpectedRoute expectedRoute = new ExpectedRoute();

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
                if (context.testExpression("IpV4Cidr", targetDepth)) {
                    context.nextToken();
                    expectedRoute.setIpV4Cidr(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrefixListId", targetDepth)) {
                    context.nextToken();
                    expectedRoute.setPrefixListId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpV6Cidr", targetDepth)) {
                    context.nextToken();
                    expectedRoute.setIpV6Cidr(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContributingSubnets", targetDepth)) {
                    context.nextToken();
                    expectedRoute.setContributingSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AllowedTargets", targetDepth)) {
                    context.nextToken();
                    expectedRoute.setAllowedTargets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RouteTableId", targetDepth)) {
                    context.nextToken();
                    expectedRoute.setRouteTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return expectedRoute;
    }

    private static ExpectedRouteJsonUnmarshaller instance;

    public static ExpectedRouteJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExpectedRouteJsonUnmarshaller();
        return instance;
    }
}
