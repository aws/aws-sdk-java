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
 * CreateEnvironmentResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentResultStaxUnmarshaller implements Unmarshaller<CreateEnvironmentResult, StaxUnmarshallerContext> {

    public CreateEnvironmentResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateEnvironmentResult createEnvironmentResult = new CreateEnvironmentResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return createEnvironmentResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EnvironmentName", targetDepth)) {
                    createEnvironmentResult.setEnvironmentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentId", targetDepth)) {
                    createEnvironmentResult.setEnvironmentId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationName", targetDepth)) {
                    createEnvironmentResult.setApplicationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VersionLabel", targetDepth)) {
                    createEnvironmentResult.setVersionLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SolutionStackName", targetDepth)) {
                    createEnvironmentResult.setSolutionStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformArn", targetDepth)) {
                    createEnvironmentResult.setPlatformArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TemplateName", targetDepth)) {
                    createEnvironmentResult.setTemplateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    createEnvironmentResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointURL", targetDepth)) {
                    createEnvironmentResult.setEndpointURL(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CNAME", targetDepth)) {
                    createEnvironmentResult.setCNAME(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateCreated", targetDepth)) {
                    createEnvironmentResult.setDateCreated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateUpdated", targetDepth)) {
                    createEnvironmentResult.setDateUpdated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    createEnvironmentResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AbortableOperationInProgress", targetDepth)) {
                    createEnvironmentResult.setAbortableOperationInProgress(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Health", targetDepth)) {
                    createEnvironmentResult.setHealth(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthStatus", targetDepth)) {
                    createEnvironmentResult.setHealthStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Resources", targetDepth)) {
                    createEnvironmentResult.setResources(EnvironmentResourcesDescriptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tier", targetDepth)) {
                    createEnvironmentResult.setTier(EnvironmentTierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentLinks", targetDepth)) {
                    createEnvironmentResult.withEnvironmentLinks(new ArrayList<EnvironmentLink>());
                    continue;
                }

                if (context.testExpression("EnvironmentLinks/member", targetDepth)) {
                    createEnvironmentResult.withEnvironmentLinks(EnvironmentLinkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentArn", targetDepth)) {
                    createEnvironmentResult.setEnvironmentArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createEnvironmentResult;
                }
            }
        }
    }

    private static CreateEnvironmentResultStaxUnmarshaller instance;

    public static CreateEnvironmentResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateEnvironmentResultStaxUnmarshaller();
        return instance;
    }
}
