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
package com.amazonaws.services.databasemigrationservice.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.databasemigrationservice.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CollectorResponseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CollectorResponseMarshaller {

    private static final MarshallingInfo<String> COLLECTORREFERENCEDID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectorReferencedId").build();
    private static final MarshallingInfo<String> COLLECTORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectorName").build();
    private static final MarshallingInfo<String> COLLECTORVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectorVersion").build();
    private static final MarshallingInfo<String> VERSIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VersionStatus").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> S3BUCKETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3BucketName").build();
    private static final MarshallingInfo<String> SERVICEACCESSROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccessRoleArn").build();
    private static final MarshallingInfo<StructuredPojo> COLLECTORHEALTHCHECK_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CollectorHealthCheck").build();
    private static final MarshallingInfo<String> LASTDATARECEIVED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastDataReceived").build();
    private static final MarshallingInfo<String> REGISTEREDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisteredDate").build();
    private static final MarshallingInfo<String> CREATEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedDate").build();
    private static final MarshallingInfo<String> MODIFIEDDATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModifiedDate").build();
    private static final MarshallingInfo<StructuredPojo> INVENTORYDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InventoryData").build();

    private static final CollectorResponseMarshaller instance = new CollectorResponseMarshaller();

    public static CollectorResponseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CollectorResponse collectorResponse, ProtocolMarshaller protocolMarshaller) {

        if (collectorResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(collectorResponse.getCollectorReferencedId(), COLLECTORREFERENCEDID_BINDING);
            protocolMarshaller.marshall(collectorResponse.getCollectorName(), COLLECTORNAME_BINDING);
            protocolMarshaller.marshall(collectorResponse.getCollectorVersion(), COLLECTORVERSION_BINDING);
            protocolMarshaller.marshall(collectorResponse.getVersionStatus(), VERSIONSTATUS_BINDING);
            protocolMarshaller.marshall(collectorResponse.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(collectorResponse.getS3BucketName(), S3BUCKETNAME_BINDING);
            protocolMarshaller.marshall(collectorResponse.getServiceAccessRoleArn(), SERVICEACCESSROLEARN_BINDING);
            protocolMarshaller.marshall(collectorResponse.getCollectorHealthCheck(), COLLECTORHEALTHCHECK_BINDING);
            protocolMarshaller.marshall(collectorResponse.getLastDataReceived(), LASTDATARECEIVED_BINDING);
            protocolMarshaller.marshall(collectorResponse.getRegisteredDate(), REGISTEREDDATE_BINDING);
            protocolMarshaller.marshall(collectorResponse.getCreatedDate(), CREATEDDATE_BINDING);
            protocolMarshaller.marshall(collectorResponse.getModifiedDate(), MODIFIEDDATE_BINDING);
            protocolMarshaller.marshall(collectorResponse.getInventoryData(), INVENTORYDATA_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
