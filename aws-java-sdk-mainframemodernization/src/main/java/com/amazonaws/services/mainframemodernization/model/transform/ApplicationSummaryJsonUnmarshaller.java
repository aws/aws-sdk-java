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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApplicationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummaryJsonUnmarshaller implements Unmarshaller<ApplicationSummary, JsonUnmarshallerContext> {

    public ApplicationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationSummary applicationSummary = new ApplicationSummary();

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
                if (context.testExpression("applicationArn", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setApplicationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationId", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationVersion", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setApplicationVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deploymentStatus", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineType", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStartTime", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setLastStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versionStatus", targetDepth)) {
                    context.nextToken();
                    applicationSummary.setVersionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return applicationSummary;
    }

    private static ApplicationSummaryJsonUnmarshaller instance;

    public static ApplicationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationSummaryJsonUnmarshaller();
        return instance;
    }
}
