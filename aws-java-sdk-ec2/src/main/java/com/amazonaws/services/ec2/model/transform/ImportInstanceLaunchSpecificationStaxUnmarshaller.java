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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ImportInstanceLaunchSpecification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportInstanceLaunchSpecificationStaxUnmarshaller implements Unmarshaller<ImportInstanceLaunchSpecification, StaxUnmarshallerContext> {

    public ImportInstanceLaunchSpecification unmarshall(StaxUnmarshallerContext context) throws Exception {
        ImportInstanceLaunchSpecification importInstanceLaunchSpecification = new ImportInstanceLaunchSpecification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return importInstanceLaunchSpecification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("additionalInfo", targetDepth)) {
                    importInstanceLaunchSpecification.setAdditionalInfo(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("architecture", targetDepth)) {
                    importInstanceLaunchSpecification.setArchitecture(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupId", targetDepth)) {
                    importInstanceLaunchSpecification.withGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("GroupId/SecurityGroupId", targetDepth)) {
                    importInstanceLaunchSpecification.withGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GroupName", targetDepth)) {
                    importInstanceLaunchSpecification.withGroupNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("GroupName/SecurityGroup", targetDepth)) {
                    importInstanceLaunchSpecification.withGroupNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceInitiatedShutdownBehavior", targetDepth)) {
                    importInstanceLaunchSpecification.setInstanceInitiatedShutdownBehavior(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    importInstanceLaunchSpecification.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("monitoring/enabled", targetDepth)) {
                    importInstanceLaunchSpecification.setMonitoring(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("placement", targetDepth)) {
                    importInstanceLaunchSpecification.setPlacement(PlacementStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("privateIpAddress", targetDepth)) {
                    importInstanceLaunchSpecification.setPrivateIpAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("subnetId", targetDepth)) {
                    importInstanceLaunchSpecification.setSubnetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("userData", targetDepth)) {
                    importInstanceLaunchSpecification.setUserData(UserDataStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return importInstanceLaunchSpecification;
                }
            }
        }
    }

    private static ImportInstanceLaunchSpecificationStaxUnmarshaller instance;

    public static ImportInstanceLaunchSpecificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportInstanceLaunchSpecificationStaxUnmarshaller();
        return instance;
    }
}
