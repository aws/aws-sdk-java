/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * OptionGroupOption StAX Unmarshaller
 */
public class OptionGroupOptionStaxUnmarshaller implements Unmarshaller<OptionGroupOption, StaxUnmarshallerContext> {

    public OptionGroupOption unmarshall(StaxUnmarshallerContext context) throws Exception {
        OptionGroupOption optionGroupOption = new OptionGroupOption();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return optionGroupOption;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Name", targetDepth)) {
                    optionGroupOption.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    optionGroupOption.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EngineName", targetDepth)) {
                    optionGroupOption.setEngineName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MajorEngineVersion", targetDepth)) {
                    optionGroupOption.setMajorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinimumRequiredMinorEngineVersion", targetDepth)) {
                    optionGroupOption.setMinimumRequiredMinorEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PortRequired", targetDepth)) {
                    optionGroupOption.setPortRequired(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DefaultPort", targetDepth)) {
                    optionGroupOption.setDefaultPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionsDependedOn/OptionName", targetDepth)) {
                    optionGroupOption.withOptionsDependedOn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionsConflictsWith/OptionConflictName", targetDepth)) {
                    optionGroupOption.withOptionsConflictsWith(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Persistent", targetDepth)) {
                    optionGroupOption.setPersistent(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Permanent", targetDepth)) {
                    optionGroupOption.setPermanent(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionGroupOptionSettings/OptionGroupOptionSetting", targetDepth)) {
                    optionGroupOption.withOptionGroupOptionSettings(OptionGroupOptionSettingStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OptionGroupOptionVersions/OptionVersion", targetDepth)) {
                    optionGroupOption.withOptionGroupOptionVersions(OptionVersionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return optionGroupOption;
                }
            }
        }
    }

    private static OptionGroupOptionStaxUnmarshaller instance;

    public static OptionGroupOptionStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionGroupOptionStaxUnmarshaller();
        return instance;
    }
}
