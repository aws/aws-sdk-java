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
 * WorkerSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerSummaryJsonUnmarshaller implements Unmarshaller<WorkerSummary, JsonUnmarshallerContext> {

    public WorkerSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkerSummary workerSummary = new WorkerSummary();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    workerSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    workerSummary.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("farmId", targetDepth)) {
                    context.nextToken();
                    workerSummary.setFarmId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fleetId", targetDepth)) {
                    context.nextToken();
                    workerSummary.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostProperties", targetDepth)) {
                    context.nextToken();
                    workerSummary.setHostProperties(HostPropertiesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("log", targetDepth)) {
                    context.nextToken();
                    workerSummary.setLog(LogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    workerSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    workerSummary.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    workerSummary.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workerId", targetDepth)) {
                    context.nextToken();
                    workerSummary.setWorkerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return workerSummary;
    }

    private static WorkerSummaryJsonUnmarshaller instance;

    public static WorkerSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkerSummaryJsonUnmarshaller();
        return instance;
    }
}
