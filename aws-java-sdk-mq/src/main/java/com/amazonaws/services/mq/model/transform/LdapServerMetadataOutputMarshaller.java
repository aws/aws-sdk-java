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
package com.amazonaws.services.mq.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mq.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LdapServerMetadataOutputMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LdapServerMetadataOutputMarshaller {

    private static final MarshallingInfo<List> HOSTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hosts").build();
    private static final MarshallingInfo<String> ROLEBASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleBase").build();
    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleName").build();
    private static final MarshallingInfo<String> ROLESEARCHMATCHING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("roleSearchMatching").build();
    private static final MarshallingInfo<Boolean> ROLESEARCHSUBTREE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("roleSearchSubtree").build();
    private static final MarshallingInfo<String> SERVICEACCOUNTUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serviceAccountUsername").build();
    private static final MarshallingInfo<String> USERBASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("userBase").build();
    private static final MarshallingInfo<String> USERROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userRoleName").build();
    private static final MarshallingInfo<String> USERSEARCHMATCHING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userSearchMatching").build();
    private static final MarshallingInfo<Boolean> USERSEARCHSUBTREE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("userSearchSubtree").build();

    private static final LdapServerMetadataOutputMarshaller instance = new LdapServerMetadataOutputMarshaller();

    public static LdapServerMetadataOutputMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LdapServerMetadataOutput ldapServerMetadataOutput, ProtocolMarshaller protocolMarshaller) {

        if (ldapServerMetadataOutput == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(ldapServerMetadataOutput.getHosts(), HOSTS_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getRoleBase(), ROLEBASE_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getRoleName(), ROLENAME_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getRoleSearchMatching(), ROLESEARCHMATCHING_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getRoleSearchSubtree(), ROLESEARCHSUBTREE_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getServiceAccountUsername(), SERVICEACCOUNTUSERNAME_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getUserBase(), USERBASE_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getUserRoleName(), USERROLENAME_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getUserSearchMatching(), USERSEARCHMATCHING_BINDING);
            protocolMarshaller.marshall(ldapServerMetadataOutput.getUserSearchSubtree(), USERSEARCHSUBTREE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
