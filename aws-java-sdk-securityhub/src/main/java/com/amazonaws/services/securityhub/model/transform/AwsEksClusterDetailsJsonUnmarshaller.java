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
 * AwsEksClusterDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEksClusterDetailsJsonUnmarshaller implements Unmarshaller<AwsEksClusterDetails, JsonUnmarshallerContext> {

    public AwsEksClusterDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEksClusterDetails awsEksClusterDetails = new AwsEksClusterDetails();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateAuthorityData", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setCertificateAuthorityData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterStatus", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setClusterStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourcesVpcConfig", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setResourcesVpcConfig(AwsEksClusterResourcesVpcConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Logging", targetDepth)) {
                    context.nextToken();
                    awsEksClusterDetails.setLogging(AwsEksClusterLoggingDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsEksClusterDetails;
    }

    private static AwsEksClusterDetailsJsonUnmarshaller instance;

    public static AwsEksClusterDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEksClusterDetailsJsonUnmarshaller();
        return instance;
    }
}
