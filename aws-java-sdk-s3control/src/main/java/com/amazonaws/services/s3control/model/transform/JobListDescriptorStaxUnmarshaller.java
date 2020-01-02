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
package com.amazonaws.services.s3control.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * JobListDescriptor StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobListDescriptorStaxUnmarshaller implements Unmarshaller<JobListDescriptor, StaxUnmarshallerContext> {

    public JobListDescriptor unmarshall(StaxUnmarshallerContext context) throws Exception {
        JobListDescriptor jobListDescriptor = new JobListDescriptor();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return jobListDescriptor;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("JobId", targetDepth)) {
                    jobListDescriptor.setJobId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    jobListDescriptor.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Operation", targetDepth)) {
                    jobListDescriptor.setOperation(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Priority", targetDepth)) {
                    jobListDescriptor.setPriority(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    jobListDescriptor.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationTime", targetDepth)) {
                    jobListDescriptor.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TerminationDate", targetDepth)) {
                    jobListDescriptor.setTerminationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgressSummary", targetDepth)) {
                    jobListDescriptor.setProgressSummary(JobProgressSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return jobListDescriptor;
                }
            }
        }
    }

    private static JobListDescriptorStaxUnmarshaller instance;

    public static JobListDescriptorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobListDescriptorStaxUnmarshaller();
        return instance;
    }
}
