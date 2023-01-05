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
 * CreateLaunchConfigurationTemplateResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLaunchConfigurationTemplateResultJsonUnmarshaller implements Unmarshaller<CreateLaunchConfigurationTemplateResult, JsonUnmarshallerContext> {

    public CreateLaunchConfigurationTemplateResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateLaunchConfigurationTemplateResult createLaunchConfigurationTemplateResult = new CreateLaunchConfigurationTemplateResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createLaunchConfigurationTemplateResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatePublicIpAddress", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setAssociatePublicIpAddress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("bootMode", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setBootMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("copyPrivateIp", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setCopyPrivateIp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("copyTags", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setCopyTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ec2LaunchTemplateID", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setEc2LaunchTemplateID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableMapAutoTagging", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setEnableMapAutoTagging(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("largeVolumeConf", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setLargeVolumeConf(LaunchTemplateDiskConfJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("launchConfigurationTemplateID", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setLaunchConfigurationTemplateID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchDisposition", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setLaunchDisposition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licensing", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setLicensing(LicensingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapAutoTaggingMpeID", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setMapAutoTaggingMpeID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("postLaunchActions", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setPostLaunchActions(PostLaunchActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("smallVolumeConf", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setSmallVolumeConf(LaunchTemplateDiskConfJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("smallVolumeMaxSize", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setSmallVolumeMaxSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("targetInstanceTypeRightSizingMethod", targetDepth)) {
                    context.nextToken();
                    createLaunchConfigurationTemplateResult.setTargetInstanceTypeRightSizingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createLaunchConfigurationTemplateResult;
    }

    private static CreateLaunchConfigurationTemplateResultJsonUnmarshaller instance;

    public static CreateLaunchConfigurationTemplateResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateLaunchConfigurationTemplateResultJsonUnmarshaller();
        return instance;
    }
}
