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
package com.amazonaws.services.cloudformation.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TypeConfigurationIdentifier StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeConfigurationIdentifierStaxUnmarshaller implements Unmarshaller<TypeConfigurationIdentifier, StaxUnmarshallerContext> {

    public TypeConfigurationIdentifier unmarshall(StaxUnmarshallerContext context) throws Exception {
        TypeConfigurationIdentifier typeConfigurationIdentifier = new TypeConfigurationIdentifier();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return typeConfigurationIdentifier;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("TypeArn", targetDepth)) {
                    typeConfigurationIdentifier.setTypeArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeConfigurationAlias", targetDepth)) {
                    typeConfigurationIdentifier.setTypeConfigurationAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeConfigurationArn", targetDepth)) {
                    typeConfigurationIdentifier.setTypeConfigurationArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Type", targetDepth)) {
                    typeConfigurationIdentifier.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeName", targetDepth)) {
                    typeConfigurationIdentifier.setTypeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return typeConfigurationIdentifier;
                }
            }
        }
    }

    private static TypeConfigurationIdentifierStaxUnmarshaller instance;

    public static TypeConfigurationIdentifierStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TypeConfigurationIdentifierStaxUnmarshaller();
        return instance;
    }
}
