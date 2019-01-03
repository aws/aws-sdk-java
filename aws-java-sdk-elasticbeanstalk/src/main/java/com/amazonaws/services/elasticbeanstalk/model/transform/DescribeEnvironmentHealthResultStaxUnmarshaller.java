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
 * DescribeEnvironmentHealthResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEnvironmentHealthResultStaxUnmarshaller implements Unmarshaller<DescribeEnvironmentHealthResult, StaxUnmarshallerContext> {

    public DescribeEnvironmentHealthResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeEnvironmentHealthResult describeEnvironmentHealthResult = new DescribeEnvironmentHealthResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeEnvironmentHealthResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EnvironmentName", targetDepth)) {
                    describeEnvironmentHealthResult.setEnvironmentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("HealthStatus", targetDepth)) {
                    describeEnvironmentHealthResult.setHealthStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    describeEnvironmentHealthResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Color", targetDepth)) {
                    describeEnvironmentHealthResult.setColor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Causes", targetDepth)) {
                    describeEnvironmentHealthResult.withCauses(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Causes/member", targetDepth)) {
                    describeEnvironmentHealthResult.withCauses(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplicationMetrics", targetDepth)) {
                    describeEnvironmentHealthResult.setApplicationMetrics(ApplicationMetricsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InstancesHealth", targetDepth)) {
                    describeEnvironmentHealthResult.setInstancesHealth(InstanceHealthSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RefreshedAt", targetDepth)) {
                    describeEnvironmentHealthResult.setRefreshedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeEnvironmentHealthResult;
                }
            }
        }
    }

    private static DescribeEnvironmentHealthResultStaxUnmarshaller instance;

    public static DescribeEnvironmentHealthResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEnvironmentHealthResultStaxUnmarshaller();
        return instance;
    }
}
