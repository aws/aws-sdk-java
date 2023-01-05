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
 * AwsWafv2WebAclDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2WebAclDetailsJsonUnmarshaller implements Unmarshaller<AwsWafv2WebAclDetails, JsonUnmarshallerContext> {

    public AwsWafv2WebAclDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsWafv2WebAclDetails awsWafv2WebAclDetails = new AwsWafv2WebAclDetails();

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
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManagedbyFirewallManager", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setManagedbyFirewallManager(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Capacity", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setCapacity(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CaptchaConfig", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setCaptchaConfig(AwsWafv2WebAclCaptchaConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultAction", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setDefaultAction(AwsWafv2WebAclActionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setRules(new ListUnmarshaller<AwsWafv2RulesDetails>(AwsWafv2RulesDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VisibilityConfig", targetDepth)) {
                    context.nextToken();
                    awsWafv2WebAclDetails.setVisibilityConfig(AwsWafv2VisibilityConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsWafv2WebAclDetails;
    }

    private static AwsWafv2WebAclDetailsJsonUnmarshaller instance;

    public static AwsWafv2WebAclDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsWafv2WebAclDetailsJsonUnmarshaller();
        return instance;
    }
}
