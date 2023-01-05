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
package com.amazonaws.services.kinesisvideo.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartEdgeConfigurationUpdateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEdgeConfigurationUpdateResultJsonUnmarshaller implements Unmarshaller<StartEdgeConfigurationUpdateResult, JsonUnmarshallerContext> {

    public StartEdgeConfigurationUpdateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartEdgeConfigurationUpdateResult startEdgeConfigurationUpdateResult = new StartEdgeConfigurationUpdateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startEdgeConfigurationUpdateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("StreamName", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamARN", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setStreamARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SyncStatus", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setSyncStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedStatusDetails", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setFailedStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeConfig", targetDepth)) {
                    context.nextToken();
                    startEdgeConfigurationUpdateResult.setEdgeConfig(EdgeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return startEdgeConfigurationUpdateResult;
    }

    private static StartEdgeConfigurationUpdateResultJsonUnmarshaller instance;

    public static StartEdgeConfigurationUpdateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartEdgeConfigurationUpdateResultJsonUnmarshaller();
        return instance;
    }
}
