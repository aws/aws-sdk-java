/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LicenseConfigurationUsageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseConfigurationUsageMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<String> RESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceType").build();
    private static final MarshallingInfo<String> RESOURCESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceStatus").build();
    private static final MarshallingInfo<String> RESOURCEOWNERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceOwnerId").build();
    private static final MarshallingInfo<java.util.Date> ASSOCIATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AssociationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<Long> CONSUMEDLICENSES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumedLicenses").build();

    private static final LicenseConfigurationUsageMarshaller instance = new LicenseConfigurationUsageMarshaller();

    public static LicenseConfigurationUsageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseConfigurationUsage licenseConfigurationUsage, ProtocolMarshaller protocolMarshaller) {

        if (licenseConfigurationUsage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseConfigurationUsage.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(licenseConfigurationUsage.getResourceType(), RESOURCETYPE_BINDING);
            protocolMarshaller.marshall(licenseConfigurationUsage.getResourceStatus(), RESOURCESTATUS_BINDING);
            protocolMarshaller.marshall(licenseConfigurationUsage.getResourceOwnerId(), RESOURCEOWNERID_BINDING);
            protocolMarshaller.marshall(licenseConfigurationUsage.getAssociationTime(), ASSOCIATIONTIME_BINDING);
            protocolMarshaller.marshall(licenseConfigurationUsage.getConsumedLicenses(), CONSUMEDLICENSES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
