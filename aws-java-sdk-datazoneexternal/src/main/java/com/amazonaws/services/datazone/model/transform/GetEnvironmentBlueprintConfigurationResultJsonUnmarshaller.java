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
 * GetEnvironmentBlueprintConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentBlueprintConfigurationResultJsonUnmarshaller implements
        Unmarshaller<GetEnvironmentBlueprintConfigurationResult, JsonUnmarshallerContext> {

    public GetEnvironmentBlueprintConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEnvironmentBlueprintConfigurationResult getEnvironmentBlueprintConfigurationResult = new GetEnvironmentBlueprintConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEnvironmentBlueprintConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enabledRegions", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setEnabledRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("environmentBlueprintId", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setEnvironmentBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manageAccessRoleArn", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setManageAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisioningRoleArn", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setProvisioningRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalParameters", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setRegionalParameters(new MapUnmarshaller<String, java.util.Map<String, String>>(context
                            .getUnmarshaller(String.class), new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    getEnvironmentBlueprintConfigurationResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getEnvironmentBlueprintConfigurationResult;
    }

    private static GetEnvironmentBlueprintConfigurationResultJsonUnmarshaller instance;

    public static GetEnvironmentBlueprintConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEnvironmentBlueprintConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
