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
 * RoleDetail StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RoleDetailStaxUnmarshaller implements Unmarshaller<RoleDetail, StaxUnmarshallerContext> {

    public RoleDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        RoleDetail roleDetail = new RoleDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return roleDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Path", targetDepth)) {
                    roleDetail.setPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleName", targetDepth)) {
                    roleDetail.setRoleName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleId", targetDepth)) {
                    roleDetail.setRoleId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Arn", targetDepth)) {
                    roleDetail.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateDate", targetDepth)) {
                    roleDetail.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("AssumeRolePolicyDocument", targetDepth)) {
                    roleDetail.setAssumeRolePolicyDocument(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceProfileList", targetDepth)) {
                    roleDetail.withInstanceProfileList(new ArrayList<InstanceProfile>());
                    continue;
                }

                if (context.testExpression("InstanceProfileList/member", targetDepth)) {
                    roleDetail.withInstanceProfileList(InstanceProfileStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RolePolicyList", targetDepth)) {
                    roleDetail.withRolePolicyList(new ArrayList<PolicyDetail>());
                    continue;
                }

                if (context.testExpression("RolePolicyList/member", targetDepth)) {
                    roleDetail.withRolePolicyList(PolicyDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AttachedManagedPolicies", targetDepth)) {
                    roleDetail.withAttachedManagedPolicies(new ArrayList<AttachedPolicy>());
                    continue;
                }

                if (context.testExpression("AttachedManagedPolicies/member", targetDepth)) {
                    roleDetail.withAttachedManagedPolicies(AttachedPolicyStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PermissionsBoundary", targetDepth)) {
                    roleDetail.setPermissionsBoundary(AttachedPermissionsBoundaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    roleDetail.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/member", targetDepth)) {
                    roleDetail.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return roleDetail;
                }
            }
        }
    }

    private static RoleDetailStaxUnmarshaller instance;

    public static RoleDetailStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RoleDetailStaxUnmarshaller();
        return instance;
    }
}
