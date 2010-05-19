/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Create Topic Request StAX Unmarshaller
 */
public class CreateTopicRequestStaxUnmarshaller implements Unmarshaller<CreateTopicRequest, StaxUnmarshallerContext> {

    

    public CreateTopicRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        CreateTopicRequest createTopicRequest = new CreateTopicRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return createTopicRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("Name", targetDepth)) {
                    createTopicRequest.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return createTopicRequest;
                }
            }
        }
    }

    private static CreateTopicRequestStaxUnmarshaller instance;
    public static CreateTopicRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new CreateTopicRequestStaxUnmarshaller();
        return instance;
    }
}
    