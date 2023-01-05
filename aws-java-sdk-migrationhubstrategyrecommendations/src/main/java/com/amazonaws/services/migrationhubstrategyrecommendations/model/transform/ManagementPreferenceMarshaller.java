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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ManagementPreferenceMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ManagementPreferenceMarshaller {

    private static final MarshallingInfo<StructuredPojo> AWSMANAGEDRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("awsManagedResources").build();
    private static final MarshallingInfo<StructuredPojo> NOPREFERENCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("noPreference").build();
    private static final MarshallingInfo<StructuredPojo> SELFMANAGERESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("selfManageResources").build();

    private static final ManagementPreferenceMarshaller instance = new ManagementPreferenceMarshaller();

    public static ManagementPreferenceMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ManagementPreference managementPreference, ProtocolMarshaller protocolMarshaller) {

        if (managementPreference == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(managementPreference.getAwsManagedResources(), AWSMANAGEDRESOURCES_BINDING);
            protocolMarshaller.marshall(managementPreference.getNoPreference(), NOPREFERENCE_BINDING);
            protocolMarshaller.marshall(managementPreference.getSelfManageResources(), SELFMANAGERESOURCES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
