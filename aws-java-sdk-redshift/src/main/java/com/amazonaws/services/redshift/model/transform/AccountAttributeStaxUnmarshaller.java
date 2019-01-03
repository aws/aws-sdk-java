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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * AccountAttribute StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountAttributeStaxUnmarshaller implements Unmarshaller<AccountAttribute, StaxUnmarshallerContext> {

    public AccountAttribute unmarshall(StaxUnmarshallerContext context) throws Exception {
        AccountAttribute accountAttribute = new AccountAttribute();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return accountAttribute;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AttributeName", targetDepth)) {
                    accountAttribute.setAttributeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AttributeValues", targetDepth)) {
                    accountAttribute.withAttributeValues(new ArrayList<AttributeValueTarget>());
                    continue;
                }

                if (context.testExpression("AttributeValues/AttributeValueTarget", targetDepth)) {
                    accountAttribute.withAttributeValues(AttributeValueTargetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return accountAttribute;
                }
            }
        }
    }

    private static AccountAttributeStaxUnmarshaller instance;

    public static AccountAttributeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccountAttributeStaxUnmarshaller();
        return instance;
    }
}
