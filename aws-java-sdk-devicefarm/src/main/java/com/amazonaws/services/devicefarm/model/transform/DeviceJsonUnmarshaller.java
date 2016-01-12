/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.devicefarm.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Device JSON Unmarshaller
 */
public class DeviceJsonUnmarshaller implements
        Unmarshaller<Device, JsonUnmarshallerContext> {

    public Device unmarshall(JsonUnmarshallerContext context) throws Exception {
        Device device = new Device();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    device.setArn(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    device.setName(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("manufacturer", targetDepth)) {
                    context.nextToken();
                    device.setManufacturer(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    context.nextToken();
                    device.setModel(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("formFactor", targetDepth)) {
                    context.nextToken();
                    device.setFormFactor(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    device.setPlatform(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("os", targetDepth)) {
                    context.nextToken();
                    device.setOs(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    context.nextToken();
                    device.setCpu(CPUJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("resolution", targetDepth)) {
                    context.nextToken();
                    device.setResolution(ResolutionJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("heapSize", targetDepth)) {
                    context.nextToken();
                    device.setHeapSize(LongJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    context.nextToken();
                    device.setMemory(LongJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    context.nextToken();
                    device.setImage(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("carrier", targetDepth)) {
                    context.nextToken();
                    device.setCarrier(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("radio", targetDepth)) {
                    context.nextToken();
                    device.setRadio(StringJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
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
