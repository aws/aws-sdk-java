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
 * AuthorizeDataShareResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthorizeDataShareResultStaxUnmarshaller implements Unmarshaller<AuthorizeDataShareResult, StaxUnmarshallerContext> {

    public AuthorizeDataShareResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        AuthorizeDataShareResult authorizeDataShareResult = new AuthorizeDataShareResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return authorizeDataShareResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("DataShareArn", targetDepth)) {
                    authorizeDataShareResult.setDataShareArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ProducerArn", targetDepth)) {
                    authorizeDataShareResult.setProducerArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowPubliclyAccessibleConsumers", targetDepth)) {
                    authorizeDataShareResult.setAllowPubliclyAccessibleConsumers(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataShareAssociations", targetDepth)) {
                    authorizeDataShareResult.withDataShareAssociations(new ArrayList<DataShareAssociation>());
                    continue;
                }

                if (context.testExpression("DataShareAssociations/member", targetDepth)) {
                    authorizeDataShareResult.withDataShareAssociations(DataShareAssociationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ManagedBy", targetDepth)) {
                    authorizeDataShareResult.setManagedBy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return authorizeDataShareResult;
                }
            }
        }
    }

    private static AuthorizeDataShareResultStaxUnmarshaller instance;

    public static AuthorizeDataShareResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizeDataShareResultStaxUnmarshaller();
        return instance;
    }
}
