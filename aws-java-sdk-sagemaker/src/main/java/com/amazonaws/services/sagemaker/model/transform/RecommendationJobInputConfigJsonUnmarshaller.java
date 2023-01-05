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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecommendationJobInputConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationJobInputConfigJsonUnmarshaller implements Unmarshaller<RecommendationJobInputConfig, JsonUnmarshallerContext> {

    public RecommendationJobInputConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationJobInputConfig recommendationJobInputConfig = new RecommendationJobInputConfig();

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
                if (context.testExpression("ModelPackageVersionArn", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setModelPackageVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDurationInSeconds", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setJobDurationInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TrafficPattern", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setTrafficPattern(TrafficPatternJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceLimit", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setResourceLimit(RecommendationJobResourceLimitJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndpointConfigurations", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setEndpointConfigurations(new ListUnmarshaller<EndpointInputConfiguration>(
                            EndpointInputConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VolumeKmsKeyId", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setVolumeKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContainerConfig", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setContainerConfig(RecommendationJobContainerConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Endpoints", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setEndpoints(new ListUnmarshaller<EndpointInfo>(EndpointInfoJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    context.nextToken();
                    recommendationJobInputConfig.setVpcConfig(RecommendationJobVpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return recommendationJobInputConfig;
    }

    private static RecommendationJobInputConfigJsonUnmarshaller instance;

    public static RecommendationJobInputConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationJobInputConfigJsonUnmarshaller();
        return instance;
    }
}
