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
package com.amazonaws.services.cleanroomsml.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanroomsml.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfiguredAudienceModelSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredAudienceModelSummaryJsonUnmarshaller implements Unmarshaller<ConfiguredAudienceModelSummary, JsonUnmarshallerContext> {

    public ConfiguredAudienceModelSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfiguredAudienceModelSummary configuredAudienceModelSummary = new ConfiguredAudienceModelSummary();

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
                if (context.testExpression("audienceModelArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setAudienceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredAudienceModelArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setConfiguredAudienceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputConfig", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setOutputConfig(ConfiguredAudienceModelOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configuredAudienceModelSummary;
    }

    private static ConfiguredAudienceModelSummaryJsonUnmarshaller instance;

    public static ConfiguredAudienceModelSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfiguredAudienceModelSummaryJsonUnmarshaller();
        return instance;
    }
}
