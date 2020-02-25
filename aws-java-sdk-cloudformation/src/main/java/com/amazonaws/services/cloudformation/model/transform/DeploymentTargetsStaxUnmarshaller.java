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
package com.amazonaws.services.cloudformation.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DeploymentTargets StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentTargetsStaxUnmarshaller implements Unmarshaller<DeploymentTargets, StaxUnmarshallerContext> {

    public DeploymentTargets unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeploymentTargets deploymentTargets = new DeploymentTargets();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deploymentTargets;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Accounts", targetDepth)) {
                    deploymentTargets.withAccounts(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Accounts/member", targetDepth)) {
                    deploymentTargets.withAccounts(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OrganizationalUnitIds", targetDepth)) {
                    deploymentTargets.withOrganizationalUnitIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("OrganizationalUnitIds/member", targetDepth)) {
                    deploymentTargets.withOrganizationalUnitIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deploymentTargets;
                }
            }
        }
    }

    private static DeploymentTargetsStaxUnmarshaller instance;

    public static DeploymentTargetsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentTargetsStaxUnmarshaller();
        return instance;
    }
}
