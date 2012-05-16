/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudfront_2012_03_15.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront_2012_03_15.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Streaming Distribution StAX Unmarshaller
 */
public class StreamingDistributionStaxUnmarshaller implements Unmarshaller<StreamingDistribution, StaxUnmarshallerContext> {

    public StreamingDistribution unmarshall(StaxUnmarshallerContext context) throws Exception {
        StreamingDistribution streamingDistribution = new StreamingDistribution();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return streamingDistribution;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Id", targetDepth)) {
                    streamingDistribution.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    streamingDistribution.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    streamingDistribution.setLastModifiedTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    streamingDistribution.setDomainName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActiveTrustedSigners", targetDepth)) {
                    streamingDistribution.setActiveTrustedSigners(ActiveTrustedSignersStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StreamingDistributionConfig", targetDepth)) {
                    streamingDistribution.setStreamingDistributionConfig(StreamingDistributionConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return streamingDistribution;
                }
            }
        }
    }

    private static StreamingDistributionStaxUnmarshaller instance;
    public static StreamingDistributionStaxUnmarshaller getInstance() {
        if (instance == null) instance = new StreamingDistributionStaxUnmarshaller();
        return instance;
    }
}
    
