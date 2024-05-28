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
package com.amazonaws.services.controlcatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.controlcatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListCommonControlsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCommonControlsResultJsonUnmarshaller implements Unmarshaller<ListCommonControlsResult, JsonUnmarshallerContext> {

    public ListCommonControlsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListCommonControlsResult listCommonControlsResult = new ListCommonControlsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listCommonControlsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CommonControls", targetDepth)) {
                    context.nextToken();
                    listCommonControlsResult.setCommonControls(new ListUnmarshaller<CommonControlSummary>(CommonControlSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    context.nextToken();
                    listCommonControlsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return listCommonControlsResult;
    }

    private static ListCommonControlsResultJsonUnmarshaller instance;

    public static ListCommonControlsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListCommonControlsResultJsonUnmarshaller();
        return instance;
    }
}
