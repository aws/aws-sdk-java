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
 * VpcIpv6CidrBlockAssociation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcIpv6CidrBlockAssociationStaxUnmarshaller implements Unmarshaller<VpcIpv6CidrBlockAssociation, StaxUnmarshallerContext> {

    public VpcIpv6CidrBlockAssociation unmarshall(StaxUnmarshallerContext context) throws Exception {
        VpcIpv6CidrBlockAssociation vpcIpv6CidrBlockAssociation = new VpcIpv6CidrBlockAssociation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return vpcIpv6CidrBlockAssociation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("associationId", targetDepth)) {
                    vpcIpv6CidrBlockAssociation.setAssociationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6CidrBlock", targetDepth)) {
                    vpcIpv6CidrBlockAssociation.setIpv6CidrBlock(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ipv6CidrBlockState", targetDepth)) {
                    vpcIpv6CidrBlockAssociation.setIpv6CidrBlockState(VpcCidrBlockStateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return vpcIpv6CidrBlockAssociation;
                }
            }
        }
    }

    private static VpcIpv6CidrBlockAssociationStaxUnmarshaller instance;

    public static VpcIpv6CidrBlockAssociationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcIpv6CidrBlockAssociationStaxUnmarshaller();
        return instance;
    }
}
