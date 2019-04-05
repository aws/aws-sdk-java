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
package com.amazonaws.services.docdb.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.docdb.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PendingCloudwatchLogsExports StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingCloudwatchLogsExportsStaxUnmarshaller implements Unmarshaller<PendingCloudwatchLogsExports, StaxUnmarshallerContext> {

    public PendingCloudwatchLogsExports unmarshall(StaxUnmarshallerContext context) throws Exception {
        PendingCloudwatchLogsExports pendingCloudwatchLogsExports = new PendingCloudwatchLogsExports();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return pendingCloudwatchLogsExports;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LogTypesToEnable", targetDepth)) {
                    pendingCloudwatchLogsExports.withLogTypesToEnable(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("LogTypesToEnable/member", targetDepth)) {
                    pendingCloudwatchLogsExports.withLogTypesToEnable(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LogTypesToDisable", targetDepth)) {
                    pendingCloudwatchLogsExports.withLogTypesToDisable(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("LogTypesToDisable/member", targetDepth)) {
                    pendingCloudwatchLogsExports.withLogTypesToDisable(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return pendingCloudwatchLogsExports;
                }
            }
        }
    }

    private static PendingCloudwatchLogsExportsStaxUnmarshaller instance;

    public static PendingCloudwatchLogsExportsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PendingCloudwatchLogsExportsStaxUnmarshaller();
        return instance;
    }
}
