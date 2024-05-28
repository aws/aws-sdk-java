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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CostAllocationTagBackfillRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostAllocationTagBackfillRequestJsonUnmarshaller implements Unmarshaller<CostAllocationTagBackfillRequest, JsonUnmarshallerContext> {

    public CostAllocationTagBackfillRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        CostAllocationTagBackfillRequest costAllocationTagBackfillRequest = new CostAllocationTagBackfillRequest();

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
                if (context.testExpression("BackfillFrom", targetDepth)) {
                    context.nextToken();
                    costAllocationTagBackfillRequest.setBackfillFrom(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedAt", targetDepth)) {
                    context.nextToken();
                    costAllocationTagBackfillRequest.setRequestedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedAt", targetDepth)) {
                    context.nextToken();
                    costAllocationTagBackfillRequest.setCompletedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackfillStatus", targetDepth)) {
                    context.nextToken();
                    costAllocationTagBackfillRequest.setBackfillStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    costAllocationTagBackfillRequest.setLastUpdatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return costAllocationTagBackfillRequest;
    }

    private static CostAllocationTagBackfillRequestJsonUnmarshaller instance;

    public static CostAllocationTagBackfillRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostAllocationTagBackfillRequestJsonUnmarshaller();
        return instance;
    }
}
