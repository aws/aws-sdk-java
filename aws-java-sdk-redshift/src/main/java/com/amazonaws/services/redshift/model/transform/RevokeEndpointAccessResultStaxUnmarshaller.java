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
 * RevokeEndpointAccessResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeEndpointAccessResultStaxUnmarshaller implements Unmarshaller<RevokeEndpointAccessResult, StaxUnmarshallerContext> {

    public RevokeEndpointAccessResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        RevokeEndpointAccessResult revokeEndpointAccessResult = new RevokeEndpointAccessResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return revokeEndpointAccessResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Grantor", targetDepth)) {
                    revokeEndpointAccessResult.setGrantor(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Grantee", targetDepth)) {
                    revokeEndpointAccessResult.setGrantee(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    revokeEndpointAccessResult.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AuthorizeTime", targetDepth)) {
                    revokeEndpointAccessResult.setAuthorizeTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("ClusterStatus", targetDepth)) {
                    revokeEndpointAccessResult.setClusterStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    revokeEndpointAccessResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedAllVPCs", targetDepth)) {
                    revokeEndpointAccessResult.setAllowedAllVPCs(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedVPCs", targetDepth)) {
                    revokeEndpointAccessResult.withAllowedVPCs(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("AllowedVPCs/VpcIdentifier", targetDepth)) {
                    revokeEndpointAccessResult.withAllowedVPCs(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EndpointCount", targetDepth)) {
                    revokeEndpointAccessResult.setEndpointCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return revokeEndpointAccessResult;
                }
            }
        }
    }

    private static RevokeEndpointAccessResultStaxUnmarshaller instance;

    public static RevokeEndpointAccessResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new RevokeEndpointAccessResultStaxUnmarshaller();
        return instance;
    }
}
