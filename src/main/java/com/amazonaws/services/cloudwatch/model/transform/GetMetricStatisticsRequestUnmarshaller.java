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
 * Get Metric Statistics Request Unmarshaller
 */        
public class GetMetricStatisticsRequestUnmarshaller implements Unmarshaller<GetMetricStatisticsRequest, Node> {

    public GetMetricStatisticsRequest unmarshall(Node node) throws Exception {
        GetMetricStatisticsRequest getMetricStatisticsRequest = new GetMetricStatisticsRequest();
        
        
        NodeList statisticsNodes = XpathUtils.asNodeList("Statistics/member", node);
        for (int statisticsIndex = 0; statisticsIndex < XpathUtils.nodeLength(statisticsNodes); ++statisticsIndex) {
            Node statisticsNode = statisticsNodes.item(statisticsIndex);
            getMetricStatisticsRequest.getStatistics().add(new StringUnmarshaller().unmarshall(statisticsNode));
            statisticsNode.getParentNode().removeChild(statisticsNode);
        }
    
        Node periodNode = XpathUtils.asNode("Period", node);
        getMetricStatisticsRequest.setPeriod(new IntegerUnmarshaller().unmarshall(periodNode));
    
        Node measureNameNode = XpathUtils.asNode("MeasureName", node);
        getMetricStatisticsRequest.setMeasureName(new StringUnmarshaller().unmarshall(measureNameNode));
    
        NodeList dimensionsNodes = XpathUtils.asNodeList("Dimensions/member", node);
        for (int dimensionsIndex = 0; dimensionsIndex < XpathUtils.nodeLength(dimensionsNodes); ++dimensionsIndex) {
            Node dimensionsNode = dimensionsNodes.item(dimensionsIndex);
            getMetricStatisticsRequest.getDimensions().add(new DimensionUnmarshaller().unmarshall(dimensionsNode));
            dimensionsNode.getParentNode().removeChild(dimensionsNode);
        }
    
        Node startTimeNode = XpathUtils.asNode("StartTime", node);
        getMetricStatisticsRequest.setStartTime(new DateUnmarshaller().unmarshall(startTimeNode));
    
        Node endTimeNode = XpathUtils.asNode("EndTime", node);
        getMetricStatisticsRequest.setEndTime(new DateUnmarshaller().unmarshall(endTimeNode));
    
        Node unitNode = XpathUtils.asNode("Unit", node);
        getMetricStatisticsRequest.setUnit(new StringUnmarshaller().unmarshall(unitNode));
    
        Node customUnitNode = XpathUtils.asNode("CustomUnit", node);
        getMetricStatisticsRequest.setCustomUnit(new StringUnmarshaller().unmarshall(customUnitNode));
    
        Node namespaceNode = XpathUtils.asNode("Namespace", node);
        getMetricStatisticsRequest.setNamespace(new StringUnmarshaller().unmarshall(namespaceNode));
    

        return getMetricStatisticsRequest;
    }  
}
    