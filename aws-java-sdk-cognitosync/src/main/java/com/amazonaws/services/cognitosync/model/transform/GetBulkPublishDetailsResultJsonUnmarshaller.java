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
package com.amazonaws.services.cognitosync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetBulkPublishDetailsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBulkPublishDetailsResultJsonUnmarshaller implements Unmarshaller<GetBulkPublishDetailsResult, JsonUnmarshallerContext> {

    public GetBulkPublishDetailsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBulkPublishDetailsResult getBulkPublishDetailsResult = new GetBulkPublishDetailsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBulkPublishDetailsResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IdentityPoolId", targetDepth)) {
                    context.nextToken();
                    getBulkPublishDetailsResult.setIdentityPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BulkPublishStartTime", targetDepth)) {
                    context.nextToken();
                    getBulkPublishDetailsResult.setBulkPublishStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BulkPublishCompleteTime", targetDepth)) {
                    context.nextToken();
                    getBulkPublishDetailsResult.setBulkPublishCompleteTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BulkPublishStatus", targetDepth)) {
                    context.nextToken();
                    getBulkPublishDetailsResult.setBulkPublishStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    context.nextToken();
                    getBulkPublishDetailsResult.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getBulkPublishDetailsResult;
    }

    private static GetBulkPublishDetailsResultJsonUnmarshaller instance;

    public static GetBulkPublishDetailsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBulkPublishDetailsResultJsonUnmarshaller();
        return instance;
    }
}
