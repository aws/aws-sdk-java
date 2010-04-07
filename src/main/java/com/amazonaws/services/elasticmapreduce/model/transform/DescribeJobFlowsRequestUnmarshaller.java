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

import org.w3c.dom.*;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Describe Job Flows Request Unmarshaller
 */
public class DescribeJobFlowsRequestUnmarshaller implements Unmarshaller<DescribeJobFlowsRequest, Node> {

    public DescribeJobFlowsRequest unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeJobFlowsRequest describeJobFlowsRequest = new DescribeJobFlowsRequest();

        
        Node createdAfterNode = XpathUtils.asNode("CreatedAfter", node);
        describeJobFlowsRequest.setCreatedAfter(new DateUnmarshaller().unmarshall(createdAfterNode));
    
        Node createdBeforeNode = XpathUtils.asNode("CreatedBefore", node);
        describeJobFlowsRequest.setCreatedBefore(new DateUnmarshaller().unmarshall(createdBeforeNode));
    
        NodeList jobFlowIdsNodes = XpathUtils.asNodeList("JobFlowIds/member", node);
        for (int jobFlowIdsIndex = 0; jobFlowIdsIndex < XpathUtils.nodeLength(jobFlowIdsNodes); ++jobFlowIdsIndex) {
            Node jobFlowIdsNode = jobFlowIdsNodes.item(jobFlowIdsIndex);
            describeJobFlowsRequest.getJobFlowIds().add(new StringUnmarshaller().unmarshall(jobFlowIdsNode));
            jobFlowIdsNode.getParentNode().removeChild(jobFlowIdsNode);
        }
    
        NodeList jobFlowStatesNodes = XpathUtils.asNodeList("JobFlowStates/member", node);
        for (int jobFlowStatesIndex = 0; jobFlowStatesIndex < XpathUtils.nodeLength(jobFlowStatesNodes); ++jobFlowStatesIndex) {
            Node jobFlowStatesNode = jobFlowStatesNodes.item(jobFlowStatesIndex);
            describeJobFlowsRequest.getJobFlowStates().add(new StringUnmarshaller().unmarshall(jobFlowStatesNode));
            jobFlowStatesNode.getParentNode().removeChild(jobFlowStatesNode);
        }
    

        return describeJobFlowsRequest;
    }
}
    