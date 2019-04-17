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
 * ServiceConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConfigurationStaxUnmarshaller implements Unmarshaller<ServiceConfiguration, StaxUnmarshallerContext> {

    public ServiceConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        ServiceConfiguration serviceConfiguration = new ServiceConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return serviceConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("serviceType", targetDepth)) {
                    serviceConfiguration.withServiceType(new ArrayList<ServiceTypeDetail>());
                    continue;
                }

                if (context.testExpression("serviceType/item", targetDepth)) {
                    serviceConfiguration.withServiceType(ServiceTypeDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serviceId", targetDepth)) {
                    serviceConfiguration.setServiceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serviceName", targetDepth)) {
                    serviceConfiguration.setServiceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("serviceState", targetDepth)) {
                    serviceConfiguration.setServiceState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZoneSet", targetDepth)) {
                    serviceConfiguration.withAvailabilityZones(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("availabilityZoneSet/item", targetDepth)) {
                    serviceConfiguration.withAvailabilityZones(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("acceptanceRequired", targetDepth)) {
                    serviceConfiguration.setAcceptanceRequired(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("managesVpcEndpoints", targetDepth)) {
                    serviceConfiguration.setManagesVpcEndpoints(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkLoadBalancerArnSet", targetDepth)) {
                    serviceConfiguration.withNetworkLoadBalancerArns(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("networkLoadBalancerArnSet/item", targetDepth)) {
                    serviceConfiguration.withNetworkLoadBalancerArns(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("baseEndpointDnsNameSet", targetDepth)) {
                    serviceConfiguration.withBaseEndpointDnsNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("baseEndpointDnsNameSet/item", targetDepth)) {
                    serviceConfiguration.withBaseEndpointDnsNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateDnsName", targetDepth)) {
                    serviceConfiguration.setPrivateDnsName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return serviceConfiguration;
                }
            }
        }
    }

    private static ServiceConfigurationStaxUnmarshaller instance;

    public static ServiceConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceConfigurationStaxUnmarshaller();
        return instance;
    }
}
