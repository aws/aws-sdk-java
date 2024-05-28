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
package com.amazonaws.services.qconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListQuickResponsesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListQuickResponsesResultJsonUnmarshaller implements Unmarshaller<ListQuickResponsesResult, JsonUnmarshallerContext> {

    public ListQuickResponsesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListQuickResponsesResult listQuickResponsesResult = new ListQuickResponsesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listQuickResponsesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("nextToken", targetDepth)) {
                    context.nextToken();
                    listQuickResponsesResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("quickResponseSummaries", targetDepth)) {
                    context.nextToken();
                    listQuickResponsesResult.setQuickResponseSummaries(new ListUnmarshaller<QuickResponseSummary>(QuickResponseSummaryJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listQuickResponsesResult;
    }

    private static ListQuickResponsesResultJsonUnmarshaller instance;

    public static ListQuickResponsesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListQuickResponsesResultJsonUnmarshaller();
        return instance;
    }
}
