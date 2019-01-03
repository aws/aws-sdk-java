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
 * LaunchTemplateVersion StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchTemplateVersionStaxUnmarshaller implements Unmarshaller<LaunchTemplateVersion, StaxUnmarshallerContext> {

    public LaunchTemplateVersion unmarshall(StaxUnmarshallerContext context) throws Exception {
        LaunchTemplateVersion launchTemplateVersion = new LaunchTemplateVersion();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return launchTemplateVersion;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("launchTemplateId", targetDepth)) {
                    launchTemplateVersion.setLaunchTemplateId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchTemplateName", targetDepth)) {
                    launchTemplateVersion.setLaunchTemplateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("versionNumber", targetDepth)) {
                    launchTemplateVersion.setVersionNumber(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("versionDescription", targetDepth)) {
                    launchTemplateVersion.setVersionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createTime", targetDepth)) {
                    launchTemplateVersion.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("createdBy", targetDepth)) {
                    launchTemplateVersion.setCreatedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("defaultVersion", targetDepth)) {
                    launchTemplateVersion.setDefaultVersion(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("launchTemplateData", targetDepth)) {
                    launchTemplateVersion.setLaunchTemplateData(ResponseLaunchTemplateDataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return launchTemplateVersion;
                }
            }
        }
    }

    private static LaunchTemplateVersionStaxUnmarshaller instance;

    public static LaunchTemplateVersionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchTemplateVersionStaxUnmarshaller();
        return instance;
    }
}
