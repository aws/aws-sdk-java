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
package com.amazonaws.services.cloudfront.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * StreamingDistributionSummary StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingDistributionSummaryStaxUnmarshaller implements Unmarshaller<StreamingDistributionSummary, StaxUnmarshallerContext> {

    public StreamingDistributionSummary unmarshall(StaxUnmarshallerContext context) throws Exception {
        StreamingDistributionSummary streamingDistributionSummary = new StreamingDistributionSummary();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return streamingDistributionSummary;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    streamingDistributionSummary.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ARN", targetDepth)) {
                    streamingDistributionSummary.setARN(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Status", targetDepth)) {
                    streamingDistributionSummary.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    streamingDistributionSummary.setLastModifiedTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("DomainName", targetDepth)) {
                    streamingDistributionSummary.setDomainName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("S3Origin", targetDepth)) {
                    streamingDistributionSummary.setS3Origin(S3OriginStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Aliases", targetDepth)) {
                    streamingDistributionSummary.setAliases(AliasesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("TrustedSigners", targetDepth)) {
                    streamingDistributionSummary.setTrustedSigners(TrustedSignersStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Comment", targetDepth)) {
                    streamingDistributionSummary.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("PriceClass", targetDepth)) {
                    streamingDistributionSummary.setPriceClass(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Enabled", targetDepth)) {
                    streamingDistributionSummary.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return streamingDistributionSummary;
                }
            }
        }
    }

    private static StreamingDistributionSummaryStaxUnmarshaller instance;

    public static StreamingDistributionSummaryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamingDistributionSummaryStaxUnmarshaller();
        return instance;
    }
}
