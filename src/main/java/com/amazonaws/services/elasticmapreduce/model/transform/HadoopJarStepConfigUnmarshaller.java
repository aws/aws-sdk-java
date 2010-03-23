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
 * Hadoop Jar Step Config Unmarshaller
 */        
public class HadoopJarStepConfigUnmarshaller implements Unmarshaller<HadoopJarStepConfig, Node> {

    public HadoopJarStepConfig unmarshall(Node node) throws Exception {
        HadoopJarStepConfig hadoopJarStepConfig = new HadoopJarStepConfig();
        
        
        NodeList propertiesNodes = XpathUtils.asNodeList("Properties/member", node);
        for (int propertiesIndex = 0; propertiesIndex < XpathUtils.nodeLength(propertiesNodes); ++propertiesIndex) {
            Node propertiesNode = propertiesNodes.item(propertiesIndex);
            hadoopJarStepConfig.getProperties().add(new KeyValueUnmarshaller().unmarshall(propertiesNode));
            propertiesNode.getParentNode().removeChild(propertiesNode);
        }
    
        Node jarNode = XpathUtils.asNode("Jar", node);
        hadoopJarStepConfig.setJar(new StringUnmarshaller().unmarshall(jarNode));
    
        Node mainClassNode = XpathUtils.asNode("MainClass", node);
        hadoopJarStepConfig.setMainClass(new StringUnmarshaller().unmarshall(mainClassNode));
    
        NodeList argsNodes = XpathUtils.asNodeList("Args/member", node);
        for (int argsIndex = 0; argsIndex < XpathUtils.nodeLength(argsNodes); ++argsIndex) {
            Node argsNode = argsNodes.item(argsIndex);
            hadoopJarStepConfig.getArgs().add(new StringUnmarshaller().unmarshall(argsNode));
            argsNode.getParentNode().removeChild(argsNode);
        }
    

        return hadoopJarStepConfig;
    }  
}
    