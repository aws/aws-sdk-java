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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TransitGatewayVpcAttachmentOptions StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayVpcAttachmentOptionsStaxUnmarshaller implements Unmarshaller<TransitGatewayVpcAttachmentOptions, StaxUnmarshallerContext> {

    public TransitGatewayVpcAttachmentOptions unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayVpcAttachmentOptions transitGatewayVpcAttachmentOptions = new TransitGatewayVpcAttachmentOptions();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayVpcAttachmentOptions;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("dnsSupport", targetDepth)) {
                    transitGatewayVpcAttachmentOptions.setDnsSupport(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6Support", targetDepth)) {
                    transitGatewayVpcAttachmentOptions.setIpv6Support(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayVpcAttachmentOptions;
                }
            }
        }
    }

    private static TransitGatewayVpcAttachmentOptionsStaxUnmarshaller instance;

    public static TransitGatewayVpcAttachmentOptionsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayVpcAttachmentOptionsStaxUnmarshaller();
        return instance;
    }
}
