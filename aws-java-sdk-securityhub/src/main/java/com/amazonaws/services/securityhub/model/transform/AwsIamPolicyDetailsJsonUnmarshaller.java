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
 * AwsIamPolicyDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamPolicyDetailsJsonUnmarshaller implements Unmarshaller<AwsIamPolicyDetails, JsonUnmarshallerContext> {

    public AwsIamPolicyDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsIamPolicyDetails awsIamPolicyDetails = new AwsIamPolicyDetails();

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
                if (context.testExpression("AttachmentCount", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setAttachmentCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setCreateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultVersionId", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setDefaultVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsAttachable", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setIsAttachable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PermissionsBoundaryUsageCount", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setPermissionsBoundaryUsageCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PolicyId", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyName", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyVersionList", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setPolicyVersionList(new ListUnmarshaller<AwsIamPolicyVersion>(AwsIamPolicyVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UpdateDate", targetDepth)) {
                    context.nextToken();
                    awsIamPolicyDetails.setUpdateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsIamPolicyDetails;
    }

    private static AwsIamPolicyDetailsJsonUnmarshaller instance;

    public static AwsIamPolicyDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamPolicyDetailsJsonUnmarshaller();
        return instance;
    }
}
