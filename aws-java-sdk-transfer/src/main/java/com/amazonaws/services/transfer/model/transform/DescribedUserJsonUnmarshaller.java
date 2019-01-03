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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedUser JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedUserJsonUnmarshaller implements Unmarshaller<DescribedUser, JsonUnmarshallerContext> {

    public DescribedUser unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedUser describedUser = new DescribedUser();

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
                if (context.testExpression("Arn", targetDepth)) {
                    context.nextToken();
                    describedUser.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomeDirectory", targetDepth)) {
                    context.nextToken();
                    describedUser.setHomeDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Policy", targetDepth)) {
                    context.nextToken();
                    describedUser.setPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    context.nextToken();
                    describedUser.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshPublicKeys", targetDepth)) {
                    context.nextToken();
                    describedUser.setSshPublicKeys(new ListUnmarshaller<SshPublicKey>(SshPublicKeyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    context.nextToken();
                    describedUser.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    describedUser.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describedUser;
    }

    private static DescribedUserJsonUnmarshaller instance;

    public static DescribedUserJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedUserJsonUnmarshaller();
        return instance;
    }
}
