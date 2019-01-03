/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentOverview JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentOverviewJsonUnmarshaller implements Unmarshaller<DeploymentOverview, JsonUnmarshallerContext> {

    public DeploymentOverview unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentOverview deploymentOverview = new DeploymentOverview();

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
                if (context.testExpression("Pending", targetDepth)) {
                    context.nextToken();
                    deploymentOverview.setPending(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("InProgress", targetDepth)) {
                    context.nextToken();
                    deploymentOverview.setInProgress(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Succeeded", targetDepth)) {
                    context.nextToken();
                    deploymentOverview.setSucceeded(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Failed", targetDepth)) {
                    context.nextToken();
                    deploymentOverview.setFailed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Skipped", targetDepth)) {
                    context.nextToken();
                    deploymentOverview.setSkipped(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Ready", targetDepth)) {
                    context.nextToken();
                    deploymentOverview.setReady(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deploymentOverview;
    }

    private static DeploymentOverviewJsonUnmarshaller instance;

    public static DeploymentOverviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentOverviewJsonUnmarshaller();
        return instance;
    }
}
