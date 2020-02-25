/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MutableClusterInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MutableClusterInfoJsonUnmarshaller implements Unmarshaller<MutableClusterInfo, JsonUnmarshallerContext> {

    public MutableClusterInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        MutableClusterInfo mutableClusterInfo = new MutableClusterInfo();

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
                if (context.testExpression("brokerEBSVolumeInfo", targetDepth)) {
                    context.nextToken();
                    mutableClusterInfo.setBrokerEBSVolumeInfo(new ListUnmarshaller<BrokerEBSVolumeInfo>(BrokerEBSVolumeInfoJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("configurationInfo", targetDepth)) {
                    context.nextToken();
                    mutableClusterInfo.setConfigurationInfo(ConfigurationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("numberOfBrokerNodes", targetDepth)) {
                    context.nextToken();
                    mutableClusterInfo.setNumberOfBrokerNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("enhancedMonitoring", targetDepth)) {
                    context.nextToken();
                    mutableClusterInfo.setEnhancedMonitoring(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("openMonitoring", targetDepth)) {
                    context.nextToken();
                    mutableClusterInfo.setOpenMonitoring(OpenMonitoringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loggingInfo", targetDepth)) {
                    context.nextToken();
                    mutableClusterInfo.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return mutableClusterInfo;
    }

    private static MutableClusterInfoJsonUnmarshaller instance;

    public static MutableClusterInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MutableClusterInfoJsonUnmarshaller();
        return instance;
    }
}
