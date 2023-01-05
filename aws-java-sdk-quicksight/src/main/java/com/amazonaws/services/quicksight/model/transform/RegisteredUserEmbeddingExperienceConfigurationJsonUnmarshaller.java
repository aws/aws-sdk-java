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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RegisteredUserEmbeddingExperienceConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisteredUserEmbeddingExperienceConfigurationJsonUnmarshaller implements
        Unmarshaller<RegisteredUserEmbeddingExperienceConfiguration, JsonUnmarshallerContext> {

    public RegisteredUserEmbeddingExperienceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegisteredUserEmbeddingExperienceConfiguration registeredUserEmbeddingExperienceConfiguration = new RegisteredUserEmbeddingExperienceConfiguration();

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
                if (context.testExpression("Dashboard", targetDepth)) {
                    context.nextToken();
                    registeredUserEmbeddingExperienceConfiguration.setDashboard(RegisteredUserDashboardEmbeddingConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("QuickSightConsole", targetDepth)) {
                    context.nextToken();
                    registeredUserEmbeddingExperienceConfiguration.setQuickSightConsole(RegisteredUserQuickSightConsoleEmbeddingConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("QSearchBar", targetDepth)) {
                    context.nextToken();
                    registeredUserEmbeddingExperienceConfiguration.setQSearchBar(RegisteredUserQSearchBarEmbeddingConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("DashboardVisual", targetDepth)) {
                    context.nextToken();
                    registeredUserEmbeddingExperienceConfiguration.setDashboardVisual(RegisteredUserDashboardVisualEmbeddingConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return registeredUserEmbeddingExperienceConfiguration;
    }

    private static RegisteredUserEmbeddingExperienceConfigurationJsonUnmarshaller instance;

    public static RegisteredUserEmbeddingExperienceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisteredUserEmbeddingExperienceConfigurationJsonUnmarshaller();
        return instance;
    }
}
