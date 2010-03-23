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

package com.amazonaws.services.autoscaling.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Scaling Activities Request Unmarshaller
 */        
public class DescribeScalingActivitiesRequestUnmarshaller implements Unmarshaller<DescribeScalingActivitiesRequest, Node> {

    public DescribeScalingActivitiesRequest unmarshall(Node node) throws Exception {
        DescribeScalingActivitiesRequest describeScalingActivitiesRequest = new DescribeScalingActivitiesRequest();
        
        
        NodeList activityIdsNodes = XpathUtils.asNodeList("ActivityIds/member", node);
        for (int activityIdsIndex = 0; activityIdsIndex < XpathUtils.nodeLength(activityIdsNodes); ++activityIdsIndex) {
            Node activityIdsNode = activityIdsNodes.item(activityIdsIndex);
            describeScalingActivitiesRequest.getActivityIds().add(new StringUnmarshaller().unmarshall(activityIdsNode));
            activityIdsNode.getParentNode().removeChild(activityIdsNode);
        }
    
        Node autoScalingGroupNameNode = XpathUtils.asNode("AutoScalingGroupName", node);
        describeScalingActivitiesRequest.setAutoScalingGroupName(new StringUnmarshaller().unmarshall(autoScalingGroupNameNode));
    
        Node maxRecordsNode = XpathUtils.asNode("MaxRecords", node);
        describeScalingActivitiesRequest.setMaxRecords(new IntegerUnmarshaller().unmarshall(maxRecordsNode));
    
        Node nextTokenNode = XpathUtils.asNode("NextToken", node);
        describeScalingActivitiesRequest.setNextToken(new StringUnmarshaller().unmarshall(nextTokenNode));
    

        return describeScalingActivitiesRequest;
    }  
}
    