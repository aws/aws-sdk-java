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
package com.amazonaws.services.auditmanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.auditmanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateControlMappingSourceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateControlMappingSourceMarshaller {

    private static final MarshallingInfo<String> SOURCENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceName").build();
    private static final MarshallingInfo<String> SOURCEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceDescription").build();
    private static final MarshallingInfo<String> SOURCESETUPOPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceSetUpOption").build();
    private static final MarshallingInfo<String> SOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceType").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEKEYWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceKeyword").build();
    private static final MarshallingInfo<String> SOURCEFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceFrequency").build();
    private static final MarshallingInfo<String> TROUBLESHOOTINGTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("troubleshootingText").build();

    private static final CreateControlMappingSourceMarshaller instance = new CreateControlMappingSourceMarshaller();

    public static CreateControlMappingSourceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateControlMappingSource createControlMappingSource, ProtocolMarshaller protocolMarshaller) {

        if (createControlMappingSource == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createControlMappingSource.getSourceName(), SOURCENAME_BINDING);
            protocolMarshaller.marshall(createControlMappingSource.getSourceDescription(), SOURCEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createControlMappingSource.getSourceSetUpOption(), SOURCESETUPOPTION_BINDING);
            protocolMarshaller.marshall(createControlMappingSource.getSourceType(), SOURCETYPE_BINDING);
            protocolMarshaller.marshall(createControlMappingSource.getSourceKeyword(), SOURCEKEYWORD_BINDING);
            protocolMarshaller.marshall(createControlMappingSource.getSourceFrequency(), SOURCEFREQUENCY_BINDING);
            protocolMarshaller.marshall(createControlMappingSource.getTroubleshootingText(), TROUBLESHOOTINGTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
