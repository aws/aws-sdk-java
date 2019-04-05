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
package com.amazonaws.services.rds.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OptionConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionConfigurationStaxUnmarshaller implements Unmarshaller<OptionConfiguration, StaxUnmarshallerContext> {

    public OptionConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        OptionConfiguration optionConfiguration = new OptionConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return optionConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("OptionName", targetDepth)) {
                    optionConfiguration.setOptionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    optionConfiguration.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionVersion", targetDepth)) {
                    optionConfiguration.setOptionVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBSecurityGroupMemberships", targetDepth)) {
                    optionConfiguration.withDBSecurityGroupMemberships(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("DBSecurityGroupMemberships/DBSecurityGroupName", targetDepth)) {
                    optionConfiguration.withDBSecurityGroupMemberships(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupMemberships", targetDepth)) {
                    optionConfiguration.withVpcSecurityGroupMemberships(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupMemberships/VpcSecurityGroupId", targetDepth)) {
                    optionConfiguration.withVpcSecurityGroupMemberships(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionSettings", targetDepth)) {
                    optionConfiguration.withOptionSettings(new ArrayList<OptionSetting>());
                    continue;
                }

                if (context.testExpression("OptionSettings/OptionSetting", targetDepth)) {
                    optionConfiguration.withOptionSettings(OptionSettingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return optionConfiguration;
                }
            }
        }
    }

    private static OptionConfigurationStaxUnmarshaller instance;

    public static OptionConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionConfigurationStaxUnmarshaller();
        return instance;
    }
}
