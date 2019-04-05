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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeDBClusterSnapshotsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBClusterSnapshotsResultStaxUnmarshaller implements Unmarshaller<DescribeDBClusterSnapshotsResult, StaxUnmarshallerContext> {

    public DescribeDBClusterSnapshotsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeDBClusterSnapshotsResult describeDBClusterSnapshotsResult = new DescribeDBClusterSnapshotsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeDBClusterSnapshotsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeDBClusterSnapshotsResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterSnapshots", targetDepth)) {
                    describeDBClusterSnapshotsResult.withDBClusterSnapshots(new ArrayList<DBClusterSnapshot>());
                    continue;
                }

                if (context.testExpression("DBClusterSnapshots/DBClusterSnapshot", targetDepth)) {
                    describeDBClusterSnapshotsResult.withDBClusterSnapshots(DBClusterSnapshotStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeDBClusterSnapshotsResult;
                }
            }
        }
    }

    private static DescribeDBClusterSnapshotsResultStaxUnmarshaller instance;

    public static DescribeDBClusterSnapshotsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDBClusterSnapshotsResultStaxUnmarshaller();
        return instance;
    }
}
