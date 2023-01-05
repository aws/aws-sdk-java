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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EdgeDeploymentPlanSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeDeploymentPlanSummaryJsonUnmarshaller implements Unmarshaller<EdgeDeploymentPlanSummary, JsonUnmarshallerContext> {

    public EdgeDeploymentPlanSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EdgeDeploymentPlanSummary edgeDeploymentPlanSummary = new EdgeDeploymentPlanSummary();

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
                if (context.testExpression("EdgeDeploymentPlanArn", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setEdgeDeploymentPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentPlanName", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setEdgeDeploymentPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceFleetName", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setDeviceFleetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentSuccess", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setEdgeDeploymentSuccess(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentPending", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setEdgeDeploymentPending(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentFailed", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setEdgeDeploymentFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentPlanSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return edgeDeploymentPlanSummary;
    }

    private static EdgeDeploymentPlanSummaryJsonUnmarshaller instance;

    public static EdgeDeploymentPlanSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EdgeDeploymentPlanSummaryJsonUnmarshaller();
        return instance;
    }
}
