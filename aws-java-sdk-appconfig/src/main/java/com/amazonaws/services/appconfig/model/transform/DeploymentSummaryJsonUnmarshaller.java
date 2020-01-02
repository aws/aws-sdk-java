/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentSummaryJsonUnmarshaller implements Unmarshaller<DeploymentSummary, JsonUnmarshallerContext> {

    public DeploymentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentSummary deploymentSummary = new DeploymentSummary();

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
                if (context.testExpression("DeploymentNumber", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setDeploymentNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationName", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationVersion", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setConfigurationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentDurationInMinutes", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setDeploymentDurationInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("GrowthType", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setGrowthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GrowthFactor", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setGrowthFactor(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("FinalBakeTimeInMinutes", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setFinalBakeTimeInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentageComplete", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setPercentageComplete(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("CompletedAt", targetDepth)) {
                    context.nextToken();
                    deploymentSummary.setCompletedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deploymentSummary;
    }

    private static DeploymentSummaryJsonUnmarshaller instance;

    public static DeploymentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentSummaryJsonUnmarshaller();
        return instance;
    }
}
