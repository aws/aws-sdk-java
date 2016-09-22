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
package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EngineDefaults StAX Unmarshaller
 */
public class EngineDefaultsStaxUnmarshaller implements Unmarshaller<EngineDefaults, StaxUnmarshallerContext> {

    public EngineDefaults unmarshall(StaxUnmarshallerContext context) throws Exception {
        EngineDefaults engineDefaults = new EngineDefaults();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return engineDefaults;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CacheParameterGroupFamily", targetDepth)) {
                    engineDefaults.setCacheParameterGroupFamily(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    engineDefaults.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Parameters/Parameter", targetDepth)) {
                    engineDefaults.withParameters(ParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeTypeSpecificParameters/CacheNodeTypeSpecificParameter", targetDepth)) {
                    engineDefaults.withCacheNodeTypeSpecificParameters(CacheNodeTypeSpecificParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return engineDefaults;
                }
            }
        }
    }

    private static EngineDefaultsStaxUnmarshaller instance;

    public static EngineDefaultsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EngineDefaultsStaxUnmarshaller();
        return instance;
    }
}
