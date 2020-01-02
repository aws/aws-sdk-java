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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ImagePipelineMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImagePipelineMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
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
    private static final MarshallingInfo<String> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateCreated").build();
    private static final MarshallingInfo<String> DATEUPDATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateUpdated").build();
    private static final MarshallingInfo<String> DATELASTRUN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateLastRun").build();
    private static final MarshallingInfo<String> DATENEXTRUN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateNextRun").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ImagePipelineMarshaller instance = new ImagePipelineMarshaller();

    public static ImagePipelineMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ImagePipeline imagePipeline, ProtocolMarshaller protocolMarshaller) {

        if (imagePipeline == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(imagePipeline.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(imagePipeline.getName(), NAME_BINDING);
            protocolMarshaller.marshall(imagePipeline.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(imagePipeline.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(imagePipeline.getImageRecipeArn(), IMAGERECIPEARN_BINDING);
            protocolMarshaller.marshall(imagePipeline.getInfrastructureConfigurationArn(), INFRASTRUCTURECONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(imagePipeline.getDistributionConfigurationArn(), DISTRIBUTIONCONFIGURATIONARN_BINDING);
            protocolMarshaller.marshall(imagePipeline.getImageTestsConfiguration(), IMAGETESTSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(imagePipeline.getSchedule(), SCHEDULE_BINDING);
            protocolMarshaller.marshall(imagePipeline.getStatus(), STATUS_BINDING);
            protocolMarshaller.marshall(imagePipeline.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(imagePipeline.getDateUpdated(), DATEUPDATED_BINDING);
            protocolMarshaller.marshall(imagePipeline.getDateLastRun(), DATELASTRUN_BINDING);
            protocolMarshaller.marshall(imagePipeline.getDateNextRun(), DATENEXTRUN_BINDING);
            protocolMarshaller.marshall(imagePipeline.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
