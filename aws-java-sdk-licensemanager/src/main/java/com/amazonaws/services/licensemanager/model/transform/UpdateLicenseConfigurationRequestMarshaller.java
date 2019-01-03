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
 * UpdateLicenseConfigurationRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLicenseConfigurationRequestMarshaller {

    private static final MarshallingInfo<String> LICENSECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseConfigurationArn").build();
    private static final MarshallingInfo<String> LICENSECONFIGURATIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseConfigurationStatus").build();
    private static final MarshallingInfo<List> LICENSERULES_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LicenseRules").build();
    private static final MarshallingInfo<Long> LICENSECOUNT_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("LicenseCount").build();
    private static final MarshallingInfo<Boolean> LICENSECOUNTHARDLIMIT_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseCountHardLimit").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();

    private static final UpdateLicenseConfigurationRequestMarshaller instance = new UpdateLicenseConfigurationRequestMarshaller();

    public static UpdateLicenseConfigurationRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLicenseConfigurationRequest updateLicenseConfigurationRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLicenseConfigurationRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getLicenseConfigurationArn(), LICENSECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getLicenseConfigurationStatus(), LICENSECONFIGURATIONSTATUS_BINDING);
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getLicenseRules(), LICENSERULES_BINDING);
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getLicenseCount(), LICENSECOUNT_BINDING);
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getLicenseCountHardLimit(), LICENSECOUNTHARDLIMIT_BINDING);
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(updateLicenseConfigurationRequest.getDescription(), DESCRIPTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
