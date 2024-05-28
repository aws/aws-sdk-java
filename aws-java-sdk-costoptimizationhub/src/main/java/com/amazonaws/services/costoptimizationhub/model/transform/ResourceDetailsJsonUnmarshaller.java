/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costoptimizationhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costoptimizationhub.model.*;
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
                if (context.testExpression("computeSavingsPlans", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setComputeSavingsPlans(ComputeSavingsPlansJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ebsVolume", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setEbsVolume(EbsVolumeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2AutoScalingGroup", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setEc2AutoScalingGroup(Ec2AutoScalingGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2Instance", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setEc2Instance(Ec2InstanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2InstanceSavingsPlans", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setEc2InstanceSavingsPlans(Ec2InstanceSavingsPlansJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2ReservedInstances", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setEc2ReservedInstances(Ec2ReservedInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ecsService", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setEcsService(EcsServiceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("elastiCacheReservedInstances", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setElastiCacheReservedInstances(ElastiCacheReservedInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunction", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setLambdaFunction(LambdaFunctionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("openSearchReservedInstances", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setOpenSearchReservedInstances(OpenSearchReservedInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rdsReservedInstances", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setRdsReservedInstances(RdsReservedInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("redshiftReservedInstances", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setRedshiftReservedInstances(RedshiftReservedInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sageMakerSavingsPlans", targetDepth)) {
                    context.nextToken();
                    resourceDetails.setSageMakerSavingsPlans(SageMakerSavingsPlansJsonUnmarshaller.getInstance().unmarshall(context));
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
