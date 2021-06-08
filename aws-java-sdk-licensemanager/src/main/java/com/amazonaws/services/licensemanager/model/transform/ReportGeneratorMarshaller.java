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
package com.amazonaws.services.licensemanager.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.licensemanager.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ReportGeneratorMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ReportGeneratorMarshaller {

    private static final MarshallingInfo<String> REPORTGENERATORNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportGeneratorName").build();
    private static final MarshallingInfo<List> REPORTTYPE_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ReportType").build();
    private static final MarshallingInfo<StructuredPojo> REPORTCONTEXT_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportContext").build();
    private static final MarshallingInfo<StructuredPojo> REPORTFREQUENCY_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportFrequency").build();
    private static final MarshallingInfo<String> LICENSEMANAGERREPORTGENERATORARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LicenseManagerReportGeneratorArn").build();
    private static final MarshallingInfo<String> LASTRUNSTATUS_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRunStatus").build();
    private static final MarshallingInfo<String> LASTRUNFAILUREREASON_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastRunFailureReason").build();
    private static final MarshallingInfo<String> LASTREPORTGENERATIONTIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LastReportGenerationTime").build();
    private static final MarshallingInfo<String> REPORTCREATORACCOUNT_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ReportCreatorAccount").build();
    private static final MarshallingInfo<String> DESCRIPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Description").build();
    private static final MarshallingInfo<StructuredPojo> S3LOCATION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("S3Location").build();
    private static final MarshallingInfo<String> CREATETIME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("CreateTime").build();
    private static final MarshallingInfo<List> TAGS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Tags").build();

    private static final ReportGeneratorMarshaller instance = new ReportGeneratorMarshaller();

    public static ReportGeneratorMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ReportGenerator reportGenerator, ProtocolMarshaller protocolMarshaller) {

        if (reportGenerator == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(reportGenerator.getReportGeneratorName(), REPORTGENERATORNAME_BINDING);
            protocolMarshaller.marshall(reportGenerator.getReportType(), REPORTTYPE_BINDING);
            protocolMarshaller.marshall(reportGenerator.getReportContext(), REPORTCONTEXT_BINDING);
            protocolMarshaller.marshall(reportGenerator.getReportFrequency(), REPORTFREQUENCY_BINDING);
            protocolMarshaller.marshall(reportGenerator.getLicenseManagerReportGeneratorArn(), LICENSEMANAGERREPORTGENERATORARN_BINDING);
            protocolMarshaller.marshall(reportGenerator.getLastRunStatus(), LASTRUNSTATUS_BINDING);
            protocolMarshaller.marshall(reportGenerator.getLastRunFailureReason(), LASTRUNFAILUREREASON_BINDING);
            protocolMarshaller.marshall(reportGenerator.getLastReportGenerationTime(), LASTREPORTGENERATIONTIME_BINDING);
            protocolMarshaller.marshall(reportGenerator.getReportCreatorAccount(), REPORTCREATORACCOUNT_BINDING);
            protocolMarshaller.marshall(reportGenerator.getDescription(), DESCRIPTION_BINDING);
            protocolMarshaller.marshall(reportGenerator.getS3Location(), S3LOCATION_BINDING);
            protocolMarshaller.marshall(reportGenerator.getCreateTime(), CREATETIME_BINDING);
            protocolMarshaller.marshall(reportGenerator.getTags(), TAGS_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
