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
 * ConfigurationOptionDescription StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfigurationOptionDescriptionStaxUnmarshaller implements Unmarshaller<ConfigurationOptionDescription, StaxUnmarshallerContext> {

    public ConfigurationOptionDescription unmarshall(StaxUnmarshallerContext context) throws Exception {
        ConfigurationOptionDescription configurationOptionDescription = new ConfigurationOptionDescription();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return configurationOptionDescription;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Namespace", targetDepth)) {
                    configurationOptionDescription.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Name", targetDepth)) {
                    configurationOptionDescription.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultValue", targetDepth)) {
                    configurationOptionDescription.setDefaultValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ChangeSeverity", targetDepth)) {
                    configurationOptionDescription.setChangeSeverity(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UserDefined", targetDepth)) {
                    configurationOptionDescription.setUserDefined(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValueType", targetDepth)) {
                    configurationOptionDescription.setValueType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ValueOptions", targetDepth)) {
                    configurationOptionDescription.withValueOptions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("ValueOptions/member", targetDepth)) {
                    configurationOptionDescription.withValueOptions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinValue", targetDepth)) {
                    configurationOptionDescription.setMinValue(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxValue", targetDepth)) {
                    configurationOptionDescription.setMaxValue(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxLength", targetDepth)) {
                    configurationOptionDescription.setMaxLength(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Regex", targetDepth)) {
                    configurationOptionDescription.setRegex(OptionRestrictionRegexStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return configurationOptionDescription;
                }
            }
        }
    }

    private static ConfigurationOptionDescriptionStaxUnmarshaller instance;

    public static ConfigurationOptionDescriptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConfigurationOptionDescriptionStaxUnmarshaller();
        return instance;
    }
}
