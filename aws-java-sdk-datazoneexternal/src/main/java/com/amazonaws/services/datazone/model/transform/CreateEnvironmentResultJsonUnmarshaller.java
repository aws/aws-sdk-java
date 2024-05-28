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
package com.amazonaws.services.datazone.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datazone.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateEnvironmentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEnvironmentResultJsonUnmarshaller implements Unmarshaller<CreateEnvironmentResult, JsonUnmarshallerContext> {

    public CreateEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateEnvironmentResult createEnvironmentResult = new CreateEnvironmentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createEnvironmentResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("awsAccountId", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountRegion", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setAwsAccountRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentProperties", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setDeploymentProperties(DeploymentPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentActions", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setEnvironmentActions(new ListUnmarshaller<ConfigurableEnvironmentAction>(
                            ConfigurableEnvironmentActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("environmentBlueprintId", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setEnvironmentBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentProfileId", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setEnvironmentProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("glossaryTerms", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setGlossaryTerms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDeployment", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setLastDeployment(DeploymentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provider", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisionedResources", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setProvisionedResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("provisioningProperties", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setProvisioningProperties(ProvisioningPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("userParameters", targetDepth)) {
                    context.nextToken();
                    createEnvironmentResult.setUserParameters(new ListUnmarshaller<CustomParameter>(CustomParameterJsonUnmarshaller.getInstance())

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

        return createEnvironmentResult;
    }

    private static CreateEnvironmentResultJsonUnmarshaller instance;

    public static CreateEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
