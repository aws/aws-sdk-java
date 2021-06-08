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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsIamUserDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamUserDetailsJsonUnmarshaller implements Unmarshaller<AwsIamUserDetails, JsonUnmarshallerContext> {

    public AwsIamUserDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsIamUserDetails awsIamUserDetails = new AwsIamUserDetails();

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
                if (context.testExpression("AttachedManagedPolicies", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setAttachedManagedPolicies(new ListUnmarshaller<AwsIamAttachedManagedPolicy>(AwsIamAttachedManagedPolicyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setCreateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupList", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setGroupList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PermissionsBoundary", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setPermissionsBoundary(AwsIamPermissionsBoundaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UserId", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserName", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserPolicyList", targetDepth)) {
                    context.nextToken();
                    awsIamUserDetails.setUserPolicyList(new ListUnmarshaller<AwsIamUserPolicy>(AwsIamUserPolicyJsonUnmarshaller.getInstance())

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

        return awsIamUserDetails;
    }

    private static AwsIamUserDetailsJsonUnmarshaller instance;

    public static AwsIamUserDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamUserDetailsJsonUnmarshaller();
        return instance;
    }
}
