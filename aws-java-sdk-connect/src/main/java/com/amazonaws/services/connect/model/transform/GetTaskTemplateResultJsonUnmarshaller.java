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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTaskTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTaskTemplateResultJsonUnmarshaller implements Unmarshaller<GetTaskTemplateResult, JsonUnmarshallerContext> {

    public GetTaskTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTaskTemplateResult getTaskTemplateResult = new GetTaskTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTaskTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactFlowId", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setContactFlowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Constraints", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setConstraints(TaskTemplateConstraintsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Defaults", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setDefaults(TaskTemplateDefaultsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Fields", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setFields(new ListUnmarshaller<TaskTemplateField>(TaskTemplateFieldJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    getTaskTemplateResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTaskTemplateResult;
    }

    private static GetTaskTemplateResultJsonUnmarshaller instance;

    public static GetTaskTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTaskTemplateResultJsonUnmarshaller();
        return instance;
    }
}
