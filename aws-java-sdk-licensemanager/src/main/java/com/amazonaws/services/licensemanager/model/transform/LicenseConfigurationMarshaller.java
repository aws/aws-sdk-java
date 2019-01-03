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

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * LicenseConfigurationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class LicenseConfigurationMarshaller {

    private static final MarshallingInfo<String> LICENSECONFIGURATIONID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseConfigurationId").build();
    private static final MarshallingInfo<String> LICENSECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseConfigurationArn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<String> LICENSECOUNTINGTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseCountingType").build();
    private static final MarshallingInfo<List> LICENSERULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LicenseRules").build();
    private static final MarshallingInfo<Long> LICENSECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LicenseCount").build();
    private static final MarshallingInfo<Boolean> LICENSECOUNTHARDLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseCountHardLimit").build();
    private static final MarshallingInfo<Long> CONSUMEDLICENSES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumedLicenses").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Status").build();
    private static final MarshallingInfo<String> OWNERACCOUNTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OwnerAccountId").build();
    private static final MarshallingInfo<List> CONSUMEDLICENSESUMMARYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ConsumedLicenseSummaryList").build();
    private static final MarshallingInfo<List> MANAGEDRESOURCESUMMARYLIST_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ManagedResourceSummaryList").build();

    private static final LicenseConfigurationMarshaller instance = new LicenseConfigurationMarshaller();

    public static LicenseConfigurationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(LicenseConfiguration licenseConfiguration, ProtocolMarshaller protocolMarshaller) {

        if (licenseConfiguration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(licenseConfiguration.getLicenseConfigurationId(), LICENSECONFIGURATIONID_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseConfigurationArn(), LICENSECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getName(), NAME_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseCountingType(), LICENSECOUNTINGTYPE_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseRules(), LICENSERULES_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseCount(), LICENSECOUNT_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getLicenseCountHardLimit(), LICENSECOUNTHARDLIMIT_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getConsumedLicenses(), CONSUMEDLICENSES_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getOwnerAccountId(), OWNERACCOUNTID_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getConsumedLicenseSummaryList(), CONSUMEDLICENSESUMMARYLIST_BINDING);
            protocolMarshaller.marshall(licenseConfiguration.getManagedResourceSummaryList(), MANAGEDRESOURCESUMMARYLIST_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
