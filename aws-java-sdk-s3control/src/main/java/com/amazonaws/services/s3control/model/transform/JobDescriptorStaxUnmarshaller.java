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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.s3control.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * JobDescriptor StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDescriptorStaxUnmarshaller implements Unmarshaller<JobDescriptor, StaxUnmarshallerContext> {

    public JobDescriptor unmarshall(StaxUnmarshallerContext context) throws Exception {
        JobDescriptor jobDescriptor = new JobDescriptor();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return jobDescriptor;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("JobId", targetDepth)) {
                    jobDescriptor.setJobId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ConfirmationRequired", targetDepth)) {
                    jobDescriptor.setConfirmationRequired(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    jobDescriptor.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("JobArn", targetDepth)) {
                    jobDescriptor.setJobArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    jobDescriptor.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Manifest", targetDepth)) {
                    jobDescriptor.setManifest(JobManifestStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Operation", targetDepth)) {
                    jobDescriptor.setOperation(JobOperationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Priority", targetDepth)) {
                    jobDescriptor.setPriority(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgressSummary", targetDepth)) {
                    jobDescriptor.setProgressSummary(JobProgressSummaryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusUpdateReason", targetDepth)) {
                    jobDescriptor.setStatusUpdateReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureReasons", targetDepth)) {
                    jobDescriptor.withFailureReasons(new ArrayList<JobFailure>());
                    continue;
                }

                if (context.testExpression("FailureReasons/member", targetDepth)) {
                    jobDescriptor.withFailureReasons(JobFailureStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Report", targetDepth)) {
                    jobDescriptor.setReport(JobReportStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreationTime", targetDepth)) {
                    jobDescriptor.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TerminationDate", targetDepth)) {
                    jobDescriptor.setTerminationDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleArn", targetDepth)) {
                    jobDescriptor.setRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SuspendedDate", targetDepth)) {
                    jobDescriptor.setSuspendedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("SuspendedCause", targetDepth)) {
                    jobDescriptor.setSuspendedCause(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return jobDescriptor;
                }
            }
        }
    }

    private static JobDescriptorStaxUnmarshaller instance;

    public static JobDescriptorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobDescriptorStaxUnmarshaller();
        return instance;
    }
}
