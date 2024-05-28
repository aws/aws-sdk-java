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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateVPCConnectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVPCConnectionResultJsonUnmarshaller implements Unmarshaller<UpdateVPCConnectionResult, JsonUnmarshallerContext> {

    public UpdateVPCConnectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateVPCConnectionResult updateVPCConnectionResult = new UpdateVPCConnectionResult();

        updateVPCConnectionResult.setStatus(context.getHttpResponse().getStatusCode());

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateVPCConnectionResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    updateVPCConnectionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VPCConnectionId", targetDepth)) {
                    context.nextToken();
                    updateVPCConnectionResult.setVPCConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateStatus", targetDepth)) {
                    context.nextToken();
                    updateVPCConnectionResult.setUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityStatus", targetDepth)) {
                    context.nextToken();
                    updateVPCConnectionResult.setAvailabilityStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestId", targetDepth)) {
                    context.nextToken();
                    updateVPCConnectionResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateVPCConnectionResult;
    }

    private static UpdateVPCConnectionResultJsonUnmarshaller instance;

    public static UpdateVPCConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateVPCConnectionResultJsonUnmarshaller();
        return instance;
    }
}
