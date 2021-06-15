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
 * CreateSlotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotResultJsonUnmarshaller implements Unmarshaller<CreateSlotResult, JsonUnmarshallerContext> {

    public CreateSlotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSlotResult createSlotResult = new CreateSlotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSlotResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotId", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setSlotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotName", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeId", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueElicitationSetting", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setValueElicitationSetting(SlotValueElicitationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("obfuscationSetting", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setObfuscationSetting(ObfuscationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("multipleValuesSetting", targetDepth)) {
                    context.nextToken();
                    createSlotResult.setMultipleValuesSetting(MultipleValuesSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createSlotResult;
    }

    private static CreateSlotResultJsonUnmarshaller instance;

    public static CreateSlotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSlotResultJsonUnmarshaller();
        return instance;
    }
}
