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
 * FileCacheMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class FileCacheMarshaller {

    private static final MarshallingInfo<String> OWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("OwnerId").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> FILECACHEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileCacheId").build();
    private static final MarshallingInfo<String> FILECACHETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileCacheType").build();
    private static final MarshallingInfo<String> FILECACHETYPEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileCacheTypeVersion").build();
    private static final MarshallingInfo<String> LIFECYCLE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Lifecycle").build();
    private static final MarshallingInfo<StructuredPojo> FAILUREDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FailureDetails").build();
    private static final MarshallingInfo<Integer> STORAGECAPACITY_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StorageCapacity").build();
    private static final MarshallingInfo<String> VPCID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("VpcId").build();
    private static final MarshallingInfo<List> SUBNETIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SubnetIds").build();
    private static final MarshallingInfo<List> NETWORKINTERFACEIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NetworkInterfaceIds").build();
    private static final MarshallingInfo<String> DNSNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DNSName").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("KmsKeyId").build();
    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceARN").build();
    private static final MarshallingInfo<StructuredPojo> LUSTRECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LustreConfiguration").build();
    private static final MarshallingInfo<List> DATAREPOSITORYASSOCIATIONIDS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DataRepositoryAssociationIds").build();

    private static final FileCacheMarshaller instance = new FileCacheMarshaller();

    public static FileCacheMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(FileCache fileCache, ProtocolMarshaller protocolMarshaller) {

        if (fileCache == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(fileCache.getOwnerId(), OWNERID_BINDING);
            protocolMarshaller.marshall(fileCache.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(fileCache.getFileCacheId(), FILECACHEID_BINDING);
            protocolMarshaller.marshall(fileCache.getFileCacheType(), FILECACHETYPE_BINDING);
            protocolMarshaller.marshall(fileCache.getFileCacheTypeVersion(), FILECACHETYPEVERSION_BINDING);
            protocolMarshaller.marshall(fileCache.getLifecycle(), LIFECYCLE_BINDING);
            protocolMarshaller.marshall(fileCache.getFailureDetails(), FAILUREDETAILS_BINDING);
            protocolMarshaller.marshall(fileCache.getStorageCapacity(), STORAGECAPACITY_BINDING);
            protocolMarshaller.marshall(fileCache.getVpcId(), VPCID_BINDING);
            protocolMarshaller.marshall(fileCache.getSubnetIds(), SUBNETIDS_BINDING);
            protocolMarshaller.marshall(fileCache.getNetworkInterfaceIds(), NETWORKINTERFACEIDS_BINDING);
            protocolMarshaller.marshall(fileCache.getDNSName(), DNSNAME_BINDING);
            protocolMarshaller.marshall(fileCache.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(fileCache.getResourceARN(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(fileCache.getLustreConfiguration(), LUSTRECONFIGURATION_BINDING);
            protocolMarshaller.marshall(fileCache.getDataRepositoryAssociationIds(), DATAREPOSITORYASSOCIATIONIDS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
