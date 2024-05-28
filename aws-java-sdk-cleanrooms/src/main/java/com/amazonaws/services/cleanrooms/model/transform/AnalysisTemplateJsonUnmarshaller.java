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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnalysisTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalysisTemplateJsonUnmarshaller implements Unmarshaller<AnalysisTemplate, JsonUnmarshallerContext> {

    public AnalysisTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnalysisTemplate analysisTemplate = new AnalysisTemplate();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("membershipId", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setMembershipId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("membershipArn", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setMembershipArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("schema", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setSchema(AnalysisSchemaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("format", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setSource(AnalysisSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("analysisParameters", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setAnalysisParameters(new ListUnmarshaller<AnalysisParameter>(AnalysisParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("validations", targetDepth)) {
                    context.nextToken();
                    analysisTemplate.setValidations(new ListUnmarshaller<AnalysisTemplateValidationStatusDetail>(
                            AnalysisTemplateValidationStatusDetailJsonUnmarshaller.getInstance())

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

        return analysisTemplate;
    }

    private static AnalysisTemplateJsonUnmarshaller instance;

    public static AnalysisTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalysisTemplateJsonUnmarshaller();
        return instance;
    }
}
