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
package com.amazonaws.services.codeartifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListRepositoriesInDomainRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListRepositoriesInDomainRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain-owner").build();
    private static final MarshallingInfo<String> ADMINISTRATORACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("administrator-account").build();
    private static final MarshallingInfo<String> REPOSITORYPREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("repository-prefix").build();
    private static final MarshallingInfo<Integer> MAXRESULTS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("max-results").build();
    private static final MarshallingInfo<String> NEXTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("next-token").build();

    private static final ListRepositoriesInDomainRequestMarshaller instance = new ListRepositoriesInDomainRequestMarshaller();

    public static ListRepositoriesInDomainRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListRepositoriesInDomainRequest listRepositoriesInDomainRequest, ProtocolMarshaller protocolMarshaller) {

        if (listRepositoriesInDomainRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listRepositoriesInDomainRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(listRepositoriesInDomainRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(listRepositoriesInDomainRequest.getAdministratorAccount(), ADMINISTRATORACCOUNT_BINDING);
            protocolMarshaller.marshall(listRepositoriesInDomainRequest.getRepositoryPrefix(), REPOSITORYPREFIX_BINDING);
            protocolMarshaller.marshall(listRepositoriesInDomainRequest.getMaxResults(), MAXRESULTS_BINDING);
            protocolMarshaller.marshall(listRepositoriesInDomainRequest.getNextToken(), NEXTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
