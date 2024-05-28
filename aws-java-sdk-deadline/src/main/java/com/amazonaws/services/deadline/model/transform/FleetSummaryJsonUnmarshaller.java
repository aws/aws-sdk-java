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
package com.amazonaws.services.deadline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.deadline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FleetSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetSummaryJsonUnmarshaller implements Unmarshaller<FleetSummary, JsonUnmarshallerContext> {

    public FleetSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        FleetSummary fleetSummary = new FleetSummary();

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
                if (context.testExpression("autoScalingStatus", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setAutoScalingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setConfiguration(FleetConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("farmId", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setFarmId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fleetId", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxWorkerCount", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setMaxWorkerCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minWorkerCount", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setMinWorkerCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetWorkerCount", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setTargetWorkerCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workerCount", targetDepth)) {
                    context.nextToken();
                    fleetSummary.setWorkerCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return fleetSummary;
    }

    private static FleetSummaryJsonUnmarshaller instance;

    public static FleetSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetSummaryJsonUnmarshaller();
        return instance;
    }
}
