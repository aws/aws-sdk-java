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
package com.amazonaws.services.datasync.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.datasync.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NetAppONTAPVolumeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetAppONTAPVolumeMarshaller {

    private static final MarshallingInfo<String> VOLUMENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumeName").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<Long> CIFSSHARECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CifsShareCount").build();
    private static final MarshallingInfo<String> SECURITYSTYLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SecurityStyle").build();
    private static final MarshallingInfo<String> SVMUUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SvmUuid").build();
    private static final MarshallingInfo<String> SVMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SvmName").build();
    private static final MarshallingInfo<Long> CAPACITYUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CapacityUsed").build();
    private static final MarshallingInfo<Long> CAPACITYPROVISIONED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CapacityProvisioned").build();
    private static final MarshallingInfo<Long> LOGICALCAPACITYUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LogicalCapacityUsed").build();
    private static final MarshallingInfo<Boolean> NFSEXPORTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NfsExported").build();
    private static final MarshallingInfo<Long> SNAPSHOTCAPACITYUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SnapshotCapacityUsed").build();
    private static final MarshallingInfo<StructuredPojo> MAXP95PERFORMANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxP95Performance").build();
    private static final MarshallingInfo<List> RECOMMENDATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recommendations").build();
    private static final MarshallingInfo<String> RECOMMENDATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationStatus").build();
    private static final MarshallingInfo<Long> LUNCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LunCount").build();

    private static final NetAppONTAPVolumeMarshaller instance = new NetAppONTAPVolumeMarshaller();

    public static NetAppONTAPVolumeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetAppONTAPVolume netAppONTAPVolume, ProtocolMarshaller protocolMarshaller) {

        if (netAppONTAPVolume == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(netAppONTAPVolume.getVolumeName(), VOLUMENAME_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getCifsShareCount(), CIFSSHARECOUNT_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getSecurityStyle(), SECURITYSTYLE_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getSvmUuid(), SVMUUID_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getSvmName(), SVMNAME_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getCapacityUsed(), CAPACITYUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getCapacityProvisioned(), CAPACITYPROVISIONED_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getLogicalCapacityUsed(), LOGICALCAPACITYUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getNfsExported(), NFSEXPORTED_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getSnapshotCapacityUsed(), SNAPSHOTCAPACITYUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getMaxP95Performance(), MAXP95PERFORMANCE_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getRecommendations(), RECOMMENDATIONS_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getRecommendationStatus(), RECOMMENDATIONSTATUS_BINDING);
            protocolMarshaller.marshall(netAppONTAPVolume.getLunCount(), LUNCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
