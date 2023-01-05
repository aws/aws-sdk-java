/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeBlueGreenDeploymentsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBlueGreenDeploymentsResultStaxUnmarshaller implements Unmarshaller<DescribeBlueGreenDeploymentsResult, StaxUnmarshallerContext> {

    public DescribeBlueGreenDeploymentsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeBlueGreenDeploymentsResult describeBlueGreenDeploymentsResult = new DescribeBlueGreenDeploymentsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeBlueGreenDeploymentsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("BlueGreenDeployments", targetDepth)) {
                    describeBlueGreenDeploymentsResult.withBlueGreenDeployments(new ArrayList<BlueGreenDeployment>());
                    continue;
                }

                if (context.testExpression("BlueGreenDeployments/member", targetDepth)) {
                    describeBlueGreenDeploymentsResult.withBlueGreenDeployments(BlueGreenDeploymentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    describeBlueGreenDeploymentsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeBlueGreenDeploymentsResult;
                }
            }
        }
    }

    private static DescribeBlueGreenDeploymentsResultStaxUnmarshaller instance;

    public static DescribeBlueGreenDeploymentsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBlueGreenDeploymentsResultStaxUnmarshaller();
        return instance;
    }
}
