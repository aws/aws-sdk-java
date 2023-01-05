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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeTemplateDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTemplateDefinitionResultJsonUnmarshaller implements Unmarshaller<DescribeTemplateDefinitionResult, JsonUnmarshallerContext> {

    public DescribeTemplateDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTemplateDefinitionResult describeTemplateDefinitionResult = new DescribeTemplateDefinitionResult();

        describeTemplateDefinitionResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTemplateDefinitionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateId", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Errors", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setErrors(new ListUnmarshaller<TemplateError>(TemplateErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceStatus", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setResourceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThemeArn", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setThemeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Definition", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setDefinition(TemplateVersionDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    describeTemplateDefinitionResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeTemplateDefinitionResult;
    }

    private static DescribeTemplateDefinitionResultJsonUnmarshaller instance;

    public static DescribeTemplateDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTemplateDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
