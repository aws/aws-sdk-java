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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * UserDetail StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserDetailStaxUnmarshaller implements Unmarshaller<UserDetail, StaxUnmarshallerContext> {

    public UserDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        UserDetail userDetail = new UserDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return userDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Path", targetDepth)) {
                    userDetail.setPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserName", targetDepth)) {
                    userDetail.setUserName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserId", targetDepth)) {
                    userDetail.setUserId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Arn", targetDepth)) {
                    userDetail.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateDate", targetDepth)) {
                    userDetail.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserPolicyList", targetDepth)) {
                    userDetail.withUserPolicyList(new ArrayList<PolicyDetail>());
                    continue;
                }

                if (context.testExpression("UserPolicyList/member", targetDepth)) {
                    userDetail.withUserPolicyList(PolicyDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupList", targetDepth)) {
                    userDetail.withGroupList(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("GroupList/member", targetDepth)) {
                    userDetail.withGroupList(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AttachedManagedPolicies", targetDepth)) {
                    userDetail.withAttachedManagedPolicies(new ArrayList<AttachedPolicy>());
                    continue;
                }

                if (context.testExpression("AttachedManagedPolicies/member", targetDepth)) {
                    userDetail.withAttachedManagedPolicies(AttachedPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PermissionsBoundary", targetDepth)) {
                    userDetail.setPermissionsBoundary(AttachedPermissionsBoundaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    userDetail.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/member", targetDepth)) {
                    userDetail.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return userDetail;
                }
            }
        }
    }

    private static UserDetailStaxUnmarshaller instance;

    public static UserDetailStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserDetailStaxUnmarshaller();
        return instance;
    }
}
