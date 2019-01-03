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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DownloadDBLogFilePortionResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DownloadDBLogFilePortionResultStaxUnmarshaller implements Unmarshaller<DownloadDBLogFilePortionResult, StaxUnmarshallerContext> {

    public DownloadDBLogFilePortionResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DownloadDBLogFilePortionResult downloadDBLogFilePortionResult = new DownloadDBLogFilePortionResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return downloadDBLogFilePortionResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("LogFileData", targetDepth)) {
                    downloadDBLogFilePortionResult.setLogFileData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Marker", targetDepth)) {
                    downloadDBLogFilePortionResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AdditionalDataPending", targetDepth)) {
                    downloadDBLogFilePortionResult.setAdditionalDataPending(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return downloadDBLogFilePortionResult;
                }
            }
        }
    }

    private static DownloadDBLogFilePortionResultStaxUnmarshaller instance;

    public static DownloadDBLogFilePortionResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DownloadDBLogFilePortionResultStaxUnmarshaller();
        return instance;
    }
}
