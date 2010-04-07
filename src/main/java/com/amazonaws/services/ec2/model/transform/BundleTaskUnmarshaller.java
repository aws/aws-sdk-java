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
 * Bundle Task Unmarshaller
 */
public class BundleTaskUnmarshaller implements Unmarshaller<BundleTask, Node> {

    public BundleTask unmarshall(Node node) throws Exception {
        if (node == null) return null;

        BundleTask bundleTask = new BundleTask();

        
        Node instanceIdNode = XpathUtils.asNode("instanceId", node);
        bundleTask.setInstanceId(new StringUnmarshaller().unmarshall(instanceIdNode));
    
        Node bundleIdNode = XpathUtils.asNode("bundleId", node);
        bundleTask.setBundleId(new StringUnmarshaller().unmarshall(bundleIdNode));
    
        Node stateNode = XpathUtils.asNode("state", node);
        bundleTask.setState(new StringUnmarshaller().unmarshall(stateNode));
    
        Node startTimeNode = XpathUtils.asNode("startTime", node);
        bundleTask.setStartTime(new DateUnmarshaller().unmarshall(startTimeNode));
    
        Node updateTimeNode = XpathUtils.asNode("updateTime", node);
        bundleTask.setUpdateTime(new DateUnmarshaller().unmarshall(updateTimeNode));
    
        Node storageNode = XpathUtils.asNode("storage", node);
        bundleTask.setStorage(new StorageUnmarshaller().unmarshall(storageNode));
    
        Node progressNode = XpathUtils.asNode("progress", node);
        bundleTask.setProgress(new StringUnmarshaller().unmarshall(progressNode));
    
        Node bundleTaskErrorNode = XpathUtils.asNode("error", node);
        bundleTask.setBundleTaskError(new BundleTaskErrorUnmarshaller().unmarshall(bundleTaskErrorNode));
    

        return bundleTask;
    }
}
    