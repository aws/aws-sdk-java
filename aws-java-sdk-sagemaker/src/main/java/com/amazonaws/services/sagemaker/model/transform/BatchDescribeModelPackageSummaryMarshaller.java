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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.sagemaker.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * BatchDescribeModelPackageSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class BatchDescribeModelPackageSummaryMarshaller {

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
    private static final MarshallingInfo<String> MODELPACKAGESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageStatus").build();
    private static final MarshallingInfo<String> MODELAPPROVALSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelApprovalStatus").build();

    private static final BatchDescribeModelPackageSummaryMarshaller instance = new BatchDescribeModelPackageSummaryMarshaller();

    public static BatchDescribeModelPackageSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(BatchDescribeModelPackageSummary batchDescribeModelPackageSummary, ProtocolMarshaller protocolMarshaller) {

        if (batchDescribeModelPackageSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getModelPackageGroupName(), MODELPACKAGEGROUPNAME_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getModelPackageVersion(), MODELPACKAGEVERSION_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getModelPackageArn(), MODELPACKAGEARN_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getModelPackageDescription(), MODELPACKAGEDESCRIPTION_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getCreationTime(), CREATIONTIME_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getInferenceSpecification(), INFERENCESPECIFICATION_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getModelPackageStatus(), MODELPACKAGESTATUS_BINDING);
            protocolMarshaller.marshall(batchDescribeModelPackageSummary.getModelApprovalStatus(), MODELAPPROVALSTATUS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
