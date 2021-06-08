/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ReplaceRootVolumeTask StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplaceRootVolumeTaskStaxUnmarshaller implements Unmarshaller<ReplaceRootVolumeTask, StaxUnmarshallerContext> {

    public ReplaceRootVolumeTask unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReplaceRootVolumeTask replaceRootVolumeTask = new ReplaceRootVolumeTask();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return replaceRootVolumeTask;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("replaceRootVolumeTaskId", targetDepth)) {
                    replaceRootVolumeTask.setReplaceRootVolumeTaskId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceId", targetDepth)) {
                    replaceRootVolumeTask.setInstanceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("taskState", targetDepth)) {
                    replaceRootVolumeTask.setTaskState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("startTime", targetDepth)) {
                    replaceRootVolumeTask.setStartTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("completeTime", targetDepth)) {
                    replaceRootVolumeTask.setCompleteTime(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    replaceRootVolumeTask.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    replaceRootVolumeTask.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return replaceRootVolumeTask;
                }
            }
        }
    }

    private static ReplaceRootVolumeTaskStaxUnmarshaller instance;

    public static ReplaceRootVolumeTaskStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplaceRootVolumeTaskStaxUnmarshaller();
        return instance;
    }
}
