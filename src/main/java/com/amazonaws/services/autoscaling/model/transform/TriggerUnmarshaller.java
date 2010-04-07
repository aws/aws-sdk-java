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
 * Trigger Unmarshaller
 */
public class TriggerUnmarshaller implements Unmarshaller<Trigger, Node> {

    public Trigger unmarshall(Node node) throws Exception {
        if (node == null) return null;

        Trigger trigger = new Trigger();

        
        Node triggerNameNode = XpathUtils.asNode("TriggerName", node);
        trigger.setTriggerName(new StringUnmarshaller().unmarshall(triggerNameNode));
    
        Node autoScalingGroupNameNode = XpathUtils.asNode("AutoScalingGroupName", node);
        trigger.setAutoScalingGroupName(new StringUnmarshaller().unmarshall(autoScalingGroupNameNode));
    
        Node measureNameNode = XpathUtils.asNode("MeasureName", node);
        trigger.setMeasureName(new StringUnmarshaller().unmarshall(measureNameNode));
    
        Node statisticNode = XpathUtils.asNode("Statistic", node);
        trigger.setStatistic(new StringUnmarshaller().unmarshall(statisticNode));
    
        NodeList dimensionsNodes = XpathUtils.asNodeList("Dimensions/member", node);
        for (int dimensionsIndex = 0; dimensionsIndex < XpathUtils.nodeLength(dimensionsNodes); ++dimensionsIndex) {
            Node dimensionsNode = dimensionsNodes.item(dimensionsIndex);
            trigger.getDimensions().add(new DimensionUnmarshaller().unmarshall(dimensionsNode));
            dimensionsNode.getParentNode().removeChild(dimensionsNode);
        }
    
        Node periodNode = XpathUtils.asNode("Period", node);
        trigger.setPeriod(new IntegerUnmarshaller().unmarshall(periodNode));
    
        Node unitNode = XpathUtils.asNode("Unit", node);
        trigger.setUnit(new StringUnmarshaller().unmarshall(unitNode));
    
        Node customUnitNode = XpathUtils.asNode("CustomUnit", node);
        trigger.setCustomUnit(new StringUnmarshaller().unmarshall(customUnitNode));
    
        Node namespaceNode = XpathUtils.asNode("Namespace", node);
        trigger.setNamespace(new StringUnmarshaller().unmarshall(namespaceNode));
    
        Node lowerThresholdNode = XpathUtils.asNode("LowerThreshold", node);
        trigger.setLowerThreshold(new DoubleUnmarshaller().unmarshall(lowerThresholdNode));
    
        Node lowerBreachScaleIncrementNode = XpathUtils.asNode("LowerBreachScaleIncrement", node);
        trigger.setLowerBreachScaleIncrement(new StringUnmarshaller().unmarshall(lowerBreachScaleIncrementNode));
    
        Node upperThresholdNode = XpathUtils.asNode("UpperThreshold", node);
        trigger.setUpperThreshold(new DoubleUnmarshaller().unmarshall(upperThresholdNode));
    
        Node upperBreachScaleIncrementNode = XpathUtils.asNode("UpperBreachScaleIncrement", node);
        trigger.setUpperBreachScaleIncrement(new StringUnmarshaller().unmarshall(upperBreachScaleIncrementNode));
    
        Node breachDurationNode = XpathUtils.asNode("BreachDuration", node);
        trigger.setBreachDuration(new IntegerUnmarshaller().unmarshall(breachDurationNode));
    
        Node statusNode = XpathUtils.asNode("Status", node);
        trigger.setStatus(new StringUnmarshaller().unmarshall(statusNode));
    
        Node createdTimeNode = XpathUtils.asNode("CreatedTime", node);
        trigger.setCreatedTime(new DateUnmarshaller().unmarshall(createdTimeNode));
    

        return trigger;
    }
}
    