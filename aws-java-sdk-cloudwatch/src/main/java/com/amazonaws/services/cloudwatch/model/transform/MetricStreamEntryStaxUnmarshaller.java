/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatch.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricStreamEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricStreamEntryStaxUnmarshaller implements Unmarshaller<MetricStreamEntry, StaxUnmarshallerContext> {

    public MetricStreamEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        MetricStreamEntry metricStreamEntry = new MetricStreamEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricStreamEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Arn", targetDepth)) {
                    metricStreamEntry.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationDate", targetDepth)) {
                    metricStreamEntry.setCreationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastUpdateDate", targetDepth)) {
                    metricStreamEntry.setLastUpdateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    metricStreamEntry.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FirehoseArn", targetDepth)) {
                    metricStreamEntry.setFirehoseArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    metricStreamEntry.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OutputFormat", targetDepth)) {
                    metricStreamEntry.setOutputFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricStreamEntry;
                }
            }
        }
    }

    private static MetricStreamEntryStaxUnmarshaller instance;

    public static MetricStreamEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricStreamEntryStaxUnmarshaller();
        return instance;
    }
}
