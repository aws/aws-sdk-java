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
 * Step Execution Status Detail Unmarshaller
 */        
public class StepExecutionStatusDetailUnmarshaller implements Unmarshaller<StepExecutionStatusDetail, Node> {

    public StepExecutionStatusDetail unmarshall(Node node) throws Exception {
        StepExecutionStatusDetail stepExecutionStatusDetail = new StepExecutionStatusDetail();
        
        
        Node stateNode = XpathUtils.asNode("State", node);
        stepExecutionStatusDetail.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node creationDateTimeNode = XpathUtils.asNode("CreationDateTime", node);
        stepExecutionStatusDetail.setCreationDateTime(new DateUnmarshaller().unmarshall(creationDateTimeNode));
    
        Node startDateTimeNode = XpathUtils.asNode("StartDateTime", node);
        stepExecutionStatusDetail.setStartDateTime(new DateUnmarshaller().unmarshall(startDateTimeNode));
    
        Node endDateTimeNode = XpathUtils.asNode("EndDateTime", node);
        stepExecutionStatusDetail.setEndDateTime(new DateUnmarshaller().unmarshall(endDateTimeNode));
    
        Node lastStateChangeReasonNode = XpathUtils.asNode("LastStateChangeReason", node);
        stepExecutionStatusDetail.setLastStateChangeReason(new StringUnmarshaller().unmarshall(lastStateChangeReasonNode));
    

        return stepExecutionStatusDetail;
    }  
}
    