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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * InferenceSpecificationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class InferenceSpecificationMarshaller {

    private static final MarshallingInfo<List> CONTAINERS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Containers").build();
    private static final MarshallingInfo<List> SUPPORTEDTRANSFORMINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedTransformInstanceTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDREALTIMEINFERENCEINSTANCETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedRealtimeInferenceInstanceTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDCONTENTTYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedContentTypes").build();
    private static final MarshallingInfo<List> SUPPORTEDRESPONSEMIMETYPES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SupportedResponseMIMETypes").build();

    private static final InferenceSpecificationMarshaller instance = new InferenceSpecificationMarshaller();

    public static InferenceSpecificationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(InferenceSpecification inferenceSpecification, ProtocolMarshaller protocolMarshaller) {

        if (inferenceSpecification == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(inferenceSpecification.getContainers(), CONTAINERS_BINDING);
            protocolMarshaller.marshall(inferenceSpecification.getSupportedTransformInstanceTypes(), SUPPORTEDTRANSFORMINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(inferenceSpecification.getSupportedRealtimeInferenceInstanceTypes(), SUPPORTEDREALTIMEINFERENCEINSTANCETYPES_BINDING);
            protocolMarshaller.marshall(inferenceSpecification.getSupportedContentTypes(), SUPPORTEDCONTENTTYPES_BINDING);
            protocolMarshaller.marshall(inferenceSpecification.getSupportedResponseMIMETypes(), SUPPORTEDRESPONSEMIMETYPES_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
