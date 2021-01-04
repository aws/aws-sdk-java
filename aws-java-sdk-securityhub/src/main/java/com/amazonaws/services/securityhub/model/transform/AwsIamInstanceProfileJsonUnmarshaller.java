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
 * AwsIamInstanceProfile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsIamInstanceProfileJsonUnmarshaller implements Unmarshaller<AwsIamInstanceProfile, JsonUnmarshallerContext> {

    public AwsIamInstanceProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsIamInstanceProfile awsIamInstanceProfile = new AwsIamInstanceProfile();

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
                    awsIamInstanceProfile.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    context.nextToken();
                    awsIamInstanceProfile.setCreateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileId", targetDepth)) {
                    context.nextToken();
                    awsIamInstanceProfile.setInstanceProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileName", targetDepth)) {
                    context.nextToken();
                    awsIamInstanceProfile.setInstanceProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    context.nextToken();
                    awsIamInstanceProfile.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Roles", targetDepth)) {
                    context.nextToken();
                    awsIamInstanceProfile.setRoles(new ListUnmarshaller<AwsIamInstanceProfileRole>(AwsIamInstanceProfileRoleJsonUnmarshaller.getInstance())

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

        return awsIamInstanceProfile;
    }

    private static AwsIamInstanceProfileJsonUnmarshaller instance;

    public static AwsIamInstanceProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsIamInstanceProfileJsonUnmarshaller();
        return instance;
    }
}
