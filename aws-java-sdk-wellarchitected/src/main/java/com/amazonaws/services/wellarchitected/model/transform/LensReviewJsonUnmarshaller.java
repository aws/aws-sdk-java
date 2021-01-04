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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LensReview JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LensReviewJsonUnmarshaller implements Unmarshaller<LensReview, JsonUnmarshallerContext> {

    public LensReview unmarshall(JsonUnmarshallerContext context) throws Exception {
        LensReview lensReview = new LensReview();

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
                    lensReview.setLensAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensVersion", targetDepth)) {
                    context.nextToken();
                    lensReview.setLensVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensName", targetDepth)) {
                    context.nextToken();
                    lensReview.setLensName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensStatus", targetDepth)) {
                    context.nextToken();
                    lensReview.setLensStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarReviewSummaries", targetDepth)) {
                    context.nextToken();
                    lensReview.setPillarReviewSummaries(new ListUnmarshaller<PillarReviewSummary>(PillarReviewSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    context.nextToken();
                    lensReview.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Notes", targetDepth)) {
                    context.nextToken();
                    lensReview.setNotes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RiskCounts", targetDepth)) {
                    context.nextToken();
                    lensReview
                            .setRiskCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context.getUnmarshaller(Integer.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    lensReview.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return lensReview;
    }

    private static LensReviewJsonUnmarshaller instance;

    public static LensReviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LensReviewJsonUnmarshaller();
        return instance;
    }
}
