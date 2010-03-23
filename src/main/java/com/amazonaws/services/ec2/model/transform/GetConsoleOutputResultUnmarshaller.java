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

package com.amazonaws.services.ec2.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Get Console Output Result Unmarshaller
 */        
public class GetConsoleOutputResultUnmarshaller implements Unmarshaller<GetConsoleOutputResult, Node> {

    public GetConsoleOutputResult unmarshall(Node node) throws Exception {
        GetConsoleOutputResult getConsoleOutputResult = new GetConsoleOutputResult();
        
        
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        getConsoleOutputResult.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node timestampNode = XpathUtils.asNode("timestamp", node);
        getConsoleOutputResult.setTimestamp(new DateUnmarshaller().unmarshall(timestampNode));
    
        Node outputNode = XpathUtils.asNode("output", node);
        getConsoleOutputResult.setOutput(new StringUnmarshaller().unmarshall(outputNode));
    

        return getConsoleOutputResult;
    }  
}
    