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
package com.amazonaws.services.migrationhubstrategyrecommendations.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.migrationhubstrategyrecommendations.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * AssessmentSummaryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class AssessmentSummaryMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANTIPATTERNREPORTS3OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportS3Object").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatus").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatusMessage").build();
    private static final MarshallingInfo<java.util.Date> LASTANALYZEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastAnalyzedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> LISTANTIPATTERNSEVERITYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listAntipatternSeveritySummary").build();
    private static final MarshallingInfo<List> LISTAPPLICATIONCOMPONENTSTATUSSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listApplicationComponentStatusSummary").build();
    private static final MarshallingInfo<List> LISTAPPLICATIONCOMPONENTSTRATEGYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listApplicationComponentStrategySummary").build();
    private static final MarshallingInfo<List> LISTAPPLICATIONCOMPONENTSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listApplicationComponentSummary").build();
    private static final MarshallingInfo<List> LISTSERVERSTATUSSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listServerStatusSummary").build();
    private static final MarshallingInfo<List> LISTSERVERSTRATEGYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listServerStrategySummary").build();
    private static final MarshallingInfo<List> LISTSERVERSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listServerSummary").build();

    private static final AssessmentSummaryMarshaller instance = new AssessmentSummaryMarshaller();

    public static AssessmentSummaryMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(AssessmentSummary assessmentSummary, ProtocolMarshaller protocolMarshaller) {

        if (assessmentSummary == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(assessmentSummary.getAntipatternReportS3Object(), ANTIPATTERNREPORTS3OBJECT_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getAntipatternReportStatus(), ANTIPATTERNREPORTSTATUS_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getAntipatternReportStatusMessage(), ANTIPATTERNREPORTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getLastAnalyzedTimestamp(), LASTANALYZEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListAntipatternSeveritySummary(), LISTANTIPATTERNSEVERITYSUMMARY_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListApplicationComponentStatusSummary(), LISTAPPLICATIONCOMPONENTSTATUSSUMMARY_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListApplicationComponentStrategySummary(), LISTAPPLICATIONCOMPONENTSTRATEGYSUMMARY_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListApplicationComponentSummary(), LISTAPPLICATIONCOMPONENTSUMMARY_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListServerStatusSummary(), LISTSERVERSTATUSSUMMARY_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListServerStrategySummary(), LISTSERVERSTRATEGYSUMMARY_BINDING);
            protocolMarshaller.marshall(assessmentSummary.getListServerSummary(), LISTSERVERSUMMARY_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
