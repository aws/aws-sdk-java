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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KubernetesRoleBindingDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KubernetesRoleBindingDetailsJsonUnmarshaller implements Unmarshaller<KubernetesRoleBindingDetails, JsonUnmarshallerContext> {

    public KubernetesRoleBindingDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        KubernetesRoleBindingDetails kubernetesRoleBindingDetails = new KubernetesRoleBindingDetails();

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
                if (context.testExpression("kind", targetDepth)) {
                    context.nextToken();
                    kubernetesRoleBindingDetails.setKind(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    kubernetesRoleBindingDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uid", targetDepth)) {
                    context.nextToken();
                    kubernetesRoleBindingDetails.setUid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleRefName", targetDepth)) {
                    context.nextToken();
                    kubernetesRoleBindingDetails.setRoleRefName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleRefKind", targetDepth)) {
                    context.nextToken();
                    kubernetesRoleBindingDetails.setRoleRefKind(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return kubernetesRoleBindingDetails;
    }

    private static KubernetesRoleBindingDetailsJsonUnmarshaller instance;

    public static KubernetesRoleBindingDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KubernetesRoleBindingDetailsJsonUnmarshaller();
        return instance;
    }
}
