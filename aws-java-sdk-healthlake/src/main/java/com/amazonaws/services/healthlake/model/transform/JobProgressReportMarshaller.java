/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.healthlake.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.healthlake.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * JobProgressReportMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class JobProgressReportMarshaller {

    private static final MarshallingInfo<Long> TOTALNUMBEROFSCANNEDFILES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfScannedFiles").build();
    private static final MarshallingInfo<Double> TOTALSIZEOFSCANNEDFILESINMB_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalSizeOfScannedFilesInMB").build();
    private static final MarshallingInfo<Long> TOTALNUMBEROFIMPORTEDFILES_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfImportedFiles").build();
    private static final MarshallingInfo<Long> TOTALNUMBEROFRESOURCESSCANNED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfResourcesScanned").build();
    private static final MarshallingInfo<Long> TOTALNUMBEROFRESOURCESIMPORTED_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfResourcesImported").build();
    private static final MarshallingInfo<Long> TOTALNUMBEROFRESOURCESWITHCUSTOMERERROR_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfResourcesWithCustomerError").build();
    private static final MarshallingInfo<Long> TOTALNUMBEROFFILESREADWITHCUSTOMERERROR_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("TotalNumberOfFilesReadWithCustomerError").build();
    private static final MarshallingInfo<Double> THROUGHPUT_BINDING = MarshallingInfo.builder(MarshallingType.DOUBLE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Throughput").build();

    private static final JobProgressReportMarshaller instance = new JobProgressReportMarshaller();

    public static JobProgressReportMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(JobProgressReport jobProgressReport, ProtocolMarshaller protocolMarshaller) {

        if (jobProgressReport == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(jobProgressReport.getTotalNumberOfScannedFiles(), TOTALNUMBEROFSCANNEDFILES_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getTotalSizeOfScannedFilesInMB(), TOTALSIZEOFSCANNEDFILESINMB_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getTotalNumberOfImportedFiles(), TOTALNUMBEROFIMPORTEDFILES_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getTotalNumberOfResourcesScanned(), TOTALNUMBEROFRESOURCESSCANNED_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getTotalNumberOfResourcesImported(), TOTALNUMBEROFRESOURCESIMPORTED_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getTotalNumberOfResourcesWithCustomerError(), TOTALNUMBEROFRESOURCESWITHCUSTOMERERROR_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getTotalNumberOfFilesReadWithCustomerError(), TOTALNUMBEROFFILESREADWITHCUSTOMERERROR_BINDING);
            protocolMarshaller.marshall(jobProgressReport.getThroughput(), THROUGHPUT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
