/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateIntentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIntentResultJsonUnmarshaller implements Unmarshaller<UpdateIntentResult, JsonUnmarshallerContext> {

    public UpdateIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIntentResult updateIntentResult = new UpdateIntentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateIntentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentName", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setSampleUtterances(new ListUnmarshaller<SampleUtterance>(SampleUtteranceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dialogCodeHook", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setDialogCodeHook(DialogCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fulfillmentCodeHook", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setFulfillmentCodeHook(FulfillmentCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("slotPriorities", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setSlotPriorities(new ListUnmarshaller<SlotPriority>(SlotPriorityJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("intentConfirmationSetting", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setIntentConfirmationSetting(IntentConfirmationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentClosingSetting", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setIntentClosingSetting(IntentClosingSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputContexts", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setInputContexts(new ListUnmarshaller<InputContext>(InputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputContexts", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setOutputContexts(new ListUnmarshaller<OutputContext>(OutputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("kendraConfiguration", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateIntentResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateIntentResult;
    }

    private static UpdateIntentResultJsonUnmarshaller instance;

    public static UpdateIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIntentResultJsonUnmarshaller();
        return instance;
    }
}
