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
package com.amazonaws.services.glacier.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.glacier.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobParametersMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobParametersMarshaller {

    private static final MarshallingInfo<String> FORMAT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Format").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<String> ARCHIVEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ArchiveId").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> SNSTOPIC_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SNSTopic").build();
    private static final MarshallingInfo<String> RETRIEVALBYTERANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RetrievalByteRange").build();
    private static final MarshallingInfo<String> TIER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tier").build();
    private static final MarshallingInfo<StructuredPojo> INVENTORYRETRIEVALPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InventoryRetrievalParameters").build();
    private static final MarshallingInfo<StructuredPojo> SELECTPARAMETERS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SelectParameters").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OutputLocation").build();

    private static final JobParametersMarshaller instance = new JobParametersMarshaller();

    public static JobParametersMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobParameters jobParameters, ProtocolMarshaller protocolMarshaller) {

        if (jobParameters == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobParameters.getFormat(), FORMAT_BINDING);
            protocolMarshaller.marshall(jobParameters.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(jobParameters.getArchiveId(), ARCHIVEID_BINDING);
            protocolMarshaller.marshall(jobParameters.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(jobParameters.getSNSTopic(), SNSTOPIC_BINDING);
            protocolMarshaller.marshall(jobParameters.getRetrievalByteRange(), RETRIEVALBYTERANGE_BINDING);
            protocolMarshaller.marshall(jobParameters.getTier(), TIER_BINDING);
            protocolMarshaller.marshall(jobParameters.getInventoryRetrievalParameters(), INVENTORYRETRIEVALPARAMETERS_BINDING);
            protocolMarshaller.marshall(jobParameters.getSelectParameters(), SELECTPARAMETERS_BINDING);
            protocolMarshaller.marshall(jobParameters.getOutputLocation(), OUTPUTLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
