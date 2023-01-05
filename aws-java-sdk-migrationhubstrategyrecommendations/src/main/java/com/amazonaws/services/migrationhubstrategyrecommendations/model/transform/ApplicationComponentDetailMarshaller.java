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
 * ApplicationComponentDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ApplicationComponentDetailMarshaller {

    private static final MarshallingInfo<String> ANALYSISSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("analysisStatus").build();
    private static final MarshallingInfo<StructuredPojo> ANTIPATTERNREPORTS3OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportS3Object").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatus").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatusMessage").build();
    private static final MarshallingInfo<String> APPTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("appType").build();
    private static final MarshallingInfo<StructuredPojo> APPUNITERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("appUnitError").build();
    private static final MarshallingInfo<String> ASSOCIATEDSERVERID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("associatedServerId").build();
    private static final MarshallingInfo<StructuredPojo> DATABASECONFIGDETAIL_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("databaseConfigDetail").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<String> INCLUSIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inclusionStatus").build();
    private static final MarshallingInfo<java.util.Date> LASTANALYZEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastAnalyzedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> LISTANTIPATTERNSEVERITYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listAntipatternSeveritySummary").build();
    private static final MarshallingInfo<Boolean> MORESERVERASSOCIATIONEXISTS_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("moreServerAssociationExists").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<String> OSDRIVER_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("osDriver").build();
    private static final MarshallingInfo<String> OSVERSION_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("osVersion").build();
    private static final MarshallingInfo<StructuredPojo> RECOMMENDATIONSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationSet").build();
    private static final MarshallingInfo<String> RESOURCESUBTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("resourceSubType").build();
    private static final MarshallingInfo<String> RUNTIMESTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runtimeStatus").build();
    private static final MarshallingInfo<String> RUNTIMESTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("runtimeStatusMessage").build();
    private static final MarshallingInfo<List> SOURCECODEREPOSITORIES_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sourceCodeRepositories").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();

    private static final ApplicationComponentDetailMarshaller instance = new ApplicationComponentDetailMarshaller();

    public static ApplicationComponentDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ApplicationComponentDetail applicationComponentDetail, ProtocolMarshaller protocolMarshaller) {

        if (applicationComponentDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(applicationComponentDetail.getAnalysisStatus(), ANALYSISSTATUS_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getAntipatternReportS3Object(), ANTIPATTERNREPORTS3OBJECT_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getAntipatternReportStatus(), ANTIPATTERNREPORTSTATUS_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getAntipatternReportStatusMessage(), ANTIPATTERNREPORTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getAppType(), APPTYPE_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getAppUnitError(), APPUNITERROR_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getAssociatedServerId(), ASSOCIATEDSERVERID_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getDatabaseConfigDetail(), DATABASECONFIGDETAIL_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getId(), ID_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getInclusionStatus(), INCLUSIONSTATUS_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getLastAnalyzedTimestamp(), LASTANALYZEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getListAntipatternSeveritySummary(), LISTANTIPATTERNSEVERITYSUMMARY_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getMoreServerAssociationExists(), MORESERVERASSOCIATIONEXISTS_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getOsDriver(), OSDRIVER_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getOsVersion(), OSVERSION_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getRecommendationSet(), RECOMMENDATIONSET_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getResourceSubType(), RESOURCESUBTYPE_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getRuntimeStatus(), RUNTIMESTATUS_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getRuntimeStatusMessage(), RUNTIMESTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getSourceCodeRepositories(), SOURCECODEREPOSITORIES_BINDING);
            protocolMarshaller.marshall(applicationComponentDetail.getStatusMessage(), STATUSMESSAGE_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
