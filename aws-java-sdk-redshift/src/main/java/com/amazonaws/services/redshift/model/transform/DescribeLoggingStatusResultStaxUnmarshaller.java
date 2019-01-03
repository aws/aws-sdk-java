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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeLoggingStatusResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLoggingStatusResultStaxUnmarshaller implements Unmarshaller<DescribeLoggingStatusResult, StaxUnmarshallerContext> {

    public DescribeLoggingStatusResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeLoggingStatusResult describeLoggingStatusResult = new DescribeLoggingStatusResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeLoggingStatusResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LoggingEnabled", targetDepth)) {
                    describeLoggingStatusResult.setLoggingEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BucketName", targetDepth)) {
                    describeLoggingStatusResult.setBucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    describeLoggingStatusResult.setS3KeyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastSuccessfulDeliveryTime", targetDepth)) {
                    describeLoggingStatusResult.setLastSuccessfulDeliveryTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastFailureTime", targetDepth)) {
                    describeLoggingStatusResult.setLastFailureTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    describeLoggingStatusResult.setLastFailureMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeLoggingStatusResult;
                }
            }
        }
    }

    private static DescribeLoggingStatusResultStaxUnmarshaller instance;

    public static DescribeLoggingStatusResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLoggingStatusResultStaxUnmarshaller();
        return instance;
    }
}
