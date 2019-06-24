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
package com.amazonaws.services.fsx.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fsx.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SelfManagedActiveDirectoryAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SelfManagedActiveDirectoryAttributesMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> ORGANIZATIONALUNITDISTINGUISHEDNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnitDistinguishedName").build();
    private static final MarshallingInfo<String> FILESYSTEMADMINISTRATORSGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FileSystemAdministratorsGroup").build();
    private static final MarshallingInfo<String> USERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserName").build();
    private static final MarshallingInfo<List> DNSIPS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("DnsIps").build();

    private static final SelfManagedActiveDirectoryAttributesMarshaller instance = new SelfManagedActiveDirectoryAttributesMarshaller();

    public static SelfManagedActiveDirectoryAttributesMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryAttributes, ProtocolMarshaller protocolMarshaller) {

        if (selfManagedActiveDirectoryAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(selfManagedActiveDirectoryAttributes.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryAttributes.getOrganizationalUnitDistinguishedName(),
                    ORGANIZATIONALUNITDISTINGUISHEDNAME_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryAttributes.getFileSystemAdministratorsGroup(), FILESYSTEMADMINISTRATORSGROUP_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryAttributes.getUserName(), USERNAME_BINDING);
            protocolMarshaller.marshall(selfManagedActiveDirectoryAttributes.getDnsIps(), DNSIPS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
