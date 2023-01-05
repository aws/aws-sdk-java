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
 * ServerDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ServerDetailMarshaller {

    private static final MarshallingInfo<StructuredPojo> ANTIPATTERNREPORTS3OBJECT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportS3Object").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatus").build();
    private static final MarshallingInfo<String> ANTIPATTERNREPORTSTATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("antipatternReportStatusMessage").build();
    private static final MarshallingInfo<List> APPLICATIONCOMPONENTSTRATEGYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("applicationComponentStrategySummary").build();
    private static final MarshallingInfo<String> DATACOLLECTIONSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("dataCollectionStatus").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> LASTANALYZEDTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastAnalyzedTimestamp").timestampFormat("unixTimestamp").build();
    private static final MarshallingInfo<List> LISTANTIPATTERNSEVERITYSUMMARY_BINDING = MarshallingInfo.builder(MarshallingType.LIST)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("listAntipatternSeveritySummary").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<StructuredPojo> RECOMMENDATIONSET_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("recommendationSet").build();
    private static final MarshallingInfo<StructuredPojo> SERVERERROR_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverError").build();
    private static final MarshallingInfo<String> SERVERTYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("serverType").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<StructuredPojo> SYSTEMINFO_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("systemInfo").build();

    private static final ServerDetailMarshaller instance = new ServerDetailMarshaller();

    public static ServerDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ServerDetail serverDetail, ProtocolMarshaller protocolMarshaller) {

        if (serverDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(serverDetail.getAntipatternReportS3Object(), ANTIPATTERNREPORTS3OBJECT_BINDING);
            protocolMarshaller.marshall(serverDetail.getAntipatternReportStatus(), ANTIPATTERNREPORTSTATUS_BINDING);
            protocolMarshaller.marshall(serverDetail.getAntipatternReportStatusMessage(), ANTIPATTERNREPORTSTATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(serverDetail.getApplicationComponentStrategySummary(), APPLICATIONCOMPONENTSTRATEGYSUMMARY_BINDING);
            protocolMarshaller.marshall(serverDetail.getDataCollectionStatus(), DATACOLLECTIONSTATUS_BINDING);
            protocolMarshaller.marshall(serverDetail.getId(), ID_BINDING);
            protocolMarshaller.marshall(serverDetail.getLastAnalyzedTimestamp(), LASTANALYZEDTIMESTAMP_BINDING);
            protocolMarshaller.marshall(serverDetail.getListAntipatternSeveritySummary(), LISTANTIPATTERNSEVERITYSUMMARY_BINDING);
            protocolMarshaller.marshall(serverDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(serverDetail.getRecommendationSet(), RECOMMENDATIONSET_BINDING);
            protocolMarshaller.marshall(serverDetail.getServerError(), SERVERERROR_BINDING);
            protocolMarshaller.marshall(serverDetail.getServerType(), SERVERTYPE_BINDING);
            protocolMarshaller.marshall(serverDetail.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(serverDetail.getSystemInfo(), SYSTEMINFO_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
