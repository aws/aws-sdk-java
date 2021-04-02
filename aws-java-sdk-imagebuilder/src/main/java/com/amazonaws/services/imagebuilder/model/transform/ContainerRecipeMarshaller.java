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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ContainerRecipeMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ContainerRecipeMarshaller {

    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CONTAINERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("containerType").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> PLATFORM_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("platform").build();
    private static final MarshallingInfo<String> OWNER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("owner").build();
    private static final MarshallingInfo<String> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();
    private static final MarshallingInfo<List> COMPONENTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("components").build();
    private static final MarshallingInfo<StructuredPojo> INSTANCECONFIGURATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("instanceConfiguration").build();
    private static final MarshallingInfo<String> DOCKERFILETEMPLATEDATA_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dockerfileTemplateData").build();
    private static final MarshallingInfo<String> KMSKEYID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("kmsKeyId").build();
    private static final MarshallingInfo<Boolean> ENCRYPTED_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encrypted").build();
    private static final MarshallingInfo<String> PARENTIMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("parentImage").build();
    private static final MarshallingInfo<String> DATECREATED_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dateCreated").build();
    private static final MarshallingInfo<Map> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("tags").build();
    private static final MarshallingInfo<String> WORKINGDIRECTORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("workingDirectory").build();
    private static final MarshallingInfo<StructuredPojo> TARGETREPOSITORY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("targetRepository").build();

    private static final ContainerRecipeMarshaller instance = new ContainerRecipeMarshaller();

    public static ContainerRecipeMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ContainerRecipe containerRecipe, ProtocolMarshaller protocolMarshaller) {

        if (containerRecipe == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(containerRecipe.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(containerRecipe.getContainerType(), CONTAINERTYPE_BINDING);
            protocolMarshaller.marshall(containerRecipe.getName(), NAME_BINDING);
            protocolMarshaller.marshall(containerRecipe.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(containerRecipe.getPlatform(), PLATFORM_BINDING);
            protocolMarshaller.marshall(containerRecipe.getOwner(), OWNER_BINDING);
            protocolMarshaller.marshall(containerRecipe.getVersion(), VERSION_BINDING);
            protocolMarshaller.marshall(containerRecipe.getComponents(), COMPONENTS_BINDING);
            protocolMarshaller.marshall(containerRecipe.getInstanceConfiguration(), INSTANCECONFIGURATION_BINDING);
            protocolMarshaller.marshall(containerRecipe.getDockerfileTemplateData(), DOCKERFILETEMPLATEDATA_BINDING);
            protocolMarshaller.marshall(containerRecipe.getKmsKeyId(), KMSKEYID_BINDING);
            protocolMarshaller.marshall(containerRecipe.getEncrypted(), ENCRYPTED_BINDING);
            protocolMarshaller.marshall(containerRecipe.getParentImage(), PARENTIMAGE_BINDING);
            protocolMarshaller.marshall(containerRecipe.getDateCreated(), DATECREATED_BINDING);
            protocolMarshaller.marshall(containerRecipe.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(containerRecipe.getWorkingDirectory(), WORKINGDIRECTORY_BINDING);
            protocolMarshaller.marshall(containerRecipe.getTargetRepository(), TARGETREPOSITORY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
