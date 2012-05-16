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
 * Streaming Distribution Config StAX Unmarshaller
 */
public class StreamingDistributionConfigStaxUnmarshaller implements Unmarshaller<StreamingDistributionConfig, StaxUnmarshallerContext> {

    public StreamingDistributionConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        StreamingDistributionConfig streamingDistributionConfig = new StreamingDistributionConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return streamingDistributionConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("S3Origin", targetDepth)) {
                    streamingDistributionConfig.setS3Origin(S3OriginStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CallerReference", targetDepth)) {
                    streamingDistributionConfig.setCallerReference(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CNAME", targetDepth)) {
                    streamingDistributionConfig.getCNAME().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Comment", targetDepth)) {
                    streamingDistributionConfig.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    streamingDistributionConfig.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Logging", targetDepth)) {
                    streamingDistributionConfig.setLogging(LoggingConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TrustedSigners", targetDepth)) {
                    streamingDistributionConfig.setTrustedSigners(TrustedSignersStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return streamingDistributionConfig;
                }
            }
        }
    }

    private static StreamingDistributionConfigStaxUnmarshaller instance;
    public static StreamingDistributionConfigStaxUnmarshaller getInstance() {
        if (instance == null) instance = new StreamingDistributionConfigStaxUnmarshaller();
        return instance;
    }
}
    
