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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StackSetDriftDetectionDetails StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetDriftDetectionDetailsStaxUnmarshaller implements Unmarshaller<StackSetDriftDetectionDetails, StaxUnmarshallerContext> {

    public StackSetDriftDetectionDetails unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackSetDriftDetectionDetails stackSetDriftDetectionDetails = new StackSetDriftDetectionDetails();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return stackSetDriftDetectionDetails;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DriftStatus", targetDepth)) {
                    stackSetDriftDetectionDetails.setDriftStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DriftDetectionStatus", targetDepth)) {
                    stackSetDriftDetectionDetails.setDriftDetectionStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastDriftCheckTimestamp", targetDepth)) {
                    stackSetDriftDetectionDetails.setLastDriftCheckTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TotalStackInstancesCount", targetDepth)) {
                    stackSetDriftDetectionDetails.setTotalStackInstancesCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DriftedStackInstancesCount", targetDepth)) {
                    stackSetDriftDetectionDetails.setDriftedStackInstancesCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InSyncStackInstancesCount", targetDepth)) {
                    stackSetDriftDetectionDetails.setInSyncStackInstancesCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InProgressStackInstancesCount", targetDepth)) {
                    stackSetDriftDetectionDetails.setInProgressStackInstancesCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailedStackInstancesCount", targetDepth)) {
                    stackSetDriftDetectionDetails.setFailedStackInstancesCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stackSetDriftDetectionDetails;
                }
            }
        }
    }

    private static StackSetDriftDetectionDetailsStaxUnmarshaller instance;

    public static StackSetDriftDetectionDetailsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackSetDriftDetectionDetailsStaxUnmarshaller();
        return instance;
    }
}
