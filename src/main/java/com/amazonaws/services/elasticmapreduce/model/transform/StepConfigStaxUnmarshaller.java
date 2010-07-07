/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Step Config StAX Unmarshaller
 */
public class StepConfigStaxUnmarshaller implements Unmarshaller<StepConfig, StaxUnmarshallerContext> {

    

    public StepConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        StepConfig stepConfig = new StepConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return stepConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Name", targetDepth)) {
                    stepConfig.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActionOnFailure", targetDepth)) {
                    stepConfig.setActionOnFailure(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("HadoopJarStep", targetDepth)) {
                    stepConfig.setHadoopJarStep(HadoopJarStepConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stepConfig;
                }
            }
        }
    }

    private static StepConfigStaxUnmarshaller instance;
    public static StepConfigStaxUnmarshaller getInstance() {
        if (instance == null) instance = new StepConfigStaxUnmarshaller();
        return instance;
    }
}
    