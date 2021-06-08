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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LoRaWANDevice JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANDeviceJsonUnmarshaller implements Unmarshaller<LoRaWANDevice, JsonUnmarshallerContext> {

    public LoRaWANDevice unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoRaWANDevice loRaWANDevice = new LoRaWANDevice();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DevEui", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setDevEui(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceProfileId", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setDeviceProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceProfileId", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setServiceProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OtaaV1_1", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setOtaaV1_1(OtaaV11JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OtaaV1_0_x", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setOtaaV1_0_x(OtaaV10XJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AbpV1_1", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setAbpV1_1(AbpV11JsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AbpV1_0_x", targetDepth)) {
                    context.nextToken();
                    loRaWANDevice.setAbpV1_0_x(AbpV10XJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return loRaWANDevice;
    }

    private static LoRaWANDeviceJsonUnmarshaller instance;

    public static LoRaWANDeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoRaWANDeviceJsonUnmarshaller();
        return instance;
    }
}
