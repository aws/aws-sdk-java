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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Device JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceJsonUnmarshaller implements Unmarshaller<Device, JsonUnmarshallerContext> {

    public Device unmarshall(JsonUnmarshallerContext context) throws Exception {
        Device device = new Device();

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
                if (context.testExpression("DeviceArn", targetDepth)) {
                    context.nextToken();
                    device.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceSerialNumber", targetDepth)) {
                    context.nextToken();
                    device.setDeviceSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceType", targetDepth)) {
                    context.nextToken();
                    device.setDeviceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceName", targetDepth)) {
                    context.nextToken();
                    device.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SoftwareVersion", targetDepth)) {
                    context.nextToken();
                    device.setSoftwareVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MacAddress", targetDepth)) {
                    context.nextToken();
                    device.setMacAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoomArn", targetDepth)) {
                    context.nextToken();
                    device.setRoomArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceStatus", targetDepth)) {
                    context.nextToken();
                    device.setDeviceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceStatusInfo", targetDepth)) {
                    context.nextToken();
                    device.setDeviceStatusInfo(DeviceStatusInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return device;
    }

    private static DeviceJsonUnmarshaller instance;

    public static DeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceJsonUnmarshaller();
        return instance;
    }
}
