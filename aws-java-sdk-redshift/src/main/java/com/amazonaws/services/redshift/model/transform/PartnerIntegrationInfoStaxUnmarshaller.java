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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PartnerIntegrationInfo StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PartnerIntegrationInfoStaxUnmarshaller implements Unmarshaller<PartnerIntegrationInfo, StaxUnmarshallerContext> {

    public PartnerIntegrationInfo unmarshall(StaxUnmarshallerContext context) throws Exception {
        PartnerIntegrationInfo partnerIntegrationInfo = new PartnerIntegrationInfo();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return partnerIntegrationInfo;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DatabaseName", targetDepth)) {
                    partnerIntegrationInfo.setDatabaseName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PartnerName", targetDepth)) {
                    partnerIntegrationInfo.setPartnerName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    partnerIntegrationInfo.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatusMessage", targetDepth)) {
                    partnerIntegrationInfo.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CreatedAt", targetDepth)) {
                    partnerIntegrationInfo.setCreatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UpdatedAt", targetDepth)) {
                    partnerIntegrationInfo.setUpdatedAt(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return partnerIntegrationInfo;
                }
            }
        }
    }

    private static PartnerIntegrationInfoStaxUnmarshaller instance;

    public static PartnerIntegrationInfoStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PartnerIntegrationInfoStaxUnmarshaller();
        return instance;
    }
}
