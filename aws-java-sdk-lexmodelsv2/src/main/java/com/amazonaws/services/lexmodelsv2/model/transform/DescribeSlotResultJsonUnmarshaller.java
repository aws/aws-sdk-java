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
 * DescribeSlotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSlotResultJsonUnmarshaller implements Unmarshaller<DescribeSlotResult, JsonUnmarshallerContext> {

    public DescribeSlotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSlotResult describeSlotResult = new DescribeSlotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSlotResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotId", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setSlotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotName", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeId", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueElicitationSetting", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setValueElicitationSetting(SlotValueElicitationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("obfuscationSetting", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setObfuscationSetting(ObfuscationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentId", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("multipleValuesSetting", targetDepth)) {
                    context.nextToken();
                    describeSlotResult.setMultipleValuesSetting(MultipleValuesSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeSlotResult;
    }

    private static DescribeSlotResultJsonUnmarshaller instance;

    public static DescribeSlotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSlotResultJsonUnmarshaller();
        return instance;
    }
}
