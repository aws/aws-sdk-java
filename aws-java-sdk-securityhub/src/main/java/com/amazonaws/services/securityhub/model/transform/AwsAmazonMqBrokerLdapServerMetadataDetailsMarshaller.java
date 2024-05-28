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
package com.amazonaws.services.securityhub.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.securityhub.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AwsAmazonMqBrokerLdapServerMetadataDetailsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AwsAmazonMqBrokerLdapServerMetadataDetailsMarshaller {

    private static final MarshallingInfo<List> HOSTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Hosts").build();
    private static final MarshallingInfo<String> ROLEBASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleBase").build();
    private static final MarshallingInfo<String> ROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("RoleName").build();
    private static final MarshallingInfo<String> ROLESEARCHMATCHING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoleSearchMatching").build();
    private static final MarshallingInfo<Boolean> ROLESEARCHSUBTREE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RoleSearchSubtree").build();
    private static final MarshallingInfo<String> SERVICEACCOUNTUSERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ServiceAccountUsername").build();
    private static final MarshallingInfo<String> USERBASE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("UserBase").build();
    private static final MarshallingInfo<String> USERROLENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserRoleName").build();
    private static final MarshallingInfo<String> USERSEARCHMATCHING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserSearchMatching").build();
    private static final MarshallingInfo<Boolean> USERSEARCHSUBTREE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("UserSearchSubtree").build();

    private static final AwsAmazonMqBrokerLdapServerMetadataDetailsMarshaller instance = new AwsAmazonMqBrokerLdapServerMetadataDetailsMarshaller();

    public static AwsAmazonMqBrokerLdapServerMetadataDetailsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AwsAmazonMqBrokerLdapServerMetadataDetails awsAmazonMqBrokerLdapServerMetadataDetails, ProtocolMarshaller protocolMarshaller) {

        if (awsAmazonMqBrokerLdapServerMetadataDetails == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getHosts(), HOSTS_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getRoleBase(), ROLEBASE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getRoleName(), ROLENAME_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getRoleSearchMatching(), ROLESEARCHMATCHING_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getRoleSearchSubtree(), ROLESEARCHSUBTREE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getServiceAccountUsername(), SERVICEACCOUNTUSERNAME_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getUserBase(), USERBASE_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getUserRoleName(), USERROLENAME_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getUserSearchMatching(), USERSEARCHMATCHING_BINDING);
            protocolMarshaller.marshall(awsAmazonMqBrokerLdapServerMetadataDetails.getUserSearchSubtree(), USERSEARCHSUBTREE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
