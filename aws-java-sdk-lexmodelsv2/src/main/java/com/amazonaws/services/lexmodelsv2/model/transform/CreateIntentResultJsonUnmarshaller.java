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
 * CreateIntentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntentResultJsonUnmarshaller implements Unmarshaller<CreateIntentResult, JsonUnmarshallerContext> {

    public CreateIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntentResult createIntentResult = new CreateIntentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIntentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentName", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setSampleUtterances(new ListUnmarshaller<SampleUtterance>(SampleUtteranceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dialogCodeHook", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setDialogCodeHook(DialogCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fulfillmentCodeHook", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setFulfillmentCodeHook(FulfillmentCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentConfirmationSetting", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setIntentConfirmationSetting(IntentConfirmationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentClosingSetting", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setIntentClosingSetting(IntentClosingSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputContexts", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setInputContexts(new ListUnmarshaller<InputContext>(InputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputContexts", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setOutputContexts(new ListUnmarshaller<OutputContext>(OutputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("kendraConfiguration", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    createIntentResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createIntentResult;
    }

    private static CreateIntentResultJsonUnmarshaller instance;

    public static CreateIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntentResultJsonUnmarshaller();
        return instance;
    }
}
