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

import com.amazonaws.services.s3.model.Stats;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.LongStaxUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import javax.xml.stream.events.XMLEvent;

/**
 * Unmarshaller for {@link Stats}.
 */
class StatsStaxUnmarshaller
    implements Unmarshaller<Stats, StaxUnmarshallerContext> {

    private static final StatsStaxUnmarshaller instance = new StatsStaxUnmarshaller();

    public static StatsStaxUnmarshaller getInstance() {
        return instance;
    }

    private StatsStaxUnmarshaller() {
    }

    @Override
    public Stats unmarshall(StaxUnmarshallerContext context) throws Exception {
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument()) {
            targetDepth += 1;
        }

        Stats result = new Stats();

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) {
                return result;
            }

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("BytesScanned", targetDepth)) {
                    result.setBytesScanned(LongStaxUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BytesReturned", targetDepth)) {
                    result.setBytesReturned(LongStaxUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BytesProcessed", targetDepth)) {
                    result.setBytesProcessed(LongStaxUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return result;
                }
            }
        }
    }

}
