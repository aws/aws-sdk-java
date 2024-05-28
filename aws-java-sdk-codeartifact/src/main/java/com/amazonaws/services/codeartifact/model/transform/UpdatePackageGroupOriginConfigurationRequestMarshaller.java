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

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codeartifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdatePackageGroupOriginConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdatePackageGroupOriginConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> DOMAIN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain").build();
    private static final MarshallingInfo<String> DOMAINOWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("domain-owner").build();
    private static final MarshallingInfo<String> PACKAGEGROUP_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("package-group").build();
    private static final MarshallingInfo<Map> RESTRICTIONS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("restrictions").build();
    private static final MarshallingInfo<List> ADDALLOWEDREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("addAllowedRepositories").build();
    private static final MarshallingInfo<List> REMOVEALLOWEDREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("removeAllowedRepositories").build();

    private static final UpdatePackageGroupOriginConfigurationRequestMarshaller instance = new UpdatePackageGroupOriginConfigurationRequestMarshaller();

    public static UpdatePackageGroupOriginConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdatePackageGroupOriginConfigurationRequest updatePackageGroupOriginConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updatePackageGroupOriginConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updatePackageGroupOriginConfigurationRequest.getDomain(), DOMAIN_BINDING);
            protocolMarshaller.marshall(updatePackageGroupOriginConfigurationRequest.getDomainOwner(), DOMAINOWNER_BINDING);
            protocolMarshaller.marshall(updatePackageGroupOriginConfigurationRequest.getPackageGroup(), PACKAGEGROUP_BINDING);
            protocolMarshaller.marshall(updatePackageGroupOriginConfigurationRequest.getRestrictions(), RESTRICTIONS_BINDING);
            protocolMarshaller.marshall(updatePackageGroupOriginConfigurationRequest.getAddAllowedRepositories(), ADDALLOWEDREPOSITORIES_BINDING);
            protocolMarshaller.marshall(updatePackageGroupOriginConfigurationRequest.getRemoveAllowedRepositories(), REMOVEALLOWEDREPOSITORIES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
