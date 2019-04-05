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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeviceInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceInstanceJsonUnmarshaller implements Unmarshaller<DeviceInstance, JsonUnmarshallerContext> {

    public DeviceInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeviceInstance deviceInstance = new DeviceInstance();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    deviceInstance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceArn", targetDepth)) {
                    context.nextToken();
                    deviceInstance.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("labels", targetDepth)) {
                    context.nextToken();
                    deviceInstance.setLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    deviceInstance.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("udid", targetDepth)) {
                    context.nextToken();
                    deviceInstance.setUdid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceProfile", targetDepth)) {
                    context.nextToken();
                    deviceInstance.setInstanceProfile(InstanceProfileJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return deviceInstance;
    }

    private static DeviceInstanceJsonUnmarshaller instance;

    public static DeviceInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceInstanceJsonUnmarshaller();
        return instance;
    }
}
