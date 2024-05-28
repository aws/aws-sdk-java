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
 * UpdateApplicationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateApplicationRequestMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<Map> INITIALCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("initialCapacity").build();
    private static final MarshallingInfo<StructuredPojo> MAXIMUMCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumCapacity").build();
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
    private static final MarshallingInfo<StructuredPojo> INTERACTIVECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("interactiveConfiguration").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseLabel").build();
    private static final MarshallingInfo<List> RUNTIMECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runtimeConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> MONITORINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("monitoringConfiguration").build();

    private static final UpdateApplicationRequestMarshaller instance = new UpdateApplicationRequestMarshaller();

    public static UpdateApplicationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateApplicationRequest updateApplicationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateApplicationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateApplicationRequest.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getInitialCapacity(), INITIALCAPACITY_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getMaximumCapacity(), MAXIMUMCAPACITY_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getAutoStartConfiguration(), AUTOSTARTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getAutoStopConfiguration(), AUTOSTOPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getImageConfiguration(), IMAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getWorkerTypeSpecifications(), WORKERTYPESPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getInteractiveConfiguration(), INTERACTIVECONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getRuntimeConfiguration(), RUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(updateApplicationRequest.getMonitoringConfiguration(), MONITORINGCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
