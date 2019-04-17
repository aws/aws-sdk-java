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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ServiceDetail StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceDetailStaxUnmarshaller implements Unmarshaller<ServiceDetail, StaxUnmarshallerContext> {

    public ServiceDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        ServiceDetail serviceDetail = new ServiceDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return serviceDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("serviceName", targetDepth)) {
                    serviceDetail.setServiceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serviceType", targetDepth)) {
                    serviceDetail.withServiceType(new ArrayList<ServiceTypeDetail>());
                    continue;
                }

                if (context.testExpression("serviceType/item", targetDepth)) {
                    serviceDetail.withServiceType(ServiceTypeDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZoneSet", targetDepth)) {
                    serviceDetail.withAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("availabilityZoneSet/item", targetDepth)) {
                    serviceDetail.withAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("owner", targetDepth)) {
                    serviceDetail.setOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("baseEndpointDnsNameSet", targetDepth)) {
                    serviceDetail.withBaseEndpointDnsNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("baseEndpointDnsNameSet/item", targetDepth)) {
                    serviceDetail.withBaseEndpointDnsNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateDnsName", targetDepth)) {
                    serviceDetail.setPrivateDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("vpcEndpointPolicySupported", targetDepth)) {
                    serviceDetail.setVpcEndpointPolicySupported(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceptanceRequired", targetDepth)) {
                    serviceDetail.setAcceptanceRequired(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("managesVpcEndpoints", targetDepth)) {
                    serviceDetail.setManagesVpcEndpoints(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return serviceDetail;
                }
            }
        }
    }

    private static ServiceDetailStaxUnmarshaller instance;

    public static ServiceDetailStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceDetailStaxUnmarshaller();
        return instance;
    }
}
