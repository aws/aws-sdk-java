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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeManagedJobTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedJobTemplateResultJsonUnmarshaller implements Unmarshaller<DescribeManagedJobTemplateResult, JsonUnmarshallerContext> {

    public DescribeManagedJobTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeManagedJobTemplateResult describeManagedJobTemplateResult = new DescribeManagedJobTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeManagedJobTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("templateName", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateArn", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateVersion", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setTemplateVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environments", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setEnvironments(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("documentParameters", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setDocumentParameters(new ListUnmarshaller<DocumentParameter>(DocumentParameterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("document", targetDepth)) {
                    context.nextToken();
                    describeManagedJobTemplateResult.setDocument(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeManagedJobTemplateResult;
    }

    private static DescribeManagedJobTemplateResultJsonUnmarshaller instance;

    public static DescribeManagedJobTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeManagedJobTemplateResultJsonUnmarshaller();
        return instance;
    }
}
