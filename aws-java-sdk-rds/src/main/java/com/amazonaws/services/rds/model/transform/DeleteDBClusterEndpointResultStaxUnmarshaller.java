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
 * DeleteDBClusterEndpointResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBClusterEndpointResultStaxUnmarshaller implements Unmarshaller<DeleteDBClusterEndpointResult, StaxUnmarshallerContext> {

    public DeleteDBClusterEndpointResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeleteDBClusterEndpointResult deleteDBClusterEndpointResult = new DeleteDBClusterEndpointResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deleteDBClusterEndpointResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DBClusterEndpointIdentifier", targetDepth)) {
                    deleteDBClusterEndpointResult.setDBClusterEndpointIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterIdentifier", targetDepth)) {
                    deleteDBClusterEndpointResult.setDBClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterEndpointResourceIdentifier", targetDepth)) {
                    deleteDBClusterEndpointResult.setDBClusterEndpointResourceIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Endpoint", targetDepth)) {
                    deleteDBClusterEndpointResult.setEndpoint(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    deleteDBClusterEndpointResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointType", targetDepth)) {
                    deleteDBClusterEndpointResult.setEndpointType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomEndpointType", targetDepth)) {
                    deleteDBClusterEndpointResult.setCustomEndpointType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StaticMembers", targetDepth)) {
                    deleteDBClusterEndpointResult.withStaticMembers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("StaticMembers/member", targetDepth)) {
                    deleteDBClusterEndpointResult.withStaticMembers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExcludedMembers", targetDepth)) {
                    deleteDBClusterEndpointResult.withExcludedMembers(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ExcludedMembers/member", targetDepth)) {
                    deleteDBClusterEndpointResult.withExcludedMembers(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBClusterEndpointArn", targetDepth)) {
                    deleteDBClusterEndpointResult.setDBClusterEndpointArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deleteDBClusterEndpointResult;
                }
            }
        }
    }

    private static DeleteDBClusterEndpointResultStaxUnmarshaller instance;

    public static DeleteDBClusterEndpointResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeleteDBClusterEndpointResultStaxUnmarshaller();
        return instance;
    }
}
