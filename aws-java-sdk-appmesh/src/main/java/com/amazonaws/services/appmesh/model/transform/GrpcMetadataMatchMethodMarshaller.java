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
package com.amazonaws.services.appmesh.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.appmesh.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * GrpcMetadataMatchMethodMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class GrpcMetadataMatchMethodMarshaller {

    private static final MarshallingInfo<String> EXACT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("exact").build();
    private static final MarshallingInfo<String> PREFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("prefix").build();
    private static final MarshallingInfo<StructuredPojo> RANGE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("range").build();
    private static final MarshallingInfo<String> REGEX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("regex").build();
    private static final MarshallingInfo<String> SUFFIX_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("suffix").build();

    private static final GrpcMetadataMatchMethodMarshaller instance = new GrpcMetadataMatchMethodMarshaller();

    public static GrpcMetadataMatchMethodMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(GrpcMetadataMatchMethod grpcMetadataMatchMethod, ProtocolMarshaller protocolMarshaller) {

        if (grpcMetadataMatchMethod == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(grpcMetadataMatchMethod.getExact(), EXACT_BINDING);
            protocolMarshaller.marshall(grpcMetadataMatchMethod.getPrefix(), PREFIX_BINDING);
            protocolMarshaller.marshall(grpcMetadataMatchMethod.getRange(), RANGE_BINDING);
            protocolMarshaller.marshall(grpcMetadataMatchMethod.getRegex(), REGEX_BINDING);
            protocolMarshaller.marshall(grpcMetadataMatchMethod.getSuffix(), SUFFIX_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
