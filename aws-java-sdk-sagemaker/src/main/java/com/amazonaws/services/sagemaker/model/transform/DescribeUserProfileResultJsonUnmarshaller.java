/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeUserProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserProfileResultJsonUnmarshaller implements Unmarshaller<DescribeUserProfileResult, JsonUnmarshallerContext> {

    public DescribeUserProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeUserProfileResult describeUserProfileResult = new DescribeUserProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeUserProfileResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainId", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserProfileArn", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setUserProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserProfileName", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setUserProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomeEfsFileSystemUid", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setHomeEfsFileSystemUid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SingleSignOnUserIdentifier", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setSingleSignOnUserIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SingleSignOnUserValue", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setSingleSignOnUserValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserSettings", targetDepth)) {
                    context.nextToken();
                    describeUserProfileResult.setUserSettings(UserSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeUserProfileResult;
    }

    private static DescribeUserProfileResultJsonUnmarshaller instance;

    public static DescribeUserProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeUserProfileResultJsonUnmarshaller();
        return instance;
    }
}
