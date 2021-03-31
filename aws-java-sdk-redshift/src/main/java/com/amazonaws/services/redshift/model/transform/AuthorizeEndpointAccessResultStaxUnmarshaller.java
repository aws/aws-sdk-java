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
 * AuthorizeEndpointAccessResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeEndpointAccessResultStaxUnmarshaller implements Unmarshaller<AuthorizeEndpointAccessResult, StaxUnmarshallerContext> {

    public AuthorizeEndpointAccessResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AuthorizeEndpointAccessResult authorizeEndpointAccessResult = new AuthorizeEndpointAccessResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return authorizeEndpointAccessResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Grantor", targetDepth)) {
                    authorizeEndpointAccessResult.setGrantor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grantee", targetDepth)) {
                    authorizeEndpointAccessResult.setGrantee(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    authorizeEndpointAccessResult.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthorizeTime", targetDepth)) {
                    authorizeEndpointAccessResult.setAuthorizeTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterStatus", targetDepth)) {
                    authorizeEndpointAccessResult.setClusterStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    authorizeEndpointAccessResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedAllVPCs", targetDepth)) {
                    authorizeEndpointAccessResult.setAllowedAllVPCs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedVPCs", targetDepth)) {
                    authorizeEndpointAccessResult.withAllowedVPCs(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AllowedVPCs/VpcIdentifier", targetDepth)) {
                    authorizeEndpointAccessResult.withAllowedVPCs(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointCount", targetDepth)) {
                    authorizeEndpointAccessResult.setEndpointCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return authorizeEndpointAccessResult;
                }
            }
        }
    }

    private static AuthorizeEndpointAccessResultStaxUnmarshaller instance;

    public static AuthorizeEndpointAccessResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizeEndpointAccessResultStaxUnmarshaller();
        return instance;
    }
}
