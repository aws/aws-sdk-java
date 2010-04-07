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
 * Step Config Unmarshaller
 */
public class StepConfigUnmarshaller implements Unmarshaller<StepConfig, Node> {

    public StepConfig unmarshall(Node node) throws Exception {
        if (node == null) return null;

        StepConfig stepConfig = new StepConfig();

        
        Node nameNode = XpathUtils.asNode("Name", node);
        stepConfig.setName(new StringUnmarshaller().unmarshall(nameNode));
    
        Node actionOnFailureNode = XpathUtils.asNode("ActionOnFailure", node);
        stepConfig.setActionOnFailure(new StringUnmarshaller().unmarshall(actionOnFailureNode));
    
        Node hadoopJarStepNode = XpathUtils.asNode("HadoopJarStep", node);
        stepConfig.setHadoopJarStep(new HadoopJarStepConfigUnmarshaller().unmarshall(hadoopJarStepNode));
    

        return stepConfig;
    }
}
    