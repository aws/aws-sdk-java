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
 * AwsEc2VpcPeeringConnectionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VpcPeeringConnectionDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2VpcPeeringConnectionDetails, JsonUnmarshallerContext> {

    public AwsEc2VpcPeeringConnectionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2VpcPeeringConnectionDetails awsEc2VpcPeeringConnectionDetails = new AwsEc2VpcPeeringConnectionDetails();

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
                if (context.testExpression("AccepterVpcInfo", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionDetails.setAccepterVpcInfo(AwsEc2VpcPeeringConnectionVpcInfoDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ExpirationTime", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionDetails.setExpirationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequesterVpcInfo", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionDetails.setRequesterVpcInfo(AwsEc2VpcPeeringConnectionVpcInfoDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionDetails.setStatus(AwsEc2VpcPeeringConnectionStatusDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcPeeringConnectionId", targetDepth)) {
                    context.nextToken();
                    awsEc2VpcPeeringConnectionDetails.setVpcPeeringConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2VpcPeeringConnectionDetails;
    }

    private static AwsEc2VpcPeeringConnectionDetailsJsonUnmarshaller instance;

    public static AwsEc2VpcPeeringConnectionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2VpcPeeringConnectionDetailsJsonUnmarshaller();
        return instance;
    }
}
