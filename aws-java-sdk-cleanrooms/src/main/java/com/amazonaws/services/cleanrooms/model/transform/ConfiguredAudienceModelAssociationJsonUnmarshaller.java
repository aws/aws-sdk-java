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
 * ConfiguredAudienceModelAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfiguredAudienceModelAssociationJsonUnmarshaller implements Unmarshaller<ConfiguredAudienceModelAssociation, JsonUnmarshallerContext> {

    public ConfiguredAudienceModelAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfiguredAudienceModelAssociation configuredAudienceModelAssociation = new ConfiguredAudienceModelAssociation();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredAudienceModelArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setConfiguredAudienceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("membershipId", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setMembershipId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("membershipArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setMembershipArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manageResourcePolicies", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setManageResourcePolicies(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    configuredAudienceModelAssociation.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configuredAudienceModelAssociation;
    }

    private static ConfiguredAudienceModelAssociationJsonUnmarshaller instance;

    public static ConfiguredAudienceModelAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfiguredAudienceModelAssociationJsonUnmarshaller();
        return instance;
    }
}
