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
 * OptionGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroupStaxUnmarshaller implements Unmarshaller<OptionGroup, StaxUnmarshallerContext> {

    public OptionGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        OptionGroup optionGroup = new OptionGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return optionGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("OptionGroupName", targetDepth)) {
                    optionGroup.setOptionGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionGroupDescription", targetDepth)) {
                    optionGroup.setOptionGroupDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineName", targetDepth)) {
                    optionGroup.setEngineName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MajorEngineVersion", targetDepth)) {
                    optionGroup.setMajorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Options", targetDepth)) {
                    optionGroup.withOptions(new ArrayList<Option>());
                    continue;
                }

                if (context.testExpression("Options/Option", targetDepth)) {
                    optionGroup.withOptions(OptionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowsVpcAndNonVpcInstanceMemberships", targetDepth)) {
                    optionGroup.setAllowsVpcAndNonVpcInstanceMemberships(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpcId", targetDepth)) {
                    optionGroup.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionGroupArn", targetDepth)) {
                    optionGroup.setOptionGroupArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return optionGroup;
                }
            }
        }
    }

    private static OptionGroupStaxUnmarshaller instance;

    public static OptionGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupStaxUnmarshaller();
        return instance;
    }
}
