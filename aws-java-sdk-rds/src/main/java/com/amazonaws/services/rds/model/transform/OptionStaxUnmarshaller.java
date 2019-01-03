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
 * Option StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionStaxUnmarshaller implements Unmarshaller<Option, StaxUnmarshallerContext> {

    public Option unmarshall(StaxUnmarshallerContext context) throws Exception {
        Option option = new Option();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return option;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("OptionName", targetDepth)) {
                    option.setOptionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionDescription", targetDepth)) {
                    option.setOptionDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Persistent", targetDepth)) {
                    option.setPersistent(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Permanent", targetDepth)) {
                    option.setPermanent(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Port", targetDepth)) {
                    option.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionVersion", targetDepth)) {
                    option.setOptionVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionSettings", targetDepth)) {
                    option.withOptionSettings(new ArrayList<OptionSetting>());
                    continue;
                }

                if (context.testExpression("OptionSettings/OptionSetting", targetDepth)) {
                    option.withOptionSettings(OptionSettingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DBSecurityGroupMemberships", targetDepth)) {
                    option.withDBSecurityGroupMemberships(new ArrayList<DBSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("DBSecurityGroupMemberships/DBSecurityGroup", targetDepth)) {
                    option.withDBSecurityGroupMemberships(DBSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupMemberships", targetDepth)) {
                    option.withVpcSecurityGroupMemberships(new ArrayList<VpcSecurityGroupMembership>());
                    continue;
                }

                if (context.testExpression("VpcSecurityGroupMemberships/VpcSecurityGroupMembership", targetDepth)) {
                    option.withVpcSecurityGroupMemberships(VpcSecurityGroupMembershipStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return option;
                }
            }
        }
    }

    private static OptionStaxUnmarshaller instance;

    public static OptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionStaxUnmarshaller();
        return instance;
    }
}
