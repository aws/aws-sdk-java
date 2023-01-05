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
package com.amazonaws.services.licensemanager.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLicenseConversionTaskForResourceRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLicenseConversionTaskForResourceRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceArn").build();
    private static final MarshallingInfo<StructuredPojo> SOURCELICENSECONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceLicenseContext").build();
    private static final MarshallingInfo<StructuredPojo> DESTINATIONLICENSECONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DestinationLicenseContext").build();

    private static final CreateLicenseConversionTaskForResourceRequestMarshaller instance = new CreateLicenseConversionTaskForResourceRequestMarshaller();

    public static CreateLicenseConversionTaskForResourceRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLicenseConversionTaskForResourceRequest createLicenseConversionTaskForResourceRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLicenseConversionTaskForResourceRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLicenseConversionTaskForResourceRequest.getResourceArn(), RESOURCEARN_BINDING);
            protocolMarshaller.marshall(createLicenseConversionTaskForResourceRequest.getSourceLicenseContext(), SOURCELICENSECONTEXT_BINDING);
            protocolMarshaller.marshall(createLicenseConversionTaskForResourceRequest.getDestinationLicenseContext(), DESTINATIONLICENSECONTEXT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
