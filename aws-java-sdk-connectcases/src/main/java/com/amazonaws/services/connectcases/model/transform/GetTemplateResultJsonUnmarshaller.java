/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectcases.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemplateResultJsonUnmarshaller implements Unmarshaller<GetTemplateResult, JsonUnmarshallerContext> {

    public GetTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetTemplateResult getTemplateResult = new GetTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("layoutConfiguration", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setLayoutConfiguration(LayoutConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requiredFields", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setRequiredFields(new ListUnmarshaller<RequiredField>(RequiredFieldJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("templateArn", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateId", targetDepth)) {
                    context.nextToken();
                    getTemplateResult.setTemplateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getTemplateResult;
    }

    private static GetTemplateResultJsonUnmarshaller instance;

    public static GetTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetTemplateResultJsonUnmarshaller();
        return instance;
    }
}
