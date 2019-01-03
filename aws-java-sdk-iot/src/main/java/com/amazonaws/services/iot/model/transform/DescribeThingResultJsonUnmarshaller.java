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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeThingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingResultJsonUnmarshaller implements Unmarshaller<DescribeThingResult, JsonUnmarshallerContext> {

    public DescribeThingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeThingResult describeThingResult = new DescribeThingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeThingResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("defaultClientId", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setDefaultClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingName", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingId", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setThingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingArn", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setThingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingTypeName", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setThingTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("billingGroupName", targetDepth)) {
                    context.nextToken();
                    describeThingResult.setBillingGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeThingResult;
    }

    private static DescribeThingResultJsonUnmarshaller instance;

    public static DescribeThingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeThingResultJsonUnmarshaller();
        return instance;
    }
}
