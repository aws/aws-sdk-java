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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2VpnConnectionOptionsTunnelOptionsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpnConnectionOptionsTunnelOptionsDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEc2VpnConnectionOptionsTunnelOptionsDetails, JsonUnmarshallerContext> {

    public AwsEc2VpnConnectionOptionsTunnelOptionsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2VpnConnectionOptionsTunnelOptionsDetails awsEc2VpnConnectionOptionsTunnelOptionsDetails = new AwsEc2VpnConnectionOptionsTunnelOptionsDetails();

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
                if (context.testExpression("DpdTimeoutSeconds", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setDpdTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IkeVersions", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setIkeVersions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("OutsideIpAddress", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setOutsideIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Phase1DhGroupNumbers", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails
                            .setPhase1DhGroupNumbers(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                            .unmarshall(context));
                }
                if (context.testExpression("Phase1EncryptionAlgorithms", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPhase1EncryptionAlgorithms(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Phase1IntegrityAlgorithms", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPhase1IntegrityAlgorithms(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Phase1LifetimeSeconds", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPhase1LifetimeSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Phase2DhGroupNumbers", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails
                            .setPhase2DhGroupNumbers(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                            .unmarshall(context));
                }
                if (context.testExpression("Phase2EncryptionAlgorithms", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPhase2EncryptionAlgorithms(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Phase2IntegrityAlgorithms", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPhase2IntegrityAlgorithms(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Phase2LifetimeSeconds", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPhase2LifetimeSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PreSharedKey", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setPreSharedKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RekeyFuzzPercentage", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setRekeyFuzzPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RekeyMarginTimeSeconds", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setRekeyMarginTimeSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ReplayWindowSize", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setReplayWindowSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TunnelInsideCidr", targetDepth)) {
                    context.nextToken();
                    awsEc2VpnConnectionOptionsTunnelOptionsDetails.setTunnelInsideCidr(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2VpnConnectionOptionsTunnelOptionsDetails;
    }

    private static AwsEc2VpnConnectionOptionsTunnelOptionsDetailsJsonUnmarshaller instance;

    public static AwsEc2VpnConnectionOptionsTunnelOptionsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2VpnConnectionOptionsTunnelOptionsDetailsJsonUnmarshaller();
        return instance;
    }
}
