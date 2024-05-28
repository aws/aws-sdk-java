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
package com.amazonaws.services.mediapackagev2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagev2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateHlsManifestConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateHlsManifestConfigurationMarshaller {

    private static final MarshallingInfo<String> MANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestName").build();
    private static final MarshallingInfo<String> CHILDMANIFESTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ChildManifestName").build();
    private static final MarshallingInfo<StructuredPojo> SCTEHLS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ScteHls").build();
    private static final MarshallingInfo<Integer> MANIFESTWINDOWSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManifestWindowSeconds").build();
    private static final MarshallingInfo<Integer> PROGRAMDATETIMEINTERVALSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProgramDateTimeIntervalSeconds").build();
    private static final MarshallingInfo<StructuredPojo> FILTERCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FilterConfiguration").build();

    private static final CreateHlsManifestConfigurationMarshaller instance = new CreateHlsManifestConfigurationMarshaller();

    public static CreateHlsManifestConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateHlsManifestConfiguration createHlsManifestConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (createHlsManifestConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createHlsManifestConfiguration.getManifestName(), MANIFESTNAME_BINDING);
            protocolMarshaller.marshall(createHlsManifestConfiguration.getChildManifestName(), CHILDMANIFESTNAME_BINDING);
            protocolMarshaller.marshall(createHlsManifestConfiguration.getScteHls(), SCTEHLS_BINDING);
            protocolMarshaller.marshall(createHlsManifestConfiguration.getManifestWindowSeconds(), MANIFESTWINDOWSECONDS_BINDING);
            protocolMarshaller.marshall(createHlsManifestConfiguration.getProgramDateTimeIntervalSeconds(), PROGRAMDATETIMEINTERVALSECONDS_BINDING);
            protocolMarshaller.marshall(createHlsManifestConfiguration.getFilterConfiguration(), FILTERCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
