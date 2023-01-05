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
package com.amazonaws.services.servicecatalog.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servicecatalog.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LastSyncMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LastSyncMarshaller {

    private static final MarshallingInfo<java.util.Date> LASTSYNCTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSyncTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTSYNCSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSyncStatus").build();
    private static final MarshallingInfo<String> LASTSYNCSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSyncStatusMessage").build();
    private static final MarshallingInfo<java.util.Date> LASTSUCCESSFULSYNCTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulSyncTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LASTSUCCESSFULSYNCPROVISIONINGARTIFACTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastSuccessfulSyncProvisioningArtifactId").build();

    private static final LastSyncMarshaller instance = new LastSyncMarshaller();

    public static LastSyncMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LastSync lastSync, ProtocolMarshaller protocolMarshaller) {

        if (lastSync == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(lastSync.getLastSyncTime(), LASTSYNCTIME_BINDING);
            protocolMarshaller.marshall(lastSync.getLastSyncStatus(), LASTSYNCSTATUS_BINDING);
            protocolMarshaller.marshall(lastSync.getLastSyncStatusMessage(), LASTSYNCSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(lastSync.getLastSuccessfulSyncTime(), LASTSUCCESSFULSYNCTIME_BINDING);
            protocolMarshaller.marshall(lastSync.getLastSuccessfulSyncProvisioningArtifactId(), LASTSUCCESSFULSYNCPROVISIONINGARTIFACTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
