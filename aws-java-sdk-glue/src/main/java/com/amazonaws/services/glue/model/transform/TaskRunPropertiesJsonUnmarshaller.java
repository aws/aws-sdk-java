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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TaskRunProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskRunPropertiesJsonUnmarshaller implements Unmarshaller<TaskRunProperties, JsonUnmarshallerContext> {

    public TaskRunProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        TaskRunProperties taskRunProperties = new TaskRunProperties();

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
                if (context.testExpression("TaskType", targetDepth)) {
                    context.nextToken();
                    taskRunProperties.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportLabelsTaskRunProperties", targetDepth)) {
                    context.nextToken();
                    taskRunProperties.setImportLabelsTaskRunProperties(ImportLabelsTaskRunPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExportLabelsTaskRunProperties", targetDepth)) {
                    context.nextToken();
                    taskRunProperties.setExportLabelsTaskRunProperties(ExportLabelsTaskRunPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelingSetGenerationTaskRunProperties", targetDepth)) {
                    context.nextToken();
                    taskRunProperties.setLabelingSetGenerationTaskRunProperties(LabelingSetGenerationTaskRunPropertiesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("FindMatchesTaskRunProperties", targetDepth)) {
                    context.nextToken();
                    taskRunProperties.setFindMatchesTaskRunProperties(FindMatchesTaskRunPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return taskRunProperties;
    }

    private static TaskRunPropertiesJsonUnmarshaller instance;

    public static TaskRunPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskRunPropertiesJsonUnmarshaller();
        return instance;
    }
}
