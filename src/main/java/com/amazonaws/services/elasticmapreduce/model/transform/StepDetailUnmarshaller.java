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
 * Step Detail Unmarshaller
 */        
public class StepDetailUnmarshaller implements Unmarshaller<StepDetail, Node> {

    public StepDetail unmarshall(Node node) throws Exception {
        StepDetail stepDetail = new StepDetail();
        
        
        Node stepConfigNode = XpathUtils.asNode("StepConfig", node);
        stepDetail.setStepConfig(new StepConfigUnmarshaller().unmarshall(stepConfigNode));
    
        Node executionStatusDetailNode = XpathUtils.asNode("ExecutionStatusDetail", node);
        stepDetail.setExecutionStatusDetail(new StepExecutionStatusDetailUnmarshaller().unmarshall(executionStatusDetailNode));
    

        return stepDetail;
    }  
}
    