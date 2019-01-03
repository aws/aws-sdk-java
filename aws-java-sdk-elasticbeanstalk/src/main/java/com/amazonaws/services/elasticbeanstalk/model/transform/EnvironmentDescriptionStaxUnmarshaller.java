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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EnvironmentDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentDescriptionStaxUnmarshaller implements Unmarshaller<EnvironmentDescription, StaxUnmarshallerContext> {

    public EnvironmentDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        EnvironmentDescription environmentDescription = new EnvironmentDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return environmentDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EnvironmentName", targetDepth)) {
                    environmentDescription.setEnvironmentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentId", targetDepth)) {
                    environmentDescription.setEnvironmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationName", targetDepth)) {
                    environmentDescription.setApplicationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VersionLabel", targetDepth)) {
                    environmentDescription.setVersionLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SolutionStackName", targetDepth)) {
                    environmentDescription.setSolutionStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformArn", targetDepth)) {
                    environmentDescription.setPlatformArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TemplateName", targetDepth)) {
                    environmentDescription.setTemplateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    environmentDescription.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointURL", targetDepth)) {
                    environmentDescription.setEndpointURL(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CNAME", targetDepth)) {
                    environmentDescription.setCNAME(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateCreated", targetDepth)) {
                    environmentDescription.setDateCreated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateUpdated", targetDepth)) {
                    environmentDescription.setDateUpdated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    environmentDescription.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AbortableOperationInProgress", targetDepth)) {
                    environmentDescription.setAbortableOperationInProgress(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Health", targetDepth)) {
                    environmentDescription.setHealth(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthStatus", targetDepth)) {
                    environmentDescription.setHealthStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Resources", targetDepth)) {
                    environmentDescription.setResources(EnvironmentResourcesDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tier", targetDepth)) {
                    environmentDescription.setTier(EnvironmentTierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentLinks", targetDepth)) {
                    environmentDescription.withEnvironmentLinks(new ArrayList<EnvironmentLink>());
                    continue;
                }

                if (context.testExpression("EnvironmentLinks/member", targetDepth)) {
                    environmentDescription.withEnvironmentLinks(EnvironmentLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentArn", targetDepth)) {
                    environmentDescription.setEnvironmentArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return environmentDescription;
                }
            }
        }
    }

    private static EnvironmentDescriptionStaxUnmarshaller instance;

    public static EnvironmentDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentDescriptionStaxUnmarshaller();
        return instance;
    }
}
