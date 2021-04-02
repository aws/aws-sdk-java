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
package com.amazonaws.services.imagebuilder.model.transform;

import java.util.Map;
import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.imagebuilder.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateContainerRecipeRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateContainerRecipeRequestMarshaller {

    private static final MarshallingInfo<String> CONTAINERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> SEMANTICVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("semanticVersion").build();
    private static final MarshallingInfo<List> COMPONENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("components").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceConfiguration").build();
    private static final MarshallingInfo<String> DOCKERFILETEMPLATEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dockerfileTemplateData").build();
    private static final MarshallingInfo<String> DOCKERFILETEMPLATEURI_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dockerfileTemplateUri").build();
    private static final MarshallingInfo<String> PLATFORMOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("platformOverride").build();
    private static final MarshallingInfo<String> IMAGEOSVERSIONOVERRIDE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("imageOsVersionOverride").build();
    private static final MarshallingInfo<String> PARENTIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentImage").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workingDirectory").build();
    private static final MarshallingInfo<StructuredPojo> TARGETREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetRepository").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("clientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateContainerRecipeRequestMarshaller instance = new CreateContainerRecipeRequestMarshaller();

    public static CreateContainerRecipeRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateContainerRecipeRequest createContainerRecipeRequest, ProtocolMarshaller protocolMarshaller) {

        if (createContainerRecipeRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createContainerRecipeRequest.getContainerType(), CONTAINERTYPE_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getName(), NAME_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getSemanticVersion(), SEMANTICVERSION_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getComponents(), COMPONENTS_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getInstanceConfiguration(), INSTANCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getDockerfileTemplateData(), DOCKERFILETEMPLATEDATA_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getDockerfileTemplateUri(), DOCKERFILETEMPLATEURI_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getPlatformOverride(), PLATFORMOVERRIDE_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getImageOsVersionOverride(), IMAGEOSVERSIONOVERRIDE_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getParentImage(), PARENTIMAGE_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getTargetRepository(), TARGETREPOSITORY_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(createContainerRecipeRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
