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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchGetAssetPropertyAggregatesEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyAggregatesEntryJsonUnmarshaller implements Unmarshaller<BatchGetAssetPropertyAggregatesEntry, JsonUnmarshallerContext> {

    public BatchGetAssetPropertyAggregatesEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetAssetPropertyAggregatesEntry batchGetAssetPropertyAggregatesEntry = new BatchGetAssetPropertyAggregatesEntry();

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
                    batchGetAssetPropertyAggregatesEntry.setEntryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyId", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setPropertyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyAlias", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setPropertyAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aggregateTypes", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setAggregateTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resolution", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startDate", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endDate", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setEndDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("qualities", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setQualities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("timeOrdering", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyAggregatesEntry.setTimeOrdering(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchGetAssetPropertyAggregatesEntry;
    }

    private static BatchGetAssetPropertyAggregatesEntryJsonUnmarshaller instance;

    public static BatchGetAssetPropertyAggregatesEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetAssetPropertyAggregatesEntryJsonUnmarshaller();
        return instance;
    }
}
