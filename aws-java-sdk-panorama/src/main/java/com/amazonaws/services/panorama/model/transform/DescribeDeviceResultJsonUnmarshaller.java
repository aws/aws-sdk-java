/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDeviceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResultJsonUnmarshaller implements Unmarshaller<DescribeDeviceResult, JsonUnmarshallerContext> {

    public DescribeDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDeviceResult describeDeviceResult = new DescribeDeviceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDeviceResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AlternateSoftwares", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setAlternateSoftwares(new ListUnmarshaller<AlternateSoftwareMetadata>(AlternateSoftwareMetadataJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Brand", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setBrand(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CurrentNetworkingStatus", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setCurrentNetworkingStatus(NetworkStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CurrentSoftware", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setCurrentSoftware(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceAggregatedStatus", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setDeviceAggregatedStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceConnectionStatus", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setDeviceConnectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceId", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestAlternateSoftware", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setLatestAlternateSoftware(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestDeviceJob", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setLatestDeviceJob(LatestDeviceJobJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestSoftware", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setLatestSoftware(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LeaseExpirationTime", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setLeaseExpirationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkingConfiguration", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setNetworkingConfiguration(NetworkPayloadJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProvisioningStatus", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setProvisioningStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SerialNumber", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    describeDeviceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDeviceResult;
    }

    private static DescribeDeviceResultJsonUnmarshaller instance;

    public static DescribeDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDeviceResultJsonUnmarshaller();
        return instance;
    }
}
