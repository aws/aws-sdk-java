/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NotebookExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotebookExecutionJsonUnmarshaller implements Unmarshaller<NotebookExecution, JsonUnmarshallerContext> {

    public NotebookExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        NotebookExecution notebookExecution = new NotebookExecution();

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
                if (context.testExpression("NotebookExecutionId", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setNotebookExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EditorId", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setEditorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionEngine", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setExecutionEngine(ExecutionEngineConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NotebookExecutionName", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setNotebookExecutionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookParams", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setNotebookParams(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputNotebookURI", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setOutputNotebookURI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastStateChangeReason", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setLastStateChangeReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceSecurityGroupId", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setNotebookInstanceSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    notebookExecution.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return notebookExecution;
    }

    private static NotebookExecutionJsonUnmarshaller instance;

    public static NotebookExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NotebookExecutionJsonUnmarshaller();
        return instance;
    }
}
