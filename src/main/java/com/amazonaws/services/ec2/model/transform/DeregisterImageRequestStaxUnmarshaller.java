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
 * Deregister Image Request StAX Unmarshaller
 */
public class DeregisterImageRequestStaxUnmarshaller implements Unmarshaller<DeregisterImageRequest, StaxUnmarshallerContext> {

    

    public DeregisterImageRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        DeregisterImageRequest deregisterImageRequest = new DeregisterImageRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 1;

        while (true) {
            XMLEvent event = context.nextEvent();
            if (event.isEndDocument()) return deregisterImageRequest;

            if (event.isAttribute() || event.isStartElement()) {
                if (context.testExpression("ImageId", targetDepth)) {
                    deregisterImageRequest.setImageId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (event.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return deregisterImageRequest;
                }
            }
        }
    }

    private static DeregisterImageRequestStaxUnmarshaller instance;
    public static DeregisterImageRequestStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DeregisterImageRequestStaxUnmarshaller();
        return instance;
    }
}
    