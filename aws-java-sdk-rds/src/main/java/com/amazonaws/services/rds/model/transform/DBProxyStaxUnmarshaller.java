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
 * DBProxy StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBProxyStaxUnmarshaller implements Unmarshaller<DBProxy, StaxUnmarshallerContext> {

    public DBProxy unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBProxy dBProxy = new DBProxy();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBProxy;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBProxyName", targetDepth)) {
                    dBProxy.setDBProxyName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBProxyArn", targetDepth)) {
                    dBProxy.setDBProxyArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBProxy.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineFamily", targetDepth)) {
                    dBProxy.setEngineFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupIds", targetDepth)) {
                    dBProxy.withVpcSecurityGroupIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupIds/member", targetDepth)) {
                    dBProxy.withVpcSecurityGroupIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSubnetIds", targetDepth)) {
                    dBProxy.withVpcSubnetIds(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("VpcSubnetIds/member", targetDepth)) {
                    dBProxy.withVpcSubnetIds(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Auth", targetDepth)) {
                    dBProxy.withAuth(new ArrayList<UserAuthConfigInfo>());
                    continue;
                }

                if (context.testExpression("Auth/member", targetDepth)) {
                    dBProxy.withAuth(UserAuthConfigInfoStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RoleArn", targetDepth)) {
                    dBProxy.setRoleArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    dBProxy.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RequireTLS", targetDepth)) {
                    dBProxy.setRequireTLS(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IdleClientTimeout", targetDepth)) {
                    dBProxy.setIdleClientTimeout(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DebugLogging", targetDepth)) {
                    dBProxy.setDebugLogging(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedDate", targetDepth)) {
                    dBProxy.setCreatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdatedDate", targetDepth)) {
                    dBProxy.setUpdatedDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBProxy;
                }
            }
        }
    }

    private static DBProxyStaxUnmarshaller instance;

    public static DBProxyStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBProxyStaxUnmarshaller();
        return instance;
    }
}
