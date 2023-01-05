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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetComputeAuthTokenResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComputeAuthTokenResultJsonUnmarshaller implements Unmarshaller<GetComputeAuthTokenResult, JsonUnmarshallerContext> {

    public GetComputeAuthTokenResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetComputeAuthTokenResult getComputeAuthTokenResult = new GetComputeAuthTokenResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getComputeAuthTokenResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FleetId", targetDepth)) {
                    context.nextToken();
                    getComputeAuthTokenResult.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetArn", targetDepth)) {
                    context.nextToken();
                    getComputeAuthTokenResult.setFleetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeName", targetDepth)) {
                    context.nextToken();
                    getComputeAuthTokenResult.setComputeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeArn", targetDepth)) {
                    context.nextToken();
                    getComputeAuthTokenResult.setComputeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthToken", targetDepth)) {
                    context.nextToken();
                    getComputeAuthTokenResult.setAuthToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationTimestamp", targetDepth)) {
                    context.nextToken();
                    getComputeAuthTokenResult.setExpirationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getComputeAuthTokenResult;
    }

    private static GetComputeAuthTokenResultJsonUnmarshaller instance;

    public static GetComputeAuthTokenResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetComputeAuthTokenResultJsonUnmarshaller();
        return instance;
    }
}
