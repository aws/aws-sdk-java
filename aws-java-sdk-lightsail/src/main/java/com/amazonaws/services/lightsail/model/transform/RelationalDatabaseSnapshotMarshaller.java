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
 * RelationalDatabaseSnapshotMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelationalDatabaseSnapshotMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> SUPPORTCODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("supportCode").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("location").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceType").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersion").build();
    private static final MarshallingInfo<Integer> SIZEINGB_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sizeInGb").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> FROMRELATIONALDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromRelationalDatabaseName").build();
    private static final MarshallingInfo<String> FROMRELATIONALDATABASEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromRelationalDatabaseArn").build();
    private static final MarshallingInfo<String> FROMRELATIONALDATABASEBUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromRelationalDatabaseBundleId").build();
    private static final MarshallingInfo<String> FROMRELATIONALDATABASEBLUEPRINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("fromRelationalDatabaseBlueprintId").build();

    private static final RelationalDatabaseSnapshotMarshaller instance = new RelationalDatabaseSnapshotMarshaller();

    public static RelationalDatabaseSnapshotMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelationalDatabaseSnapshot relationalDatabaseSnapshot, ProtocolMarshaller protocolMarshaller) {

        if (relationalDatabaseSnapshot == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getName(), NAME_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getSizeInGb(), SIZEINGB_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getState(), STATE_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getFromRelationalDatabaseName(), FROMRELATIONALDATABASENAME_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getFromRelationalDatabaseArn(), FROMRELATIONALDATABASEARN_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getFromRelationalDatabaseBundleId(), FROMRELATIONALDATABASEBUNDLEID_BINDING);
            protocolMarshaller.marshall(relationalDatabaseSnapshot.getFromRelationalDatabaseBlueprintId(), FROMRELATIONALDATABASEBLUEPRINTID_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
