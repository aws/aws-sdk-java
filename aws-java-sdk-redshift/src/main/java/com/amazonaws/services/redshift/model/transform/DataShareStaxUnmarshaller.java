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
 * DataShare StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataShareStaxUnmarshaller implements Unmarshaller<DataShare, StaxUnmarshallerContext> {

    public DataShare unmarshall(StaxUnmarshallerContext context) throws Exception {
        DataShare dataShare = new DataShare();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return dataShare;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataShareArn", targetDepth)) {
                    dataShare.setDataShareArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProducerArn", targetDepth)) {
                    dataShare.setProducerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowPubliclyAccessibleConsumers", targetDepth)) {
                    dataShare.setAllowPubliclyAccessibleConsumers(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataShareAssociations", targetDepth)) {
                    dataShare.withDataShareAssociations(new ArrayList<DataShareAssociation>());
                    continue;
                }

                if (context.testExpression("DataShareAssociations/member", targetDepth)) {
                    dataShare.withDataShareAssociations(DataShareAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManagedBy", targetDepth)) {
                    dataShare.setManagedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return dataShare;
                }
            }
        }
    }

    private static DataShareStaxUnmarshaller instance;

    public static DataShareStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataShareStaxUnmarshaller();
        return instance;
    }
}
