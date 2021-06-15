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
 * UpdateSlotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlotResultJsonUnmarshaller implements Unmarshaller<UpdateSlotResult, JsonUnmarshallerContext> {

    public UpdateSlotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSlotResult updateSlotResult = new UpdateSlotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSlotResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotId", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setSlotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotName", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeId", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueElicitationSetting", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setValueElicitationSetting(SlotValueElicitationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("obfuscationSetting", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setObfuscationSetting(ObfuscationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("multipleValuesSetting", targetDepth)) {
                    context.nextToken();
                    updateSlotResult.setMultipleValuesSetting(MultipleValuesSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSlotResult;
    }

    private static UpdateSlotResultJsonUnmarshaller instance;

    public static UpdateSlotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSlotResultJsonUnmarshaller();
        return instance;
    }
}
