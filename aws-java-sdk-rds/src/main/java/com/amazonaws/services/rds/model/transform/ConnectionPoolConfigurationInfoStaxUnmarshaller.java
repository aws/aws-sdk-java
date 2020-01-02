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
 * ConnectionPoolConfigurationInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionPoolConfigurationInfoStaxUnmarshaller implements Unmarshaller<ConnectionPoolConfigurationInfo, StaxUnmarshallerContext> {

    public ConnectionPoolConfigurationInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        ConnectionPoolConfigurationInfo connectionPoolConfigurationInfo = new ConnectionPoolConfigurationInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return connectionPoolConfigurationInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MaxConnectionsPercent", targetDepth)) {
                    connectionPoolConfigurationInfo.setMaxConnectionsPercent(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxIdleConnectionsPercent", targetDepth)) {
                    connectionPoolConfigurationInfo.setMaxIdleConnectionsPercent(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ConnectionBorrowTimeout", targetDepth)) {
                    connectionPoolConfigurationInfo.setConnectionBorrowTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionPinningFilters", targetDepth)) {
                    connectionPoolConfigurationInfo.withSessionPinningFilters(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SessionPinningFilters/member", targetDepth)) {
                    connectionPoolConfigurationInfo.withSessionPinningFilters(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InitQuery", targetDepth)) {
                    connectionPoolConfigurationInfo.setInitQuery(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return connectionPoolConfigurationInfo;
                }
            }
        }
    }

    private static ConnectionPoolConfigurationInfoStaxUnmarshaller instance;

    public static ConnectionPoolConfigurationInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionPoolConfigurationInfoStaxUnmarshaller();
        return instance;
    }
}
