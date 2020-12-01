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

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ModelPackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ModelPackageMarshaller {

    private static final MarshallingInfo<String> MODELPACKAGENAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageName").build();
    private static final MarshallingInfo<String> MODELPACKAGEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageGroupName").build();
    private static final MarshallingInfo<Integer> MODELPACKAGEVERSION_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageVersion").build();
    private static final MarshallingInfo<String> MODELPACKAGEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageArn").build();
    private static final MarshallingInfo<String> MODELPACKAGEDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageDescription").build();
    private static final MarshallingInfo<java.util.Date> CREATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreationTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> INFERENCESPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InferenceSpecification").build();
    private static final MarshallingInfo<StructuredPojo> SOURCEALGORITHMSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SourceAlgorithmSpecification").build();
    private static final MarshallingInfo<StructuredPojo> VALIDATIONSPECIFICATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ValidationSpecification").build();
    private static final MarshallingInfo<String> MODELPACKAGESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageStatus").build();
    private static final MarshallingInfo<StructuredPojo> MODELPACKAGESTATUSDETAILS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageStatusDetails").build();
    private static final MarshallingInfo<Boolean> CERTIFYFORMARKETPLACE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CertifyForMarketplace").build();
    private static final MarshallingInfo<String> MODELAPPROVALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelApprovalStatus").build();
    private static final MarshallingInfo<StructuredPojo> CREATEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreatedBy").build();
    private static final MarshallingInfo<StructuredPojo> METADATAPROPERTIES_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("MetadataProperties").build();
    private static final MarshallingInfo<StructuredPojo> MODELMETRICS_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelMetrics").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDTIME_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedTime").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<StructuredPojo> LASTMODIFIEDBY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastModifiedBy").build();
    private static final MarshallingInfo<String> APPROVALDESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ApprovalDescription").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final ModelPackageMarshaller instance = new ModelPackageMarshaller();

    public static ModelPackageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ModelPackage modelPackage, ProtocolMarshaller protocolMarshaller) {

        if (modelPackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(modelPackage.getModelPackageName(), MODELPACKAGENAME_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelPackageGroupName(), MODELPACKAGEGROUPNAME_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelPackageVersion(), MODELPACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelPackageArn(), MODELPACKAGEARN_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelPackageDescription(), MODELPACKAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(modelPackage.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(modelPackage.getInferenceSpecification(), INFERENCESPECIFICATION_BINDING);
            protocolMarshaller.marshall(modelPackage.getSourceAlgorithmSpecification(), SOURCEALGORITHMSPECIFICATION_BINDING);
            protocolMarshaller.marshall(modelPackage.getValidationSpecification(), VALIDATIONSPECIFICATION_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelPackageStatus(), MODELPACKAGESTATUS_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelPackageStatusDetails(), MODELPACKAGESTATUSDETAILS_BINDING);
            protocolMarshaller.marshall(modelPackage.getCertifyForMarketplace(), CERTIFYFORMARKETPLACE_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelApprovalStatus(), MODELAPPROVALSTATUS_BINDING);
            protocolMarshaller.marshall(modelPackage.getCreatedBy(), CREATEDBY_BINDING);
            protocolMarshaller.marshall(modelPackage.getMetadataProperties(), METADATAPROPERTIES_BINDING);
            protocolMarshaller.marshall(modelPackage.getModelMetrics(), MODELMETRICS_BINDING);
            protocolMarshaller.marshall(modelPackage.getLastModifiedTime(), LASTMODIFIEDTIME_BINDING);
            protocolMarshaller.marshall(modelPackage.getLastModifiedBy(), LASTMODIFIEDBY_BINDING);
            protocolMarshaller.marshall(modelPackage.getApprovalDescription(), APPROVALDESCRIPTION_BINDING);
            protocolMarshaller.marshall(modelPackage.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
