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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchRasterDataCollectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchRasterDataCollectionResultJsonUnmarshaller implements Unmarshaller<SearchRasterDataCollectionResult, JsonUnmarshallerContext> {

    public SearchRasterDataCollectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchRasterDataCollectionResult searchRasterDataCollectionResult = new SearchRasterDataCollectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return searchRasterDataCollectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApproximateResultCount", targetDepth)) {
                    context.nextToken();
                    searchRasterDataCollectionResult.setApproximateResultCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Items", targetDepth)) {
                    context.nextToken();
                    searchRasterDataCollectionResult.setItems(new ListUnmarshaller<ItemSource>(ItemSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    searchRasterDataCollectionResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchRasterDataCollectionResult;
    }

    private static SearchRasterDataCollectionResultJsonUnmarshaller instance;

    public static SearchRasterDataCollectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchRasterDataCollectionResultJsonUnmarshaller();
        return instance;
    }
}
