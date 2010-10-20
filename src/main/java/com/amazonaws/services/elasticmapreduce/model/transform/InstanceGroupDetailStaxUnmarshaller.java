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

package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Instance Group Detail StAX Unmarshaller
 */
public class InstanceGroupDetailStaxUnmarshaller implements Unmarshaller<InstanceGroupDetail, StaxUnmarshallerContext> {

    

    public InstanceGroupDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        InstanceGroupDetail instanceGroupDetail = new InstanceGroupDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return instanceGroupDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("InstanceGroupId", targetDepth)) {
                    instanceGroupDetail.setInstanceGroupId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Name", targetDepth)) {
                    instanceGroupDetail.setName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Market", targetDepth)) {
                    instanceGroupDetail.setMarket(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceRole", targetDepth)) {
                    instanceGroupDetail.setInstanceRole(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    instanceGroupDetail.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceRequestCount", targetDepth)) {
                    instanceGroupDetail.setInstanceRequestCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("InstanceRunningCount", targetDepth)) {
                    instanceGroupDetail.setInstanceRunningCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("State", targetDepth)) {
                    instanceGroupDetail.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastStateChangeReason", targetDepth)) {
                    instanceGroupDetail.setLastStateChangeReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    instanceGroupDetail.setCreationDateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StartDateTime", targetDepth)) {
                    instanceGroupDetail.setStartDateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ReadyDateTime", targetDepth)) {
                    instanceGroupDetail.setReadyDateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EndDateTime", targetDepth)) {
                    instanceGroupDetail.setEndDateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return instanceGroupDetail;
                }
            }
        }
    }

    private static InstanceGroupDetailStaxUnmarshaller instance;
    public static InstanceGroupDetailStaxUnmarshaller getInstance() {
        if (instance == null) instance = new InstanceGroupDetailStaxUnmarshaller();
        return instance;
    }
}
    