/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudhsm.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeHsmResult JSON Unmarshaller
 */
public class DescribeHsmResultJsonUnmarshaller implements
        Unmarshaller<DescribeHsmResult, JsonUnmarshallerContext> {

    public DescribeHsmResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        DescribeHsmResult describeHsmResult = new DescribeHsmResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL)
            return null;

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HsmArn", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setHsmArn(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setStatus(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setStatusDetails(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setAvailabilityZone(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("EniId", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setEniId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("EniIp", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setEniIp(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SubscriptionType", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setSubscriptionType(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context
                        .testExpression("SubscriptionStartDate", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setSubscriptionStartDate(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("SubscriptionEndDate", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setSubscriptionEndDate(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setVpcId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSubnetId(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setIamRoleArn(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SerialNumber", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSerialNumber(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("VendorName", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setVendorName(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("HsmType", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setHsmType(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SoftwareVersion", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSoftwareVersion(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SshPublicKey", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSshPublicKey(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("SshKeyLastUpdated", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setSshKeyLastUpdated(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("ServerCertUri", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setServerCertUri(StringJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context
                        .testExpression("ServerCertLastUpdated", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setServerCertLastUpdated(StringJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("Partitions", targetDepth)) {
                    context.nextToken();
                    describeHsmResult
                            .setPartitions(new ListUnmarshaller<String>(
                                    StringJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null
                        || context.getLastParsedParentElement().equals(
                                currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeHsmResult;
    }

    private static DescribeHsmResultJsonUnmarshaller instance;

    public static DescribeHsmResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHsmResultJsonUnmarshaller();
        return instance;
    }
}
