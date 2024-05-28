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
package com.amazonaws.services.artifact.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.artifact.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportDetailMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportDetailMarshaller {

    private static final MarshallingInfo<String> ACCEPTANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("acceptanceType").build();
    private static final MarshallingInfo<String> ARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("arn").build();
    private static final MarshallingInfo<String> CATEGORY_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("category").build();
    private static final MarshallingInfo<String> COMPANYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("companyName").build();
    private static final MarshallingInfo<java.util.Date> CREATEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("createdAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> DELETEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("deletedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("description").build();
    private static final MarshallingInfo<String> ID_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("id").build();
    private static final MarshallingInfo<java.util.Date> LASTMODIFIEDAT_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("lastModifiedAt").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> NAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("name").build();
    private static final MarshallingInfo<java.util.Date> PERIODEND_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("periodEnd").timestampFormat("iso8601").build();
    private static final MarshallingInfo<java.util.Date> PERIODSTART_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("periodStart").timestampFormat("iso8601").build();
    private static final MarshallingInfo<String> PRODUCTNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("productName").build();
    private static final MarshallingInfo<Long> SEQUENCENUMBER_BINDING = MarshallingInfo.builder(MarshallingType.LONG)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("sequenceNumber").build();
    private static final MarshallingInfo<String> SERIES_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("series").build();
    private static final MarshallingInfo<String> STATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("state").build();
    private static final MarshallingInfo<String> STATUSMESSAGE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("statusMessage").build();
    private static final MarshallingInfo<String> TERMARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("termArn").build();
    private static final MarshallingInfo<String> UPLOADSTATE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("uploadState").build();
    private static final MarshallingInfo<Long> VERSION_BINDING = MarshallingInfo.builder(MarshallingType.LONG).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("version").build();

    private static final ReportDetailMarshaller instance = new ReportDetailMarshaller();

    public static ReportDetailMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportDetail reportDetail, ProtocolMarshaller protocolMarshaller) {

        if (reportDetail == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportDetail.getAcceptanceType(), ACCEPTANCETYPE_BINDING);
            protocolMarshaller.marshall(reportDetail.getArn(), ARN_BINDING);
            protocolMarshaller.marshall(reportDetail.getCategory(), CATEGORY_BINDING);
            protocolMarshaller.marshall(reportDetail.getCompanyName(), COMPANYNAME_BINDING);
            protocolMarshaller.marshall(reportDetail.getCreatedAt(), CREATEDAT_BINDING);
            protocolMarshaller.marshall(reportDetail.getDeletedAt(), DELETEDAT_BINDING);
            protocolMarshaller.marshall(reportDetail.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(reportDetail.getId(), ID_BINDING);
            protocolMarshaller.marshall(reportDetail.getLastModifiedAt(), LASTMODIFIEDAT_BINDING);
            protocolMarshaller.marshall(reportDetail.getName(), NAME_BINDING);
            protocolMarshaller.marshall(reportDetail.getPeriodEnd(), PERIODEND_BINDING);
            protocolMarshaller.marshall(reportDetail.getPeriodStart(), PERIODSTART_BINDING);
            protocolMarshaller.marshall(reportDetail.getProductName(), PRODUCTNAME_BINDING);
            protocolMarshaller.marshall(reportDetail.getSequenceNumber(), SEQUENCENUMBER_BINDING);
            protocolMarshaller.marshall(reportDetail.getSeries(), SERIES_BINDING);
            protocolMarshaller.marshall(reportDetail.getState(), STATE_BINDING);
            protocolMarshaller.marshall(reportDetail.getStatusMessage(), STATUSMESSAGE_BINDING);
            protocolMarshaller.marshall(reportDetail.getTermArn(), TERMARN_BINDING);
            protocolMarshaller.marshall(reportDetail.getUploadState(), UPLOADSTATE_BINDING);
            protocolMarshaller.marshall(reportDetail.getVersion(), VERSION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
