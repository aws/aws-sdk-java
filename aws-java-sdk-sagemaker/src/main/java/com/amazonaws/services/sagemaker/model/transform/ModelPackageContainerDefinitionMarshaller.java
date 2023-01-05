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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.Map;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelPackageContainerDefinitionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelPackageContainerDefinitionMarshaller {

    private static final MarshallingInfo<String> CONTAINERHOSTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ContainerHostname").build();
    private static final MarshallingInfo<String> IMAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Image").build();
    private static final MarshallingInfo<String> IMAGEDIGEST_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ImageDigest").build();
    private static final MarshallingInfo<String> MODELDATAURL_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelDataUrl").build();
    private static final MarshallingInfo<String> PRODUCTID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ProductId").build();
    private static final MarshallingInfo<Map> ENVIRONMENT_BINDING = MarshallingInfo.builder(MarshallingType.MAP).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Environment").build();
    private static final MarshallingInfo<StructuredPojo> MODELINPUT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelInput").build();
    private static final MarshallingInfo<String> FRAMEWORK_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Framework").build();
    private static final MarshallingInfo<String> FRAMEWORKVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("FrameworkVersion").build();
    private static final MarshallingInfo<String> NEARESTMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("NearestModelName").build();

    private static final ModelPackageContainerDefinitionMarshaller instance = new ModelPackageContainerDefinitionMarshaller();

    public static ModelPackageContainerDefinitionMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelPackageContainerDefinition modelPackageContainerDefinition, ProtocolMarshaller protocolMarshaller) {

        if (modelPackageContainerDefinition == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelPackageContainerDefinition.getContainerHostname(), CONTAINERHOSTNAME_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getImage(), IMAGE_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getImageDigest(), IMAGEDIGEST_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getModelDataUrl(), MODELDATAURL_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getProductId(), PRODUCTID_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getEnvironment(), ENVIRONMENT_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getModelInput(), MODELINPUT_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getFramework(), FRAMEWORK_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getFrameworkVersion(), FRAMEWORKVERSION_BINDING);
            protocolMarshaller.marshall(modelPackageContainerDefinition.getNearestModelName(), NEARESTMODELNAME_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
