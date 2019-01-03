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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DBClusterBacktrack StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DBClusterBacktrackStaxUnmarshaller implements Unmarshaller<DBClusterBacktrack, StaxUnmarshallerContext> {

    public DBClusterBacktrack unmarshall(StaxUnmarshallerContext context) throws Exception {
        DBClusterBacktrack dBClusterBacktrack = new DBClusterBacktrack();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dBClusterBacktrack;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    dBClusterBacktrack.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BacktrackIdentifier", targetDepth)) {
                    dBClusterBacktrack.setBacktrackIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("BacktrackTo", targetDepth)) {
                    dBClusterBacktrack.setBacktrackTo(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("BacktrackedFrom", targetDepth)) {
                    dBClusterBacktrack.setBacktrackedFrom(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("BacktrackRequestCreationTime", targetDepth)) {
                    dBClusterBacktrack.setBacktrackRequestCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    dBClusterBacktrack.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dBClusterBacktrack;
                }
            }
        }
    }

    private static DBClusterBacktrackStaxUnmarshaller instance;

    public static DBClusterBacktrackStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterBacktrackStaxUnmarshaller();
        return instance;
    }
}
