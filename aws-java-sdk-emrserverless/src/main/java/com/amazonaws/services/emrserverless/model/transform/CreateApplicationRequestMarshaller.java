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
package com.amazonaws.services.emrserverless.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.emrserverless.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateApplicationRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseLabel").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> INITIALCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("initialCapacity").build();
    private static final MarshallingInfo<StructuredPojo> MAXIMUMCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumCapacity").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSTARTCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoStartConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSTOPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoStopConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> NETWORKCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkConfiguration").build();
    private static final MarshallingInfo<String> ARCHITECTURE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("architecture").build();
    private static final MarshallingInfo<StructuredPojo> IMAGECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageConfiguration").build();
    private static final MarshallingInfo<Map> WORKERTYPESPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workerTypeSpecifications").build();
    private static final MarshallingInfo<List> RUNTIMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runtimeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monitoringConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> INTERACTIVECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interactiveConfiguration").build();

    private static final CreateApplicationRequestMarshaller instance = new CreateApplicationRequestMarshaller();

    public static CreateApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateApplicationRequest createApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (createApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createApplicationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getInitialCapacity(), INITIALCAPACITY_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getMaximumCapacity(), MAXIMUMCAPACITY_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getAutoStartConfiguration(), AUTOSTARTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getAutoStopConfiguration(), AUTOSTOPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getImageConfiguration(), IMAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getWorkerTypeSpecifications(), WORKERTYPESPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getRuntimeConfiguration(), RUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getMonitoringConfiguration(), MONITORINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createApplicationRequest.getInteractiveConfiguration(), INTERACTIVECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
