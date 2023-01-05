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
package com.amazonaws.services.gamesparks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamesparks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StageDeploymentDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageDeploymentDetailsJsonUnmarshaller implements Unmarshaller<StageDeploymentDetails, JsonUnmarshallerContext> {

    public StageDeploymentDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        StageDeploymentDetails stageDeploymentDetails = new StageDeploymentDetails();

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
                if (context.testExpression("Created", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setCreated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DeploymentAction", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setDeploymentAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentId", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentResult", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setDeploymentResult(DeploymentResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeploymentState", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setDeploymentState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    context.nextToken();
                    stageDeploymentDetails.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return stageDeploymentDetails;
    }

    private static StageDeploymentDetailsJsonUnmarshaller instance;

    public static StageDeploymentDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StageDeploymentDetailsJsonUnmarshaller();
        return instance;
    }
}
