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
 * ImageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ImageMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<StructuredPojo> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("state").build();
    private static final MarshallingInfo<StructuredPojo> IMAGERECIPE_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageRecipe").build();
    private static final MarshallingInfo<String> SOURCEPIPELINENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourcePipelineName").build();
    private static final MarshallingInfo<String> SOURCEPIPELINEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourcePipelineArn").build();
    private static final MarshallingInfo<StructuredPojo> INFRASTRUCTURECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("infrastructureConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> DISTRIBUTIONCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("distributionConfiguration").build();
    private static final MarshallingInfo<StructuredPojo> IMAGETESTSCONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageTestsConfiguration").build();
    private static final MarshallingInfo<String> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateCreated").build();
    private static final MarshallingInfo<StructuredPojo> OUTPUTRESOURCES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("outputResources").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();

    private static final ImageMarshaller instance = new ImageMarshaller();

    public static ImageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(Image image, ProtocolMarshaller protocolMarshaller) {

        if (image == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(image.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(image.getName(), NAME_BINDING);
            protocolMarshaller.marshall(image.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(image.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(image.getState(), STATE_BINDING);
            protocolMarshaller.marshall(image.getImageRecipe(), IMAGERECIPE_BINDING);
            protocolMarshaller.marshall(image.getSourcePipelineName(), SOURCEPIPELINENAME_BINDING);
            protocolMarshaller.marshall(image.getSourcePipelineArn(), SOURCEPIPELINEARN_BINDING);
            protocolMarshaller.marshall(image.getInfrastructureConfiguration(), INFRASTRUCTURECONFIGURATION_BINDING);
            protocolMarshaller.marshall(image.getDistributionConfiguration(), DISTRIBUTIONCONFIGURATION_BINDING);
            protocolMarshaller.marshall(image.getImageTestsConfiguration(), IMAGETESTSCONFIGURATION_BINDING);
            protocolMarshaller.marshall(image.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(image.getOutputResources(), OUTPUTRESOURCES_BINDING);
            protocolMarshaller.marshall(image.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
