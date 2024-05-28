/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workspacesweb.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * IpAccessSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class IpAccessSettingsMarshaller {

    private static final MarshallingInfo<Map> ADDITIONALENCRYPTIONCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.MAP)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("additionalEncryptionContext").build();
    private static final MarshallingInfo<List> ASSOCIATEDPORTALARNS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedPortalArns").build();
    private static final MarshallingInfo<java.util.Date> CREATIONDATE_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("creationDate").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<String> CUSTOMERMANAGEDKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("customerManagedKey").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("displayName").build();
    private static final MarshallingInfo<String> IPACCESSSETTINGSARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ipAccessSettingsArn").build();
    private static final MarshallingInfo<List> IPRULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ipRules").build();

    private static final IpAccessSettingsMarshaller instance = new IpAccessSettingsMarshaller();

    public static IpAccessSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(IpAccessSettings ipAccessSettings, ProtocolMarshaller protocolMarshaller) {

        if (ipAccessSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ipAccessSettings.getAdditionalEncryptionContext(), ADDITIONALENCRYPTIONCONTEXT_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getAssociatedPortalArns(), ASSOCIATEDPORTALARNS_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getCreationDate(), CREATIONDATE_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getCustomerManagedKey(), CUSTOMERMANAGEDKEY_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getIpAccessSettingsArn(), IPACCESSSETTINGSARN_BINDING);
            protocolMarshaller.marshall(ipAccessSettings.getIpRules(), IPRULES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
