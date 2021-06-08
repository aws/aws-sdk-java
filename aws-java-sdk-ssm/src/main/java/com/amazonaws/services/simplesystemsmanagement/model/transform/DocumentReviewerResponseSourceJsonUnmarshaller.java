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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DocumentReviewerResponseSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentReviewerResponseSourceJsonUnmarshaller implements Unmarshaller<DocumentReviewerResponseSource, JsonUnmarshallerContext> {

    public DocumentReviewerResponseSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocumentReviewerResponseSource documentReviewerResponseSource = new DocumentReviewerResponseSource();

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
                if (context.testExpression("CreateTime", targetDepth)) {
                    context.nextToken();
                    documentReviewerResponseSource.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTime", targetDepth)) {
                    context.nextToken();
                    documentReviewerResponseSource.setUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReviewStatus", targetDepth)) {
                    context.nextToken();
                    documentReviewerResponseSource.setReviewStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    context.nextToken();
                    documentReviewerResponseSource.setComment(new ListUnmarshaller<DocumentReviewCommentSource>(DocumentReviewCommentSourceJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Reviewer", targetDepth)) {
                    context.nextToken();
                    documentReviewerResponseSource.setReviewer(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return documentReviewerResponseSource;
    }

    private static DocumentReviewerResponseSourceJsonUnmarshaller instance;

    public static DocumentReviewerResponseSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentReviewerResponseSourceJsonUnmarshaller();
        return instance;
    }
}
