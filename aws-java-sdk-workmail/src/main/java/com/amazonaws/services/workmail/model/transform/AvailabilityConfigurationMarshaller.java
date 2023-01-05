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
package com.amazonaws.services.workmail.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.workmail.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AvailabilityConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AvailabilityConfigurationMarshaller {

    private static final MarshallingInfo<String> DOMAINNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DomainName").build();
    private static final MarshallingInfo<String> PROVIDERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ProviderType").build();
    private static final MarshallingInfo<StructuredPojo> EWSPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("EwsProvider").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LambdaProvider").build();
    private static final MarshallingInfo<java.util.Date> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateCreated").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<java.util.Date> DATEMODIFIED_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DateModified").timestampFormat("unixTimestamp").build();

    private static final AvailabilityConfigurationMarshaller instance = new AvailabilityConfigurationMarshaller();

    public static AvailabilityConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AvailabilityConfiguration availabilityConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (availabilityConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(availabilityConfiguration.getDomainName(), DOMAINNAME_BINDING);
            protocolMarshaller.marshall(availabilityConfiguration.getProviderType(), PROVIDERTYPE_BINDING);
            protocolMarshaller.marshall(availabilityConfiguration.getEwsProvider(), EWSPROVIDER_BINDING);
            protocolMarshaller.marshall(availabilityConfiguration.getLambdaProvider(), LAMBDAPROVIDER_BINDING);
            protocolMarshaller.marshall(availabilityConfiguration.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(availabilityConfiguration.getDateModified(), DATEMODIFIED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
