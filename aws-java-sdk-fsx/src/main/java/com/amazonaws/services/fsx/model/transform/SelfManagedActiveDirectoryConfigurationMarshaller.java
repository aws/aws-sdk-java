/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SelfManagedActiveDirectoryConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SelfManagedActiveDirectoryConfigurationMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> ORGANIZATIONALUNITDISTINGUISHEDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnitDistinguishedName").build();
    private static final MarshallingInfo<String> FILESYSTEMADMINISTRATORSGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemAdministratorsGroup").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<String> PASSWORD_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Password").build();
    private static final MarshallingInfo<List> DNSIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsIps").build();

    private static final SelfManagedActiveDirectoryConfigurationMarshaller instance = new SelfManagedActiveDirectoryConfigurationMarshaller();

    public static SelfManagedActiveDirectoryConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (selfManagedActiveDirectoryConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(selfManagedActiveDirectoryConfiguration.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryConfiguration.getOrganizationalUnitDistinguishedName(),
                    ORGANIZATIONALUNITDISTINGUISHEDNAME_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryConfiguration.getFileSystemAdministratorsGroup(), FILESYSTEMADMINISTRATORSGROUP_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryConfiguration.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryConfiguration.getPassword(), PASSWORD_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryConfiguration.getDnsIps(), DNSIPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
