/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * IpamPoolSourceResourceRequest StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpamPoolSourceResourceRequestStaxUnmarshaller implements Unmarshaller<IpamPoolSourceResourceRequest, StaxUnmarshallerContext> {

    public IpamPoolSourceResourceRequest unmarshall(StaxUnmarshallerContext context) throws Exception {
        IpamPoolSourceResourceRequest ipamPoolSourceResourceRequest = new IpamPoolSourceResourceRequest();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return ipamPoolSourceResourceRequest;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ResourceId", targetDepth)) {
                    ipamPoolSourceResourceRequest.setResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceType", targetDepth)) {
                    ipamPoolSourceResourceRequest.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceRegion", targetDepth)) {
                    ipamPoolSourceResourceRequest.setResourceRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ResourceOwner", targetDepth)) {
                    ipamPoolSourceResourceRequest.setResourceOwner(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return ipamPoolSourceResourceRequest;
                }
            }
        }
    }

    private static IpamPoolSourceResourceRequestStaxUnmarshaller instance;

    public static IpamPoolSourceResourceRequestStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpamPoolSourceResourceRequestStaxUnmarshaller();
        return instance;
    }
}
