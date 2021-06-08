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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * RepositoryDescriptionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class RepositoryDescriptionMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> ADMINISTRATORACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("administratorAccount").build();
    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainName").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("domainOwner").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<List> UPSTREAMS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("upstreams").build();
    private static final MarshallingInfo<List> EXTERNALCONNECTIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("externalConnections").build();

    private static final RepositoryDescriptionMarshaller instance = new RepositoryDescriptionMarshaller();

    public static RepositoryDescriptionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(RepositoryDescription repositoryDescription, ProtocolMarshaller protocolMarshaller) {

        if (repositoryDescription == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(repositoryDescription.getName(), NAME_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getAdministratorAccount(), ADMINISTRATORACCOUNT_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getUpstreams(), UPSTREAMS_BINDING);
            protocolMarshaller.marshall(repositoryDescription.getExternalConnections(), EXTERNALCONNECTIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
