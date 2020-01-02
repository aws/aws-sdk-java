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
 * ConnectionPoolConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectionPoolConfigurationStaxUnmarshaller implements Unmarshaller<ConnectionPoolConfiguration, StaxUnmarshallerContext> {

    public ConnectionPoolConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        ConnectionPoolConfiguration connectionPoolConfiguration = new ConnectionPoolConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return connectionPoolConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MaxConnectionsPercent", targetDepth)) {
                    connectionPoolConfiguration.setMaxConnectionsPercent(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxIdleConnectionsPercent", targetDepth)) {
                    connectionPoolConfiguration.setMaxIdleConnectionsPercent(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ConnectionBorrowTimeout", targetDepth)) {
                    connectionPoolConfiguration.setConnectionBorrowTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SessionPinningFilters", targetDepth)) {
                    connectionPoolConfiguration.withSessionPinningFilters(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("SessionPinningFilters/member", targetDepth)) {
                    connectionPoolConfiguration.withSessionPinningFilters(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InitQuery", targetDepth)) {
                    connectionPoolConfiguration.setInitQuery(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return connectionPoolConfiguration;
                }
            }
        }
    }

    private static ConnectionPoolConfigurationStaxUnmarshaller instance;

    public static ConnectionPoolConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectionPoolConfigurationStaxUnmarshaller();
        return instance;
    }
}
