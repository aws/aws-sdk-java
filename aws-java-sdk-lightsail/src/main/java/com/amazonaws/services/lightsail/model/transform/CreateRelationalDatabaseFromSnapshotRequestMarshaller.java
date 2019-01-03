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
package com.amazonaws.services.lightsail.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.lightsail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateRelationalDatabaseFromSnapshotRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateRelationalDatabaseFromSnapshotRequestMarshaller {

    private static final MarshallingInfo<String> RELATIONALDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseName").build();
    private static final MarshallingInfo<String> AVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("availabilityZone").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyAccessible").build();
    private static final MarshallingInfo<String> RELATIONALDATABASESNAPSHOTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseSnapshotName").build();
    private static final MarshallingInfo<String> RELATIONALDATABASEBUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseBundleId").build();
    private static final MarshallingInfo<String> SOURCERELATIONALDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceRelationalDatabaseName").build();
    private static final MarshallingInfo<java.util.Date> RESTORETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("restoreTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Boolean> USELATESTRESTORABLETIME_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useLatestRestorableTime").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final CreateRelationalDatabaseFromSnapshotRequestMarshaller instance = new CreateRelationalDatabaseFromSnapshotRequestMarshaller();

    public static CreateRelationalDatabaseFromSnapshotRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateRelationalDatabaseFromSnapshotRequest createRelationalDatabaseFromSnapshotRequest, ProtocolMarshaller protocolMarshaller) {

        if (createRelationalDatabaseFromSnapshotRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getRelationalDatabaseName(), RELATIONALDATABASENAME_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getAvailabilityZone(), AVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller
                    .marshall(createRelationalDatabaseFromSnapshotRequest.getRelationalDatabaseSnapshotName(), RELATIONALDATABASESNAPSHOTNAME_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getRelationalDatabaseBundleId(), RELATIONALDATABASEBUNDLEID_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getSourceRelationalDatabaseName(), SOURCERELATIONALDATABASENAME_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getRestoreTime(), RESTORETIME_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getUseLatestRestorableTime(), USELATESTRESTORABLETIME_BINDING);
            protocolMarshaller.marshall(createRelationalDatabaseFromSnapshotRequest.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
