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
 * Activity Unmarshaller
 */        
public class ActivityUnmarshaller implements Unmarshaller<Activity, Node> {

    public Activity unmarshall(Node node) throws Exception {
        Activity activity = new Activity();
        
        
        Node activityIdNode = XpathUtils.asNode("ActivityId", node);
        activity.setActivityId(new StringUnmarshaller().unmarshall(activityIdNode));
    
        Node descriptionNode = XpathUtils.asNode("Description", node);
        activity.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        Node causeNode = XpathUtils.asNode("Cause", node);
        activity.setCause(new StringUnmarshaller().unmarshall(causeNode));
    
        Node startTimeNode = XpathUtils.asNode("StartTime", node);
        activity.setStartTime(new DateUnmarshaller().unmarshall(startTimeNode));
    
        Node endTimeNode = XpathUtils.asNode("EndTime", node);
        activity.setEndTime(new DateUnmarshaller().unmarshall(endTimeNode));
    
        Node statusCodeNode = XpathUtils.asNode("StatusCode", node);
        activity.setStatusCode(new StringUnmarshaller().unmarshall(statusCodeNode));
    
        Node statusMessageNode = XpathUtils.asNode("StatusMessage", node);
        activity.setStatusMessage(new StringUnmarshaller().unmarshall(statusMessageNode));
    
        Node progressNode = XpathUtils.asNode("Progress", node);
        activity.setProgress(new IntegerUnmarshaller().unmarshall(progressNode));
    

        return activity;
    }  
}
    