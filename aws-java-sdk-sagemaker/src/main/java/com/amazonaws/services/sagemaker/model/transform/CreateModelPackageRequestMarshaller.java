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
package com.amazonaws.services.sagemaker.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.util.IdempotentUtils;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateModelPackageRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateModelPackageRequestMarshaller {

    private static final MarshallingInfo<String> MODELPACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageName").build();
    private static final MarshallingInfo<String> MODELPACKAGEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageGroupName").build();
    private static final MarshallingInfo<String> MODELPACKAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageDescription").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSpecification").build();
    private static final MarshallingInfo<StructuredPojo> VALIDATIONSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationSpecification").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEALGORITHMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceAlgorithmSpecification").build();
    private static final MarshallingInfo<Boolean> CERTIFYFORMARKETPLACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertifyForMarketplace").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();
    private static final MarshallingInfo<String> MODELAPPROVALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelApprovalStatus").build();
    private static final MarshallingInfo<StructuredPojo> METADATAPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataProperties").build();
    private static final MarshallingInfo<StructuredPojo> MODELMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelMetrics").build();
    private static final MarshallingInfo<String> CLIENTTOKEN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ClientToken")
            .defaultValueSupplier(com.amazonaws.util.IdempotentUtils.getGenerator()).build();

    private static final CreateModelPackageRequestMarshaller instance = new CreateModelPackageRequestMarshaller();

    public static CreateModelPackageRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateModelPackageRequest createModelPackageRequest, ProtocolMarshaller protocolMarshaller) {

        if (createModelPackageRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createModelPackageRequest.getModelPackageName(), MODELPACKAGENAME_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getModelPackageGroupName(), MODELPACKAGEGROUPNAME_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getModelPackageDescription(), MODELPACKAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getInferenceSpecification(), INFERENCESPECIFICATION_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getValidationSpecification(), VALIDATIONSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getSourceAlgorithmSpecification(), SOURCEALGORITHMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getCertifyForMarketplace(), CERTIFYFORMARKETPLACE_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getTags(), TAGS_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getModelApprovalStatus(), MODELAPPROVALSTATUS_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getMetadataProperties(), METADATAPROPERTIES_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getModelMetrics(), MODELMETRICS_BINDING);
            protocolMarshaller.marshall(createModelPackageRequest.getClientToken(), CLIENTTOKEN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
