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
 * NetworkProfile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkProfileJsonUnmarshaller implements Unmarshaller<NetworkProfile, JsonUnmarshallerContext> {

    public NetworkProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkProfile networkProfile = new NetworkProfile();

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
                    networkProfile.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    networkProfile.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    networkProfile.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    networkProfile.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uplinkBandwidthBits", targetDepth)) {
                    context.nextToken();
                    networkProfile.setUplinkBandwidthBits(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("downlinkBandwidthBits", targetDepth)) {
                    context.nextToken();
                    networkProfile.setDownlinkBandwidthBits(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("uplinkDelayMs", targetDepth)) {
                    context.nextToken();
                    networkProfile.setUplinkDelayMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("downlinkDelayMs", targetDepth)) {
                    context.nextToken();
                    networkProfile.setDownlinkDelayMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("uplinkJitterMs", targetDepth)) {
                    context.nextToken();
                    networkProfile.setUplinkJitterMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("downlinkJitterMs", targetDepth)) {
                    context.nextToken();
                    networkProfile.setDownlinkJitterMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("uplinkLossPercent", targetDepth)) {
                    context.nextToken();
                    networkProfile.setUplinkLossPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("downlinkLossPercent", targetDepth)) {
                    context.nextToken();
                    networkProfile.setDownlinkLossPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return networkProfile;
    }

    private static NetworkProfileJsonUnmarshaller instance;

    public static NetworkProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkProfileJsonUnmarshaller();
        return instance;
    }
}
