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

package com.amazonaws.services.elasticloadbalancing.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.elasticloadbalancing.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Health Check Unmarshaller
 */
public class HealthCheckUnmarshaller implements Unmarshaller<HealthCheck, Node> {

    public HealthCheck unmarshall(Node node) throws Exception {
        if (node == null) return null;

        HealthCheck healthCheck = new HealthCheck();

        
        Node targetNode = XpathUtils.asNode("Target", node);
        healthCheck.setTarget(new StringUnmarshaller().unmarshall(targetNode));
    
        Node intervalNode = XpathUtils.asNode("Interval", node);
        healthCheck.setInterval(new IntegerUnmarshaller().unmarshall(intervalNode));
    
        Node timeoutNode = XpathUtils.asNode("Timeout", node);
        healthCheck.setTimeout(new IntegerUnmarshaller().unmarshall(timeoutNode));
    
        Node unhealthyThresholdNode = XpathUtils.asNode("UnhealthyThreshold", node);
        healthCheck.setUnhealthyThreshold(new IntegerUnmarshaller().unmarshall(unhealthyThresholdNode));
    
        Node healthyThresholdNode = XpathUtils.asNode("HealthyThreshold", node);
        healthCheck.setHealthyThreshold(new IntegerUnmarshaller().unmarshall(healthyThresholdNode));
    

        return healthCheck;
    }
}
    