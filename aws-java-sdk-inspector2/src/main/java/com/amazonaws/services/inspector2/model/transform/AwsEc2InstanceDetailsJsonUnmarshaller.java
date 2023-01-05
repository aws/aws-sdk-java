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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2InstanceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2InstanceDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2InstanceDetails, JsonUnmarshallerContext> {

    public AwsEc2InstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2InstanceDetails awsEc2InstanceDetails = new AwsEc2InstanceDetails();

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
                if (context.testExpression("iamInstanceProfileArn", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setIamInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageId", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipV4Addresses", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setIpV4Addresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ipV6Addresses", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setIpV6Addresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("keyName", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchedAt", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setLaunchedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnetId", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcId", targetDepth)) {
                    context.nextToken();
                    awsEc2InstanceDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2InstanceDetails;
    }

    private static AwsEc2InstanceDetailsJsonUnmarshaller instance;

    public static AwsEc2InstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2InstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
