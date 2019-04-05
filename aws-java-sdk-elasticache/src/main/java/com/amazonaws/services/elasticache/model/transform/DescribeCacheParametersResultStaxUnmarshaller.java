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
 * DescribeCacheParametersResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCacheParametersResultStaxUnmarshaller implements Unmarshaller<DescribeCacheParametersResult, StaxUnmarshallerContext> {

    public DescribeCacheParametersResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeCacheParametersResult describeCacheParametersResult = new DescribeCacheParametersResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeCacheParametersResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeCacheParametersResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Parameters", targetDepth)) {
                    describeCacheParametersResult.withParameters(new ArrayList<Parameter>());
                    continue;
                }

                if (context.testExpression("Parameters/Parameter", targetDepth)) {
                    describeCacheParametersResult.withParameters(ParameterStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CacheNodeTypeSpecificParameters", targetDepth)) {
                    describeCacheParametersResult.withCacheNodeTypeSpecificParameters(new ArrayList<CacheNodeTypeSpecificParameter>());
                    continue;
                }

                if (context.testExpression("CacheNodeTypeSpecificParameters/CacheNodeTypeSpecificParameter", targetDepth)) {
                    describeCacheParametersResult.withCacheNodeTypeSpecificParameters(CacheNodeTypeSpecificParameterStaxUnmarshaller.getInstance().unmarshall(
                            context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeCacheParametersResult;
                }
            }
        }
    }

    private static DescribeCacheParametersResultStaxUnmarshaller instance;

    public static DescribeCacheParametersResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCacheParametersResultStaxUnmarshaller();
        return instance;
    }
}
