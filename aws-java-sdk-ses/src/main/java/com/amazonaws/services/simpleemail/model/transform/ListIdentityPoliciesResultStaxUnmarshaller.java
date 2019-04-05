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
package com.amazonaws.services.simpleemail.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ListIdentityPoliciesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIdentityPoliciesResultStaxUnmarshaller implements Unmarshaller<ListIdentityPoliciesResult, StaxUnmarshallerContext> {

    public ListIdentityPoliciesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ListIdentityPoliciesResult listIdentityPoliciesResult = new ListIdentityPoliciesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return listIdentityPoliciesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PolicyNames", targetDepth)) {
                    listIdentityPoliciesResult.withPolicyNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("PolicyNames/member", targetDepth)) {
                    listIdentityPoliciesResult.withPolicyNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return listIdentityPoliciesResult;
                }
            }
        }
    }

    private static ListIdentityPoliciesResultStaxUnmarshaller instance;

    public static ListIdentityPoliciesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListIdentityPoliciesResultStaxUnmarshaller();
        return instance;
    }
}
