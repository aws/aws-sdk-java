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
package com.amazonaws.services.fms.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.fms.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * OrganizationalUnitScopeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class OrganizationalUnitScopeMarshaller {

    private static final MarshallingInfo<List> ORGANIZATIONALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrganizationalUnits").build();
    private static final MarshallingInfo<Boolean> ALLORGANIZATIONALUNITSENABLED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AllOrganizationalUnitsEnabled").build();
    private static final MarshallingInfo<Boolean> EXCLUDESPECIFIEDORGANIZATIONALUNITS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ExcludeSpecifiedOrganizationalUnits").build();

    private static final OrganizationalUnitScopeMarshaller instance = new OrganizationalUnitScopeMarshaller();

    public static OrganizationalUnitScopeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(OrganizationalUnitScope organizationalUnitScope, ProtocolMarshaller protocolMarshaller) {

        if (organizationalUnitScope == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(organizationalUnitScope.getOrganizationalUnits(), ORGANIZATIONALUNITS_BINDING);
            protocolMarshaller.marshall(organizationalUnitScope.getAllOrganizationalUnitsEnabled(), ALLORGANIZATIONALUNITSENABLED_BINDING);
            protocolMarshaller.marshall(organizationalUnitScope.getExcludeSpecifiedOrganizationalUnits(), EXCLUDESPECIFIEDORGANIZATIONALUNITS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
