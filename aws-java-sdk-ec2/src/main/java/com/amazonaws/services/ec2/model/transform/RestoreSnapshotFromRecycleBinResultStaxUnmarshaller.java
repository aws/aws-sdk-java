/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * RestoreSnapshotFromRecycleBinResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreSnapshotFromRecycleBinResultStaxUnmarshaller implements Unmarshaller<RestoreSnapshotFromRecycleBinResult, StaxUnmarshallerContext> {

    public RestoreSnapshotFromRecycleBinResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RestoreSnapshotFromRecycleBinResult restoreSnapshotFromRecycleBinResult = new RestoreSnapshotFromRecycleBinResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return restoreSnapshotFromRecycleBinResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("snapshotId", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("outpostArn", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setOutpostArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("description", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("encrypted", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("progress", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("startTime", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeId", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setVolumeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("volumeSize", targetDepth)) {
                    restoreSnapshotFromRecycleBinResult.setVolumeSize(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return restoreSnapshotFromRecycleBinResult;
                }
            }
        }
    }

    private static RestoreSnapshotFromRecycleBinResultStaxUnmarshaller instance;

    public static RestoreSnapshotFromRecycleBinResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RestoreSnapshotFromRecycleBinResultStaxUnmarshaller();
        return instance;
    }
}
