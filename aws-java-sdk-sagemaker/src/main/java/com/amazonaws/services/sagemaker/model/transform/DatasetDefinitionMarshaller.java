/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DatasetDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DatasetDefinitionMarshaller {

    private static final MarshallingInfo<StructuredPojo> ATHENADATASETDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AthenaDatasetDefinition").build();
    private static final MarshallingInfo<StructuredPojo> REDSHIFTDATASETDEFINITION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RedshiftDatasetDefinition").build();
    private static final MarshallingInfo<String> LOCALPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LocalPath").build();
    private static final MarshallingInfo<String> DATADISTRIBUTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataDistributionType").build();
    private static final MarshallingInfo<String> INPUTMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("InputMode").build();

    private static final DatasetDefinitionMarshaller instance = new DatasetDefinitionMarshaller();

    public static DatasetDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DatasetDefinition datasetDefinition, ProtocolMarshaller protocolMarshaller) {

        if (datasetDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(datasetDefinition.getAthenaDatasetDefinition(), ATHENADATASETDEFINITION_BINDING);
            protocolMarshaller.marshall(datasetDefinition.getRedshiftDatasetDefinition(), REDSHIFTDATASETDEFINITION_BINDING);
            protocolMarshaller.marshall(datasetDefinition.getLocalPath(), LOCALPATH_BINDING);
            protocolMarshaller.marshall(datasetDefinition.getDataDistributionType(), DATADISTRIBUTIONTYPE_BINDING);
            protocolMarshaller.marshall(datasetDefinition.getInputMode(), INPUTMODE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
