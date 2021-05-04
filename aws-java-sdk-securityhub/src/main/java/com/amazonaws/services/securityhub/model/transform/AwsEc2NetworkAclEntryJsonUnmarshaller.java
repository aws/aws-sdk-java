/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * AwsEc2NetworkAclEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkAclEntryJsonUnmarshaller implements Unmarshaller<AwsEc2NetworkAclEntry, JsonUnmarshallerContext> {

    public AwsEc2NetworkAclEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2NetworkAclEntry awsEc2NetworkAclEntry = new AwsEc2NetworkAclEntry();

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
                if (context.testExpression("CidrBlock", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Egress", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setEgress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IcmpTypeCode", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setIcmpTypeCode(IcmpTypeCodeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ipv6CidrBlock", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setIpv6CidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PortRange", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setPortRange(PortRangeFromToJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Protocol", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleAction", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setRuleAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleNumber", targetDepth)) {
                    context.nextToken();
                    awsEc2NetworkAclEntry.setRuleNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2NetworkAclEntry;
    }

    private static AwsEc2NetworkAclEntryJsonUnmarshaller instance;

    public static AwsEc2NetworkAclEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2NetworkAclEntryJsonUnmarshaller();
        return instance;
    }
}
