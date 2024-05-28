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
package com.amazonaws.services.proton.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ServiceInstanceState JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceInstanceStateJsonUnmarshaller implements Unmarshaller<ServiceInstanceState, JsonUnmarshallerContext> {

    public ServiceInstanceState unmarshall(JsonUnmarshallerContext context) throws Exception {
        ServiceInstanceState serviceInstanceState = new ServiceInstanceState();

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
                if (context.testExpression("lastSuccessfulComponentDeploymentIds", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setLastSuccessfulComponentDeploymentIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulEnvironmentDeploymentId", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setLastSuccessfulEnvironmentDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulServicePipelineDeploymentId", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setLastSuccessfulServicePipelineDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spec", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateMajorVersion", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setTemplateMajorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateMinorVersion", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setTemplateMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateName", targetDepth)) {
                    context.nextToken();
                    serviceInstanceState.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return serviceInstanceState;
    }

    private static ServiceInstanceStateJsonUnmarshaller instance;

    public static ServiceInstanceStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceInstanceStateJsonUnmarshaller();
        return instance;
    }
}
