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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Member JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberJsonUnmarshaller implements Unmarshaller<Member, JsonUnmarshallerContext> {

    public Member unmarshall(JsonUnmarshallerContext context) throws Exception {
        Member member = new Member();

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
                if (context.testExpression("accountId", targetDepth)) {
                    context.nextToken();
                    member.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("administratorAccountId", targetDepth)) {
                    context.nextToken();
                    member.setAdministratorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    member.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("email", targetDepth)) {
                    context.nextToken();
                    member.setEmail(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("invitedAt", targetDepth)) {
                    context.nextToken();
                    member.setInvitedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("masterAccountId", targetDepth)) {
                    context.nextToken();
                    member.setMasterAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relationshipStatus", targetDepth)) {
                    context.nextToken();
                    member.setRelationshipStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    member.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    context.nextToken();
                    member.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return member;
    }

    private static MemberJsonUnmarshaller instance;

    public static MemberJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MemberJsonUnmarshaller();
        return instance;
    }
}
