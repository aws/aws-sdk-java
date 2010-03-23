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

package com.amazonaws.services.rds.model.transform;

import org.w3c.dom.*;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.SimpleTypeUnmarshallers.*;
import com.amazonaws.util.XpathUtils;

/**
 * Parameter Unmarshaller
 */        
public class ParameterUnmarshaller implements Unmarshaller<Parameter, Node> {

    public Parameter unmarshall(Node node) throws Exception {
        Parameter parameter = new Parameter();
        
        
        Node parameterNameNode = XpathUtils.asNode("ParameterName", node);
        parameter.setParameterName(new StringUnmarshaller().unmarshall(parameterNameNode));
    
        Node parameterValueNode = XpathUtils.asNode("ParameterValue", node);
        parameter.setParameterValue(new StringUnmarshaller().unmarshall(parameterValueNode));
    
        Node descriptionNode = XpathUtils.asNode("Description", node);
        parameter.setDescription(new StringUnmarshaller().unmarshall(descriptionNode));
    
        Node sourceNode = XpathUtils.asNode("Source", node);
        parameter.setSource(new StringUnmarshaller().unmarshall(sourceNode));
    
        Node applyTypeNode = XpathUtils.asNode("ApplyType", node);
        parameter.setApplyType(new StringUnmarshaller().unmarshall(applyTypeNode));
    
        Node dataTypeNode = XpathUtils.asNode("DataType", node);
        parameter.setDataType(new StringUnmarshaller().unmarshall(dataTypeNode));
    
        Node allowedValuesNode = XpathUtils.asNode("AllowedValues", node);
        parameter.setAllowedValues(new StringUnmarshaller().unmarshall(allowedValuesNode));
    
        Node isModifiableNode = XpathUtils.asNode("IsModifiable", node);
        parameter.setIsModifiable(new BooleanUnmarshaller().unmarshall(isModifiableNode));
    
        Node applyMethodNode = XpathUtils.asNode("ApplyMethod", node);
        parameter.setApplyMethod(new StringUnmarshaller().unmarshall(applyMethodNode));
    

        return parameter;
    }  
}
    