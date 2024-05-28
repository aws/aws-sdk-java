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
 * UpdateSubscriptionTargetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionTargetResultJsonUnmarshaller implements Unmarshaller<UpdateSubscriptionTargetResult, JsonUnmarshallerContext> {

    public UpdateSubscriptionTargetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSubscriptionTargetResult updateSubscriptionTargetResult = new UpdateSubscriptionTargetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSubscriptionTargetResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicableAssetTypes", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setApplicableAssetTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("authorizedPrincipals", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setAuthorizedPrincipals(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manageAccessRole", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setManageAccessRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectId", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provider", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriptionTargetConfig", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setSubscriptionTargetConfig(new ListUnmarshaller<SubscriptionTargetForm>(
                            SubscriptionTargetFormJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionTargetResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSubscriptionTargetResult;
    }

    private static UpdateSubscriptionTargetResultJsonUnmarshaller instance;

    public static UpdateSubscriptionTargetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSubscriptionTargetResultJsonUnmarshaller();
        return instance;
    }
}
