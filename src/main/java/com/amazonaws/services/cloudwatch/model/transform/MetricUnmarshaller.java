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
 * Metric Unmarshaller
 */        
public class MetricUnmarshaller implements Unmarshaller<Metric, Node> {

    public Metric unmarshall(Node node) throws Exception {
        Metric metric = new Metric();
        
        
        Node measureNameNode = XpathUtils.asNode("MeasureName", node);
        metric.setMeasureName(new StringUnmarshaller().unmarshall(measureNameNode));
    
        NodeList dimensionsNodes = XpathUtils.asNodeList("Dimensions/member", node);
        for (int dimensionsIndex = 0; dimensionsIndex < XpathUtils.nodeLength(dimensionsNodes); ++dimensionsIndex) {
            Node dimensionsNode = dimensionsNodes.item(dimensionsIndex);
            metric.getDimensions().add(new DimensionUnmarshaller().unmarshall(dimensionsNode));
            dimensionsNode.getParentNode().removeChild(dimensionsNode);
        }
    
        Node namespaceNode = XpathUtils.asNode("Namespace", node);
        metric.setNamespace(new StringUnmarshaller().unmarshall(namespaceNode));
    

        return metric;
    }  
}
    