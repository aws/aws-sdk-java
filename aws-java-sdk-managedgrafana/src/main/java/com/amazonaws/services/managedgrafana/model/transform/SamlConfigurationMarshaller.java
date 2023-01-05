/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.managedgrafana.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.managedgrafana.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * SamlConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class SamlConfigurationMarshaller {

    private static final MarshallingInfo<List> ALLOWEDORGANIZATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("allowedOrganizations").build();
    private static final MarshallingInfo<StructuredPojo> ASSERTIONATTRIBUTES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("assertionAttributes").build();
    private static final MarshallingInfo<StructuredPojo> IDPMETADATA_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("idpMetadata").build();
    private static final MarshallingInfo<Integer> LOGINVALIDITYDURATION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("loginValidityDuration").build();
    private static final MarshallingInfo<StructuredPojo> ROLEVALUES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("roleValues").build();

    private static final SamlConfigurationMarshaller instance = new SamlConfigurationMarshaller();

    public static SamlConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(SamlConfiguration samlConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (samlConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(samlConfiguration.getAllowedOrganizations(), ALLOWEDORGANIZATIONS_BINDING);
            protocolMarshaller.marshall(samlConfiguration.getAssertionAttributes(), ASSERTIONATTRIBUTES_BINDING);
            protocolMarshaller.marshall(samlConfiguration.getIdpMetadata(), IDPMETADATA_BINDING);
            protocolMarshaller.marshall(samlConfiguration.getLoginValidityDuration(), LOGINVALIDITYDURATION_BINDING);
            protocolMarshaller.marshall(samlConfiguration.getRoleValues(), ROLEVALUES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
