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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AntipatternReportResultMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AntipatternReportResultMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANALYZERNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analyzerName").build();
    private static final MarshallingInfo<StructuredPojo> ANTIPATTERNREPORTS3OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antiPatternReportS3Object").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatus").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatusMessage").build();

    private static final AntipatternReportResultMarshaller instance = new AntipatternReportResultMarshaller();

    public static AntipatternReportResultMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AntipatternReportResult antipatternReportResult, ProtocolMarshaller protocolMarshaller) {

        if (antipatternReportResult == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(antipatternReportResult.getAnalyzerName(), ANALYZERNAME_BINDING);
            protocolMarshaller.marshall(antipatternReportResult.getAntiPatternReportS3Object(), ANTIPATTERNREPORTS3OBJECT_BINDING);
            protocolMarshaller.marshall(antipatternReportResult.getAntipatternReportStatus(), ANTIPATTERNREPORTSTATUS_BINDING);
            protocolMarshaller.marshall(antipatternReportResult.getAntipatternReportStatusMessage(), ANTIPATTERNREPORTSTATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
