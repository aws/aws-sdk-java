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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Membership JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipJsonUnmarshaller implements Unmarshaller<Membership, JsonUnmarshallerContext> {

    public Membership unmarshall(JsonUnmarshallerContext context) throws Exception {
        Membership membership = new Membership();

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
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    membership.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    membership.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    context.nextToken();
                    membership.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    context.nextToken();
                    membership.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationCreatorAccountId", targetDepth)) {
                    context.nextToken();
                    membership.setCollaborationCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationCreatorDisplayName", targetDepth)) {
                    context.nextToken();
                    membership.setCollaborationCreatorDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationName", targetDepth)) {
                    context.nextToken();
                    membership.setCollaborationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    context.nextToken();
                    membership.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    context.nextToken();
                    membership.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    membership.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("memberAbilities", targetDepth)) {
                    context.nextToken();
                    membership.setMemberAbilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("queryLogStatus", targetDepth)) {
                    context.nextToken();
                    membership.setQueryLogStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultResultConfiguration", targetDepth)) {
                    context.nextToken();
                    membership.setDefaultResultConfiguration(MembershipProtectedQueryResultConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("paymentConfiguration", targetDepth)) {
                    context.nextToken();
                    membership.setPaymentConfiguration(MembershipPaymentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return membership;
    }

    private static MembershipJsonUnmarshaller instance;

    public static MembershipJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MembershipJsonUnmarshaller();
        return instance;
    }
}
