/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateImagePipelineRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateImagePipelineRequestMarshaller {

    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> IMAGERECIPEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageRecipeArn").build();
    private static final MarshallingInfo<String> INFRASTRUCTURECONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("infrastructureConfigurationArn").build();
    private static final MarshallingInfo<String> DISTRIBUTIONCONFIGURATIONARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distributionConfigurationArn").build();
    private static final MarshallingInfo<StructuredPojo> IMAGETESTSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageTestsConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> SCHEDULE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("schedule").build();
    private static final MarshallingInfo<String> STATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("status").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateImagePipelineRequestMarshaller instance = new CreateImagePipelineRequestMarshaller();

    public static CreateImagePipelineRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateImagePipelineRequest createImagePipelineRequest, ProtocolMarshaller protocolMarshaller) {

        if (createImagePipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createImagePipelineRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getImageRecipeArn(), IMAGERECIPEARN_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getInfrastructureConfigurationArn(), INFRASTRUCTURECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getDistributionConfigurationArn(), DISTRIBUTIONCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getImageTestsConfiguration(), IMAGETESTSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createImagePipelineRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
