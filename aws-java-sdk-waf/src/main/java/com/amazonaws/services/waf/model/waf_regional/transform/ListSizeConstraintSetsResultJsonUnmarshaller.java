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
package com.amazonaws.services.waf.model.waf_regional.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.waf.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListSizeConstraintSetsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSizeConstraintSetsResultJsonUnmarshaller implements Unmarshaller<ListSizeConstraintSetsResult, JsonUnmarshallerContext> {

    public ListSizeConstraintSetsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListSizeConstraintSetsResult listSizeConstraintSetsResult = new ListSizeConstraintSetsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listSizeConstraintSetsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("NextMarker", targetDepth)) {
                    context.nextToken();
                    listSizeConstraintSetsResult.setNextMarker(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizeConstraintSets", targetDepth)) {
                    context.nextToken();
                    listSizeConstraintSetsResult.setSizeConstraintSets(new ListUnmarshaller<SizeConstraintSetSummary>(SizeConstraintSetSummaryJsonUnmarshaller
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

        return listSizeConstraintSetsResult;
    }

    private static ListSizeConstraintSetsResultJsonUnmarshaller instance;

    public static ListSizeConstraintSetsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListSizeConstraintSetsResultJsonUnmarshaller();
        return instance;
    }
}
