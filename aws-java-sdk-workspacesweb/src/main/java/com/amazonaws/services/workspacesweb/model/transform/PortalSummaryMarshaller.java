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
 * PortalSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class PortalSummaryMarshaller {

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
    private static final MarshallingInfo<String> TRUSTSTOREARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("trustStoreArn").build();
    private static final MarshallingInfo<String> USERACCESSLOGGINGSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userAccessLoggingSettingsArn").build();
    private static final MarshallingInfo<String> USERSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userSettingsArn").build();

    private static final PortalSummaryMarshaller instance = new PortalSummaryMarshaller();

    public static PortalSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(PortalSummary portalSummary, ProtocolMarshaller protocolMarshaller) {

        if (portalSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(portalSummary.getBrowserSettingsArn(), BROWSERSETTINGSARN_BINDING);
            protocolMarshaller.marshall(portalSummary.getBrowserType(), BROWSERTYPE_BINDING);
            protocolMarshaller.marshall(portalSummary.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(portalSummary.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(portalSummary.getNetworkSettingsArn(), NETWORKSETTINGSARN_BINDING);
            protocolMarshaller.marshall(portalSummary.getPortalArn(), PORTALARN_BINDING);
            protocolMarshaller.marshall(portalSummary.getPortalEndpoint(), PORTALENDPOINT_BINDING);
            protocolMarshaller.marshall(portalSummary.getPortalStatus(), PORTALSTATUS_BINDING);
            protocolMarshaller.marshall(portalSummary.getRendererType(), RENDERERTYPE_BINDING);
            protocolMarshaller.marshall(portalSummary.getTrustStoreArn(), TRUSTSTOREARN_BINDING);
            protocolMarshaller.marshall(portalSummary.getUserAccessLoggingSettingsArn(), USERACCESSLOGGINGSETTINGSARN_BINDING);
            protocolMarshaller.marshall(portalSummary.getUserSettingsArn(), USERSETTINGSARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
