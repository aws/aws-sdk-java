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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OriginRequestPolicyConfig StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginRequestPolicyConfigStaxUnmarshaller implements Unmarshaller<OriginRequestPolicyConfig, StaxUnmarshallerContext> {

    public OriginRequestPolicyConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        OriginRequestPolicyConfig originRequestPolicyConfig = new OriginRequestPolicyConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return originRequestPolicyConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Comment", targetDepth)) {
                    originRequestPolicyConfig.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    originRequestPolicyConfig.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HeadersConfig", targetDepth)) {
                    originRequestPolicyConfig.setHeadersConfig(OriginRequestPolicyHeadersConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CookiesConfig", targetDepth)) {
                    originRequestPolicyConfig.setCookiesConfig(OriginRequestPolicyCookiesConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("QueryStringsConfig", targetDepth)) {
                    originRequestPolicyConfig.setQueryStringsConfig(OriginRequestPolicyQueryStringsConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return originRequestPolicyConfig;
                }
            }
        }
    }

    private static OriginRequestPolicyConfigStaxUnmarshaller instance;

    public static OriginRequestPolicyConfigStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OriginRequestPolicyConfigStaxUnmarshaller();
        return instance;
    }
}
