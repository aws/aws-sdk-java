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
 * AssociateDataShareConsumerResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateDataShareConsumerResultStaxUnmarshaller implements Unmarshaller<AssociateDataShareConsumerResult, StaxUnmarshallerContext> {

    public AssociateDataShareConsumerResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AssociateDataShareConsumerResult associateDataShareConsumerResult = new AssociateDataShareConsumerResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return associateDataShareConsumerResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataShareArn", targetDepth)) {
                    associateDataShareConsumerResult.setDataShareArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProducerArn", targetDepth)) {
                    associateDataShareConsumerResult.setProducerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowPubliclyAccessibleConsumers", targetDepth)) {
                    associateDataShareConsumerResult.setAllowPubliclyAccessibleConsumers(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataShareAssociations", targetDepth)) {
                    associateDataShareConsumerResult.withDataShareAssociations(new ArrayList<DataShareAssociation>());
                    continue;
                }

                if (context.testExpression("DataShareAssociations/member", targetDepth)) {
                    associateDataShareConsumerResult.withDataShareAssociations(DataShareAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManagedBy", targetDepth)) {
                    associateDataShareConsumerResult.setManagedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return associateDataShareConsumerResult;
                }
            }
        }
    }

    private static AssociateDataShareConsumerResultStaxUnmarshaller instance;

    public static AssociateDataShareConsumerResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateDataShareConsumerResultStaxUnmarshaller();
        return instance;
    }
}
