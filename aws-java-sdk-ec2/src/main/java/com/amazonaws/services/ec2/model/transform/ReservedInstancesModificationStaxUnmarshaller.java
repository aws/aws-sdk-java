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
package com.amazonaws.services.ec2.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ReservedInstancesModification StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedInstancesModificationStaxUnmarshaller implements Unmarshaller<ReservedInstancesModification, StaxUnmarshallerContext> {

    public ReservedInstancesModification unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedInstancesModification reservedInstancesModification = new ReservedInstancesModification();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedInstancesModification;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("clientToken", targetDepth)) {
                    reservedInstancesModification.setClientToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createDate", targetDepth)) {
                    reservedInstancesModification.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("effectiveDate", targetDepth)) {
                    reservedInstancesModification.setEffectiveDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("modificationResultSet", targetDepth)) {
                    reservedInstancesModification.withModificationResults(new ArrayList<ReservedInstancesModificationResult>());
                    continue;
                }

                if (context.testExpression("modificationResultSet/item", targetDepth)) {
                    reservedInstancesModification
                            .withModificationResults(ReservedInstancesModificationResultStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservedInstancesSet", targetDepth)) {
                    reservedInstancesModification.withReservedInstancesIds(new ArrayList<ReservedInstancesId>());
                    continue;
                }

                if (context.testExpression("reservedInstancesSet/item", targetDepth)) {
                    reservedInstancesModification.withReservedInstancesIds(ReservedInstancesIdStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservedInstancesModificationId", targetDepth)) {
                    reservedInstancesModification.setReservedInstancesModificationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    reservedInstancesModification.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("statusMessage", targetDepth)) {
                    reservedInstancesModification.setStatusMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("updateDate", targetDepth)) {
                    reservedInstancesModification.setUpdateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedInstancesModification;
                }
            }
        }
    }

    private static ReservedInstancesModificationStaxUnmarshaller instance;

    public static ReservedInstancesModificationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedInstancesModificationStaxUnmarshaller();
        return instance;
    }
}
