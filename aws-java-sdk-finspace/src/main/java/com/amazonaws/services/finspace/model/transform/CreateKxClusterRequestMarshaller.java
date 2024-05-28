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
package com.amazonaws.services.finspace.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.finspace.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateKxClusterRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateKxClusterRequestMarshaller {

    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();
    private static final MarshallingInfo<String> ENVIRONMENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("environmentId").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterName").build();
    private static final MarshallingInfo<String> CLUSTERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterType").build();
    private static final MarshallingInfo<StructuredPojo> TICKERPLANTLOGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("tickerplantLogConfiguration").build();
    private static final MarshallingInfo<List> DATABASES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("databases").build();
    private static final MarshallingInfo<List> CACHESTORAGECONFIGURATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("cacheStorageConfigurations").build();
    private static final MarshallingInfo<StructuredPojo> AUTOSCALINGCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("autoScalingConfiguration").build();
    private static final MarshallingInfo<String> CLUSTERDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clusterDescription").build();
    private static final MarshallingInfo<StructuredPojo> CAPACITYCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("capacityConfiguration").build();
    private static final MarshallingInfo<String> RELEASELABEL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("releaseLabel").build();
    private static final MarshallingInfo<StructuredPojo> VPCCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vpcConfiguration").build();
    private static final MarshallingInfo<String> INITIALIZATIONSCRIPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("initializationScript").build();
    private static final MarshallingInfo<List> COMMANDLINEARGUMENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("commandLineArguments").build();
    private static final MarshallingInfo<StructuredPojo> CODE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("code").build();
    private static final MarshallingInfo<String> EXECUTIONROLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("executionRole").build();
    private static final MarshallingInfo<StructuredPojo> SAVEDOWNSTORAGECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("savedownStorageConfiguration").build();
    private static final MarshallingInfo<String> AZMODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("azMode").build();
    private static final MarshallingInfo<String> AVAILABILITYZONEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZoneId").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<StructuredPojo> SCALINGGROUPCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("scalingGroupConfiguration").build();

    private static final CreateKxClusterRequestMarshaller instance = new CreateKxClusterRequestMarshaller();

    public static CreateKxClusterRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateKxClusterRequest createKxClusterRequest, ProtocolMarshaller protocolMarshaller) {

        if (createKxClusterRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createKxClusterRequest.getClientToken(), CLIENTTOKEN_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getEnvironmentId(), ENVIRONMENTID_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getClusterType(), CLUSTERTYPE_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getTickerplantLogConfiguration(), TICKERPLANTLOGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getDatabases(), DATABASES_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getCacheStorageConfigurations(), CACHESTORAGECONFIGURATIONS_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getAutoScalingConfiguration(), AUTOSCALINGCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getClusterDescription(), CLUSTERDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getCapacityConfiguration(), CAPACITYCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getReleaseLabel(), RELEASELABEL_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getVpcConfiguration(), VPCCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getInitializationScript(), INITIALIZATIONSCRIPT_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getCommandLineArguments(), COMMANDLINEARGUMENTS_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getCode(), CODE_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getExecutionRole(), EXECUTIONROLE_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getSavedownStorageConfiguration(), SAVEDOWNSTORAGECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getAzMode(), AZMODE_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getAvailabilityZoneId(), AVAILABILITYZONEID_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createKxClusterRequest.getScalingGroupConfiguration(), SCALINGGROUPCONFIGURATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
