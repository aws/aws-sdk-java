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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SingleInstanceHealth StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SingleInstanceHealthStaxUnmarshaller implements Unmarshaller<SingleInstanceHealth, StaxUnmarshallerContext> {

    public SingleInstanceHealth unmarshall(StaxUnmarshallerContext context) throws Exception {
        SingleInstanceHealth singleInstanceHealth = new SingleInstanceHealth();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return singleInstanceHealth;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("InstanceId", targetDepth)) {
                    singleInstanceHealth.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthStatus", targetDepth)) {
                    singleInstanceHealth.setHealthStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Color", targetDepth)) {
                    singleInstanceHealth.setColor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Causes", targetDepth)) {
                    singleInstanceHealth.withCauses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Causes/member", targetDepth)) {
                    singleInstanceHealth.withCauses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LaunchedAt", targetDepth)) {
                    singleInstanceHealth.setLaunchedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationMetrics", targetDepth)) {
                    singleInstanceHealth.setApplicationMetrics(ApplicationMetricsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("System", targetDepth)) {
                    singleInstanceHealth.setSystem(SystemStatusStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Deployment", targetDepth)) {
                    singleInstanceHealth.setDeployment(DeploymentStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    singleInstanceHealth.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstanceType", targetDepth)) {
                    singleInstanceHealth.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return singleInstanceHealth;
                }
            }
        }
    }

    private static SingleInstanceHealthStaxUnmarshaller instance;

    public static SingleInstanceHealthStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SingleInstanceHealthStaxUnmarshaller();
        return instance;
    }
}
