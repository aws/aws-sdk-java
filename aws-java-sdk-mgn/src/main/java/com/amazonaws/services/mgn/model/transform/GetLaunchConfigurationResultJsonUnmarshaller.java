/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetLaunchConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLaunchConfigurationResultJsonUnmarshaller implements Unmarshaller<GetLaunchConfigurationResult, JsonUnmarshallerContext> {

    public GetLaunchConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLaunchConfigurationResult getLaunchConfigurationResult = new GetLaunchConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLaunchConfigurationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("copyPrivateIp", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setCopyPrivateIp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("copyTags", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setCopyTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ec2LaunchTemplateID", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setEc2LaunchTemplateID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchDisposition", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setLaunchDisposition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licensing", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setLicensing(LicensingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetInstanceTypeRightSizingMethod", targetDepth)) {
                    context.nextToken();
                    getLaunchConfigurationResult.setTargetInstanceTypeRightSizingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getLaunchConfigurationResult;
    }

    private static GetLaunchConfigurationResultJsonUnmarshaller instance;

    public static GetLaunchConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLaunchConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
