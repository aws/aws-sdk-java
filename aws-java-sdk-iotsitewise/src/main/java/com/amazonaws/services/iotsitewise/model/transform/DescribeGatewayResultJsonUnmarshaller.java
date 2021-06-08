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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeGatewayResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayResultJsonUnmarshaller implements Unmarshaller<DescribeGatewayResult, JsonUnmarshallerContext> {

    public DescribeGatewayResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeGatewayResult describeGatewayResult = new DescribeGatewayResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeGatewayResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("gatewayId", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayName", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setGatewayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayArn", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayPlatform", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setGatewayPlatform(GatewayPlatformJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("gatewayCapabilitySummaries", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setGatewayCapabilitySummaries(new ListUnmarshaller<GatewayCapabilitySummary>(GatewayCapabilitySummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateDate", targetDepth)) {
                    context.nextToken();
                    describeGatewayResult.setLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeGatewayResult;
    }

    private static DescribeGatewayResultJsonUnmarshaller instance;

    public static DescribeGatewayResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGatewayResultJsonUnmarshaller();
        return instance;
    }
}
