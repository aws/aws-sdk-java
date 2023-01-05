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
 * AwsWafv2RulesActionCaptchaDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsWafv2RulesActionCaptchaDetailsJsonUnmarshaller implements Unmarshaller<AwsWafv2RulesActionCaptchaDetails, JsonUnmarshallerContext> {

    public AwsWafv2RulesActionCaptchaDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsWafv2RulesActionCaptchaDetails awsWafv2RulesActionCaptchaDetails = new AwsWafv2RulesActionCaptchaDetails();

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
                if (context.testExpression("CustomRequestHandling", targetDepth)) {
                    context.nextToken();
                    awsWafv2RulesActionCaptchaDetails.setCustomRequestHandling(AwsWafv2CustomRequestHandlingDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsWafv2RulesActionCaptchaDetails;
    }

    private static AwsWafv2RulesActionCaptchaDetailsJsonUnmarshaller instance;

    public static AwsWafv2RulesActionCaptchaDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsWafv2RulesActionCaptchaDetailsJsonUnmarshaller();
        return instance;
    }
}
