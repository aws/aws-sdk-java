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
 * NetAppONTAPSVMMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetAppONTAPSVMMarshaller {

    private static final MarshallingInfo<String> CLUSTERUUID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterUuid").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> SVMNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SvmName").build();
    private static final MarshallingInfo<Long> CIFSSHARECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CifsShareCount").build();
    private static final MarshallingInfo<List> ENABLEDPROTOCOLS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EnabledProtocols").build();
    private static final MarshallingInfo<Long> TOTALCAPACITYUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCapacityUsed").build();
    private static final MarshallingInfo<Long> TOTALCAPACITYPROVISIONED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalCapacityProvisioned").build();
    private static final MarshallingInfo<Long> TOTALLOGICALCAPACITYUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalLogicalCapacityUsed").build();
    private static final MarshallingInfo<StructuredPojo> MAXP95PERFORMANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxP95Performance").build();
    private static final MarshallingInfo<List> RECOMMENDATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recommendations").build();
    private static final MarshallingInfo<Long> NFSEXPORTEDVOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NfsExportedVolumes").build();
    private static final MarshallingInfo<String> RECOMMENDATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationStatus").build();
    private static final MarshallingInfo<Long> TOTALSNAPSHOTCAPACITYUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalSnapshotCapacityUsed").build();
    private static final MarshallingInfo<Long> LUNCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LunCount").build();

    private static final NetAppONTAPSVMMarshaller instance = new NetAppONTAPSVMMarshaller();

    public static NetAppONTAPSVMMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetAppONTAPSVM netAppONTAPSVM, ProtocolMarshaller protocolMarshaller) {

        if (netAppONTAPSVM == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(netAppONTAPSVM.getClusterUuid(), CLUSTERUUID_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getSvmName(), SVMNAME_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getCifsShareCount(), CIFSSHARECOUNT_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getEnabledProtocols(), ENABLEDPROTOCOLS_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getTotalCapacityUsed(), TOTALCAPACITYUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getTotalCapacityProvisioned(), TOTALCAPACITYPROVISIONED_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getTotalLogicalCapacityUsed(), TOTALLOGICALCAPACITYUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getMaxP95Performance(), MAXP95PERFORMANCE_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getRecommendations(), RECOMMENDATIONS_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getNfsExportedVolumes(), NFSEXPORTEDVOLUMES_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getRecommendationStatus(), RECOMMENDATIONSTATUS_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getTotalSnapshotCapacityUsed(), TOTALSNAPSHOTCAPACITYUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPSVM.getLunCount(), LUNCOUNT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
