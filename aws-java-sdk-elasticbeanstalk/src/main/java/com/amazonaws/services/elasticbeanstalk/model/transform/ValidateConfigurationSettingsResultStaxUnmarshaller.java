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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ValidateConfigurationSettingsResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateConfigurationSettingsResultStaxUnmarshaller implements Unmarshaller<ValidateConfigurationSettingsResult, StaxUnmarshallerContext> {

    public ValidateConfigurationSettingsResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ValidateConfigurationSettingsResult validateConfigurationSettingsResult = new ValidateConfigurationSettingsResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return validateConfigurationSettingsResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Messages", targetDepth)) {
                    validateConfigurationSettingsResult.withMessages(new ArrayList<ValidationMessage>());
                    continue;
                }

                if (context.testExpression("Messages/member", targetDepth)) {
                    validateConfigurationSettingsResult.withMessages(ValidationMessageStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return validateConfigurationSettingsResult;
                }
            }
        }
    }

    private static ValidateConfigurationSettingsResultStaxUnmarshaller instance;

    public static ValidateConfigurationSettingsResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ValidateConfigurationSettingsResultStaxUnmarshaller();
        return instance;
    }
}
