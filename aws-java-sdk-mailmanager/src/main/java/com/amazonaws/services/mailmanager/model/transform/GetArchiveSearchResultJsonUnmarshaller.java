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
package com.amazonaws.services.mailmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetArchiveSearchResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveSearchResultJsonUnmarshaller implements Unmarshaller<GetArchiveSearchResult, JsonUnmarshallerContext> {

    public GetArchiveSearchResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetArchiveSearchResult getArchiveSearchResult = new GetArchiveSearchResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getArchiveSearchResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ArchiveId", targetDepth)) {
                    context.nextToken();
                    getArchiveSearchResult.setArchiveId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Filters", targetDepth)) {
                    context.nextToken();
                    getArchiveSearchResult.setFilters(ArchiveFiltersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FromTimestamp", targetDepth)) {
                    context.nextToken();
                    getArchiveSearchResult.setFromTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MaxResults", targetDepth)) {
                    context.nextToken();
                    getArchiveSearchResult.setMaxResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getArchiveSearchResult.setStatus(SearchStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ToTimestamp", targetDepth)) {
                    context.nextToken();
                    getArchiveSearchResult.setToTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getArchiveSearchResult;
    }

    private static GetArchiveSearchResultJsonUnmarshaller instance;

    public static GetArchiveSearchResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetArchiveSearchResultJsonUnmarshaller();
        return instance;
    }
}
