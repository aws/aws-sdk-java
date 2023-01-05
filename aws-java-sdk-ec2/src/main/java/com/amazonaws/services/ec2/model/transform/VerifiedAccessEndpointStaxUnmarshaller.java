/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * VerifiedAccessEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifiedAccessEndpointStaxUnmarshaller implements Unmarshaller<VerifiedAccessEndpoint, StaxUnmarshallerContext> {

    public VerifiedAccessEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        VerifiedAccessEndpoint verifiedAccessEndpoint = new VerifiedAccessEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return verifiedAccessEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("verifiedAccessInstanceId", targetDepth)) {
                    verifiedAccessEndpoint.setVerifiedAccessInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("verifiedAccessGroupId", targetDepth)) {
                    verifiedAccessEndpoint.setVerifiedAccessGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("verifiedAccessEndpointId", targetDepth)) {
                    verifiedAccessEndpoint.setVerifiedAccessEndpointId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("applicationDomain", targetDepth)) {
                    verifiedAccessEndpoint.setApplicationDomain(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("endpointType", targetDepth)) {
                    verifiedAccessEndpoint.setEndpointType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("attachmentType", targetDepth)) {
                    verifiedAccessEndpoint.setAttachmentType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("domainCertificateArn", targetDepth)) {
                    verifiedAccessEndpoint.setDomainCertificateArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("endpointDomain", targetDepth)) {
                    verifiedAccessEndpoint.setEndpointDomain(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deviceValidationDomain", targetDepth)) {
                    verifiedAccessEndpoint.setDeviceValidationDomain(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("securityGroupIdSet", targetDepth)) {
                    verifiedAccessEndpoint.withSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("securityGroupIdSet/item", targetDepth)) {
                    verifiedAccessEndpoint.withSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("loadBalancerOptions", targetDepth)) {
                    verifiedAccessEndpoint.setLoadBalancerOptions(VerifiedAccessEndpointLoadBalancerOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkInterfaceOptions", targetDepth)) {
                    verifiedAccessEndpoint.setNetworkInterfaceOptions(VerifiedAccessEndpointEniOptionsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    verifiedAccessEndpoint.setStatus(VerifiedAccessEndpointStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    verifiedAccessEndpoint.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    verifiedAccessEndpoint.setCreationTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    verifiedAccessEndpoint.setLastUpdatedTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deletionTime", targetDepth)) {
                    verifiedAccessEndpoint.setDeletionTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    verifiedAccessEndpoint.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    verifiedAccessEndpoint.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return verifiedAccessEndpoint;
                }
            }
        }
    }

    private static VerifiedAccessEndpointStaxUnmarshaller instance;

    public static VerifiedAccessEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new VerifiedAccessEndpointStaxUnmarshaller();
        return instance;
    }
}
