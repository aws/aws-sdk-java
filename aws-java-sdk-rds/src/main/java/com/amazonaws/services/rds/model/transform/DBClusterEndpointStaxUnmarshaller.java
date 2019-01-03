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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBClusterEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterEndpointStaxUnmarshaller implements Unmarshaller<DBClusterEndpoint, StaxUnmarshallerContext> {

    public DBClusterEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBClusterEndpoint dBClusterEndpoint = new DBClusterEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBClusterEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBClusterEndpointIdentifier", targetDepth)) {
                    dBClusterEndpoint.setDBClusterEndpointIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBClusterEndpoint.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterEndpointResourceIdentifier", targetDepth)) {
                    dBClusterEndpoint.setDBClusterEndpointResourceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    dBClusterEndpoint.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBClusterEndpoint.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointType", targetDepth)) {
                    dBClusterEndpoint.setEndpointType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomEndpointType", targetDepth)) {
                    dBClusterEndpoint.setCustomEndpointType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StaticMembers", targetDepth)) {
                    dBClusterEndpoint.withStaticMembers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("StaticMembers/member", targetDepth)) {
                    dBClusterEndpoint.withStaticMembers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExcludedMembers", targetDepth)) {
                    dBClusterEndpoint.withExcludedMembers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExcludedMembers/member", targetDepth)) {
                    dBClusterEndpoint.withExcludedMembers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterEndpointArn", targetDepth)) {
                    dBClusterEndpoint.setDBClusterEndpointArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBClusterEndpoint;
                }
            }
        }
    }

    private static DBClusterEndpointStaxUnmarshaller instance;

    public static DBClusterEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterEndpointStaxUnmarshaller();
        return instance;
    }
}
