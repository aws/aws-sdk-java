/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.nimblestudio.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.nimblestudio.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LaunchProfileInitializationActiveDirectoryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LaunchProfileInitializationActiveDirectoryMarshaller {

    private static final MarshallingInfo<List> COMPUTERATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("computerAttributes").build();
    private static final MarshallingInfo<String> DIRECTORYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directoryId").build();
    private static final MarshallingInfo<String> DIRECTORYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("directoryName").build();
    private static final MarshallingInfo<List> DNSIPADDRESSES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dnsIpAddresses").build();
    private static final MarshallingInfo<String> ORGANIZATIONALUNITDISTINGUISHEDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("organizationalUnitDistinguishedName").build();
    private static final MarshallingInfo<String> STUDIOCOMPONENTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioComponentId").build();
    private static final MarshallingInfo<String> STUDIOCOMPONENTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("studioComponentName").build();

    private static final LaunchProfileInitializationActiveDirectoryMarshaller instance = new LaunchProfileInitializationActiveDirectoryMarshaller();

    public static LaunchProfileInitializationActiveDirectoryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LaunchProfileInitializationActiveDirectory launchProfileInitializationActiveDirectory, ProtocolMarshaller protocolMarshaller) {

        if (launchProfileInitializationActiveDirectory == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getComputerAttributes(), COMPUTERATTRIBUTES_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getDirectoryId(), DIRECTORYID_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getDirectoryName(), DIRECTORYNAME_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getDnsIpAddresses(), DNSIPADDRESSES_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getOrganizationalUnitDistinguishedName(),
                    ORGANIZATIONALUNITDISTINGUISHEDNAME_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getStudioComponentId(), STUDIOCOMPONENTID_BINDING);
            protocolMarshaller.marshall(launchProfileInitializationActiveDirectory.getStudioComponentName(), STUDIOCOMPONENTNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
