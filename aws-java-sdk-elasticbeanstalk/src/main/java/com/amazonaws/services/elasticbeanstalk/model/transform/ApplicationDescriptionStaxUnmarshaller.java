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
 * ApplicationDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationDescriptionStaxUnmarshaller implements Unmarshaller<ApplicationDescription, StaxUnmarshallerContext> {

    public ApplicationDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        ApplicationDescription applicationDescription = new ApplicationDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return applicationDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ApplicationArn", targetDepth)) {
                    applicationDescription.setApplicationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationName", targetDepth)) {
                    applicationDescription.setApplicationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    applicationDescription.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateCreated", targetDepth)) {
                    applicationDescription.setDateCreated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateUpdated", targetDepth)) {
                    applicationDescription.setDateUpdated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Versions", targetDepth)) {
                    applicationDescription.withVersions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Versions/member", targetDepth)) {
                    applicationDescription.withVersions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ConfigurationTemplates", targetDepth)) {
                    applicationDescription.withConfigurationTemplates(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ConfigurationTemplates/member", targetDepth)) {
                    applicationDescription.withConfigurationTemplates(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceLifecycleConfig", targetDepth)) {
                    applicationDescription.setResourceLifecycleConfig(ApplicationResourceLifecycleConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return applicationDescription;
                }
            }
        }
    }

    private static ApplicationDescriptionStaxUnmarshaller instance;

    public static ApplicationDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationDescriptionStaxUnmarshaller();
        return instance;
    }
}
