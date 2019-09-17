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
 * CancelResizeResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelResizeResultStaxUnmarshaller implements Unmarshaller<CancelResizeResult, StaxUnmarshallerContext> {

    public CancelResizeResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        CancelResizeResult cancelResizeResult = new CancelResizeResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cancelResizeResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TargetNodeType", targetDepth)) {
                    cancelResizeResult.setTargetNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetNumberOfNodes", targetDepth)) {
                    cancelResizeResult.setTargetNumberOfNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetClusterType", targetDepth)) {
                    cancelResizeResult.setTargetClusterType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    cancelResizeResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ImportTablesCompleted", targetDepth)) {
                    cancelResizeResult.withImportTablesCompleted(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ImportTablesCompleted/member", targetDepth)) {
                    cancelResizeResult.withImportTablesCompleted(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ImportTablesInProgress", targetDepth)) {
                    cancelResizeResult.withImportTablesInProgress(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ImportTablesInProgress/member", targetDepth)) {
                    cancelResizeResult.withImportTablesInProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ImportTablesNotStarted", targetDepth)) {
                    cancelResizeResult.withImportTablesNotStarted(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ImportTablesNotStarted/member", targetDepth)) {
                    cancelResizeResult.withImportTablesNotStarted(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AvgResizeRateInMegaBytesPerSecond", targetDepth)) {
                    cancelResizeResult.setAvgResizeRateInMegaBytesPerSecond(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TotalResizeDataInMegaBytes", targetDepth)) {
                    cancelResizeResult.setTotalResizeDataInMegaBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProgressInMegaBytes", targetDepth)) {
                    cancelResizeResult.setProgressInMegaBytes(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ElapsedTimeInSeconds", targetDepth)) {
                    cancelResizeResult.setElapsedTimeInSeconds(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EstimatedTimeToCompletionInSeconds", targetDepth)) {
                    cancelResizeResult.setEstimatedTimeToCompletionInSeconds(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResizeType", targetDepth)) {
                    cancelResizeResult.setResizeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Message", targetDepth)) {
                    cancelResizeResult.setMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetEncryptionType", targetDepth)) {
                    cancelResizeResult.setTargetEncryptionType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataTransferProgressPercent", targetDepth)) {
                    cancelResizeResult.setDataTransferProgressPercent(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cancelResizeResult;
                }
            }
        }
    }

    private static CancelResizeResultStaxUnmarshaller instance;

    public static CancelResizeResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CancelResizeResultStaxUnmarshaller();
        return instance;
    }
}
