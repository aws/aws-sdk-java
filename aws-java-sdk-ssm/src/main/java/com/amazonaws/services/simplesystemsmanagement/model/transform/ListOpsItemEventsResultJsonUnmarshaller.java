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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListOpsItemEventsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOpsItemEventsResultJsonUnmarshaller implements Unmarshaller<ListOpsItemEventsResult, JsonUnmarshallerContext> {

    public ListOpsItemEventsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListOpsItemEventsResult listOpsItemEventsResult = new ListOpsItemEventsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listOpsItemEventsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listOpsItemEventsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Summaries", targetDepth)) {
                    context.nextToken();
                    listOpsItemEventsResult.setSummaries(new ListUnmarshaller<OpsItemEventSummary>(OpsItemEventSummaryJsonUnmarshaller.getInstance())

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

        return listOpsItemEventsResult;
    }

    private static ListOpsItemEventsResultJsonUnmarshaller instance;

    public static ListOpsItemEventsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListOpsItemEventsResultJsonUnmarshaller();
        return instance;
    }
}
