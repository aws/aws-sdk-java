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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * EC2SecurityGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2SecurityGroupStaxUnmarshaller implements Unmarshaller<EC2SecurityGroup, StaxUnmarshallerContext> {

    public EC2SecurityGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        EC2SecurityGroup eC2SecurityGroup = new EC2SecurityGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return eC2SecurityGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Status", targetDepth)) {
                    eC2SecurityGroup.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EC2SecurityGroupName", targetDepth)) {
                    eC2SecurityGroup.setEC2SecurityGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EC2SecurityGroupOwnerId", targetDepth)) {
                    eC2SecurityGroup.setEC2SecurityGroupOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Tags", targetDepth)) {
                    eC2SecurityGroup.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("Tags/Tag", targetDepth)) {
                    eC2SecurityGroup.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return eC2SecurityGroup;
                }
            }
        }
    }

    private static EC2SecurityGroupStaxUnmarshaller instance;

    public static EC2SecurityGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2SecurityGroupStaxUnmarshaller();
        return instance;
    }
}
