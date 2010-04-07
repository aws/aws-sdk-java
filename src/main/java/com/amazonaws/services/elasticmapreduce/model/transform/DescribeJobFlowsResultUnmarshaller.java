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
 * Describe Job Flows Result Unmarshaller
 */
public class DescribeJobFlowsResultUnmarshaller implements Unmarshaller<DescribeJobFlowsResult, Node> {

    public DescribeJobFlowsResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        DescribeJobFlowsResult describeJobFlowsResult = new DescribeJobFlowsResult();

        
        NodeList jobFlowsNodes = XpathUtils.asNodeList("JobFlows/member", node);
        for (int jobFlowsIndex = 0; jobFlowsIndex < XpathUtils.nodeLength(jobFlowsNodes); ++jobFlowsIndex) {
            Node jobFlowsNode = jobFlowsNodes.item(jobFlowsIndex);
            describeJobFlowsResult.getJobFlows().add(new JobFlowDetailUnmarshaller().unmarshall(jobFlowsNode));
            jobFlowsNode.getParentNode().removeChild(jobFlowsNode);
        }
    

        return describeJobFlowsResult;
    }
}
    