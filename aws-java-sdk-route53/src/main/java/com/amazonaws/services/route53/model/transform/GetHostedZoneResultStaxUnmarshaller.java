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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetHostedZoneResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostedZoneResultStaxUnmarshaller implements Unmarshaller<GetHostedZoneResult, StaxUnmarshallerContext> {

    public GetHostedZoneResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetHostedZoneResult getHostedZoneResult = new GetHostedZoneResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getHostedZoneResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("HostedZone", targetDepth)) {
                    getHostedZoneResult.setHostedZone(HostedZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DelegationSet", targetDepth)) {
                    getHostedZoneResult.setDelegationSet(DelegationSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VPCs", targetDepth)) {
                    getHostedZoneResult.withVPCs(new ArrayList<VPC>());
                    continue;
                }

                if (context.testExpression("VPCs/VPC", targetDepth)) {
                    getHostedZoneResult.withVPCs(VPCStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getHostedZoneResult;
                }
            }
        }
    }

    private static GetHostedZoneResultStaxUnmarshaller instance;

    public static GetHostedZoneResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetHostedZoneResultStaxUnmarshaller();
        return instance;
    }
}
