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
package com.amazonaws.services.inspector2.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.inspector2.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ResourceScanMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ResourceScanMetadataMarshaller {

    private static final MarshallingInfo<StructuredPojo> EC2_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ec2").build();
    private static final MarshallingInfo<StructuredPojo> ECRIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrImage").build();
    private static final MarshallingInfo<StructuredPojo> ECRREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ecrRepository").build();
    private static final MarshallingInfo<StructuredPojo> LAMBDAFUNCTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lambdaFunction").build();

    private static final ResourceScanMetadataMarshaller instance = new ResourceScanMetadataMarshaller();

    public static ResourceScanMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ResourceScanMetadata resourceScanMetadata, ProtocolMarshaller protocolMarshaller) {

        if (resourceScanMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(resourceScanMetadata.getEc2(), EC2_BINDING);
            protocolMarshaller.marshall(resourceScanMetadata.getEcrImage(), ECRIMAGE_BINDING);
            protocolMarshaller.marshall(resourceScanMetadata.getEcrRepository(), ECRREPOSITORY_BINDING);
            protocolMarshaller.marshall(resourceScanMetadata.getLambdaFunction(), LAMBDAFUNCTION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
