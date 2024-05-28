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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ApplicationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationMarshaller {

    private static final MarshallingInfo<String> APPLICATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseLabel").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("type").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> STATEDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("stateDetails").build();
    private static final MarshallingInfo<Map> INITIALCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("initialCapacity").build();
    private static final MarshallingInfo<StructuredPojo> MAXIMUMCAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("maximumCapacity").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> UPDATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("updatedAt").timestampFormat("unixTimestamp").build();
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

    private static final ApplicationMarshaller instance = new ApplicationMarshaller();

    public static ApplicationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Application application, ProtocolMarshaller protocolMarshaller) {

        if (application == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(application.getApplicationId(), APPLICATIONID_BINDING);
            protocolMarshaller.marshall(application.getName(), NAME_BINDING);
            protocolMarshaller.marshall(application.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(application.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(application.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(application.getState(), STATE_BINDING);
            protocolMarshaller.marshall(application.getStateDetails(), STATEDETAILS_BINDING);
            protocolMarshaller.marshall(application.getInitialCapacity(), INITIALCAPACITY_BINDING);
            protocolMarshaller.marshall(application.getMaximumCapacity(), MAXIMUMCAPACITY_BINDING);
            protocolMarshaller.marshall(application.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(application.getUpdatedAt(), UPDATEDAT_BINDING);
            protocolMarshaller.marshall(application.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(application.getAutoStartConfiguration(), AUTOSTARTCONFIGURATION_BINDING);
            protocolMarshaller.marshall(application.getAutoStopConfiguration(), AUTOSTOPCONFIGURATION_BINDING);
            protocolMarshaller.marshall(application.getNetworkConfiguration(), NETWORKCONFIGURATION_BINDING);
            protocolMarshaller.marshall(application.getArchitecture(), ARCHITECTURE_BINDING);
            protocolMarshaller.marshall(application.getImageConfiguration(), IMAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(application.getWorkerTypeSpecifications(), WORKERTYPESPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(application.getRuntimeConfiguration(), RUNTIMECONFIGURATION_BINDING);
            protocolMarshaller.marshall(application.getMonitoringConfiguration(), MONITORINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(application.getInteractiveConfiguration(), INTERACTIVECONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
