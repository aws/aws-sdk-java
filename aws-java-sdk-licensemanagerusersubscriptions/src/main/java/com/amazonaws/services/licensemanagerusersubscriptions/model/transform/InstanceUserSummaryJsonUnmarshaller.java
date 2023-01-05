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
package com.amazonaws.services.licensemanagerusersubscriptions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.licensemanagerusersubscriptions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceUserSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceUserSummaryJsonUnmarshaller implements Unmarshaller<InstanceUserSummary, JsonUnmarshallerContext> {

    public InstanceUserSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceUserSummary instanceUserSummary = new InstanceUserSummary();

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
                if (context.testExpression("AssociationDate", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setAssociationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisassociationDate", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setDisassociationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityProvider", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setIdentityProvider(IdentityProviderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    context.nextToken();
                    instanceUserSummary.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return instanceUserSummary;
    }

    private static InstanceUserSummaryJsonUnmarshaller instance;

    public static InstanceUserSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceUserSummaryJsonUnmarshaller();
        return instance;
    }
}
