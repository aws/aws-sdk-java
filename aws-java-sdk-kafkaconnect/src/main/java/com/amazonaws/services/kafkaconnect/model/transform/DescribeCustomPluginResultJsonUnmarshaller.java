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
package com.amazonaws.services.kafkaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafkaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeCustomPluginResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomPluginResultJsonUnmarshaller implements Unmarshaller<DescribeCustomPluginResult, JsonUnmarshallerContext> {

    public DescribeCustomPluginResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCustomPluginResult describeCustomPluginResult = new DescribeCustomPluginResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCustomPluginResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customPluginArn", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setCustomPluginArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customPluginState", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setCustomPluginState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestRevision", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setLatestRevision(CustomPluginRevisionSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateDescription", targetDepth)) {
                    context.nextToken();
                    describeCustomPluginResult.setStateDescription(StateDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeCustomPluginResult;
    }

    private static DescribeCustomPluginResultJsonUnmarshaller instance;

    public static DescribeCustomPluginResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCustomPluginResultJsonUnmarshaller();
        return instance;
    }
}
