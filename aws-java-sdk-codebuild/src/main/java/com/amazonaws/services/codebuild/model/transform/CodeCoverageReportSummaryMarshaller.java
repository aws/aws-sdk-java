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
package com.amazonaws.services.codebuild.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.codebuild.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CodeCoverageReportSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CodeCoverageReportSummaryMarshaller {

    private static final MarshallingInfo<Double> LINECOVERAGEPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lineCoveragePercentage").build();
    private static final MarshallingInfo<Integer> LINESCOVERED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linesCovered").build();
    private static final MarshallingInfo<Integer> LINESMISSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("linesMissed").build();
    private static final MarshallingInfo<Double> BRANCHCOVERAGEPERCENTAGE_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("branchCoveragePercentage").build();
    private static final MarshallingInfo<Integer> BRANCHESCOVERED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("branchesCovered").build();
    private static final MarshallingInfo<Integer> BRANCHESMISSED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("branchesMissed").build();

    private static final CodeCoverageReportSummaryMarshaller instance = new CodeCoverageReportSummaryMarshaller();

    public static CodeCoverageReportSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CodeCoverageReportSummary codeCoverageReportSummary, ProtocolMarshaller protocolMarshaller) {

        if (codeCoverageReportSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(codeCoverageReportSummary.getLineCoveragePercentage(), LINECOVERAGEPERCENTAGE_BINDING);
            protocolMarshaller.marshall(codeCoverageReportSummary.getLinesCovered(), LINESCOVERED_BINDING);
            protocolMarshaller.marshall(codeCoverageReportSummary.getLinesMissed(), LINESMISSED_BINDING);
            protocolMarshaller.marshall(codeCoverageReportSummary.getBranchCoveragePercentage(), BRANCHCOVERAGEPERCENTAGE_BINDING);
            protocolMarshaller.marshall(codeCoverageReportSummary.getBranchesCovered(), BRANCHESCOVERED_BINDING);
            protocolMarshaller.marshall(codeCoverageReportSummary.getBranchesMissed(), BRANCHESMISSED_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
