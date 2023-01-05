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
 * DescribeDeviceJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceJobResultJsonUnmarshaller implements Unmarshaller<DescribeDeviceJobResult, JsonUnmarshallerContext> {

    public DescribeDeviceJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDeviceJobResult describeDeviceJobResult = new DescribeDeviceJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDeviceJobResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedTime", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeviceArn", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceId", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceName", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceType", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setDeviceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageVersion", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setImageVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobType", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeDeviceJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeDeviceJobResult;
    }

    private static DescribeDeviceJobResultJsonUnmarshaller instance;

    public static DescribeDeviceJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDeviceJobResultJsonUnmarshaller();
        return instance;
    }
}
