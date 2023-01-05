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
package com.amazonaws.services.workspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeClientBrandingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClientBrandingResultJsonUnmarshaller implements Unmarshaller<DescribeClientBrandingResult, JsonUnmarshallerContext> {

    public DescribeClientBrandingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeClientBrandingResult describeClientBrandingResult = new DescribeClientBrandingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeClientBrandingResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DeviceTypeWindows", targetDepth)) {
                    context.nextToken();
                    describeClientBrandingResult.setDeviceTypeWindows(DefaultClientBrandingAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeviceTypeOsx", targetDepth)) {
                    context.nextToken();
                    describeClientBrandingResult.setDeviceTypeOsx(DefaultClientBrandingAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeviceTypeAndroid", targetDepth)) {
                    context.nextToken();
                    describeClientBrandingResult.setDeviceTypeAndroid(DefaultClientBrandingAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeviceTypeIos", targetDepth)) {
                    context.nextToken();
                    describeClientBrandingResult.setDeviceTypeIos(IosClientBrandingAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeviceTypeLinux", targetDepth)) {
                    context.nextToken();
                    describeClientBrandingResult.setDeviceTypeLinux(DefaultClientBrandingAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeviceTypeWeb", targetDepth)) {
                    context.nextToken();
                    describeClientBrandingResult.setDeviceTypeWeb(DefaultClientBrandingAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeClientBrandingResult;
    }

    private static DescribeClientBrandingResultJsonUnmarshaller instance;

    public static DescribeClientBrandingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeClientBrandingResultJsonUnmarshaller();
        return instance;
    }
}
