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
package com.amazonaws.services.elasticsearch.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.elasticsearch.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreatePackageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreatePackageRequestMarshaller {

    private static final MarshallingInfo<String> PACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageName").build();
    private static final MarshallingInfo<String> PACKAGETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageType").build();
    private static final MarshallingInfo<String> PACKAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageDescription").build();
    private static final MarshallingInfo<StructuredPojo> PACKAGESOURCE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PackageSource").build();

    private static final CreatePackageRequestMarshaller instance = new CreatePackageRequestMarshaller();

    public static CreatePackageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreatePackageRequest createPackageRequest, ProtocolMarshaller protocolMarshaller) {

        if (createPackageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createPackageRequest.getPackageName(), PACKAGENAME_BINDING);
            protocolMarshaller.marshall(createPackageRequest.getPackageType(), PACKAGETYPE_BINDING);
            protocolMarshaller.marshall(createPackageRequest.getPackageDescription(), PACKAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createPackageRequest.getPackageSource(), PACKAGESOURCE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
