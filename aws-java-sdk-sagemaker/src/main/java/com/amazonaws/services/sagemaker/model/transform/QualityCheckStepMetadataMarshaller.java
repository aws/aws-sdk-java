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
 * QualityCheckStepMetadataMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class QualityCheckStepMetadataMarshaller {

    private static final MarshallingInfo<String> CHECKTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("CheckType").build();
    private static final MarshallingInfo<String> BASELINEUSEDFORDRIFTCHECKSTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineUsedForDriftCheckStatistics").build();
    private static final MarshallingInfo<String> BASELINEUSEDFORDRIFTCHECKCONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaselineUsedForDriftCheckConstraints").build();
    private static final MarshallingInfo<String> CALCULATEDBASELINESTATISTICS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedBaselineStatistics").build();
    private static final MarshallingInfo<String> CALCULATEDBASELINECONSTRAINTS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CalculatedBaselineConstraints").build();
    private static final MarshallingInfo<String> MODELPACKAGEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ModelPackageGroupName").build();
    private static final MarshallingInfo<String> VIOLATIONREPORT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ViolationReport").build();
    private static final MarshallingInfo<String> CHECKJOBARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CheckJobArn").build();
    private static final MarshallingInfo<Boolean> SKIPCHECK_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("SkipCheck").build();
    private static final MarshallingInfo<Boolean> REGISTERNEWBASELINE_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("RegisterNewBaseline").build();

    private static final QualityCheckStepMetadataMarshaller instance = new QualityCheckStepMetadataMarshaller();

    public static QualityCheckStepMetadataMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(QualityCheckStepMetadata qualityCheckStepMetadata, ProtocolMarshaller protocolMarshaller) {

        if (qualityCheckStepMetadata == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(qualityCheckStepMetadata.getCheckType(), CHECKTYPE_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getBaselineUsedForDriftCheckStatistics(), BASELINEUSEDFORDRIFTCHECKSTATISTICS_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getBaselineUsedForDriftCheckConstraints(), BASELINEUSEDFORDRIFTCHECKCONSTRAINTS_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getCalculatedBaselineStatistics(), CALCULATEDBASELINESTATISTICS_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getCalculatedBaselineConstraints(), CALCULATEDBASELINECONSTRAINTS_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getModelPackageGroupName(), MODELPACKAGEGROUPNAME_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getViolationReport(), VIOLATIONREPORT_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getCheckJobArn(), CHECKJOBARN_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getSkipCheck(), SKIPCHECK_BINDING);
            protocolMarshaller.marshall(qualityCheckStepMetadata.getRegisterNewBaseline(), REGISTERNEWBASELINE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
