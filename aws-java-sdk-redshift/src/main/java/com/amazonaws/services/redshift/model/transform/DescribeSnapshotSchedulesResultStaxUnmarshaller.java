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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeSnapshotSchedulesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotSchedulesResultStaxUnmarshaller implements Unmarshaller<DescribeSnapshotSchedulesResult, StaxUnmarshallerContext> {

    public DescribeSnapshotSchedulesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeSnapshotSchedulesResult describeSnapshotSchedulesResult = new DescribeSnapshotSchedulesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeSnapshotSchedulesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SnapshotSchedules", targetDepth)) {
                    describeSnapshotSchedulesResult.withSnapshotSchedules(new ArrayList<SnapshotSchedule>());
                    continue;
                }

                if (context.testExpression("SnapshotSchedules/SnapshotSchedule", targetDepth)) {
                    describeSnapshotSchedulesResult.withSnapshotSchedules(SnapshotScheduleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    describeSnapshotSchedulesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeSnapshotSchedulesResult;
                }
            }
        }
    }

    private static DescribeSnapshotSchedulesResultStaxUnmarshaller instance;

    public static DescribeSnapshotSchedulesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSnapshotSchedulesResultStaxUnmarshaller();
        return instance;
    }
}
