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
 * AwsRoute53HostedZoneDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRoute53HostedZoneDetailsJsonUnmarshaller implements Unmarshaller<AwsRoute53HostedZoneDetails, JsonUnmarshallerContext> {

    public AwsRoute53HostedZoneDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRoute53HostedZoneDetails awsRoute53HostedZoneDetails = new AwsRoute53HostedZoneDetails();

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
                if (context.testExpression("HostedZone", targetDepth)) {
                    context.nextToken();
                    awsRoute53HostedZoneDetails.setHostedZone(AwsRoute53HostedZoneObjectDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Vpcs", targetDepth)) {
                    context.nextToken();
                    awsRoute53HostedZoneDetails.setVpcs(new ListUnmarshaller<AwsRoute53HostedZoneVpcDetails>(AwsRoute53HostedZoneVpcDetailsJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NameServers", targetDepth)) {
                    context.nextToken();
                    awsRoute53HostedZoneDetails.setNameServers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("QueryLoggingConfig", targetDepth)) {
                    context.nextToken();
                    awsRoute53HostedZoneDetails.setQueryLoggingConfig(AwsRoute53QueryLoggingConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsRoute53HostedZoneDetails;
    }

    private static AwsRoute53HostedZoneDetailsJsonUnmarshaller instance;

    public static AwsRoute53HostedZoneDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRoute53HostedZoneDetailsJsonUnmarshaller();
        return instance;
    }
}
