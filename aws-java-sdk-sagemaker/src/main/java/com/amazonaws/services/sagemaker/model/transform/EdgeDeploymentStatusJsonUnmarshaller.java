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
 * EdgeDeploymentStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EdgeDeploymentStatusJsonUnmarshaller implements Unmarshaller<EdgeDeploymentStatus, JsonUnmarshallerContext> {

    public EdgeDeploymentStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        EdgeDeploymentStatus edgeDeploymentStatus = new EdgeDeploymentStatus();

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
                if (context.testExpression("StageStatus", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentStatus.setStageStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentSuccessInStage", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentStatus.setEdgeDeploymentSuccessInStage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentPendingInStage", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentStatus.setEdgeDeploymentPendingInStage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentFailedInStage", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentStatus.setEdgeDeploymentFailedInStage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentStatusMessage", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentStatus.setEdgeDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeDeploymentStageStartTime", targetDepth)) {
                    context.nextToken();
                    edgeDeploymentStatus.setEdgeDeploymentStageStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return edgeDeploymentStatus;
    }

    private static EdgeDeploymentStatusJsonUnmarshaller instance;

    public static EdgeDeploymentStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EdgeDeploymentStatusJsonUnmarshaller();
        return instance;
    }
}
