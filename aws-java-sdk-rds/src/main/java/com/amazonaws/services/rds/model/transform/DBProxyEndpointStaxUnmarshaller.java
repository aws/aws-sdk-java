/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DBProxyEndpoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBProxyEndpointStaxUnmarshaller implements Unmarshaller<DBProxyEndpoint, StaxUnmarshallerContext> {

    public DBProxyEndpoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBProxyEndpoint dBProxyEndpoint = new DBProxyEndpoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBProxyEndpoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBProxyEndpointName", targetDepth)) {
                    dBProxyEndpoint.setDBProxyEndpointName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBProxyEndpointArn", targetDepth)) {
                    dBProxyEndpoint.setDBProxyEndpointArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBProxyName", targetDepth)) {
                    dBProxyEndpoint.setDBProxyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBProxyEndpoint.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    dBProxyEndpoint.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupIds", targetDepth)) {
                    dBProxyEndpoint.withVpcSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupIds/member", targetDepth)) {
                    dBProxyEndpoint.withVpcSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSubnetIds", targetDepth)) {
                    dBProxyEndpoint.withVpcSubnetIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("VpcSubnetIds/member", targetDepth)) {
                    dBProxyEndpoint.withVpcSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    dBProxyEndpoint.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedDate", targetDepth)) {
                    dBProxyEndpoint.setCreatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TargetRole", targetDepth)) {
                    dBProxyEndpoint.setTargetRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsDefault", targetDepth)) {
                    dBProxyEndpoint.setIsDefault(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBProxyEndpoint;
                }
            }
        }
    }

    private static DBProxyEndpointStaxUnmarshaller instance;

    public static DBProxyEndpointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyEndpointStaxUnmarshaller();
        return instance;
    }
}
