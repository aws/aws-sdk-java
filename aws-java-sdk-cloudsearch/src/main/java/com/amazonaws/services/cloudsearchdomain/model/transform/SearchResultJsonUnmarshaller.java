/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchdomain.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudsearchdomain.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchResultJsonUnmarshaller implements Unmarshaller<SearchResult, JsonUnmarshallerContext> {

    public SearchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchResult searchResult = new SearchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return searchResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    searchResult.setStatus(SearchStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hits", targetDepth)) {
                    context.nextToken();
                    searchResult.setHits(HitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("facets", targetDepth)) {
                    context.nextToken();
                    searchResult.setFacets(new MapUnmarshaller<String, BucketInfo>(context.getUnmarshaller(String.class), BucketInfoJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("stats", targetDepth)) {
                    context.nextToken();
                    searchResult.setStats(new MapUnmarshaller<String, FieldStats>(context.getUnmarshaller(String.class), FieldStatsJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchResult;
    }

    private static SearchResultJsonUnmarshaller instance;

    public static SearchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchResultJsonUnmarshaller();
        return instance;
    }
}
