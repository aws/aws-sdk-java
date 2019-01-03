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
 * RelationalDatabaseMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RelationalDatabaseMarshaller {

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
    private static final MarshallingInfo<String> RELATIONALDATABASEBLUEPRINTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseBlueprintId").build();
    private static final MarshallingInfo<String> RELATIONALDATABASEBUNDLEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("relationalDatabaseBundleId").build();
    private static final MarshallingInfo<String> MASTERDATABASENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("masterDatabaseName").build();
    private static final MarshallingInfo<StructuredPojo> HARDWARE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("hardware").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> SECONDARYAVAILABILITYZONE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("secondaryAvailabilityZone").build();
    private static final MarshallingInfo<Boolean> BACKUPRETENTIONENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("backupRetentionEnabled").build();
    private static final MarshallingInfo<StructuredPojo> PENDINGMODIFIEDVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingModifiedValues").build();
    private static final MarshallingInfo<String> ENGINE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("engine").build();
    private static final MarshallingInfo<String> ENGINEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("engineVersion").build();
    private static final MarshallingInfo<java.util.Date> LATESTRESTORABLETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestRestorableTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> MASTERUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("masterUsername").build();
    private static final MarshallingInfo<String> PARAMETERAPPLYSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parameterApplyStatus").build();
    private static final MarshallingInfo<String> PREFERREDBACKUPWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredBackupWindow").build();
    private static final MarshallingInfo<String> PREFERREDMAINTENANCEWINDOW_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("preferredMaintenanceWindow").build();
    private static final MarshallingInfo<Boolean> PUBLICLYACCESSIBLE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("publiclyAccessible").build();
    private static final MarshallingInfo<StructuredPojo> MASTERENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("masterEndpoint").build();
    private static final MarshallingInfo<List> PENDINGMAINTENANCEACTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("pendingMaintenanceActions").build();

    private static final RelationalDatabaseMarshaller instance = new RelationalDatabaseMarshaller();

    public static RelationalDatabaseMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RelationalDatabase relationalDatabase, ProtocolMarshaller protocolMarshaller) {

        if (relationalDatabase == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(relationalDatabase.getName(), NAME_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getSupportCode(), SUPPORTCODE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getLocation(), LOCATION_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getRelationalDatabaseBlueprintId(), RELATIONALDATABASEBLUEPRINTID_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getRelationalDatabaseBundleId(), RELATIONALDATABASEBUNDLEID_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getMasterDatabaseName(), MASTERDATABASENAME_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getHardware(), HARDWARE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getState(), STATE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getSecondaryAvailabilityZone(), SECONDARYAVAILABILITYZONE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getBackupRetentionEnabled(), BACKUPRETENTIONENABLED_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getPendingModifiedValues(), PENDINGMODIFIEDVALUES_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getEngine(), ENGINE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getEngineVersion(), ENGINEVERSION_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getLatestRestorableTime(), LATESTRESTORABLETIME_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getMasterUsername(), MASTERUSERNAME_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getParameterApplyStatus(), PARAMETERAPPLYSTATUS_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getPreferredBackupWindow(), PREFERREDBACKUPWINDOW_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getPreferredMaintenanceWindow(), PREFERREDMAINTENANCEWINDOW_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getPubliclyAccessible(), PUBLICLYACCESSIBLE_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getMasterEndpoint(), MASTERENDPOINT_BINDING);
            protocolMarshaller.marshall(relationalDatabase.getPendingMaintenanceActions(), PENDINGMAINTENANCEACTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
