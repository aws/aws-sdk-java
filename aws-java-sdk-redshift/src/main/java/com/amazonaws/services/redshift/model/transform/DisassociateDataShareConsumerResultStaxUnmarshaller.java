/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * DisassociateDataShareConsumerResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateDataShareConsumerResultStaxUnmarshaller implements Unmarshaller<DisassociateDataShareConsumerResult, StaxUnmarshallerContext> {

    public DisassociateDataShareConsumerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisassociateDataShareConsumerResult disassociateDataShareConsumerResult = new DisassociateDataShareConsumerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return disassociateDataShareConsumerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataShareArn", targetDepth)) {
                    disassociateDataShareConsumerResult.setDataShareArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProducerArn", targetDepth)) {
                    disassociateDataShareConsumerResult.setProducerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowPubliclyAccessibleConsumers", targetDepth)) {
                    disassociateDataShareConsumerResult.setAllowPubliclyAccessibleConsumers(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataShareAssociations", targetDepth)) {
                    disassociateDataShareConsumerResult.withDataShareAssociations(new ArrayList<DataShareAssociation>());
                    continue;
                }

                if (context.testExpression("DataShareAssociations/member", targetDepth)) {
                    disassociateDataShareConsumerResult.withDataShareAssociations(DataShareAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManagedBy", targetDepth)) {
                    disassociateDataShareConsumerResult.setManagedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disassociateDataShareConsumerResult;
                }
            }
        }
    }

    private static DisassociateDataShareConsumerResultStaxUnmarshaller instance;

    public static DisassociateDataShareConsumerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisassociateDataShareConsumerResultStaxUnmarshaller();
        return instance;
    }
}
