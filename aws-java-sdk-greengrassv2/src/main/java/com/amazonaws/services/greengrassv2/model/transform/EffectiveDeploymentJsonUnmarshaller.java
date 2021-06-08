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
 * EffectiveDeployment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EffectiveDeploymentJsonUnmarshaller implements Unmarshaller<EffectiveDeployment, JsonUnmarshallerContext> {

    public EffectiveDeployment unmarshall(JsonUnmarshallerContext context) throws Exception {
        EffectiveDeployment effectiveDeployment = new EffectiveDeployment();

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
                if (context.testExpression("deploymentId", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentName", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setDeploymentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iotJobId", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setIotJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iotJobArn", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setIotJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetArn", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setTargetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("coreDeviceExecutionStatus", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setCoreDeviceExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reason", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("modifiedTimestamp", targetDepth)) {
                    context.nextToken();
                    effectiveDeployment.setModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return effectiveDeployment;
    }

    private static EffectiveDeploymentJsonUnmarshaller instance;

    public static EffectiveDeploymentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EffectiveDeploymentJsonUnmarshaller();
        return instance;
    }
}
