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
 * LoRaWANDeviceProfile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANDeviceProfileJsonUnmarshaller implements Unmarshaller<LoRaWANDeviceProfile, JsonUnmarshallerContext> {

    public LoRaWANDeviceProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoRaWANDeviceProfile loRaWANDeviceProfile = new LoRaWANDeviceProfile();

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
                if (context.testExpression("SupportsClassB", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setSupportsClassB(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ClassBTimeout", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setClassBTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PingSlotPeriod", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setPingSlotPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PingSlotDr", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setPingSlotDr(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PingSlotFreq", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setPingSlotFreq(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SupportsClassC", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setSupportsClassC(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ClassCTimeout", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setClassCTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MacVersion", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setMacVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegParamsRevision", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setRegParamsRevision(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RxDelay1", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setRxDelay1(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RxDrOffset1", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setRxDrOffset1(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RxDataRate2", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setRxDataRate2(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RxFreq2", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setRxFreq2(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FactoryPresetFreqsList", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setFactoryPresetFreqsList(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MaxEirp", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setMaxEirp(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxDutyCycle", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setMaxDutyCycle(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RfRegion", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setRfRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportsJoin", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setSupportsJoin(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Supports32BitFCnt", targetDepth)) {
                    context.nextToken();
                    loRaWANDeviceProfile.setSupports32BitFCnt(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return loRaWANDeviceProfile;
    }

    private static LoRaWANDeviceProfileJsonUnmarshaller instance;

    public static LoRaWANDeviceProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoRaWANDeviceProfileJsonUnmarshaller();
        return instance;
    }
}
