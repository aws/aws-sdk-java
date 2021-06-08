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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsElasticBeanstalkEnvironmentDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticBeanstalkEnvironmentDetailsJsonUnmarshaller implements Unmarshaller<AwsElasticBeanstalkEnvironmentDetails, JsonUnmarshallerContext> {

    public AwsElasticBeanstalkEnvironmentDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsElasticBeanstalkEnvironmentDetails awsElasticBeanstalkEnvironmentDetails = new AwsElasticBeanstalkEnvironmentDetails();

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
                if (context.testExpression("ApplicationName", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setApplicationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Cname", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setCname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DateCreated", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DateUpdated", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setDateUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointUrl", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setEndpointUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentArn", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentLinks", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setEnvironmentLinks(new ListUnmarshaller<AwsElasticBeanstalkEnvironmentEnvironmentLink>(
                            AwsElasticBeanstalkEnvironmentEnvironmentLinkJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnvironmentName", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setEnvironmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OptionSettings", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setOptionSettings(new ListUnmarshaller<AwsElasticBeanstalkEnvironmentOptionSetting>(
                            AwsElasticBeanstalkEnvironmentOptionSettingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlatformArn", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setPlatformArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SolutionStackName", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setSolutionStackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tier", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setTier(AwsElasticBeanstalkEnvironmentTierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VersionLabel", targetDepth)) {
                    context.nextToken();
                    awsElasticBeanstalkEnvironmentDetails.setVersionLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsElasticBeanstalkEnvironmentDetails;
    }

    private static AwsElasticBeanstalkEnvironmentDetailsJsonUnmarshaller instance;

    public static AwsElasticBeanstalkEnvironmentDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElasticBeanstalkEnvironmentDetailsJsonUnmarshaller();
        return instance;
    }
}
