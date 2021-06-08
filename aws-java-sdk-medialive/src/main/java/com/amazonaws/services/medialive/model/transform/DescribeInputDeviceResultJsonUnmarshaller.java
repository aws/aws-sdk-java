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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeInputDeviceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputDeviceResultJsonUnmarshaller implements Unmarshaller<DescribeInputDeviceResult, JsonUnmarshallerContext> {

    public DescribeInputDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInputDeviceResult describeInputDeviceResult = new DescribeInputDeviceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeInputDeviceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionState", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setConnectionState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceSettingsSyncState", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setDeviceSettingsSyncState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceUpdateStatus", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setDeviceUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hdDeviceSettings", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setHdDeviceSettings(InputDeviceHdSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macAddress", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setMacAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSettings", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setNetworkSettings(InputDeviceNetworkSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serialNumber", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uhdDeviceSettings", targetDepth)) {
                    context.nextToken();
                    describeInputDeviceResult.setUhdDeviceSettings(InputDeviceUhdSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeInputDeviceResult;
    }

    private static DescribeInputDeviceResultJsonUnmarshaller instance;

    public static DescribeInputDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInputDeviceResultJsonUnmarshaller();
        return instance;
    }
}
