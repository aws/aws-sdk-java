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
package com.amazonaws.services.fsx.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OpenZFSVolumeConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OpenZFSVolumeConfigurationMarshaller {

    private static final MarshallingInfo<String> PARENTVOLUMEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ParentVolumeId").build();
    private static final MarshallingInfo<String> VOLUMEPATH_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VolumePath").build();
    private static final MarshallingInfo<Integer> STORAGECAPACITYRESERVATIONGIB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageCapacityReservationGiB").build();
    private static final MarshallingInfo<Integer> STORAGECAPACITYQUOTAGIB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageCapacityQuotaGiB").build();
    private static final MarshallingInfo<Integer> RECORDSIZEKIB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RecordSizeKiB").build();
    private static final MarshallingInfo<String> DATACOMPRESSIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataCompressionType").build();
    private static final MarshallingInfo<Boolean> COPYTAGSTOSNAPSHOTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CopyTagsToSnapshots").build();
    private static final MarshallingInfo<StructuredPojo> ORIGINSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OriginSnapshot").build();
    private static final MarshallingInfo<Boolean> READONLY_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReadOnly").build();
    private static final MarshallingInfo<List> NFSEXPORTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("NfsExports").build();
    private static final MarshallingInfo<List> USERANDGROUPQUOTAS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserAndGroupQuotas").build();
    private static final MarshallingInfo<String> RESTORETOSNAPSHOT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RestoreToSnapshot").build();
    private static final MarshallingInfo<Boolean> DELETEINTERMEDIATESNAPHOTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteIntermediateSnaphots").build();
    private static final MarshallingInfo<Boolean> DELETECLONEDVOLUMES_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DeleteClonedVolumes").build();

    private static final OpenZFSVolumeConfigurationMarshaller instance = new OpenZFSVolumeConfigurationMarshaller();

    public static OpenZFSVolumeConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OpenZFSVolumeConfiguration openZFSVolumeConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (openZFSVolumeConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getParentVolumeId(), PARENTVOLUMEID_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getVolumePath(), VOLUMEPATH_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getStorageCapacityReservationGiB(), STORAGECAPACITYRESERVATIONGIB_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getStorageCapacityQuotaGiB(), STORAGECAPACITYQUOTAGIB_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getRecordSizeKiB(), RECORDSIZEKIB_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getDataCompressionType(), DATACOMPRESSIONTYPE_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getCopyTagsToSnapshots(), COPYTAGSTOSNAPSHOTS_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getOriginSnapshot(), ORIGINSNAPSHOT_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getReadOnly(), READONLY_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getNfsExports(), NFSEXPORTS_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getUserAndGroupQuotas(), USERANDGROUPQUOTAS_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getRestoreToSnapshot(), RESTORETOSNAPSHOT_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getDeleteIntermediateSnaphots(), DELETEINTERMEDIATESNAPHOTS_BINDING);
            protocolMarshaller.marshall(openZFSVolumeConfiguration.getDeleteClonedVolumes(), DELETECLONEDVOLUMES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
