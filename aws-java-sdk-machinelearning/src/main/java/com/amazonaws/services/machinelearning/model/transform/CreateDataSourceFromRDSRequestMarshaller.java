/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.machinelearning.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateDataSourceFromRDSRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateDataSourceFromRDSRequestMarshaller {

    private static final MarshallingInfo<String> DATASOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceId").build();
    private static final MarshallingInfo<String> DATASOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataSourceName").build();
    private static final MarshallingInfo<StructuredPojo> RDSDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RDSData").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleARN").build();
    private static final MarshallingInfo<Boolean> COMPUTESTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComputeStatistics").build();

    private static final CreateDataSourceFromRDSRequestMarshaller instance = new CreateDataSourceFromRDSRequestMarshaller();

    public static CreateDataSourceFromRDSRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateDataSourceFromRDSRequest createDataSourceFromRDSRequest, ProtocolMarshaller protocolMarshaller) {

        if (createDataSourceFromRDSRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createDataSourceFromRDSRequest.getDataSourceId(), DATASOURCEID_BINDING);
            protocolMarshaller.marshall(createDataSourceFromRDSRequest.getDataSourceName(), DATASOURCENAME_BINDING);
            protocolMarshaller.marshall(createDataSourceFromRDSRequest.getRDSData(), RDSDATA_BINDING);
            protocolMarshaller.marshall(createDataSourceFromRDSRequest.getRoleARN(), ROLEARN_BINDING);
            protocolMarshaller.marshall(createDataSourceFromRDSRequest.getComputeStatistics(), COMPUTESTATISTICS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
