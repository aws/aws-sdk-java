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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EmailTemplateResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailTemplateResponseJsonUnmarshaller implements Unmarshaller<EmailTemplateResponse, JsonUnmarshallerContext> {

    public EmailTemplateResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        EmailTemplateResponse emailTemplateResponse = new EmailTemplateResponse();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultSubstitutions", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setDefaultSubstitutions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HtmlPart", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setHtmlPart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommenderId", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setRecommenderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Subject", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setSubject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TemplateDescription", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setTemplateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateType", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setTemplateType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TextPart", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setTextPart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    emailTemplateResponse.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return emailTemplateResponse;
    }

    private static EmailTemplateResponseJsonUnmarshaller instance;

    public static EmailTemplateResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EmailTemplateResponseJsonUnmarshaller();
        return instance;
    }
}
