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
package com.amazonaws.services.datapipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TaskObject JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskObjectJsonUnmarshaller implements Unmarshaller<TaskObject, JsonUnmarshallerContext> {

    public TaskObject unmarshall(JsonUnmarshallerContext context) throws Exception {
        TaskObject taskObject = new TaskObject();

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
                if (context.testExpression("taskId", targetDepth)) {
                    context.nextToken();
                    taskObject.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelineId", targetDepth)) {
                    context.nextToken();
                    taskObject.setPipelineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attemptId", targetDepth)) {
                    context.nextToken();
                    taskObject.setAttemptId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("objects", targetDepth)) {
                    context.nextToken();
                    taskObject.setObjects(new MapUnmarshaller<String, PipelineObject>(context.getUnmarshaller(String.class), PipelineObjectJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return taskObject;
    }

    private static TaskObjectJsonUnmarshaller instance;

    public static TaskObjectJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskObjectJsonUnmarshaller();
        return instance;
    }
}
