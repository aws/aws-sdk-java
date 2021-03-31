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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EndpointAuthorization StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointAuthorizationStaxUnmarshaller implements Unmarshaller<EndpointAuthorization, StaxUnmarshallerContext> {

    public EndpointAuthorization unmarshall(StaxUnmarshallerContext context) throws Exception {
        EndpointAuthorization endpointAuthorization = new EndpointAuthorization();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return endpointAuthorization;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Grantor", targetDepth)) {
                    endpointAuthorization.setGrantor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grantee", targetDepth)) {
                    endpointAuthorization.setGrantee(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    endpointAuthorization.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthorizeTime", targetDepth)) {
                    endpointAuthorization.setAuthorizeTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterStatus", targetDepth)) {
                    endpointAuthorization.setClusterStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    endpointAuthorization.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedAllVPCs", targetDepth)) {
                    endpointAuthorization.setAllowedAllVPCs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedVPCs", targetDepth)) {
                    endpointAuthorization.withAllowedVPCs(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AllowedVPCs/VpcIdentifier", targetDepth)) {
                    endpointAuthorization.withAllowedVPCs(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointCount", targetDepth)) {
                    endpointAuthorization.setEndpointCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return endpointAuthorization;
                }
            }
        }
    }

    private static EndpointAuthorizationStaxUnmarshaller instance;

    public static EndpointAuthorizationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointAuthorizationStaxUnmarshaller();
        return instance;
    }
}
