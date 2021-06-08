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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCustomVerificationEmailTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomVerificationEmailTemplateResultJsonUnmarshaller implements
        Unmarshaller<GetCustomVerificationEmailTemplateResult, JsonUnmarshallerContext> {

    public GetCustomVerificationEmailTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCustomVerificationEmailTemplateResult getCustomVerificationEmailTemplateResult = new GetCustomVerificationEmailTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCustomVerificationEmailTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TemplateName", targetDepth)) {
                    context.nextToken();
                    getCustomVerificationEmailTemplateResult.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FromEmailAddress", targetDepth)) {
                    context.nextToken();
                    getCustomVerificationEmailTemplateResult.setFromEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateSubject", targetDepth)) {
                    context.nextToken();
                    getCustomVerificationEmailTemplateResult.setTemplateSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateContent", targetDepth)) {
                    context.nextToken();
                    getCustomVerificationEmailTemplateResult.setTemplateContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SuccessRedirectionURL", targetDepth)) {
                    context.nextToken();
                    getCustomVerificationEmailTemplateResult.setSuccessRedirectionURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureRedirectionURL", targetDepth)) {
                    context.nextToken();
                    getCustomVerificationEmailTemplateResult.setFailureRedirectionURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getCustomVerificationEmailTemplateResult;
    }

    private static GetCustomVerificationEmailTemplateResultJsonUnmarshaller instance;

    public static GetCustomVerificationEmailTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCustomVerificationEmailTemplateResultJsonUnmarshaller();
        return instance;
    }
}
