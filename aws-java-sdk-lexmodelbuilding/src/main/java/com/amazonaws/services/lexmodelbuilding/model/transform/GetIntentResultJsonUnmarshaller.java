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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetIntentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntentResultJsonUnmarshaller implements Unmarshaller<GetIntentResult, JsonUnmarshallerContext> {

    public GetIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIntentResult getIntentResult = new GetIntentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getIntentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slots", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setSlots(new ListUnmarshaller<Slot>(SlotJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setSampleUtterances(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("confirmationPrompt", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setConfirmationPrompt(PromptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rejectionStatement", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setRejectionStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("followUpPrompt", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setFollowUpPrompt(FollowUpPromptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("conclusionStatement", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setConclusionStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dialogCodeHook", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setDialogCodeHook(CodeHookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fulfillmentActivity", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setFulfillmentActivity(FulfillmentActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checksum", targetDepth)) {
                    context.nextToken();
                    getIntentResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getIntentResult;
    }

    private static GetIntentResultJsonUnmarshaller instance;

    public static GetIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIntentResultJsonUnmarshaller();
        return instance;
    }
}
