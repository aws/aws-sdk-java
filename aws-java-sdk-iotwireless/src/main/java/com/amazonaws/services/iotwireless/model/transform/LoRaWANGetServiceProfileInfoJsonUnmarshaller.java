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
 * LoRaWANGetServiceProfileInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANGetServiceProfileInfoJsonUnmarshaller implements Unmarshaller<LoRaWANGetServiceProfileInfo, JsonUnmarshallerContext> {

    public LoRaWANGetServiceProfileInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        LoRaWANGetServiceProfileInfo loRaWANGetServiceProfileInfo = new LoRaWANGetServiceProfileInfo();

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
                if (context.testExpression("UlRate", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setUlRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UlBucketSize", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setUlBucketSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UlRatePolicy", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setUlRatePolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DlRate", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setDlRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DlBucketSize", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setDlBucketSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DlRatePolicy", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setDlRatePolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddGwMetadata", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setAddGwMetadata(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DevStatusReqFreq", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setDevStatusReqFreq(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReportDevStatusBattery", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setReportDevStatusBattery(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReportDevStatusMargin", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setReportDevStatusMargin(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DrMin", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setDrMin(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DrMax", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setDrMax(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ChannelMask", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setChannelMask(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrAllowed", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setPrAllowed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HrAllowed", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setHrAllowed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RaAllowed", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setRaAllowed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NwkGeoLoc", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setNwkGeoLoc(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TargetPer", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setTargetPer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinGwDiversity", targetDepth)) {
                    context.nextToken();
                    loRaWANGetServiceProfileInfo.setMinGwDiversity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return loRaWANGetServiceProfileInfo;
    }

    private static LoRaWANGetServiceProfileInfoJsonUnmarshaller instance;

    public static LoRaWANGetServiceProfileInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoRaWANGetServiceProfileInfoJsonUnmarshaller();
        return instance;
    }
}
