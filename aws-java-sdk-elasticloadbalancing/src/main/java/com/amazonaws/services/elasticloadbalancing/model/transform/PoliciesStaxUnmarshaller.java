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
package com.amazonaws.services.elasticloadbalancing.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Policies StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PoliciesStaxUnmarshaller implements Unmarshaller<Policies, StaxUnmarshallerContext> {

    public Policies unmarshall(StaxUnmarshallerContext context) throws Exception {
        Policies policies = new Policies();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return policies;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AppCookieStickinessPolicies", targetDepth)) {
                    policies.withAppCookieStickinessPolicies(new ArrayList<AppCookieStickinessPolicy>());
                    continue;
                }

                if (context.testExpression("AppCookieStickinessPolicies/member", targetDepth)) {
                    policies.withAppCookieStickinessPolicies(AppCookieStickinessPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LBCookieStickinessPolicies", targetDepth)) {
                    policies.withLBCookieStickinessPolicies(new ArrayList<LBCookieStickinessPolicy>());
                    continue;
                }

                if (context.testExpression("LBCookieStickinessPolicies/member", targetDepth)) {
                    policies.withLBCookieStickinessPolicies(LBCookieStickinessPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OtherPolicies", targetDepth)) {
                    policies.withOtherPolicies(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("OtherPolicies/member", targetDepth)) {
                    policies.withOtherPolicies(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return policies;
                }
            }
        }
    }

    private static PoliciesStaxUnmarshaller instance;

    public static PoliciesStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PoliciesStaxUnmarshaller();
        return instance;
    }
}
