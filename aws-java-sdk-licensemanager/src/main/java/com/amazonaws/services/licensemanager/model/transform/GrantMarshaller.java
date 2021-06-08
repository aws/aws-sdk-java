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
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GrantMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GrantMarshaller {

    private static final MarshallingInfo<String> GRANTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GrantArn").build();
    private static final MarshallingInfo<String> GRANTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("GrantName").build();
    private static final MarshallingInfo<String> PARENTARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ParentArn").build();
    private static final MarshallingInfo<String> LICENSEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseArn").build();
    private static final MarshallingInfo<String> GRANTEEPRINCIPALARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GranteePrincipalArn").build();
    private static final MarshallingInfo<String> HOMEREGION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("HomeRegion").build();
    private static final MarshallingInfo<String> GRANTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrantStatus").build();
    private static final MarshallingInfo<String> STATUSREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("StatusReason").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Version").build();
    private static final MarshallingInfo<List> GRANTEDOPERATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("GrantedOperations").build();

    private static final GrantMarshaller instance = new GrantMarshaller();

    public static GrantMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Grant grant, ProtocolMarshaller protocolMarshaller) {

        if (grant == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(grant.getGrantArn(), GRANTARN_BINDING);
            protocolMarshaller.marshall(grant.getGrantName(), GRANTNAME_BINDING);
            protocolMarshaller.marshall(grant.getParentArn(), PARENTARN_BINDING);
            protocolMarshaller.marshall(grant.getLicenseArn(), LICENSEARN_BINDING);
            protocolMarshaller.marshall(grant.getGranteePrincipalArn(), GRANTEEPRINCIPALARN_BINDING);
            protocolMarshaller.marshall(grant.getHomeRegion(), HOMEREGION_BINDING);
            protocolMarshaller.marshall(grant.getGrantStatus(), GRANTSTATUS_BINDING);
            protocolMarshaller.marshall(grant.getStatusReason(), STATUSREASON_BINDING);
            protocolMarshaller.marshall(grant.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(grant.getGrantedOperations(), GRANTEDOPERATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
