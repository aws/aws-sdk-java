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
 * DescribeIntentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIntentResultJsonUnmarshaller implements Unmarshaller<DescribeIntentResult, JsonUnmarshallerContext> {

    public DescribeIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeIntentResult describeIntentResult = new DescribeIntentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeIntentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentName", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setSampleUtterances(new ListUnmarshaller<SampleUtterance>(SampleUtteranceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dialogCodeHook", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setDialogCodeHook(DialogCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fulfillmentCodeHook", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setFulfillmentCodeHook(FulfillmentCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("slotPriorities", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setSlotPriorities(new ListUnmarshaller<SlotPriority>(SlotPriorityJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("intentConfirmationSetting", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setIntentConfirmationSetting(IntentConfirmationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentClosingSetting", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setIntentClosingSetting(IntentClosingSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputContexts", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setInputContexts(new ListUnmarshaller<InputContext>(InputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputContexts", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setOutputContexts(new ListUnmarshaller<OutputContext>(OutputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("kendraConfiguration", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeIntentResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeIntentResult;
    }

    private static DescribeIntentResultJsonUnmarshaller instance;

    public static DescribeIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeIntentResultJsonUnmarshaller();
        return instance;
    }
}
