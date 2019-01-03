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
 * DescribeGlobalClustersResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalClustersResultStaxUnmarshaller implements Unmarshaller<DescribeGlobalClustersResult, StaxUnmarshallerContext> {

    public DescribeGlobalClustersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeGlobalClustersResult describeGlobalClustersResult = new DescribeGlobalClustersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeGlobalClustersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeGlobalClustersResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("GlobalClusters", targetDepth)) {
                    describeGlobalClustersResult.withGlobalClusters(new ArrayList<GlobalCluster>());
                    continue;
                }

                if (context.testExpression("GlobalClusters/GlobalClusterMember", targetDepth)) {
                    describeGlobalClustersResult.withGlobalClusters(GlobalClusterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeGlobalClustersResult;
                }
            }
        }
    }

    private static DescribeGlobalClustersResultStaxUnmarshaller instance;

    public static DescribeGlobalClustersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGlobalClustersResultStaxUnmarshaller();
        return instance;
    }
}
