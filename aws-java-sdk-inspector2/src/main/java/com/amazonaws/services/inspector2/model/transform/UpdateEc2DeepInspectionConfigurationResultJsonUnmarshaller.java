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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateEc2DeepInspectionConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEc2DeepInspectionConfigurationResultJsonUnmarshaller implements
        Unmarshaller<UpdateEc2DeepInspectionConfigurationResult, JsonUnmarshallerContext> {

    public UpdateEc2DeepInspectionConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateEc2DeepInspectionConfigurationResult updateEc2DeepInspectionConfigurationResult = new UpdateEc2DeepInspectionConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateEc2DeepInspectionConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("errorMessage", targetDepth)) {
                    context.nextToken();
                    updateEc2DeepInspectionConfigurationResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("orgPackagePaths", targetDepth)) {
                    context.nextToken();
                    updateEc2DeepInspectionConfigurationResult.setOrgPackagePaths(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("packagePaths", targetDepth)) {
                    context.nextToken();
                    updateEc2DeepInspectionConfigurationResult.setPackagePaths(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateEc2DeepInspectionConfigurationResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateEc2DeepInspectionConfigurationResult;
    }

    private static UpdateEc2DeepInspectionConfigurationResultJsonUnmarshaller instance;

    public static UpdateEc2DeepInspectionConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateEc2DeepInspectionConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
