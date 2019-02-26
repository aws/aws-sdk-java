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
 * OptionGroupOptionSetting StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionGroupOptionSettingStaxUnmarshaller implements Unmarshaller<OptionGroupOptionSetting, StaxUnmarshallerContext> {

    public OptionGroupOptionSetting unmarshall(StaxUnmarshallerContext context) throws Exception {
        OptionGroupOptionSetting optionGroupOptionSetting = new OptionGroupOptionSetting();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return optionGroupOptionSetting;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("SettingName", targetDepth)) {
                    optionGroupOptionSetting.setSettingName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SettingDescription", targetDepth)) {
                    optionGroupOptionSetting.setSettingDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultValue", targetDepth)) {
                    optionGroupOptionSetting.setDefaultValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ApplyType", targetDepth)) {
                    optionGroupOptionSetting.setApplyType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedValues", targetDepth)) {
                    optionGroupOptionSetting.setAllowedValues(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsModifiable", targetDepth)) {
                    optionGroupOptionSetting.setIsModifiable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsRequired", targetDepth)) {
                    optionGroupOptionSetting.setIsRequired(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinimumEngineVersionPerAllowedValue", targetDepth)) {
                    optionGroupOptionSetting.withMinimumEngineVersionPerAllowedValue(new ArrayList<MinimumEngineVersionPerAllowedValue>());
                    continue;
                }

                if (context.testExpression("MinimumEngineVersionPerAllowedValue/MinimumEngineVersionPerAllowedValue", targetDepth)) {
                    optionGroupOptionSetting.withMinimumEngineVersionPerAllowedValue(MinimumEngineVersionPerAllowedValueStaxUnmarshaller.getInstance()
                            .unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return optionGroupOptionSetting;
                }
            }
        }
    }

    private static OptionGroupOptionSettingStaxUnmarshaller instance;

    public static OptionGroupOptionSettingStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupOptionSettingStaxUnmarshaller();
        return instance;
    }
}
