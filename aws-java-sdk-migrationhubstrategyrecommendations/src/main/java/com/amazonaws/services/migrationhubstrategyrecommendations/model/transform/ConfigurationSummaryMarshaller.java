/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ConfigurationSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ConfigurationSummaryMarshaller {

    private static final MarshallingInfo<List> IPADDRESSBASEDREMOTEINFOLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAddressBasedRemoteInfoList").build();
    private static final MarshallingInfo<List> PIPELINEINFOLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pipelineInfoList").build();
    private static final MarshallingInfo<StructuredPojo> REMOTESOURCECODEANALYSISSERVERINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("remoteSourceCodeAnalysisServerInfo").build();
    private static final MarshallingInfo<List> VCENTERBASEDREMOTEINFOLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("vcenterBasedRemoteInfoList").build();
    private static final MarshallingInfo<List> VERSIONCONTROLINFOLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("versionControlInfoList").build();

    private static final ConfigurationSummaryMarshaller instance = new ConfigurationSummaryMarshaller();

    public static ConfigurationSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ConfigurationSummary configurationSummary, ProtocolMarshaller protocolMarshaller) {

        if (configurationSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(configurationSummary.getIpAddressBasedRemoteInfoList(), IPADDRESSBASEDREMOTEINFOLIST_BINDING);
            protocolMarshaller.marshall(configurationSummary.getPipelineInfoList(), PIPELINEINFOLIST_BINDING);
            protocolMarshaller.marshall(configurationSummary.getRemoteSourceCodeAnalysisServerInfo(), REMOTESOURCECODEANALYSISSERVERINFO_BINDING);
            protocolMarshaller.marshall(configurationSummary.getVcenterBasedRemoteInfoList(), VCENTERBASEDREMOTEINFOLIST_BINDING);
            protocolMarshaller.marshall(configurationSummary.getVersionControlInfoList(), VERSIONCONTROLINFOLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
