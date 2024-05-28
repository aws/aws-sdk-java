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
package com.amazonaws.services.datazone.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnvironmentBlueprintConfigurationItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentBlueprintConfigurationItemJsonUnmarshaller implements Unmarshaller<EnvironmentBlueprintConfigurationItem, JsonUnmarshallerContext> {

    public EnvironmentBlueprintConfigurationItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnvironmentBlueprintConfigurationItem environmentBlueprintConfigurationItem = new EnvironmentBlueprintConfigurationItem();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enabledRegions", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setEnabledRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("environmentBlueprintId", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setEnvironmentBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manageAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setManageAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisioningRoleArn", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setProvisioningRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalParameters", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setRegionalParameters(new MapUnmarshaller<String, java.util.Map<String, String>>(context
                            .getUnmarshaller(String.class), new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    environmentBlueprintConfigurationItem.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return environmentBlueprintConfigurationItem;
    }

    private static EnvironmentBlueprintConfigurationItemJsonUnmarshaller instance;

    public static EnvironmentBlueprintConfigurationItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentBlueprintConfigurationItemJsonUnmarshaller();
        return instance;
    }
}
