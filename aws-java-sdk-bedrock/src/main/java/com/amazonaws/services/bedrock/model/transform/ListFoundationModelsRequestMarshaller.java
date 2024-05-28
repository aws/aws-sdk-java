/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.bedrock.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.bedrock.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ListFoundationModelsRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ListFoundationModelsRequestMarshaller {

    private static final MarshallingInfo<String> BYPROVIDER_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("byProvider").build();
    private static final MarshallingInfo<String> BYCUSTOMIZATIONTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("byCustomizationType").build();
    private static final MarshallingInfo<String> BYOUTPUTMODALITY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("byOutputModality").build();
    private static final MarshallingInfo<String> BYINFERENCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.QUERY_PARAM).marshallLocationName("byInferenceType").build();

    private static final ListFoundationModelsRequestMarshaller instance = new ListFoundationModelsRequestMarshaller();

    public static ListFoundationModelsRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ListFoundationModelsRequest listFoundationModelsRequest, ProtocolMarshaller protocolMarshaller) {

        if (listFoundationModelsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(listFoundationModelsRequest.getByProvider(), BYPROVIDER_BINDING);
            protocolMarshaller.marshall(listFoundationModelsRequest.getByCustomizationType(), BYCUSTOMIZATIONTYPE_BINDING);
            protocolMarshaller.marshall(listFoundationModelsRequest.getByOutputModality(), BYOUTPUTMODALITY_BINDING);
            protocolMarshaller.marshall(listFoundationModelsRequest.getByInferenceType(), BYINFERENCETYPE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
