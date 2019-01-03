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
 * PlatformDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformDescriptionStaxUnmarshaller implements Unmarshaller<PlatformDescription, StaxUnmarshallerContext> {

    public PlatformDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        PlatformDescription platformDescription = new PlatformDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return platformDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PlatformArn", targetDepth)) {
                    platformDescription.setPlatformArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformOwner", targetDepth)) {
                    platformDescription.setPlatformOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformName", targetDepth)) {
                    platformDescription.setPlatformName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformVersion", targetDepth)) {
                    platformDescription.setPlatformVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SolutionStackName", targetDepth)) {
                    platformDescription.setSolutionStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformStatus", targetDepth)) {
                    platformDescription.setPlatformStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateCreated", targetDepth)) {
                    platformDescription.setDateCreated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateUpdated", targetDepth)) {
                    platformDescription.setDateUpdated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformCategory", targetDepth)) {
                    platformDescription.setPlatformCategory(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    platformDescription.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Maintainer", targetDepth)) {
                    platformDescription.setMaintainer(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OperatingSystemName", targetDepth)) {
                    platformDescription.setOperatingSystemName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OperatingSystemVersion", targetDepth)) {
                    platformDescription.setOperatingSystemVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgrammingLanguages", targetDepth)) {
                    platformDescription.withProgrammingLanguages(new ArrayList<PlatformProgrammingLanguage>());
                    continue;
                }

                if (context.testExpression("ProgrammingLanguages/member", targetDepth)) {
                    platformDescription.withProgrammingLanguages(PlatformProgrammingLanguageStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Frameworks", targetDepth)) {
                    platformDescription.withFrameworks(new ArrayList<PlatformFramework>());
                    continue;
                }

                if (context.testExpression("Frameworks/member", targetDepth)) {
                    platformDescription.withFrameworks(PlatformFrameworkStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomAmiList", targetDepth)) {
                    platformDescription.withCustomAmiList(new ArrayList<CustomAmi>());
                    continue;
                }

                if (context.testExpression("CustomAmiList/member", targetDepth)) {
                    platformDescription.withCustomAmiList(CustomAmiStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTierList", targetDepth)) {
                    platformDescription.withSupportedTierList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedTierList/member", targetDepth)) {
                    platformDescription.withSupportedTierList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedAddonList", targetDepth)) {
                    platformDescription.withSupportedAddonList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedAddonList/member", targetDepth)) {
                    platformDescription.withSupportedAddonList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return platformDescription;
                }
            }
        }
    }

    private static PlatformDescriptionStaxUnmarshaller instance;

    public static PlatformDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlatformDescriptionStaxUnmarshaller();
        return instance;
    }
}
