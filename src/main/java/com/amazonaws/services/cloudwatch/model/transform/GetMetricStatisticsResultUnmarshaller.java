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

package com.amazonaws.services.cloudwatch.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Get Metric Statistics Result Unmarshaller
 */
public class GetMetricStatisticsResultUnmarshaller implements Unmarshaller<GetMetricStatisticsResult, Node> {

    public GetMetricStatisticsResult unmarshall(Node node) throws Exception {
        if (node == null) return null;

        GetMetricStatisticsResult getMetricStatisticsResult = new GetMetricStatisticsResult();

        
        Node labelNode = XpathUtils.asNode("Label", node);
        getMetricStatisticsResult.setLabel(new StringUnmarshaller().unmarshall(labelNode));
    
        NodeList datapointsNodes = XpathUtils.asNodeList("Datapoints/member", node);
        for (int datapointsIndex = 0; datapointsIndex < XpathUtils.nodeLength(datapointsNodes); ++datapointsIndex) {
            Node datapointsNode = datapointsNodes.item(datapointsIndex);
            getMetricStatisticsResult.getDatapoints().add(new DatapointUnmarshaller().unmarshall(datapointsNode));
            datapointsNode.getParentNode().removeChild(datapointsNode);
        }
    

        return getMetricStatisticsResult;
    }
}
    