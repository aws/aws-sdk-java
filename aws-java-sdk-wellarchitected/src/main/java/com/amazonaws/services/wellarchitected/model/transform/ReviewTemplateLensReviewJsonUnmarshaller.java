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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReviewTemplateLensReview JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewTemplateLensReviewJsonUnmarshaller implements Unmarshaller<ReviewTemplateLensReview, JsonUnmarshallerContext> {

    public ReviewTemplateLensReview unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReviewTemplateLensReview reviewTemplateLensReview = new ReviewTemplateLensReview();

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
                if (context.testExpression("LensAlias", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setLensAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensArn", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setLensArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensVersion", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setLensVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensName", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setLensName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensStatus", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setLensStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarReviewSummaries", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setPillarReviewSummaries(new ListUnmarshaller<ReviewTemplatePillarReviewSummary>(
                            ReviewTemplatePillarReviewSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Notes", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionCounts", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setQuestionCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    reviewTemplateLensReview.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reviewTemplateLensReview;
    }

    private static ReviewTemplateLensReviewJsonUnmarshaller instance;

    public static ReviewTemplateLensReviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReviewTemplateLensReviewJsonUnmarshaller();
        return instance;
    }
}
