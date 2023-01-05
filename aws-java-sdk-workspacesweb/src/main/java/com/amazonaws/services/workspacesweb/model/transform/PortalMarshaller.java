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
package com.amazonaws.services.workspacesweb.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * PortalMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PortalMarshaller {

    private static final MarshallingInfo<String> BROWSERSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("browserSettingsArn").build();
    private static final MarshallingInfo<String> BROWSERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("browserType").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> NETWORKSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("networkSettingsArn").build();
    private static final MarshallingInfo<String> PORTALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("portalArn").build();
    private static final MarshallingInfo<String> PORTALENDPOINT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portalEndpoint").build();
    private static final MarshallingInfo<String> PORTALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("portalStatus").build();
    private static final MarshallingInfo<String> RENDERERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("rendererType").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusReason").build();
    private static final MarshallingInfo<String> TRUSTSTOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trustStoreArn").build();
    private static final MarshallingInfo<String> USERACCESSLOGGINGSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAccessLoggingSettingsArn").build();
    private static final MarshallingInfo<String> USERSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userSettingsArn").build();

    private static final PortalMarshaller instance = new PortalMarshaller();

    public static PortalMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Portal portal, ProtocolMarshaller protocolMarshaller) {

        if (portal == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(portal.getBrowserSettingsArn(), BROWSERSETTINGSARN_BINDING);
            protocolMarshaller.marshall(portal.getBrowserType(), BROWSERTYPE_BINDING);
            protocolMarshaller.marshall(portal.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(portal.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(portal.getNetworkSettingsArn(), NETWORKSETTINGSARN_BINDING);
            protocolMarshaller.marshall(portal.getPortalArn(), PORTALARN_BINDING);
            protocolMarshaller.marshall(portal.getPortalEndpoint(), PORTALENDPOINT_BINDING);
            protocolMarshaller.marshall(portal.getPortalStatus(), PORTALSTATUS_BINDING);
            protocolMarshaller.marshall(portal.getRendererType(), RENDERERTYPE_BINDING);
            protocolMarshaller.marshall(portal.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(portal.getTrustStoreArn(), TRUSTSTOREARN_BINDING);
            protocolMarshaller.marshall(portal.getUserAccessLoggingSettingsArn(), USERACCESSLOGGINGSETTINGSARN_BINDING);
            protocolMarshaller.marshall(portal.getUserSettingsArn(), USERSETTINGSARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
