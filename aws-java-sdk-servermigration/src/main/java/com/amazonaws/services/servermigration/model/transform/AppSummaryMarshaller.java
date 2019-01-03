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
package com.amazonaws.services.servermigration.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.servermigration.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AppSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AppSummaryMarshaller {

    private static final MarshallingInfo<String> APPID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> REPLICATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationStatus").build();
    private static final MarshallingInfo<String> REPLICATIONSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("replicationStatusMessage").build();
    private static final MarshallingInfo<java.util.Date> LATESTREPLICATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("latestReplicationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> LAUNCHSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchStatus").build();
    private static final MarshallingInfo<String> LAUNCHSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchStatusMessage").build();
    private static final MarshallingInfo<StructuredPojo> LAUNCHDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("launchDetails").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModified").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleName").build();
    private static final MarshallingInfo<Integer> TOTALSERVERGROUPS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalServerGroups").build();
    private static final MarshallingInfo<Integer> TOTALSERVERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("totalServers").build();

    private static final AppSummaryMarshaller instance = new AppSummaryMarshaller();

    public static AppSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AppSummary appSummary, ProtocolMarshaller protocolMarshaller) {

        if (appSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(appSummary.getAppId(), APPID_BINDING);
            protocolMarshaller.marshall(appSummary.getName(), NAME_BINDING);
            protocolMarshaller.marshall(appSummary.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(appSummary.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(appSummary.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(appSummary.getReplicationStatus(), REPLICATIONSTATUS_BINDING);
            protocolMarshaller.marshall(appSummary.getReplicationStatusMessage(), REPLICATIONSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(appSummary.getLatestReplicationTime(), LATESTREPLICATIONTIME_BINDING);
            protocolMarshaller.marshall(appSummary.getLaunchStatus(), LAUNCHSTATUS_BINDING);
            protocolMarshaller.marshall(appSummary.getLaunchStatusMessage(), LAUNCHSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(appSummary.getLaunchDetails(), LAUNCHDETAILS_BINDING);
            protocolMarshaller.marshall(appSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(appSummary.getLastModified(), LASTMODIFIED_BINDING);
            protocolMarshaller.marshall(appSummary.getRoleName(), ROLENAME_BINDING);
            protocolMarshaller.marshall(appSummary.getTotalServerGroups(), TOTALSERVERGROUPS_BINDING);
            protocolMarshaller.marshall(appSummary.getTotalServers(), TOTALSERVERS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
