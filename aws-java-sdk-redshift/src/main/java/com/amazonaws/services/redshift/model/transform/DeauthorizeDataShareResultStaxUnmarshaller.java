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
 * DeauthorizeDataShareResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeauthorizeDataShareResultStaxUnmarshaller implements Unmarshaller<DeauthorizeDataShareResult, StaxUnmarshallerContext> {

    public DeauthorizeDataShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeauthorizeDataShareResult deauthorizeDataShareResult = new DeauthorizeDataShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return deauthorizeDataShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataShareArn", targetDepth)) {
                    deauthorizeDataShareResult.setDataShareArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProducerArn", targetDepth)) {
                    deauthorizeDataShareResult.setProducerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowPubliclyAccessibleConsumers", targetDepth)) {
                    deauthorizeDataShareResult.setAllowPubliclyAccessibleConsumers(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataShareAssociations", targetDepth)) {
                    deauthorizeDataShareResult.withDataShareAssociations(new ArrayList<DataShareAssociation>());
                    continue;
                }

                if (context.testExpression("DataShareAssociations/member", targetDepth)) {
                    deauthorizeDataShareResult.withDataShareAssociations(DataShareAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManagedBy", targetDepth)) {
                    deauthorizeDataShareResult.setManagedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deauthorizeDataShareResult;
                }
            }
        }
    }

    private static DeauthorizeDataShareResultStaxUnmarshaller instance;

    public static DeauthorizeDataShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeauthorizeDataShareResultStaxUnmarshaller();
        return instance;
    }
}
