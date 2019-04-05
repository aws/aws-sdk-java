/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.s3.model.S3KeyFilter;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;

class S3KeyFilterStaxUnmarshaller implements Unmarshaller<S3KeyFilter, StaxUnmarshallerContext> {

    private static final S3KeyFilterStaxUnmarshaller instance = new S3KeyFilterStaxUnmarshaller();

    public static S3KeyFilterStaxUnmarshaller getInstance() {
        return instance;
    }

    private S3KeyFilterStaxUnmarshaller() {
    }

    @Override
    public S3KeyFilter unmarshall(StaxUnmarshallerContext context) throws Exception {
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        S3KeyFilter filter = new S3KeyFilter();

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return filter;
            }

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("FilterRule", targetDepth)) {
                    filter.addFilterRule(FilterRuleStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return filter;
                }
            }
        }
    }

}
