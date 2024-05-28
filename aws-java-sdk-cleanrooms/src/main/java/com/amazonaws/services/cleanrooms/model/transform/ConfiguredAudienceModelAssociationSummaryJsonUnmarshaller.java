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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfiguredAudienceModelAssociationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredAudienceModelAssociationSummaryJsonUnmarshaller implements
        Unmarshaller<ConfiguredAudienceModelAssociationSummary, JsonUnmarshallerContext> {

    public ConfiguredAudienceModelAssociationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfiguredAudienceModelAssociationSummary configuredAudienceModelAssociationSummary = new ConfiguredAudienceModelAssociationSummary();

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
                if (context.testExpression("membershipId", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setMembershipId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("membershipArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setMembershipArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredAudienceModelArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setConfiguredAudienceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociationSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configuredAudienceModelAssociationSummary;
    }

    private static ConfiguredAudienceModelAssociationSummaryJsonUnmarshaller instance;

    public static ConfiguredAudienceModelAssociationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfiguredAudienceModelAssociationSummaryJsonUnmarshaller();
        return instance;
    }
}
