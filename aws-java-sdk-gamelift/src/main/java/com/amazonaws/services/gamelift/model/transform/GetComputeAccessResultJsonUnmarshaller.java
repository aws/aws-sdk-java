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
 * GetComputeAccessResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComputeAccessResultJsonUnmarshaller implements Unmarshaller<GetComputeAccessResult, JsonUnmarshallerContext> {

    public GetComputeAccessResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetComputeAccessResult getComputeAccessResult = new GetComputeAccessResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getComputeAccessResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("FleetId", targetDepth)) {
                    context.nextToken();
                    getComputeAccessResult.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetArn", targetDepth)) {
                    context.nextToken();
                    getComputeAccessResult.setFleetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeName", targetDepth)) {
                    context.nextToken();
                    getComputeAccessResult.setComputeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeArn", targetDepth)) {
                    context.nextToken();
                    getComputeAccessResult.setComputeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Credentials", targetDepth)) {
                    context.nextToken();
                    getComputeAccessResult.setCredentials(CredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getComputeAccessResult;
    }

    private static GetComputeAccessResultJsonUnmarshaller instance;

    public static GetComputeAccessResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetComputeAccessResultJsonUnmarshaller();
        return instance;
    }
}
