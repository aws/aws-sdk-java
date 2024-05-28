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
 * NetAppONTAPClusterMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NetAppONTAPClusterMarshaller {

    private static final MarshallingInfo<Long> CIFSSHARECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CifsShareCount").build();
    private static final MarshallingInfo<Long> NFSEXPORTEDVOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NfsExportedVolumes").build();
    private static final MarshallingInfo<String> RESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceId").build();
    private static final MarshallingInfo<String> CLUSTERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterName").build();
    private static final MarshallingInfo<StructuredPojo> MAXP95PERFORMANCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MaxP95Performance").build();
    private static final MarshallingInfo<Long> CLUSTERBLOCKSTORAGESIZE_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterBlockStorageSize").build();
    private static final MarshallingInfo<Long> CLUSTERBLOCKSTORAGEUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterBlockStorageUsed").build();
    private static final MarshallingInfo<Long> CLUSTERBLOCKSTORAGELOGICALUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterBlockStorageLogicalUsed").build();
    private static final MarshallingInfo<List> RECOMMENDATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Recommendations").build();
    private static final MarshallingInfo<String> RECOMMENDATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecommendationStatus").build();
    private static final MarshallingInfo<Long> LUNCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LunCount").build();
    private static final MarshallingInfo<Long> CLUSTERCLOUDSTORAGEUSED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClusterCloudStorageUsed").build();

    private static final NetAppONTAPClusterMarshaller instance = new NetAppONTAPClusterMarshaller();

    public static NetAppONTAPClusterMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NetAppONTAPCluster netAppONTAPCluster, ProtocolMarshaller protocolMarshaller) {

        if (netAppONTAPCluster == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(netAppONTAPCluster.getCifsShareCount(), CIFSSHARECOUNT_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getNfsExportedVolumes(), NFSEXPORTEDVOLUMES_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getResourceId(), RESOURCEID_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getClusterName(), CLUSTERNAME_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getMaxP95Performance(), MAXP95PERFORMANCE_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getClusterBlockStorageSize(), CLUSTERBLOCKSTORAGESIZE_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getClusterBlockStorageUsed(), CLUSTERBLOCKSTORAGEUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getClusterBlockStorageLogicalUsed(), CLUSTERBLOCKSTORAGELOGICALUSED_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getRecommendations(), RECOMMENDATIONS_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getRecommendationStatus(), RECOMMENDATIONSTATUS_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getLunCount(), LUNCOUNT_BINDING);
            protocolMarshaller.marshall(netAppONTAPCluster.getClusterCloudStorageUsed(), CLUSTERCLOUDSTORAGEUSED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
