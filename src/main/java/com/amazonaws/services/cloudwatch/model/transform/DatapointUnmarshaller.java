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
 * Datapoint Unmarshaller
 */        
public class DatapointUnmarshaller implements Unmarshaller<Datapoint, Node> {

    public Datapoint unmarshall(Node node) throws Exception {
        Datapoint datapoint = new Datapoint();
        
        
        Node timestampNode = XpathUtils.asNode("Timestamp", node);
        datapoint.setTimestamp(new DateUnmarshaller().unmarshall(timestampNode));
    
        Node unitNode = XpathUtils.asNode("Unit", node);
        datapoint.setUnit(new StringUnmarshaller().unmarshall(unitNode));
    
        Node customUnitNode = XpathUtils.asNode("CustomUnit", node);
        datapoint.setCustomUnit(new StringUnmarshaller().unmarshall(customUnitNode));
    
        Node samplesNode = XpathUtils.asNode("Samples", node);
        datapoint.setSamples(new DoubleUnmarshaller().unmarshall(samplesNode));
    
        Node averageNode = XpathUtils.asNode("Average", node);
        datapoint.setAverage(new DoubleUnmarshaller().unmarshall(averageNode));
    
        Node sumNode = XpathUtils.asNode("Sum", node);
        datapoint.setSum(new DoubleUnmarshaller().unmarshall(sumNode));
    
        Node minimumNode = XpathUtils.asNode("Minimum", node);
        datapoint.setMinimum(new DoubleUnmarshaller().unmarshall(minimumNode));
    
        Node maximumNode = XpathUtils.asNode("Maximum", node);
        datapoint.setMaximum(new DoubleUnmarshaller().unmarshall(maximumNode));
    

        return datapoint;
    }  
}
    