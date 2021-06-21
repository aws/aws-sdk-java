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
 * TypeConfigurationDetails StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TypeConfigurationDetailsStaxUnmarshaller implements Unmarshaller<TypeConfigurationDetails, StaxUnmarshallerContext> {

    public TypeConfigurationDetails unmarshall(StaxUnmarshallerContext context) throws Exception {
        TypeConfigurationDetails typeConfigurationDetails = new TypeConfigurationDetails();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return typeConfigurationDetails;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Arn", targetDepth)) {
                    typeConfigurationDetails.setArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Alias", targetDepth)) {
                    typeConfigurationDetails.setAlias(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Configuration", targetDepth)) {
                    typeConfigurationDetails.setConfiguration(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastUpdated", targetDepth)) {
                    typeConfigurationDetails.setLastUpdated(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeArn", targetDepth)) {
                    typeConfigurationDetails.setTypeArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TypeName", targetDepth)) {
                    typeConfigurationDetails.setTypeName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsDefaultConfiguration", targetDepth)) {
                    typeConfigurationDetails.setIsDefaultConfiguration(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return typeConfigurationDetails;
                }
            }
        }
    }

    private static TypeConfigurationDetailsStaxUnmarshaller instance;

    public static TypeConfigurationDetailsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TypeConfigurationDetailsStaxUnmarshaller();
        return instance;
    }
}
