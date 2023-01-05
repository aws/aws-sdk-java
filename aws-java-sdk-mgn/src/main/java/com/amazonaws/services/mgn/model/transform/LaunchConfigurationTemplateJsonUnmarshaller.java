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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LaunchConfigurationTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LaunchConfigurationTemplateJsonUnmarshaller implements Unmarshaller<LaunchConfigurationTemplate, JsonUnmarshallerContext> {

    public LaunchConfigurationTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        LaunchConfigurationTemplate launchConfigurationTemplate = new LaunchConfigurationTemplate();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatePublicIpAddress", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setAssociatePublicIpAddress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("bootMode", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setBootMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("copyPrivateIp", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setCopyPrivateIp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("copyTags", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setCopyTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ec2LaunchTemplateID", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setEc2LaunchTemplateID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableMapAutoTagging", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setEnableMapAutoTagging(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("largeVolumeConf", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setLargeVolumeConf(LaunchTemplateDiskConfJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("launchConfigurationTemplateID", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setLaunchConfigurationTemplateID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchDisposition", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setLaunchDisposition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licensing", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setLicensing(LicensingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapAutoTaggingMpeID", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setMapAutoTaggingMpeID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("postLaunchActions", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setPostLaunchActions(PostLaunchActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("smallVolumeConf", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setSmallVolumeConf(LaunchTemplateDiskConfJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("smallVolumeMaxSize", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setSmallVolumeMaxSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("targetInstanceTypeRightSizingMethod", targetDepth)) {
                    context.nextToken();
                    launchConfigurationTemplate.setTargetInstanceTypeRightSizingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return launchConfigurationTemplate;
    }

    private static LaunchConfigurationTemplateJsonUnmarshaller instance;

    public static LaunchConfigurationTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LaunchConfigurationTemplateJsonUnmarshaller();
        return instance;
    }
}
