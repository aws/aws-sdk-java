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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnonymousUserEmbeddingExperienceConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnonymousUserEmbeddingExperienceConfigurationJsonUnmarshaller implements
        Unmarshaller<AnonymousUserEmbeddingExperienceConfiguration, JsonUnmarshallerContext> {

    public AnonymousUserEmbeddingExperienceConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnonymousUserEmbeddingExperienceConfiguration anonymousUserEmbeddingExperienceConfiguration = new AnonymousUserEmbeddingExperienceConfiguration();

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
                    anonymousUserEmbeddingExperienceConfiguration.setDashboard(AnonymousUserDashboardEmbeddingConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("DashboardVisual", targetDepth)) {
                    context.nextToken();
                    anonymousUserEmbeddingExperienceConfiguration.setDashboardVisual(AnonymousUserDashboardVisualEmbeddingConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("QSearchBar", targetDepth)) {
                    context.nextToken();
                    anonymousUserEmbeddingExperienceConfiguration.setQSearchBar(AnonymousUserQSearchBarEmbeddingConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("GenerativeQnA", targetDepth)) {
                    context.nextToken();
                    anonymousUserEmbeddingExperienceConfiguration.setGenerativeQnA(AnonymousUserGenerativeQnAEmbeddingConfigurationJsonUnmarshaller
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

        return anonymousUserEmbeddingExperienceConfiguration;
    }

    private static AnonymousUserEmbeddingExperienceConfigurationJsonUnmarshaller instance;

    public static AnonymousUserEmbeddingExperienceConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnonymousUserEmbeddingExperienceConfigurationJsonUnmarshaller();
        return instance;
    }
}
