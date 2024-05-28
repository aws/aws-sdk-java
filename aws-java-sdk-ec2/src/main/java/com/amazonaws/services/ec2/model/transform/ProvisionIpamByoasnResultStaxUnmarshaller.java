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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ProvisionIpamByoasnResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionIpamByoasnResultStaxUnmarshaller implements Unmarshaller<ProvisionIpamByoasnResult, StaxUnmarshallerContext> {

    public ProvisionIpamByoasnResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ProvisionIpamByoasnResult provisionIpamByoasnResult = new ProvisionIpamByoasnResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return provisionIpamByoasnResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("byoasn", targetDepth)) {
                    provisionIpamByoasnResult.setByoasn(ByoasnStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return provisionIpamByoasnResult;
                }
            }
        }
    }

    private static ProvisionIpamByoasnResultStaxUnmarshaller instance;

    public static ProvisionIpamByoasnResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionIpamByoasnResultStaxUnmarshaller();
        return instance;
    }
}
