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
 * GroupDetail StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupDetailStaxUnmarshaller implements Unmarshaller<GroupDetail, StaxUnmarshallerContext> {

    public GroupDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        GroupDetail groupDetail = new GroupDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return groupDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Path", targetDepth)) {
                    groupDetail.setPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupName", targetDepth)) {
                    groupDetail.setGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupId", targetDepth)) {
                    groupDetail.setGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Arn", targetDepth)) {
                    groupDetail.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateDate", targetDepth)) {
                    groupDetail.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupPolicyList", targetDepth)) {
                    groupDetail.withGroupPolicyList(new ArrayList<PolicyDetail>());
                    continue;
                }

                if (context.testExpression("GroupPolicyList/member", targetDepth)) {
                    groupDetail.withGroupPolicyList(PolicyDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AttachedManagedPolicies", targetDepth)) {
                    groupDetail.withAttachedManagedPolicies(new ArrayList<AttachedPolicy>());
                    continue;
                }

                if (context.testExpression("AttachedManagedPolicies/member", targetDepth)) {
                    groupDetail.withAttachedManagedPolicies(AttachedPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return groupDetail;
                }
            }
        }
    }

    private static GroupDetailStaxUnmarshaller instance;

    public static GroupDetailStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GroupDetailStaxUnmarshaller();
        return instance;
    }
}
