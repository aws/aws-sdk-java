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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CancelExportTaskResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelExportTaskResultStaxUnmarshaller implements Unmarshaller<CancelExportTaskResult, StaxUnmarshallerContext> {

    public CancelExportTaskResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CancelExportTaskResult cancelExportTaskResult = new CancelExportTaskResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cancelExportTaskResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ExportTaskIdentifier", targetDepth)) {
                    cancelExportTaskResult.setExportTaskIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SourceArn", targetDepth)) {
                    cancelExportTaskResult.setSourceArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExportOnly", targetDepth)) {
                    cancelExportTaskResult.withExportOnly(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExportOnly/member", targetDepth)) {
                    cancelExportTaskResult.withExportOnly(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SnapshotTime", targetDepth)) {
                    cancelExportTaskResult.setSnapshotTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TaskStartTime", targetDepth)) {
                    cancelExportTaskResult.setTaskStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TaskEndTime", targetDepth)) {
                    cancelExportTaskResult.setTaskEndTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3Bucket", targetDepth)) {
                    cancelExportTaskResult.setS3Bucket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3Prefix", targetDepth)) {
                    cancelExportTaskResult.setS3Prefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IamRoleArn", targetDepth)) {
                    cancelExportTaskResult.setIamRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("KmsKeyId", targetDepth)) {
                    cancelExportTaskResult.setKmsKeyId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    cancelExportTaskResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PercentProgress", targetDepth)) {
                    cancelExportTaskResult.setPercentProgress(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TotalExtractedDataInGB", targetDepth)) {
                    cancelExportTaskResult.setTotalExtractedDataInGB(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FailureCause", targetDepth)) {
                    cancelExportTaskResult.setFailureCause(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("WarningMessage", targetDepth)) {
                    cancelExportTaskResult.setWarningMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cancelExportTaskResult;
                }
            }
        }
    }

    private static CancelExportTaskResultStaxUnmarshaller instance;

    public static CancelExportTaskResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CancelExportTaskResultStaxUnmarshaller();
        return instance;
    }
}
