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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * SnapshotDetail StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnapshotDetailStaxUnmarshaller implements Unmarshaller<SnapshotDetail, StaxUnmarshallerContext> {

    public SnapshotDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        SnapshotDetail snapshotDetail = new SnapshotDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return snapshotDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("description", targetDepth)) {
                    snapshotDetail.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("deviceName", targetDepth)) {
                    snapshotDetail.setDeviceName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("diskImageSize", targetDepth)) {
                    snapshotDetail.setDiskImageSize(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("format", targetDepth)) {
                    snapshotDetail.setFormat(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("progress", targetDepth)) {
                    snapshotDetail.setProgress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("snapshotId", targetDepth)) {
                    snapshotDetail.setSnapshotId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    snapshotDetail.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    snapshotDetail.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("url", targetDepth)) {
                    snapshotDetail.setUrl(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("userBucket", targetDepth)) {
                    snapshotDetail.setUserBucket(UserBucketDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapshotDetail;
                }
            }
        }
    }

    private static SnapshotDetailStaxUnmarshaller instance;

    public static SnapshotDetailStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotDetailStaxUnmarshaller();
        return instance;
    }
}
