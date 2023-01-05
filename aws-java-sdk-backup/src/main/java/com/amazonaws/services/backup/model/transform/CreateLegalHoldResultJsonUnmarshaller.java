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
 * CreateLegalHoldResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLegalHoldResultJsonUnmarshaller implements Unmarshaller<CreateLegalHoldResult, JsonUnmarshallerContext> {

    public CreateLegalHoldResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateLegalHoldResult createLegalHoldResult = new CreateLegalHoldResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createLegalHoldResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Title", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LegalHoldId", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setLegalHoldId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LegalHoldArn", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setLegalHoldArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RecoveryPointSelection", targetDepth)) {
                    context.nextToken();
                    createLegalHoldResult.setRecoveryPointSelection(RecoveryPointSelectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createLegalHoldResult;
    }

    private static CreateLegalHoldResultJsonUnmarshaller instance;

    public static CreateLegalHoldResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLegalHoldResultJsonUnmarshaller();
        return instance;
    }
}
