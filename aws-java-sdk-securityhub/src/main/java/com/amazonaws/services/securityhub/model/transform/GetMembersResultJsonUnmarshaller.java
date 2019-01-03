/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GetMembersResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMembersResultJsonUnmarshaller implements Unmarshaller<GetMembersResult, JsonUnmarshallerContext> {

    public GetMembersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMembersResult getMembersResult = new GetMembersResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMembersResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Members", targetDepth)) {
                    context.nextToken();
                    getMembersResult.setMembers(new ListUnmarshaller<Member>(MemberJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UnprocessedAccounts", targetDepth)) {
                    context.nextToken();
                    getMembersResult.setUnprocessedAccounts(new ListUnmarshaller<Result>(ResultJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getMembersResult;
    }

    private static GetMembersResultJsonUnmarshaller instance;

    public static GetMembersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMembersResultJsonUnmarshaller();
        return instance;
    }
}
