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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeMultiplexResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMultiplexResultJsonUnmarshaller implements Unmarshaller<DescribeMultiplexResult, JsonUnmarshallerContext> {

    public DescribeMultiplexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMultiplexResult describeMultiplexResult = new DescribeMultiplexResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeMultiplexResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZones", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("destinations", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setDestinations(new ListUnmarshaller<MultiplexOutputDestination>(MultiplexOutputDestinationJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("multiplexSettings", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setMultiplexSettings(MultiplexSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelinesRunningCount", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setPipelinesRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("programCount", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setProgramCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    describeMultiplexResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeMultiplexResult;
    }

    private static DescribeMultiplexResultJsonUnmarshaller instance;

    public static DescribeMultiplexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMultiplexResultJsonUnmarshaller();
        return instance;
    }
}
