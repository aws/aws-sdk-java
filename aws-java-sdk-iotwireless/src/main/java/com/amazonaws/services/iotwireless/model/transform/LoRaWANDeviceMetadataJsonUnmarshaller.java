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
 * LoRaWANDeviceMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANDeviceMetadataJsonUnmarshaller implements Unmarshaller<LoRaWANDeviceMetadata, JsonUnmarshallerContext> {

    public LoRaWANDeviceMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoRaWANDeviceMetadata loRaWANDeviceMetadata = new LoRaWANDeviceMetadata();

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
                    loRaWANDeviceMetadata.setDevEui(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FPort", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceMetadata.setFPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DataRate", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceMetadata.setDataRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Frequency", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceMetadata.setFrequency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timestamp", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceMetadata.setTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Gateways", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceMetadata.setGateways(new ListUnmarshaller<LoRaWANGatewayMetadata>(LoRaWANGatewayMetadataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return loRaWANDeviceMetadata;
    }

    private static LoRaWANDeviceMetadataJsonUnmarshaller instance;

    public static LoRaWANDeviceMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoRaWANDeviceMetadataJsonUnmarshaller();
        return instance;
    }
}
