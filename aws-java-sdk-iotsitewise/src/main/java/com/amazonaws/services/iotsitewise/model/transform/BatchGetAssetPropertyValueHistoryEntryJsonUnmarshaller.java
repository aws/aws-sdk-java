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
 * BatchGetAssetPropertyValueHistoryEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetAssetPropertyValueHistoryEntryJsonUnmarshaller implements Unmarshaller<BatchGetAssetPropertyValueHistoryEntry, JsonUnmarshallerContext> {

    public BatchGetAssetPropertyValueHistoryEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchGetAssetPropertyValueHistoryEntry batchGetAssetPropertyValueHistoryEntry = new BatchGetAssetPropertyValueHistoryEntry();

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
                    batchGetAssetPropertyValueHistoryEntry.setEntryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assetId", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyId", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setPropertyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyAlias", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setPropertyAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startDate", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endDate", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setEndDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("qualities", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setQualities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("timeOrdering", targetDepth)) {
                    context.nextToken();
                    batchGetAssetPropertyValueHistoryEntry.setTimeOrdering(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return batchGetAssetPropertyValueHistoryEntry;
    }

    private static BatchGetAssetPropertyValueHistoryEntryJsonUnmarshaller instance;

    public static BatchGetAssetPropertyValueHistoryEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchGetAssetPropertyValueHistoryEntryJsonUnmarshaller();
        return instance;
    }
}
