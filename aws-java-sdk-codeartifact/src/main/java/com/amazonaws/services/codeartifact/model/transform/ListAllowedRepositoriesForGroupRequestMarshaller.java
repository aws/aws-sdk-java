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
package com.amazonaws.services.codeartifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListAllowedRepositoriesForGroupRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListAllowedRepositoriesForGroupRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain-owner").build();
    private static final MarshallingInfo<String> PACKAGEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("package-group").build();
    private static final MarshallingInfo<String> ORIGINRESTRICTIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("originRestrictionType").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("max-results").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("next-token").build();

    private static final ListAllowedRepositoriesForGroupRequestMarshaller instance = new ListAllowedRepositoriesForGroupRequestMarshaller();

    public static ListAllowedRepositoriesForGroupRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListAllowedRepositoriesForGroupRequest listAllowedRepositoriesForGroupRequest, ProtocolMarshaller protocolMarshaller) {

        if (listAllowedRepositoriesForGroupRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listAllowedRepositoriesForGroupRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(listAllowedRepositoriesForGroupRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(listAllowedRepositoriesForGroupRequest.getPackageGroup(), PACKAGEGROUP_BINDING);
            protocolMarshaller.marshall(listAllowedRepositoriesForGroupRequest.getOriginRestrictionType(), ORIGINRESTRICTIONTYPE_BINDING);
            protocolMarshaller.marshall(listAllowedRepositoriesForGroupRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listAllowedRepositoriesForGroupRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
