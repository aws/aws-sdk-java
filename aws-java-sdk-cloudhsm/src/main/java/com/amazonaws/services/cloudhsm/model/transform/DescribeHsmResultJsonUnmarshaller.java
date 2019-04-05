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
package com.amazonaws.services.cloudhsm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeHsmResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHsmResultJsonUnmarshaller implements Unmarshaller<DescribeHsmResult, JsonUnmarshallerContext> {

    public DescribeHsmResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHsmResult describeHsmResult = new DescribeHsmResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeHsmResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HsmArn", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setHsmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EniId", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setEniId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EniIp", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setEniIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionType", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSubscriptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionStartDate", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSubscriptionStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionEndDate", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSubscriptionEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SerialNumber", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VendorName", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setVendorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HsmType", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setHsmType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SoftwareVersion", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSoftwareVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshPublicKey", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSshPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshKeyLastUpdated", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setSshKeyLastUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerCertUri", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setServerCertUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerCertLastUpdated", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setServerCertLastUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Partitions", targetDepth)) {
                    context.nextToken();
                    describeHsmResult.setPartitions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
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
