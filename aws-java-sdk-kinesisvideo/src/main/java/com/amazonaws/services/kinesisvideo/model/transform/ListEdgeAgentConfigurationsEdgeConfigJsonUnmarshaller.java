/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ListEdgeAgentConfigurationsEdgeConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgeAgentConfigurationsEdgeConfigJsonUnmarshaller implements Unmarshaller<ListEdgeAgentConfigurationsEdgeConfig, JsonUnmarshallerContext> {

    public ListEdgeAgentConfigurationsEdgeConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListEdgeAgentConfigurationsEdgeConfig listEdgeAgentConfigurationsEdgeConfig = new ListEdgeAgentConfigurationsEdgeConfig();

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
                if (context.testExpression("StreamName", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamARN", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setStreamARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SyncStatus", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setSyncStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedStatusDetails", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setFailedStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeConfig", targetDepth)) {
                    context.nextToken();
                    listEdgeAgentConfigurationsEdgeConfig.setEdgeConfig(EdgeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listEdgeAgentConfigurationsEdgeConfig;
    }

    private static ListEdgeAgentConfigurationsEdgeConfigJsonUnmarshaller instance;

    public static ListEdgeAgentConfigurationsEdgeConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListEdgeAgentConfigurationsEdgeConfigJsonUnmarshaller();
        return instance;
    }
}
