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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetLegalHoldResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLegalHoldResultJsonUnmarshaller implements Unmarshaller<GetLegalHoldResult, JsonUnmarshallerContext> {

    public GetLegalHoldResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLegalHoldResult getLegalHoldResult = new GetLegalHoldResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLegalHoldResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CancelDescription", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setCancelDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LegalHoldId", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setLegalHoldId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LegalHoldArn", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setLegalHoldArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CancellationDate", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setCancellationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RetainRecordUntil", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setRetainRecordUntil(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RecoveryPointSelection", targetDepth)) {
                    context.nextToken();
                    getLegalHoldResult.setRecoveryPointSelection(RecoveryPointSelectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLegalHoldResult;
    }

    private static GetLegalHoldResultJsonUnmarshaller instance;

    public static GetLegalHoldResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLegalHoldResultJsonUnmarshaller();
        return instance;
    }
}
