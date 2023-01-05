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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowdevicemanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDeviceEc2InstancesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceEc2InstancesResultJsonUnmarshaller implements Unmarshaller<DescribeDeviceEc2InstancesResult, JsonUnmarshallerContext> {

    public DescribeDeviceEc2InstancesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDeviceEc2InstancesResult describeDeviceEc2InstancesResult = new DescribeDeviceEc2InstancesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDeviceEc2InstancesResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("instances", targetDepth)) {
                    context.nextToken();
                    describeDeviceEc2InstancesResult.setInstances(new ListUnmarshaller<InstanceSummary>(InstanceSummaryJsonUnmarshaller.getInstance())

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

        return describeDeviceEc2InstancesResult;
    }

    private static DescribeDeviceEc2InstancesResultJsonUnmarshaller instance;

    public static DescribeDeviceEc2InstancesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDeviceEc2InstancesResultJsonUnmarshaller();
        return instance;
    }
}
