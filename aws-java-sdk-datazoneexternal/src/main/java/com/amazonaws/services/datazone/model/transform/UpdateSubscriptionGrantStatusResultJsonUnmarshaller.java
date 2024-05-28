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
 * UpdateSubscriptionGrantStatusResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionGrantStatusResultJsonUnmarshaller implements Unmarshaller<UpdateSubscriptionGrantStatusResult, JsonUnmarshallerContext> {

    public UpdateSubscriptionGrantStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSubscriptionGrantStatusResult updateSubscriptionGrantStatusResult = new UpdateSubscriptionGrantStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSubscriptionGrantStatusResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("assets", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setAssets(new ListUnmarshaller<SubscribedAsset>(SubscribedAssetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainId", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("grantedEntity", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setGrantedEntity(GrantedEntityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriptionId", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setSubscriptionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subscriptionTargetId", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setSubscriptionTargetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    context.nextToken();
                    updateSubscriptionGrantStatusResult.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateSubscriptionGrantStatusResult;
    }

    private static UpdateSubscriptionGrantStatusResultJsonUnmarshaller instance;

    public static UpdateSubscriptionGrantStatusResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSubscriptionGrantStatusResultJsonUnmarshaller();
        return instance;
    }
}
