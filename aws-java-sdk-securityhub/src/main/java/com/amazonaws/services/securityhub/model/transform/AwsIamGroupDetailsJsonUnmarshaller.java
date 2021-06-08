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
 * AwsIamGroupDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamGroupDetailsJsonUnmarshaller implements Unmarshaller<AwsIamGroupDetails, JsonUnmarshallerContext> {

    public AwsIamGroupDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsIamGroupDetails awsIamGroupDetails = new AwsIamGroupDetails();

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
                    awsIamGroupDetails.setAttachedManagedPolicies(new ListUnmarshaller<AwsIamAttachedManagedPolicy>(AwsIamAttachedManagedPolicyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    awsIamGroupDetails.setCreateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupId", targetDepth)) {
                    context.nextToken();
                    awsIamGroupDetails.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupName", targetDepth)) {
                    context.nextToken();
                    awsIamGroupDetails.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupPolicyList", targetDepth)) {
                    context.nextToken();
                    awsIamGroupDetails.setGroupPolicyList(new ListUnmarshaller<AwsIamGroupPolicy>(AwsIamGroupPolicyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    awsIamGroupDetails.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsIamGroupDetails;
    }

    private static AwsIamGroupDetailsJsonUnmarshaller instance;

    public static AwsIamGroupDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamGroupDetailsJsonUnmarshaller();
        return instance;
    }
}
