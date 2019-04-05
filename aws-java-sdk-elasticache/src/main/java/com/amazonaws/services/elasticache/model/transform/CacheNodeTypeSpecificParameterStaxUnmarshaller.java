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
package com.amazonaws.services.elasticache.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CacheNodeTypeSpecificParameter StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheNodeTypeSpecificParameterStaxUnmarshaller implements Unmarshaller<CacheNodeTypeSpecificParameter, StaxUnmarshallerContext> {

    public CacheNodeTypeSpecificParameter unmarshall(StaxUnmarshallerContext context) throws Exception {
        CacheNodeTypeSpecificParameter cacheNodeTypeSpecificParameter = new CacheNodeTypeSpecificParameter();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cacheNodeTypeSpecificParameter;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ParameterName", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setParameterName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Description", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Source", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setSource(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("DataType", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setDataType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AllowedValues", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setAllowedValues(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("IsModifiable", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setIsModifiable(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MinimumEngineVersion", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setMinimumEngineVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeTypeSpecificValues", targetDepth)) {
                    cacheNodeTypeSpecificParameter.withCacheNodeTypeSpecificValues(new ArrayList<CacheNodeTypeSpecificValue>());
                    continue;
                }

                if (context.testExpression("CacheNodeTypeSpecificValues/CacheNodeTypeSpecificValue", targetDepth)) {
                    cacheNodeTypeSpecificParameter
                            .withCacheNodeTypeSpecificValues(CacheNodeTypeSpecificValueStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ChangeType", targetDepth)) {
                    cacheNodeTypeSpecificParameter.setChangeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cacheNodeTypeSpecificParameter;
                }
            }
        }
    }

    private static CacheNodeTypeSpecificParameterStaxUnmarshaller instance;

    public static CacheNodeTypeSpecificParameterStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CacheNodeTypeSpecificParameterStaxUnmarshaller();
        return instance;
    }
}
