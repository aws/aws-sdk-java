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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEc2LaunchTemplateDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2LaunchTemplateDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2LaunchTemplateDetails, JsonUnmarshallerContext> {

    public AwsEc2LaunchTemplateDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2LaunchTemplateDetails awsEc2LaunchTemplateDetails = new AwsEc2LaunchTemplateDetails();

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
                if (context.testExpression("LaunchTemplateName", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDetails.setLaunchTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDetails.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchTemplateData", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDetails.setLaunchTemplateData(AwsEc2LaunchTemplateDataDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultVersionNumber", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDetails.setDefaultVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersionNumber", targetDepth)) {
                    context.nextToken();
                    awsEc2LaunchTemplateDetails.setLatestVersionNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEc2LaunchTemplateDetails;
    }

    private static AwsEc2LaunchTemplateDetailsJsonUnmarshaller instance;

    public static AwsEc2LaunchTemplateDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2LaunchTemplateDetailsJsonUnmarshaller();
        return instance;
    }
}
