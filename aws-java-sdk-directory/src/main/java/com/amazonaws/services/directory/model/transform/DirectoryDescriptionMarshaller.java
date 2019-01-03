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
package com.amazonaws.services.directory.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.directory.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DirectoryDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DirectoryDescriptionMarshaller {

    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DirectoryId").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> SHORTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ShortName").build();
    private static final MarshallingInfo<String> SIZE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Size").build();
    private static final MarshallingInfo<String> EDITION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Edition").build();
    private static final MarshallingInfo<String> ALIAS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Alias").build();
    private static final MarshallingInfo<String> ACCESSURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("AccessUrl").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<List> DNSIPADDRS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsIpAddrs").build();
    private static final MarshallingInfo<String> STAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Stage").build();
    private static final MarshallingInfo<String> SHARESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareStatus").build();
    private static final MarshallingInfo<String> SHAREMETHOD_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareMethod").build();
    private static final MarshallingInfo<String> SHARENOTES_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ShareNotes").build();
    private static final MarshallingInfo<java.util.Date> LAUNCHTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LaunchTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> STAGELASTUPDATEDDATETIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StageLastUpdatedDateTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> TYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Type").build();
    private static final MarshallingInfo<StructuredPojo> VPCSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("VpcSettings").build();
    private static final MarshallingInfo<StructuredPojo> CONNECTSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConnectSettings").build();
    private static final MarshallingInfo<StructuredPojo> RADIUSSETTINGS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RadiusSettings").build();
    private static final MarshallingInfo<String> RADIUSSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RadiusStatus").build();
    private static final MarshallingInfo<String> STAGEREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StageReason").build();
    private static final MarshallingInfo<Boolean> SSOENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SsoEnabled").build();
    private static final MarshallingInfo<Integer> DESIREDNUMBEROFDOMAINCONTROLLERS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DesiredNumberOfDomainControllers").build();
    private static final MarshallingInfo<StructuredPojo> OWNERDIRECTORYDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerDirectoryDescription").build();

    private static final DirectoryDescriptionMarshaller instance = new DirectoryDescriptionMarshaller();

    public static DirectoryDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DirectoryDescription directoryDescription, ProtocolMarshaller protocolMarshaller) {

        if (directoryDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(directoryDescription.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(directoryDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(directoryDescription.getShortName(), SHORTNAME_BINDING);
            protocolMarshaller.marshall(directoryDescription.getSize(), SIZE_BINDING);
            protocolMarshaller.marshall(directoryDescription.getEdition(), EDITION_BINDING);
            protocolMarshaller.marshall(directoryDescription.getAlias(), ALIAS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getAccessUrl(), ACCESSURL_BINDING);
            protocolMarshaller.marshall(directoryDescription.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(directoryDescription.getDnsIpAddrs(), DNSIPADDRS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getStage(), STAGE_BINDING);
            protocolMarshaller.marshall(directoryDescription.getShareStatus(), SHARESTATUS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getShareMethod(), SHAREMETHOD_BINDING);
            protocolMarshaller.marshall(directoryDescription.getShareNotes(), SHARENOTES_BINDING);
            protocolMarshaller.marshall(directoryDescription.getLaunchTime(), LAUNCHTIME_BINDING);
            protocolMarshaller.marshall(directoryDescription.getStageLastUpdatedDateTime(), STAGELASTUPDATEDDATETIME_BINDING);
            protocolMarshaller.marshall(directoryDescription.getType(), TYPE_BINDING);
            protocolMarshaller.marshall(directoryDescription.getVpcSettings(), VPCSETTINGS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getConnectSettings(), CONNECTSETTINGS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getRadiusSettings(), RADIUSSETTINGS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getRadiusStatus(), RADIUSSTATUS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getStageReason(), STAGEREASON_BINDING);
            protocolMarshaller.marshall(directoryDescription.getSsoEnabled(), SSOENABLED_BINDING);
            protocolMarshaller.marshall(directoryDescription.getDesiredNumberOfDomainControllers(), DESIREDNUMBEROFDOMAINCONTROLLERS_BINDING);
            protocolMarshaller.marshall(directoryDescription.getOwnerDirectoryDescription(), OWNERDIRECTORYDESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
