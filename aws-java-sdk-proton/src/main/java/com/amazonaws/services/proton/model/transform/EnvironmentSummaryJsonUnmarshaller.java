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
package com.amazonaws.services.proton.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnvironmentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentSummaryJsonUnmarshaller implements Unmarshaller<EnvironmentSummary, JsonUnmarshallerContext> {

    public EnvironmentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnvironmentSummary environmentSummary = new EnvironmentSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deploymentStatus", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatusMessage", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentAccountConnectionId", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setEnvironmentAccountConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentAccountId", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setEnvironmentAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDeploymentAttemptedAt", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setLastDeploymentAttemptedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastDeploymentSucceededAt", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setLastDeploymentSucceededAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protonServiceRoleArn", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setProtonServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisioning", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setProvisioning(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateMajorVersion", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setTemplateMajorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateMinorVersion", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setTemplateMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateName", targetDepth)) {
                    context.nextToken();
                    environmentSummary.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return environmentSummary;
    }

    private static EnvironmentSummaryJsonUnmarshaller instance;

    public static EnvironmentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentSummaryJsonUnmarshaller();
        return instance;
    }
}
