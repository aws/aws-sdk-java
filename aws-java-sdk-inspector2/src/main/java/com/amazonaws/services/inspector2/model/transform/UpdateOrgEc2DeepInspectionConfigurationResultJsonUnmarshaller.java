/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateOrgEc2DeepInspectionConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOrgEc2DeepInspectionConfigurationResultJsonUnmarshaller implements
        Unmarshaller<UpdateOrgEc2DeepInspectionConfigurationResult, JsonUnmarshallerContext> {

    public UpdateOrgEc2DeepInspectionConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateOrgEc2DeepInspectionConfigurationResult updateOrgEc2DeepInspectionConfigurationResult = new UpdateOrgEc2DeepInspectionConfigurationResult();

        return updateOrgEc2DeepInspectionConfigurationResult;
    }

    private static UpdateOrgEc2DeepInspectionConfigurationResultJsonUnmarshaller instance;

    public static UpdateOrgEc2DeepInspectionConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateOrgEc2DeepInspectionConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
