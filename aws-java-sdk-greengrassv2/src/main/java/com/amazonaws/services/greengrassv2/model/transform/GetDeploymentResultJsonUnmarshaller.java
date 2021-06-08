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
package com.amazonaws.services.greengrassv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDeploymentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentResultJsonUnmarshaller implements Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> {

    public GetDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDeploymentResult getDeploymentResult = new GetDeploymentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDeploymentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("targetArn", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setTargetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentId", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentName", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setDeploymentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatus", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iotJobId", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setIotJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iotJobArn", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setIotJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("components", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setComponents(new MapUnmarshaller<String, ComponentDeploymentSpecification>(context.getUnmarshaller(String.class),
                            ComponentDeploymentSpecificationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("deploymentPolicies", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setDeploymentPolicies(DeploymentPoliciesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotJobConfiguration", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setIotJobConfiguration(DeploymentIoTJobConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("isLatestForTarget", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setIsLatestForTarget(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    getDeploymentResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getDeploymentResult;
    }

    private static GetDeploymentResultJsonUnmarshaller instance;

    public static GetDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
