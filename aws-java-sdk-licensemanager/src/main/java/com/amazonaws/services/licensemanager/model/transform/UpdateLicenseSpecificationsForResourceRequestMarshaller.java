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
 * UpdateLicenseSpecificationsForResourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLicenseSpecificationsForResourceRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<List> ADDLICENSESPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("AddLicenseSpecifications").build();
    private static final MarshallingInfo<List> REMOVELICENSESPECIFICATIONS_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RemoveLicenseSpecifications").build();

    private static final UpdateLicenseSpecificationsForResourceRequestMarshaller instance = new UpdateLicenseSpecificationsForResourceRequestMarshaller();

    public static UpdateLicenseSpecificationsForResourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLicenseSpecificationsForResourceRequest updateLicenseSpecificationsForResourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLicenseSpecificationsForResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLicenseSpecificationsForResourceRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(updateLicenseSpecificationsForResourceRequest.getAddLicenseSpecifications(), ADDLICENSESPECIFICATIONS_BINDING);
            protocolMarshaller.marshall(updateLicenseSpecificationsForResourceRequest.getRemoveLicenseSpecifications(), REMOVELICENSESPECIFICATIONS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
