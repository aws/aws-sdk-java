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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchUpdateRecommendationStatusSuccessfulEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateRecommendationStatusSuccessfulEntryJsonUnmarshaller implements
        Unmarshaller<BatchUpdateRecommendationStatusSuccessfulEntry, JsonUnmarshallerContext> {

    public BatchUpdateRecommendationStatusSuccessfulEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchUpdateRecommendationStatusSuccessfulEntry batchUpdateRecommendationStatusSuccessfulEntry = new BatchUpdateRecommendationStatusSuccessfulEntry();

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
                if (context.testExpression("entryId", targetDepth)) {
                    context.nextToken();
                    batchUpdateRecommendationStatusSuccessfulEntry.setEntryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("excludeReason", targetDepth)) {
                    context.nextToken();
                    batchUpdateRecommendationStatusSuccessfulEntry.setExcludeReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("excluded", targetDepth)) {
                    context.nextToken();
                    batchUpdateRecommendationStatusSuccessfulEntry.setExcluded(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("item", targetDepth)) {
                    context.nextToken();
                    batchUpdateRecommendationStatusSuccessfulEntry.setItem(UpdateRecommendationStatusItemJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("referenceId", targetDepth)) {
                    context.nextToken();
                    batchUpdateRecommendationStatusSuccessfulEntry.setReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchUpdateRecommendationStatusSuccessfulEntry;
    }

    private static BatchUpdateRecommendationStatusSuccessfulEntryJsonUnmarshaller instance;

    public static BatchUpdateRecommendationStatusSuccessfulEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchUpdateRecommendationStatusSuccessfulEntryJsonUnmarshaller();
        return instance;
    }
}
