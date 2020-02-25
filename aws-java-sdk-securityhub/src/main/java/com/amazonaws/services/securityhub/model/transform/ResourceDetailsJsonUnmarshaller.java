/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ResourceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetailsJsonUnmarshaller implements Unmarshaller<ResourceDetails, JsonUnmarshallerContext> {

    public ResourceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceDetails resourceDetails = new ResourceDetails();

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
                if (context.testExpression("AwsCodeBuildProject", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsCodeBuildProject(AwsCodeBuildProjectDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCloudFrontDistribution", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsCloudFrontDistribution(AwsCloudFrontDistributionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2Instance", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsEc2Instance(AwsEc2InstanceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2NetworkInterface", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2SecurityGroup", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsEc2SecurityGroup(AwsEc2SecurityGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsElbv2LoadBalancer", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsElasticsearchDomain", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsElasticsearchDomain(AwsElasticsearchDomainDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsS3Bucket", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsS3Bucket(AwsS3BucketDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamAccessKey", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsIamAccessKey(AwsIamAccessKeyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamRole", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsIamRole(AwsIamRoleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsKmsKey", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsKmsKey(AwsKmsKeyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsLambdaFunction", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsLambdaFunction(AwsLambdaFunctionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsLambdaLayerVersion", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsLambdaLayerVersion(AwsLambdaLayerVersionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsRdsDbInstance", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsRdsDbInstance(AwsRdsDbInstanceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSnsTopic", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsSnsTopic(AwsSnsTopicDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSqsQueue", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsSqsQueue(AwsSqsQueueDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafWebAcl", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setAwsWafWebAcl(AwsWafWebAclDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Container", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setContainer(ContainerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Other", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setOther(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return resourceDetails;
    }

    private static ResourceDetailsJsonUnmarshaller instance;

    public static ResourceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDetailsJsonUnmarshaller();
        return instance;
    }
}
