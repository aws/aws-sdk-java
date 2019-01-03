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
 * SystemStatus StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SystemStatusStaxUnmarshaller implements Unmarshaller<SystemStatus, StaxUnmarshallerContext> {

    public SystemStatus unmarshall(StaxUnmarshallerContext context) throws Exception {
        SystemStatus systemStatus = new SystemStatus();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return systemStatus;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CPUUtilization", targetDepth)) {
                    systemStatus.setCPUUtilization(CPUUtilizationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LoadAverage", targetDepth)) {
                    systemStatus.withLoadAverage(new ArrayList<Double>());
                    continue;
                }

                if (context.testExpression("LoadAverage/member", targetDepth)) {
                    systemStatus.withLoadAverage(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return systemStatus;
                }
            }
        }
    }

    private static SystemStatusStaxUnmarshaller instance;

    public static SystemStatusStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SystemStatusStaxUnmarshaller();
        return instance;
    }
}
