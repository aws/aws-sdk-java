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

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Terminate Instances Request StAX Unmarshaller
 */
public class TerminateInstancesRequestStaxUnmarshaller implements Unmarshaller<TerminateInstancesRequest, StaxUnmarshallerContext> {

    

    public TerminateInstancesRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        TerminateInstancesRequest terminateInstancesRequest = new TerminateInstancesRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return terminateInstancesRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("InstanceId/InstanceId", targetDepth)) {
                    terminateInstancesRequest.getInstanceIds().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return terminateInstancesRequest;
                }
            }
        }
    }

    private static TerminateInstancesRequestStaxUnmarshaller instance;
    public static TerminateInstancesRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new TerminateInstancesRequestStaxUnmarshaller();
        return instance;
    }
}
    