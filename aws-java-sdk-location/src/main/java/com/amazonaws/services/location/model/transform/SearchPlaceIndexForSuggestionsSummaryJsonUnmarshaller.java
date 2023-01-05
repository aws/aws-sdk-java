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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchPlaceIndexForSuggestionsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller implements Unmarshaller<SearchPlaceIndexForSuggestionsSummary, JsonUnmarshallerContext> {

    public SearchPlaceIndexForSuggestionsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchPlaceIndexForSuggestionsSummary searchPlaceIndexForSuggestionsSummary = new SearchPlaceIndexForSuggestionsSummary();

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
                if (context.testExpression("BiasPosition", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setBiasPosition(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterBBox", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setFilterBBox(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FilterCountries", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setFilterCountries(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Language", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxResults", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setMaxResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    context.nextToken();
                    searchPlaceIndexForSuggestionsSummary.setText(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return searchPlaceIndexForSuggestionsSummary;
    }

    private static SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller instance;

    public static SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForSuggestionsSummaryJsonUnmarshaller();
        return instance;
    }
}
