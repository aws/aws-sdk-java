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
 * UpdateConfigurationTemplateResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationTemplateResultStaxUnmarshaller implements Unmarshaller<UpdateConfigurationTemplateResult, StaxUnmarshallerContext> {

    public UpdateConfigurationTemplateResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        UpdateConfigurationTemplateResult updateConfigurationTemplateResult = new UpdateConfigurationTemplateResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return updateConfigurationTemplateResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SolutionStackName", targetDepth)) {
                    updateConfigurationTemplateResult.setSolutionStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PlatformArn", targetDepth)) {
                    updateConfigurationTemplateResult.setPlatformArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationName", targetDepth)) {
                    updateConfigurationTemplateResult.setApplicationName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TemplateName", targetDepth)) {
                    updateConfigurationTemplateResult.setTemplateName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    updateConfigurationTemplateResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EnvironmentName", targetDepth)) {
                    updateConfigurationTemplateResult.setEnvironmentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DeploymentStatus", targetDepth)) {
                    updateConfigurationTemplateResult.setDeploymentStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateCreated", targetDepth)) {
                    updateConfigurationTemplateResult.setDateCreated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DateUpdated", targetDepth)) {
                    updateConfigurationTemplateResult.setDateUpdated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionSettings", targetDepth)) {
                    updateConfigurationTemplateResult.withOptionSettings(new ArrayList<ConfigurationOptionSetting>());
                    continue;
                }

                if (context.testExpression("OptionSettings/member", targetDepth)) {
                    updateConfigurationTemplateResult.withOptionSettings(ConfigurationOptionSettingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return updateConfigurationTemplateResult;
                }
            }
        }
    }

    private static UpdateConfigurationTemplateResultStaxUnmarshaller instance;

    public static UpdateConfigurationTemplateResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateConfigurationTemplateResultStaxUnmarshaller();
        return instance;
    }
}
