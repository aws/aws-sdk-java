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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConfigurationPolicyAssociationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationPolicyAssociationSummaryJsonUnmarshaller implements Unmarshaller<ConfigurationPolicyAssociationSummary, JsonUnmarshallerContext> {

    public ConfigurationPolicyAssociationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConfigurationPolicyAssociationSummary configurationPolicyAssociationSummary = new ConfigurationPolicyAssociationSummary();

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
                if (context.testExpression("ConfigurationPolicyId", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setConfigurationPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetId", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetType", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationType", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setAssociationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("AssociationStatus", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setAssociationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationStatusMessage", targetDepth)) {
                    context.nextToken();
                    configurationPolicyAssociationSummary.setAssociationStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return configurationPolicyAssociationSummary;
    }

    private static ConfigurationPolicyAssociationSummaryJsonUnmarshaller instance;

    public static ConfigurationPolicyAssociationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationPolicyAssociationSummaryJsonUnmarshaller();
        return instance;
    }
}
