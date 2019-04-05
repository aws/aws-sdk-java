/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simplesystemsmanagement.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceDataSyncItemMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceDataSyncItemMarshaller {

    private static final MarshallingInfo<String> SYNCNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("SyncName").build();
    private static final MarshallingInfo<StructuredPojo> S3DESTINATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Destination").build();
    private static final MarshallingInfo<java.util.Date> LASTSYNCTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSyncTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULSYNCTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulSyncTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastStatus").build();
    private static final MarshallingInfo<java.util.Date> SYNCCREATEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SyncCreatedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTSYNCSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSyncStatusMessage").build();

    private static final ResourceDataSyncItemMarshaller instance = new ResourceDataSyncItemMarshaller();

    public static ResourceDataSyncItemMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceDataSyncItem resourceDataSyncItem, ProtocolMarshaller protocolMarshaller) {

        if (resourceDataSyncItem == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceDataSyncItem.getSyncName(), SYNCNAME_BINDING);
            protocolMarshaller.marshall(resourceDataSyncItem.getS3Destination(), S3DESTINATION_BINDING);
            protocolMarshaller.marshall(resourceDataSyncItem.getLastSyncTime(), LASTSYNCTIME_BINDING);
            protocolMarshaller.marshall(resourceDataSyncItem.getLastSuccessfulSyncTime(), LASTSUCCESSFULSYNCTIME_BINDING);
            protocolMarshaller.marshall(resourceDataSyncItem.getLastStatus(), LASTSTATUS_BINDING);
            protocolMarshaller.marshall(resourceDataSyncItem.getSyncCreatedTime(), SYNCCREATEDTIME_BINDING);
            protocolMarshaller.marshall(resourceDataSyncItem.getLastSyncStatusMessage(), LASTSYNCSTATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
