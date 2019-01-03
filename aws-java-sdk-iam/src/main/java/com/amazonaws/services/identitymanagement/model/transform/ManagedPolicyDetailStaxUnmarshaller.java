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
 * ManagedPolicyDetail StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedPolicyDetailStaxUnmarshaller implements Unmarshaller<ManagedPolicyDetail, StaxUnmarshallerContext> {

    public ManagedPolicyDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        ManagedPolicyDetail managedPolicyDetail = new ManagedPolicyDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return managedPolicyDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("PolicyName", targetDepth)) {
                    managedPolicyDetail.setPolicyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PolicyId", targetDepth)) {
                    managedPolicyDetail.setPolicyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Arn", targetDepth)) {
                    managedPolicyDetail.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Path", targetDepth)) {
                    managedPolicyDetail.setPath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultVersionId", targetDepth)) {
                    managedPolicyDetail.setDefaultVersionId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AttachmentCount", targetDepth)) {
                    managedPolicyDetail.setAttachmentCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PermissionsBoundaryUsageCount", targetDepth)) {
                    managedPolicyDetail.setPermissionsBoundaryUsageCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsAttachable", targetDepth)) {
                    managedPolicyDetail.setIsAttachable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    managedPolicyDetail.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreateDate", targetDepth)) {
                    managedPolicyDetail.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdateDate", targetDepth)) {
                    managedPolicyDetail.setUpdateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("PolicyVersionList", targetDepth)) {
                    managedPolicyDetail.withPolicyVersionList(new ArrayList<PolicyVersion>());
                    continue;
                }

                if (context.testExpression("PolicyVersionList/member", targetDepth)) {
                    managedPolicyDetail.withPolicyVersionList(PolicyVersionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return managedPolicyDetail;
                }
            }
        }
    }

    private static ManagedPolicyDetailStaxUnmarshaller instance;

    public static ManagedPolicyDetailStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedPolicyDetailStaxUnmarshaller();
        return instance;
    }
}
