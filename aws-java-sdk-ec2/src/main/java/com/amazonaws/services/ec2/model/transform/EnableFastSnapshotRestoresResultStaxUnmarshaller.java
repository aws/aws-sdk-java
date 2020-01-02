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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EnableFastSnapshotRestoresResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableFastSnapshotRestoresResultStaxUnmarshaller implements Unmarshaller<EnableFastSnapshotRestoresResult, StaxUnmarshallerContext> {

    public EnableFastSnapshotRestoresResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        EnableFastSnapshotRestoresResult enableFastSnapshotRestoresResult = new EnableFastSnapshotRestoresResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return enableFastSnapshotRestoresResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("successful", targetDepth)) {
                    enableFastSnapshotRestoresResult.withSuccessful(new ArrayList<EnableFastSnapshotRestoreSuccessItem>());
                    continue;
                }

                if (context.testExpression("successful/item", targetDepth)) {
                    enableFastSnapshotRestoresResult.withSuccessful(EnableFastSnapshotRestoreSuccessItemStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("unsuccessful", targetDepth)) {
                    enableFastSnapshotRestoresResult.withUnsuccessful(new ArrayList<EnableFastSnapshotRestoreErrorItem>());
                    continue;
                }

                if (context.testExpression("unsuccessful/item", targetDepth)) {
                    enableFastSnapshotRestoresResult.withUnsuccessful(EnableFastSnapshotRestoreErrorItemStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return enableFastSnapshotRestoresResult;
                }
            }
        }
    }

    private static EnableFastSnapshotRestoresResultStaxUnmarshaller instance;

    public static EnableFastSnapshotRestoresResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnableFastSnapshotRestoresResultStaxUnmarshaller();
        return instance;
    }
}
