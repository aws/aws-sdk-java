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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsStepFunctionStateMachineDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsStepFunctionStateMachineDetailsJsonUnmarshaller implements Unmarshaller<AwsStepFunctionStateMachineDetails, JsonUnmarshallerContext> {

    public AwsStepFunctionStateMachineDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsStepFunctionStateMachineDetails awsStepFunctionStateMachineDetails = new AwsStepFunctionStateMachineDetails();

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
                if (context.testExpression("Label", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingConfiguration", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setLoggingConfiguration(AwsStepFunctionStateMachineLoggingConfigurationDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateMachineArn", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setStateMachineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TracingConfiguration", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setTracingConfiguration(AwsStepFunctionStateMachineTracingConfigurationDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    context.nextToken();
                    awsStepFunctionStateMachineDetails.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsStepFunctionStateMachineDetails;
    }

    private static AwsStepFunctionStateMachineDetailsJsonUnmarshaller instance;

    public static AwsStepFunctionStateMachineDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsStepFunctionStateMachineDetailsJsonUnmarshaller();
        return instance;
    }
}
