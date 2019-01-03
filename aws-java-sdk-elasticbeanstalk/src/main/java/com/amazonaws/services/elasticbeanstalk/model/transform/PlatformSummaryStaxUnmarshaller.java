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
 * PlatformSummary StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlatformSummaryStaxUnmarshaller implements Unmarshaller<PlatformSummary, StaxUnmarshallerContext> {

    public PlatformSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        PlatformSummary platformSummary = new PlatformSummary();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return platformSummary;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PlatformArn", targetDepth)) {
                    platformSummary.setPlatformArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformOwner", targetDepth)) {
                    platformSummary.setPlatformOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformStatus", targetDepth)) {
                    platformSummary.setPlatformStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformCategory", targetDepth)) {
                    platformSummary.setPlatformCategory(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OperatingSystemName", targetDepth)) {
                    platformSummary.setOperatingSystemName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OperatingSystemVersion", targetDepth)) {
                    platformSummary.setOperatingSystemVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedTierList", targetDepth)) {
                    platformSummary.withSupportedTierList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedTierList/member", targetDepth)) {
                    platformSummary.withSupportedTierList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SupportedAddonList", targetDepth)) {
                    platformSummary.withSupportedAddonList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SupportedAddonList/member", targetDepth)) {
                    platformSummary.withSupportedAddonList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return platformSummary;
                }
            }
        }
    }

    private static PlatformSummaryStaxUnmarshaller instance;

    public static PlatformSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PlatformSummaryStaxUnmarshaller();
        return instance;
    }
}
