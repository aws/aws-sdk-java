/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GetAccountAuthorizationDetailsResult StAX Unmarshaller
 */
public class GetAccountAuthorizationDetailsResultStaxUnmarshaller implements Unmarshaller<GetAccountAuthorizationDetailsResult, StaxUnmarshallerContext> {

    public GetAccountAuthorizationDetailsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        GetAccountAuthorizationDetailsResult getAccountAuthorizationDetailsResult = new GetAccountAuthorizationDetailsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return getAccountAuthorizationDetailsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("UserDetailList/member", targetDepth)) {
                    getAccountAuthorizationDetailsResult.withUserDetailList(UserDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupDetailList/member", targetDepth)) {
                    getAccountAuthorizationDetailsResult.withGroupDetailList(GroupDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleDetailList/member", targetDepth)) {
                    getAccountAuthorizationDetailsResult.withRoleDetailList(RoleDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Policies/member", targetDepth)) {
                    getAccountAuthorizationDetailsResult.withPolicies(ManagedPolicyDetailStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsTruncated", targetDepth)) {
                    getAccountAuthorizationDetailsResult.setIsTruncated(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    getAccountAuthorizationDetailsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return getAccountAuthorizationDetailsResult;
                }
            }
        }
    }

    private static GetAccountAuthorizationDetailsResultStaxUnmarshaller instance;

    public static GetAccountAuthorizationDetailsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAccountAuthorizationDetailsResultStaxUnmarshaller();
        return instance;
    }
}
