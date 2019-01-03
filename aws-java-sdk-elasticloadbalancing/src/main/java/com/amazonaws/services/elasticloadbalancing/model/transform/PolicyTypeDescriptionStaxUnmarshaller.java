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
 * PolicyTypeDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyTypeDescriptionStaxUnmarshaller implements Unmarshaller<PolicyTypeDescription, StaxUnmarshallerContext> {

    public PolicyTypeDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        PolicyTypeDescription policyTypeDescription = new PolicyTypeDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return policyTypeDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PolicyTypeName", targetDepth)) {
                    policyTypeDescription.setPolicyTypeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    policyTypeDescription.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PolicyAttributeTypeDescriptions", targetDepth)) {
                    policyTypeDescription.withPolicyAttributeTypeDescriptions(new ArrayList<PolicyAttributeTypeDescription>());
                    continue;
                }

                if (context.testExpression("PolicyAttributeTypeDescriptions/member", targetDepth)) {
                    policyTypeDescription.withPolicyAttributeTypeDescriptions(PolicyAttributeTypeDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return policyTypeDescription;
                }
            }
        }
    }

    private static PolicyTypeDescriptionStaxUnmarshaller instance;

    public static PolicyTypeDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PolicyTypeDescriptionStaxUnmarshaller();
        return instance;
    }
}
