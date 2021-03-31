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
 * GetWirelessDeviceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessDeviceResultJsonUnmarshaller implements Unmarshaller<GetWirelessDeviceResult, JsonUnmarshallerContext> {

    public GetWirelessDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWirelessDeviceResult getWirelessDeviceResult = new GetWirelessDeviceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWirelessDeviceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationName", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setDestinationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThingName", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThingArn", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setThingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoRaWAN", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setLoRaWAN(LoRaWANDeviceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Sidewalk", targetDepth)) {
                    context.nextToken();
                    getWirelessDeviceResult.setSidewalk(SidewalkDeviceJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getWirelessDeviceResult;
    }

    private static GetWirelessDeviceResultJsonUnmarshaller instance;

    public static GetWirelessDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWirelessDeviceResultJsonUnmarshaller();
        return instance;
    }
}
