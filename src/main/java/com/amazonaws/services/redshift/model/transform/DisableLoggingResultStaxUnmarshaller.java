/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.redshift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Disable Logging Result StAX Unmarshaller
 */
public class DisableLoggingResultStaxUnmarshaller implements Unmarshaller<DisableLoggingResult, StaxUnmarshallerContext> {

    public DisableLoggingResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DisableLoggingResult disableLoggingResult = new DisableLoggingResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return disableLoggingResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("LoggingEnabled", targetDepth)) {
                    disableLoggingResult.setLoggingEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BucketName", targetDepth)) {
                    disableLoggingResult.setBucketName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    disableLoggingResult.setS3KeyPrefix(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastSuccessfulDeliveryTime", targetDepth)) {
                    disableLoggingResult.setLastSuccessfulDeliveryTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastFailureTime", targetDepth)) {
                    disableLoggingResult.setLastFailureTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    disableLoggingResult.setLastFailureMessage(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return disableLoggingResult;
                }
            }
        }
    }

    private static DisableLoggingResultStaxUnmarshaller instance;
    public static DisableLoggingResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DisableLoggingResultStaxUnmarshaller();
        return instance;
    }
}
    