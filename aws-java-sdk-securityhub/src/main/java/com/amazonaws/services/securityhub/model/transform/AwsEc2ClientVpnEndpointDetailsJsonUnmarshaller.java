/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsEc2ClientVpnEndpointDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2ClientVpnEndpointDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2ClientVpnEndpointDetails, JsonUnmarshallerContext> {

    public AwsEc2ClientVpnEndpointDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2ClientVpnEndpointDetails awsEc2ClientVpnEndpointDetails = new AwsEc2ClientVpnEndpointDetails();

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
                if (context.testExpression("ClientVpnEndpointId", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setClientVpnEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientCidrBlock", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setClientCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsServer", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setDnsServer(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SplitTunnel", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setSplitTunnel(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TransportProtocol", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setTransportProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpnPort", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setVpnPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerCertificateArn", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setServerCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthenticationOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setAuthenticationOptions(new ListUnmarshaller<AwsEc2ClientVpnEndpointAuthenticationOptionsDetails>(
                            AwsEc2ClientVpnEndpointAuthenticationOptionsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ConnectionLogOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setConnectionLogOptions(AwsEc2ClientVpnEndpointConnectionLogOptionsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIdSet", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setSecurityGroupIdSet(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelfServicePortalUrl", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setSelfServicePortalUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientConnectOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setClientConnectOptions(AwsEc2ClientVpnEndpointClientConnectOptionsDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("SessionTimeoutHours", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setSessionTimeoutHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ClientLoginBannerOptions", targetDepth)) {
                    context.nextToken();
                    awsEc2ClientVpnEndpointDetails.setClientLoginBannerOptions(AwsEc2ClientVpnEndpointClientLoginBannerOptionsDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2ClientVpnEndpointDetails;
    }

    private static AwsEc2ClientVpnEndpointDetailsJsonUnmarshaller instance;

    public static AwsEc2ClientVpnEndpointDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2ClientVpnEndpointDetailsJsonUnmarshaller();
        return instance;
    }
}
