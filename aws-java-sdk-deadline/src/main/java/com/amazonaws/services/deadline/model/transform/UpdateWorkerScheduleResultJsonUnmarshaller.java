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
 * UpdateWorkerScheduleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWorkerScheduleResultJsonUnmarshaller implements Unmarshaller<UpdateWorkerScheduleResult, JsonUnmarshallerContext> {

    public UpdateWorkerScheduleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateWorkerScheduleResult updateWorkerScheduleResult = new UpdateWorkerScheduleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateWorkerScheduleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assignedSessions", targetDepth)) {
                    context.nextToken();
                    updateWorkerScheduleResult.setAssignedSessions(new MapUnmarshaller<String, AssignedSession>(context.getUnmarshaller(String.class),
                            AssignedSessionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("cancelSessionActions", targetDepth)) {
                    context.nextToken();
                    updateWorkerScheduleResult.setCancelSessionActions(new MapUnmarshaller<String, java.util.List<String>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("desiredWorkerStatus", targetDepth)) {
                    context.nextToken();
                    updateWorkerScheduleResult.setDesiredWorkerStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateIntervalSeconds", targetDepth)) {
                    context.nextToken();
                    updateWorkerScheduleResult.setUpdateIntervalSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateWorkerScheduleResult;
    }

    private static UpdateWorkerScheduleResultJsonUnmarshaller instance;

    public static UpdateWorkerScheduleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateWorkerScheduleResultJsonUnmarshaller();
        return instance;
    }
}
