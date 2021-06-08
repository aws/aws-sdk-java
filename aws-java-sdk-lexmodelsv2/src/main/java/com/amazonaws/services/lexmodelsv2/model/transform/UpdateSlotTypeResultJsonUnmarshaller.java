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
 * UpdateSlotTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSlotTypeResultJsonUnmarshaller implements Unmarshaller<UpdateSlotTypeResult, JsonUnmarshallerContext> {

    public UpdateSlotTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSlotTypeResult updateSlotTypeResult = new UpdateSlotTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSlotTypeResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotTypeId", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeName", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setSlotTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeValues", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setSlotTypeValues(new ListUnmarshaller<SlotTypeValue>(SlotTypeValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("valueSelectionSetting", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setValueSelectionSetting(SlotValueSelectionSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parentSlotTypeSignature", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setParentSlotTypeSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    updateSlotTypeResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSlotTypeResult;
    }

    private static UpdateSlotTypeResultJsonUnmarshaller instance;

    public static UpdateSlotTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSlotTypeResultJsonUnmarshaller();
        return instance;
    }
}
