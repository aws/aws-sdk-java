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
package com.amazonaws.services.mturk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReviewActionDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewActionDetailJsonUnmarshaller implements Unmarshaller<ReviewActionDetail, JsonUnmarshallerContext> {

    public ReviewActionDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReviewActionDetail reviewActionDetail = new ReviewActionDetail();

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
                if (context.testExpression("ActionId", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setActionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActionName", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetId", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetType", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompleteTime", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setCompleteTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Result", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCode", targetDepth)) {
                    context.nextToken();
                    reviewActionDetail.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return reviewActionDetail;
    }

    private static ReviewActionDetailJsonUnmarshaller instance;

    public static ReviewActionDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReviewActionDetailJsonUnmarshaller();
        return instance;
    }
}
